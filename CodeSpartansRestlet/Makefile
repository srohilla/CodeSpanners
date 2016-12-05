
all: clean compile 

clean:
	rm -rf build/*
	rm -f dist/app.jar
	find . -name "*.class" -exec rm -rf {} \;

app: compile
	cd build ; jar -cvfe ../dist/app.jar ServerApplication .

test: compile app
	java -cp dist/servlet-api.jar:dist/restlet-json.jar:dist/restlet.jar:dist/org.restlet.jar:dist/org.restlet.ext.xml.jar:dist/org.restlet.ext.servlet.jar:dist/org.restlet.ext.json.jar:dist/org.restlet.ext.fileupload_1.2.jar:dist/org.json.jar:dist/mongo-java-driver-3.3.0.jar:dist/mongodb-driver-core-3.3.0.jar:dist/mongodb-driver-async-3.3.0.jar:dist/mongodb-driver-3.3.0.jar:dist/json-simple-1.1.jar:dist/json.jar:dist/apache-logging-log4j.jar:dist/app.jar:dist/bson-3.0.2.jar api.ServerApplication

compile: 
	javac -cp dist/servlet-api.jar:dist/restlet-json.jar:dist/restlet.jar:dist/org.restlet.jar:dist/org.restlet.ext.xml.jar:dist/org.restlet.ext.servlet.jar:dist/org.restlet.ext.json.jar:dist/org.restlet.ext.fileupload_1.2.jar:dist/org.json.jar:dist/mongo-java-driver-3.3.0.jar:dist/mongodb-driver-core-3.3.0.jar:dist/mongodb-driver-async-3.3.0.jar:dist/mongodb-driver-3.3.0.jar:dist/json-simple-1.1.jar:dist/json.jar:dist/apache-logging-log4j.jar:dist/bson-3.0.2.jar -d build \
	src/gumball/*.java \
	clients/loadtestclient/*.java \
	src/api/*.java

run:
	echo Starting Service at:  http://localhost:8080
	java -cp dist/servlet-api.jar:dist/restlet-json.jar:dist/restlet.jar:dist/org.restlet.jar:dist/org.restlet.ext.xml.jar:dist/org.restlet.ext.servlet.jar:dist/org.restlet.ext.json.jar:dist/org.restlet.ext.fileupload_1.2.jar:dist/org.json.jar:dist/mongo-java-driver-3.3.0.jar:dist/mongodb-driver-core-3.3.0.jar:dist/mongodb-driver-async-3.3.0.jar:dist/mongodb-driver-3.3.0.jar:dist/json-simple-1.1.jar:dist/json.jar:dist/apache-logging-log4j.jar:dist/bson-3.0.2.jar:dist/app.jar api.ServerApplication

loadtest:
	echo Starting Load Test on localhost
	java -cp build:dist/restlet.jar:dist/restlet-json.jar:dist/json.jar RunLoadTest 5

docker-build: app
	docker build -t GameServer .
	docker images

docker-clean:
	docker stop GameServer
	docker rm GameServer
	docker rmi GameServer

docker-run:
	docker run --name GameServer -td GameServer
	docker ps

docker-run-host:
	docker run --name GameServer -td --net=host GameServer
	docker ps

docker-run-bridge:
	docker run --name GameServer -td -p 80:8080 GameServer
	docker ps

docker-network:
	docker network inspect host
	docker network inspect bridge

docker-stop:
	docker stop GameServer
	docker rm GameServer

docker-shell:
	docker exec -it GameServer bash 
	
