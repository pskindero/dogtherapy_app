#!/bin/bash

#For development purpose
PSQL=/usr/bin/psql

SQL_SCRIPTS_DIR=$( cd "$(dirname "${BASH_SOURCE[0]}")"/../sql ; pwd -P )
DELETE_SQL=${SQL_SCRIPTS_DIR}/delete.sql
CREATE_SQL=${SQL_SCRIPTS_DIR}/create.sql
INSERT_SQL=${SQL_SCRIPTS_DIR}/insert.sql

#Exit codes
SUCCESS=0
FAIL=1

load_sql_file() {
	PGPASSWORD=admin ${PSQL} -h localhost -p 32777 -d dogtherapy_db -U admin -f $1
	return $?
}

load_sql_file ${DELETE_SQL}
if [ $? -ne 0 ]; then
	echo "Delete sql failed."
	exit ${FAIL}
fi

load_sql_file ${CREATE_SQL}
if [ $? -ne 0 ]; then
	echo "Create sql failed."
	exit ${FAIL}
fi

load_sql_file ${INSERT_SQL}
if [ $? -ne 0 ]; then
	echo "Insert sql failed."
	exit ${FAIL}
fi

exit ${SUCCESS}