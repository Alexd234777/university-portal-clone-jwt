package com.university.portal;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;

    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, JwtUtils jwtUtils) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.jwtUtils = jwtUtils;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        User user = userRepository.findByUsername(username).orElseThrow();
        String token = jwtUtils.generateToken(user);
        return ResponseEntity.ok(Map.of("token", token, "roles", user.getRoles()));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        // For demo: register as STUDENT
        User user = new User(username, password, Set.of(Role.ROLE_STUDENT));
        userRepository.save(user);
        return ResponseEntity.ok(Map.of("message", "created"));
    }
}
