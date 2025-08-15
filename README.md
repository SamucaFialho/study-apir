```
export DB_USER=<seu usuario>
export DB_PASSWORD=<sua senha>
```

```
executar o mvn clean package para limpar o targer
Localizar o .jar no target e copiar o "Path Relative"
java -jar target\study-apir-0.0.1-SNAPSHOT.jar
target\study-apir-0.2.0.jar
```



# Study APIR

API Java para estudo de Spring Boot

## MER

![](assets/images/mer.png)

## Instalação

* Limpar e criar a pasta */target*

```
mvn clean package
```

* Configuração do Swagger

    - https://springdoc.org/properties.html

- application.properties

```
springdoc.swagger-ui.path=/
springdoc.swagger-ui.disable-swagger-default-url=true
```


## Navegação

### Executar a API

-  *Executando* **Maven**

```
mvn spring-boot:run
```

### Documentação da API (Swagger)
- http://localhost:8080/swagger-ui.html


## Referencias

- https://springdoc.org/