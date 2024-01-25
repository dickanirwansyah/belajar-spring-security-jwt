package com.app.oauth2service.roles;


public interface RolesService {
    Roles getRolesById(Long id);
    Roles saveRoles(Roles roles);
}
