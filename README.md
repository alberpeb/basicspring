Basic Spring RESTfull App



### Requirements
 * Preferably [Java 1.8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html).
 * [Spring STS](https://spring.io/tools) or [EClipse](https://www.eclipse.org/downloads/?) (preferably any early version as Neon or Luna).
 * [MySql](https://dev.mysql.com/downloads/), choose your OS related version.
 * Download this project or just clone it as looks below.
```sh
git clone https://github.com/alberpeb/basicspring.git
```

 * Or you could just import it following [this](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse) instructions.

### Installation
Don't forget to update maven using your IDE. You can right-click on your project then Maven > Update Project. Or you can do it by console:
```sh
mvn update
```
### Configuration

Edit the following lines in "application.properties" file:
```sh
spring.datasource.url=jdbc:mysql://localhost:3306/exampledb
spring.datasource.username=[your_username]
spring.datasource.password=[your_password]
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```
* Run src/main/resources/script-database.sql in your console.

* Run application as Java Application.
