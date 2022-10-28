# Template Service

An example service running on Google Cloud Run

## Building and running locally

Start Docker daemon:

```shell
colima start
```

Build and run the database:

```shell
docker rm main

docker run --name main \
  -e POSTGRES_USER=main  \
  -e POSTGRES_PASSWORD=mysecretpassword \
  -e POSTGRES_DB=main \
  -p 5432:5432 \
  -d \
  postgres:14
```

Build and run the application:

```shell
./gradlew build
docker build -t template-service:0.0.0-development .
docker image tag template-service:0.0.0-development template-service:latest
docker run -p 8080:8080 template-service:0.0.0-development
```

## Building and deploying on Google Cloud Run from the local machine

### Building Docker image

```shell
./gradlew build
docker build -t {Docker repository}/template-service:0.0.0-development .
docker image tag {Docker repository}/template-service:0.0.0-development {Docker repository}/template-service:latest
docker image push --all-tags {Docker repository}/template-service
```

Replace `{Docker repository}` Artifact Registry repository, please see
the [documentation](https://cloud.google.com/artifact-registry/docs/docker/names) for more information

### Deploying on Google Cloud Run

```shell
gcloud run deploy template-service \
  --image {Docker repository}/template-service:latest \
  --allow-unauthenticated \
  --region={Region} \
  --add-cloudsql-instances={Cloud SQL instance connection name}
```
