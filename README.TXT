mvn clean install
docker build -f Dockerfile -t html-worker .

docker run --name html-worker -p 8084:8084 --network bridge html-worker
