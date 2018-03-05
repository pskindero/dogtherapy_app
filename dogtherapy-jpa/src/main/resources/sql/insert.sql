-- Predefined roles
INSERT INTO roles (name) VALUES ('ROOT');
INSERT INTO roles (name) VALUES ('ADMINISTRATOR');
INSERT INTO roles (name) VALUES ('EMPLOYEE');

-- Predefined users
INSERT INTO users(username, password, email) VALUES ('root', 'root', 'dogoterapia.z.fibi@gmail.com');

--Predefined user-role mappings
--INSERT INTO user_roles(role, username) VALUES ('ROOT', 'root');

-- Social media default values
INSERT INTO social_media (name, url) VALUES ('facebook', 'https://facebook.com/dogoterapia-z-fibi');
INSERT INTO social_media (name, url) VALUES ('twitter', 'https://facebook.com/ilonaskinderowicz');

-- Contact default values
INSERT INTO contact (phone, mail) VALUES ('+48880-541-695', 'dogoterapiazfibii@gmail.com');
