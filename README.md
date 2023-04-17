# Projeto CRUD de cardápio

---

### Java
Esse projeto funciona melhor com o **Java 17**, pois faz uso do ```record```, lançado no Java 14.

### PostgreSQL
Estou utilizando PostgreSQL 15.2.  
Nos meus testes o projeto não conseguiu criar a tabela sozinho, por isso tive que criar a tabela na mão:

```sql
CREATE TABLE foods(
  id SERIAL PRIMARY KEY,
  title VARCHAR(100),
  price INT,
  image VARCHAR(255)
);
```