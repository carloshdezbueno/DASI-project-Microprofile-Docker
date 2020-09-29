

docker container run -d -e BACKEND_SID=backend -e com.mycompany.frontenddakar.services.BackendService/mp-rest/uri=http://backend:8080 -p 81:8080 --name frontend --network oracle-network frontend
