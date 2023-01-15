# Microservice Product

## Endpoints:

### Save Product

```
POST /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic Base64 (username:password)
Content-Type: application/json
Cookie: JSESSIONID=E521B6A151E627E13D370349D7B12B06
Content-Length: 45

{
    "name": "test-1",
    "price": 1.2
}
```

### Get Product

```
GET /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic Base64 (username:password)
```

### Delete Product

```
DELETE /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic Base64 (username:password)

```



