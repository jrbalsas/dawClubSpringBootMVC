dawClub using SpringMVC & SpringBoot
==========

Sample Maven Netbeans project with CRUD Web App using SpringMVC & SpringBoot

Features:
-------------
- Controller uses JSP/JSTL as view technology 
- Simple Entity CRUD JSP views
- Uses SpringBoot for application bootstraping
- Simple DAOMap for testing purpose
- Sample DAOJpa and Spring JdbcTemplate implementations
- Uses Spring CDI with qualifiers for DAO selection
- JEE Datasource definition in web.xml
- SpringBoot JPA auto-configuration with JNDI datasource definition application.properties
- Bean Validation with customized messages on ValidationMessages.properties
- Optional access constraints for JEE Authentication/Authorization.
- SpringMVC Default controller for static routing and logout
- SpringBoot custom error pages
- Webjar dependencies for BootStrap CSS integration
- JEE Access control rules in web.xml
- JEE Security API Authentication

## Requeriments

- JEE Application Server, i.e. Payara, Glassfish

## Usage
- Compile and deploy in a JEE Application Server

### DB Access:
1. Configure JEE Datasource in web.xml
2. Uncomment SpringBoot DataSource JNDI location in application.properties
3. Select JPA DAOs implementation in controller
4. Optional: edit sample data on `src/main/resources`

### JEE Authentication/Authorization:
1. Uncomment/Create Security-constraints in web.xml
2. Configure JEE Security API identity store in JEESecurityConfig class3. Select valid realm in web.xml