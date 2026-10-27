# Spring Boot

Aplicação Java inicial com Spring Boot para desenvolvimento local, com configuração básica de execução, endpoints de verificação e logs de inicialização/encerramento.

## O que foi implementado

- Projeto Spring Boot 3.5.4 com Java 17
- Estrutura padrão inicial do Spring Boot
- Endpoint de status em `/` retornando `Aplicação online`
- Endpoint de health em `/health` retornando `OK`
- Configuração do Actuator para expor `health` e `info`
- Logs com SLF4J para registrar:
  - `Aplicação Startada`
  - `Aplicação encerrada: motivo = fechamento do contexto da aplicação`
- Ajuste da porta local para `8082` para evitar conflitos com processos já ocupando a porta padrão do Spring Boot

## Requisitos

- JDK 17
- Maven 3.9.16 (ou uso do Maven Wrapper incluído)

Confira as versões instaladas:

```shell
java -version
mvn -version
```

## Executar localmente

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

No macOS/Linux:

```shell
./mvnw spring-boot:run
```

A aplicação será iniciada na porta `8082`.

## Endpoints de verificação

Depois da inicialização, os seguintes endpoints ficam disponíveis:

- `http://localhost:8082/`
- `http://localhost:8082/health`
- `http://localhost:8082/actuator/health`

## Compilar e testar

Windows:

```powershell
.\mvnw.cmd clean verify
```

macOS/Linux:

```shell
./mvnw clean verify
```

Para gerar e executar o JAR:

```shell
./mvnw clean package
java -jar target/springboot-0.0.1-SNAPSHOT.jar
```

No Windows, substitua `./mvnw` por `./mvnw.cmd`.

## Estrutura

```text
.
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
├── .mvn/wrapper/
└── src/
    ├── main/
    │   ├── java/com/example/springboot/
    │   │   ├── SpringbootApplication.java
    │   │   └── StatusController.java
    │   └── resources/application.properties
    └── test/
        └── java/com/example/springboot/SpringbootApplicationTests.java
```

## Observações

- O identificador Maven (`com.example:springboot`) e o pacote Java (`com.example.springboot`) permanecem como padrão do projeto.
- A aplicação foi preparada para facilitar a validação local e futura evolução para endpoints reais de negócio.
- A finalidade atual é demonstrar o funcionamento do Spring Boot, logs SLF4J e verificação em execução.
