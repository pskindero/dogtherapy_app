CREATE TABLE IF NOT EXISTS social_media (
	id SERIAL PRIMARY KEY,
    name VARCHAR(48) NOT NULL,
    url VARCHAR(98) NOT NULL
);

CREATE TABLE IF NOT EXISTS contact ( 
	name VARCHAR(24) NOT NULL, 
	phone CHAR(12) NOT NULL,
	mail CHAR(48) NOT NULL,
	social_media_id INT REFERENCES social_media(id) 
);
