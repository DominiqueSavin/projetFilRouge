package com.formaclean.projetfilrouge.pl.controllers;

import com.formaclean.projetfilrouge.bl.services.UserDetailServiceImpl;
import com.formaclean.projetfilrouge.dal.entities.UserEntity;
import com.formaclean.projetfilrouge.dal.enums.RoleEnum;
import com.formaclean.projetfilrouge.models.forms.LoginForm;
import com.formaclean.projetfilrouge.pl.dto.AuthResponse;
import com.formaclean.projetfilrouge.pl.utils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final JwtUtil utils;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailServiceImpl securityService;

    public UserController(JwtUtil utils, PasswordEncoder passwordEncoder, UserDetailServiceImpl securityService) {
        this.utils = utils;
        this.passwordEncoder = passwordEncoder;
        this.securityService = securityService;
    }

    @PostMapping(path = {"/signIn"})
    public ResponseEntity<AuthResponse> signInAction(
            HttpServletRequest request,
            @RequestBody LoginForm form
    ) {
        System.out.println(request);
        UserDetails user = this.securityService.loadUserByUsername(form.username);

        if (passwordEncoder.matches(form.password, user.getPassword())) {
            return ResponseEntity.ok(new AuthResponse(utils.generateToken(user), user));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

    @PostMapping(path = {"/register"})
    public ResponseEntity<AuthResponse> registerAction(
            @RequestBody LoginForm form
    ) {
//        return ResponseEntity.ok(null);
        UserEntity entity = new UserEntity();
        entity.setUsername(form.username);
        entity.setPassword(passwordEncoder.encode(form.password));
        entity.setRole(RoleEnum.USER);

        UserDetails user = this.securityService.insert(entity);
        return ResponseEntity.ok(new AuthResponse(utils.generateToken(user), user));
    }

    @PostMapping(path = {"/registerAdmin"})
    public ResponseEntity<AuthResponse> registerAdminAction(
            @RequestBody LoginForm form
    ) {
//        return ResponseEntity.ok(null);
        UserEntity entity = new UserEntity();
        entity.setUsername(form.username);
        entity.setPassword(passwordEncoder.encode(form.password));
        entity.setRole(RoleEnum.ADMIN);

        UserDetails user = this.securityService.insert(entity);
        return ResponseEntity.ok(new AuthResponse(utils.generateToken(user), user));
    }
}
