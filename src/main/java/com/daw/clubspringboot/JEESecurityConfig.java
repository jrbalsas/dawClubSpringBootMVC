package com.daw.clubspringboot;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import org.glassfish.soteria.identitystores.annotation.Credentials;
import org.glassfish.soteria.identitystores.annotation.EmbeddedIdentityStoreDefinition;

/** JEE Security configuration
 *
 * @author jrbalsas
 */
@EmbeddedIdentityStoreDefinition({
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
