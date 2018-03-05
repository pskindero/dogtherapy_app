CREATE TABLE IF NOT EXISTS roles (
  name VARCHAR(20) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS users(
   username VARCHAR(20) NOT NULL,
   password VARCHAR(20) NOT NULL,
   email VARCHAR(40) NOT NULL UNIQUE,
   enabled boolean NOT NULL DEFAULT TRUE,
   role_name VARCHAR(20) REFERENCES roles(name), 
   primary key(username)
);

--CREATE TABLE IF NOT EXISTS user_roles(
--   role VARCHAR(20) NOT NULL REFERENCES roles(name),
--   username VARCHAR(20) NOT NULL REFERENCES users(username)
--);

CREATE TABLE IF NOT EXISTS contact (
	id SERIAL PRIMARY KEY,  
	phone CHAR(18) NOT NULL,
	mail CHAR(48) NOT NULL
);

CREATE TABLE IF NOT EXISTS social_media (
	id SERIAL PRIMARY KEY,
    name VARCHAR(48) NOT NULL,
    url VARCHAR(98) NOT NULL UNIQUE,
    icon_url VARCHAR(96),
	contact_id INT REFERENCES contact(id) 
);

CREATE TABLE IF NOT EXISTS app_properties (
	prop_key CHAR UNIQUE NOT NULL,
	prop_value CHAR
);
