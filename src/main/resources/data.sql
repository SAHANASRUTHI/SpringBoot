delete from person;
INSERT INTO Person (id, uname, email) VALUES (1, 'Alice', 'alice@example.com');
INSERT INTO Person (id, uname, email) VALUES (2, 'Bob', 'bob@example.com');
INSERT INTO Person (id, uname, email) VALUES (3, 'Charlie', 'charlie@example.com');
INSERT INTO Person (id, uname, email) VALUES (4, 'David', 'david@example.com');
INSERT INTO Person (id, uname, email) VALUES (5, 'Eve', 'eve@example.com');

delete from `User`;
INSERT INTO `User` (userid, uname, email, upassword, urole) VALUES
( 'u001', 'Alice Johnson', 'alice.johnson@example.com', 'password123', 'admin'),
( 'u002', 'Bob Smith', 'bob.smith@example.com', 'securePass', 'user'),
( 'u003', 'Carol White', 'carol.white@example.com', 'myPassword', 'moderator'),
( 'u004', 'David Brown', 'david.brown@example.com', 'pass456', 'user'),
( 'u005', 'Eve Black', 'eve.black@example.com', 'qwerty789', 'user');
