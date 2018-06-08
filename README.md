# Chupa-cabra
A sample project that uses <a href="https://github.com/shyiko/mysql-binlog-connector-java">mysql-binlog-connector</a>

Some things are import:
 - According the documentation the user MUST have REPLICATION SLAVE privilege. 
 That is why just as sample purpose, I use the root to connect.
 - The database should have the log_bin activated and a server-id. In this project there is into /db/conf/config-file.cnf
 this configurations.
 
## How to run

docker-compose up -d

./gradlew run