CREATE DATABASE revolution;

use revolution;

CREATE TABLE strikes(
id INT NOT NULL UNIQUE AUTO_INCREMENT,
dateOfStrike datetime NOT NULL,
location VARCHAR(200) NOT NULL,
leader VARCHAR(200),
tradeUnion VARCHAR(200),
workArea VARCHAR(200),
PRIMARY KEY (id));

INSERT INTO strikes(dateOfStrike, location, leader, tradeUnion, workArea) VALUES (
'2022-08-20 12:00:00', "Greenwich, London", "Ben O'Connor", "RMT", "transport");

INSERT INTO strikes(dateOfStrike, location, leader, tradeUnion, workArea) VALUES (
'2022-09-05 13:30:00', "Fort William", "Harry Gairn", "RMT", "catering");

SELECT * FROM strikes;

#DROP TABLES strikes;



