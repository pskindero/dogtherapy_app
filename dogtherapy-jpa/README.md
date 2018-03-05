##Dogtherapy JPA component

### Setup PostgreSQL on Docker

##### Build dockerfile
docker build -t dogodb_postgresql . && \
docker run --rm -P -p 32777:5432 --name dogotherapy_db_container dogodb_postgresql

##### Connect to PostgreSQL 
psql -h 172.168.0.102 -p 5432 -d dogtherapy_db -U admin --password

### PostgreSQL commands cheat sheat
\dt - show tables
\du - show users


