create table if not exists person( 
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE if not exists `User` (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userid VARCHAR(255) NOT NULL,
    uname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    upassword VARCHAR(255) NOT NULL,
    urole VARCHAR(255) NOT NULL
);
