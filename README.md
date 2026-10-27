# Spring Boot

Aplicação web de demonstração feita com Java 17 e Spring Boot 3.5.4. No momento, ela inicia um servidor web embutido, responde a duas requisições HTTP GET com textos fixos e disponibiliza os endpoints `health` e `info` do Spring Boot Actuator. Não há banco de dados, autenticação ou lógica de negócio.

## Comportamento da aplicação

O servidor está configurado para escutar no endereço `192.168.18.228`, porta `8082`. Esse endereço precisa estar atribuído a uma interface de rede da máquina; caso contrário, a aplicação não iniciará. Para executar em outra máquina ou ambiente, altere `server.address` em `src/main/resources/application.properties` para o endereço apropriado ou remova a propriedade para usar o endereço padrão do Spring Boot.

| Método | Caminho | Resposta |
|---|---|---|
| `GET` | `/` | `Aplicação online` |
| `GET` | `/health` | `OK` |
| `GET` | `/actuator/health` | Estado de saúde do Spring Boot Actuator |
| `GET` | `/actuator/info` | Informações do Actuator; nenhuma informação de aplicação foi configurada neste projeto |

Os endpoints do Actuator expostos pela configuração são `health` e `info`. Os detalhes de saúde estão configurados para serem sempre exibidos. A aplicação também registra no log `Aplicação Startada` quando fica pronta e uma mensagem de encerramento quando o contexto do Spring fecha.

## Requisitos

- JDK 17
- Maven Wrapper incluído (Maven 3.9.16)

## Executar localmente

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

No macOS/Linux:

```shell
./mvnw spring-boot:run
```

Com a configuração de rede atual, acesse `http://192.168.18.228:8082/` e `http://192.168.18.228:8082/health`. Os endereços do Actuator são `http://192.168.18.228:8082/actuator/health` e `http://192.168.18.228:8082/actuator/info`.

## Testes

Os testes existentes verificam que o contexto da aplicação inicia e que os métodos do controller retornam as respostas previstas. O teste do controller chama os métodos diretamente; ele não simula uma requisição HTTP.

No Windows:

```powershell
.\mvnw.cmd clean verify
```

No macOS/Linux:

```shell
./mvnw clean verify
```

## Estrutura relevante

```text
.
├── .github/
│   ├── copilot-instructions.md
│   └── skills/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/
    ├── main/
    │   ├── java/com/example/springboot/
    │   │   ├── SpringbootApplication.java
    │   │   └── controller/StatusController.java
    │   └── resources/application.properties
    └── test/
        └── java/com/example/springboot/
            ├── SpringbootApplicationTests.java
            └── controller/StatusControllerTest.java
```
