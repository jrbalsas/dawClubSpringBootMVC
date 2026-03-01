package com.daw.clubspringboot;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.LoginToContinue;
import jakarta.security.enterprise.identitystore.InMemoryIdentityStoreDefinition;
import jakarta.security.enterprise.identitystore.InMemoryIdentityStoreDefinition.Credentials;

/** JEE Security configuration
 *
 * @author jrbalsas
 */
@InMemoryIdentityStoreDefinition({
    @Credentials(callerName = "admin", password = "secret1", groups = {"ADMINISTRADORES"}),
    @Credentials(callerName = "user", password = "secret2", groups = {"USUARIOS"})
})
@FormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(
                loginPage = "/login",
                errorPage = "/login?error",
                useForwardToLogin = false
        )
)
@ApplicationScoped
public class JEESecurityConfig {
    
}
