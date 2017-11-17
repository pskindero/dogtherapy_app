# Setup PostgreSQL on Docker
================================

### Build dockerfile
--------------------------------
docker build -t dogodb_postgresql . && \
docker run --rm -P -p 32777:5432 --name dogotherapy_db_container dogodb_postgresql

### Connect to PostgreSQL 
--------------------------------
psql -h localhost -p 32777 -d dogtherapy_db -U admin --password
