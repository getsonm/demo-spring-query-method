# demo-spring-query-method
Exemplo de query method com Spring Boot

Lista todos os usuários cadastrados:
http://localhost:8080/usuarios

Lista um usuário pelo seu identificador único (3):
http://localhost:8080/usuarios/3

Lista usuário com data entre dois períodos (1995-07-20) e (2200-12-31):
http://localhost:8080/usuarios/1995-07-20/2200-12-31

Lista usuário com data entre dois períodos (1995-07-20) e (2200-12-31) e,
pelo Telefone (11998765437):
http://localhost:8080/usuarios/1995-07-20/2200-12-31/11998765437

Lista usuário com data entre dois períodos (1995-07-20) e (2200-12-31),
pelo Telefone (11998765437) e o cpf (10171586069):
http://localhost:8080/usuarios/1995-07-20/2200-12-31/11998765437/10171586069
