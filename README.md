### Features

API-Gateway

Discovery Server

Circuit Breaker

OAuth 2.0

Docker

### Deploy

```bash
docker-compose up -d

```

### Use

```bash
curl --request POST \
  --url http://localhost:8081/catalog \
  --header 'content-type: application/json' \
  --data '{
	"name": "Internet",
	"price": 500
}'
```

```bash
curl --request GET \
  --url http://localhost:8081/catalog/{specification_id}
```

```bash
curl --request PUT \
  --url http://localhost:8082/catalog/{specification_id}/order
```

### Drawbacks

- -Big codebase-
- -Risk: trespassing between modules-
- -Risk: problems with maintenance and evolution- ?
- -IDE load- ?
- -Web Container load-
- -Problems with Continuous Deployment- 
- -Limitations of environment scalability-
- -Problems with development scalability- 
- -Fixed technical stack-
- -Infrastructure dependencies- ?

Microservices specific:

- Hard to test
- -Hard to configure deployment- ?
- Resources consumption


