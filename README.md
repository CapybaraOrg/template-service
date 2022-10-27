# Template Service

An example service running on Google Cloud Run

## Building locally

```shell
./gradlew build
docker build -t template-service .
docker run -p 8080:8080 template-service
```
