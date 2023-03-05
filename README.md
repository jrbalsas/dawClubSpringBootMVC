dawClub using SpringMVC & SpringBoot
==========

Sample Maven project with CRUD Web App using SpringMVC & SpringBoot

Features:
-------------
- Controller uses JSP/JSTL as view technology 
- Simple Entity CRUD JSP views
- Uses SpringBoot for application bootstraping
- Simple DAOMap for testing purpose
- Sample DAOJpa and Spring JdbcTemplate implementations
- Uses Spring CDI with qualifiers for DAO selection
- JEE Datasource definition in web.xml
- SpringBoot H2 DataSource and JPA configuration (application.properties)
- Bean Validation with customized messages on ValidationMessages.properties
- SpringMVC Default controller for static routing and logout
- SpringBoot custom error pages
- Webjar dependencies for BootStrap CSS integration

## Requeriments

- JDK 17

## Usage
- Compile and run

### DB Access:
1. Configure Spring Datasource in application.properties
3. Select JPA DAOs implementation in controller
4. Optional: edit sample data on `src/main/resources` import.sql file
