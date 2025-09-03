package com.ecommerce.e_shop.service;


import com.ecommerce.e_shop.payload.AuthenticationResult;
import com.ecommerce.e_shop.payload.UserResponse;
import com.ecommerce.e_shop.security.request.LoginRequest;
import com.ecommerce.e_shop.security.request.SignupRequest;
import com.ecommerce.e_shop.security.response.MessageResponse;
import com.ecommerce.e_shop.security.response.UserInfoResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {

    AuthenticationResult login(LoginRequest loginRequest);

    ResponseEntity<MessageResponse> register(SignupRequest signUpRequest);

    UserInfoResponse getCurrentUserDetails(Authentication authentication);

    ResponseCookie logoutUser();

    UserResponse getAllSellers(Pageable pageable);
}
