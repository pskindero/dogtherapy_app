CREATE TABLE IF NOT EXISTS contact (
	id SERIAL PRIMARY KEY,  
	phone CHAR(18) NOT NULL,
	mail CHAR(48) NOT NULL
);

CREATE TABLE IF NOT EXISTS social_media (
	id SERIAL PRIMARY KEY,
    name VARCHAR(48) NOT NULL,
    url VARCHAR(98) NOT NULL UNIQUE,
    icon_url varchar(96),
	contact_id INT REFERENCES contact(id) 
);

CREATE TABLE IF NOT EXISTS app_properties (
	prop_key CHAR UNIQUE NOT NULL,
	prop_value CHAR
);
