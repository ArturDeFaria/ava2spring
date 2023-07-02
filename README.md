# Atividade Avaliativa 2 - Programação Orientada a Objetos Com Aplicações Web

 UNIVERSIDADE VEIGA DE ALMEIDA 

PROGRAMAÇÃO ORIENTADA A OBJETO II

PROFESSOR: DENIS GONÇALVES COPLE




PARTICIPANTES:

Artur de Faria – 1200103025
Breno Sobral Matos - 1210102032
Júlia Oliveira da Silva – 1180201161
Leandro Alves Santos - 1200200950
Wellington Junior Rodrigues da Silva - 1200101333



- <a href="mrfoo.ddns.net:30000/ava2">Backend Spring   - VM Rocky</a>
- <a href="https://uvapoo2db2ava2front-abxdefaria.b4a.run">Frontend Reactjs - Back4App</a>

## Exemplo do acesso a api

# GET

- Obter a lista json de uma entidade
/pessoa

- Obter um objeto através de um id
/pessoa/0

# POST

- Guarda uma entidade atraves de um json 
/pessoa

```json
{
  "id": 1,
  "nome": "Oregwuart",
  "telefone": "3123-1231",
  "email": "asd@as.asd"
}
```
# PUT
Requisição PUT para "/pessoa/"  com o id "1" atualiza um registro já existente 
```
http://mrfoo.ddns.net:30000/ava2/pessoa/1
```
```json
{
  "id": 1,
  "nome": "Oreg Art",
  "telefone": "3123-1231",
  "email": "asd@as.asd"
}
```

# DELETE

Requisição DELETE para "/pessoa/"  com o id "1" dispara a ação de remover o registro 

# Screen Shots
## Get /fornecedor
![Alt text](/get-fornecedor..JPG "Optional title")
