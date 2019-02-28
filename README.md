dawClub using SpringMVC & SpringBoot
==========

Sample Maven Netbeans project with CRUD Web App using SpringMVC & SpringBoot

Features:
-------------
- Uses Spring Boot for application bootstraping
- Simple DAOList for testing purpose
- Sample DAOJDBC and Spring JdbcTemplate implementations
- Uses Spring CDI with qualifiers for DAO selection
- JEE Datasource definition in web.xml
- SpringBoot JNDI datasource configuration in application.properties
- Bean Validation with customized messages on ValidationMessages.properties
- Simple Entity CRUD jsp views
- Optional access constraints for JEE Authentication/Authorization.
- SpringMVC Default controller for static routing and logout
- Webjar dependencies for BootStrap CSS integration

## Requeriments

- JEE Application Server, i.e. Payara, Glassfish

## USE

### DB Access:
1 Configure JEE Datasource in web.xml
2 Uncomment SpringBoot DataSource JNDI location in application.properties
3 Select JDBC or JDBCTemplate DAOs implementation in controller
### Realm Authentication/Authorization:
1 Uncomment/Create Security-constraints in web.xml
2 Select valid realm in web.xml