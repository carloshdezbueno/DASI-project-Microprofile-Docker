
docker container run -d -e DATABASE_HOST=oracle11gXE -e DATABASE_PORT=1521 -e DATABASE_SID=xe -e DATABASE_USER=username -e DATABASE_PWD=password --name backend --network oracle-network backend
