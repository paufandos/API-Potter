DROP TABLE IF EXISTS books;
CREATE TABLE books (id INT PRIMARY KEY, name VARCHAR(255), publish_year INT);
INSERT INTO books VALUES(1, 'Harry Potter and the Philosophers Stone', 1997);
INSERT INTO books VALUES(2, 'Harry Potter and the Chamber of Secrets', 1998);
INSERT INTO books VALUES(3, 'Harry Potter and the Prisoner of Azkaban', 1999);
INSERT INTO books VALUES(4, 'Harry Potter and the Goblet of Fire', 2000);
INSERT INTO books VALUES(5, 'Harry Potter and the Order of the Phoenix', 2003);
INSERT INTO books VALUES(6, 'Harry Potter and the Deathly Hallows', 2007);

DROP TABLE IF EXISTS clients;
CREATE TABLE clients (id INT PRIMARY KEY, name VARCHAR(255));
INSERT INTO clients VALUES(1, 'Pau');
INSERT INTO clients VALUES(2, 'Quique');
INSERT INTO clients VALUES(3, 'Nerea');
INSERT INTO clients VALUES(4, 'Laura');

DROP TABLE IF EXISTS carts;
CREATE TABLE carts (id INT PRIMARY KEY, client_id INT, price DECIMAL(6,2),CONSTRAINT FK_client_id FOREIGN KEY (client_id) REFERENCES clients(id) ON DELETE CASCADE);

DROP TABLE IF EXISTS cart_books;
CREATE TABLE cart_books (id INT PRIMARY KEY, cart_id INT, book_id INT,CONSTRAINT FK_cart_id FOREIGN KEY (cart_id) REFERENCES carts(id) ON DELETE CASCADE,CONSTRAINT FK_book_id FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE);


DROP TABLE IF EXISTS users;
CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255),password VARCHAR(255));
INSERT INTO users VALUES(1, 'Pau', 'pau@pau.pau', '1234');
INSERT INTO users VALUES(2, 'Quique', 'quique@quique.quique', '1234');
INSERT INTO users VALUES(3, 'Nerea', 'nerea@nerea.nerea', '1234');
INSERT INTO users VALUES(4, 'Laura', 'laura@laura.laura', '1234');