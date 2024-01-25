package com.app.oauth2service.user;

import com.app.oauth2service.dto.AuthenticationRequest;
import com.app.oauth2service.dto.AuthenticationResponse;
import com.app.oauth2service.dto.RegisterRequest;

public interface AuthenticationService {

    AuthenticationResponse authentication (AuthenticationRequest request);
    AuthenticationResponse register(RegisterRequest request);
}
