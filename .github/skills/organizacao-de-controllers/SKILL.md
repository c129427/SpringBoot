---
name: organizacao-de-controllers
description: Use ao criar, mover ou modificar controllers Java para mantê-los no pacote dedicado controller.
---

# Organização de controllers

- Coloque todos os controllers da aplicação no diretório `src/main/java/com/example/springboot/controller`, correspondente ao pacote `com.example.springboot.controller`.
- Mantenha nesse pacote apenas classes responsáveis por receber e encaminhar requisições HTTP; serviços, modelos e repositórios devem ficar em seus próprios pacotes.
- Ao criar um controller, crie também sua classe de teste correspondente em `src/test/java/com/example/springboot/controller`, com o sufixo `Test`, e cubra os comportamentos relevantes.
- Ao mover um controller existente, atualize a declaração `package`, as referências, os testes e a documentação da estrutura do projeto.
