package com.bookstore.services;

import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

public class CustomOidcUserService extends OidcUserService {
    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        // Lấy thông tin từ OAuth2 Provider
        OidcUser oidcUser = super.loadUser(userRequest);

        // Custom logic (nếu cần) để xử lý thông tin người dùng từ oidcUser

        return oidcUser;
    }
}
