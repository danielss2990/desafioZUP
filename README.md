### DESAFIO ZUP

API REST que controla veículos de usuários.

O primeiro foi a construção de um cadastro de usuários, sendo obrigatórios: nome, e-mail, CPF e 
data de nascimento, sendo que e-mail e CPF devem ser únicos.

O segundo passo foi criar um cadastro de veículos, sendo obrigatórios: Marca, Modelo do Veículo e 
Ano. E o serviço deve consumir a API da FIPE (https://deividfortuna.github.io/fipe/) para obter os 
dados do valor do veículo baseado nas informações inseridas.

O terceiro passo foi criar um endpoint que retorna um usuário com a lista de todos seus veículos cadastrados.

Foram construídos 3 endpoints neste sistema, o cadastro do usuário, o cadastro de veículo e a listagem dos veículos 
para um usuário específico.

No endpoint que lista os veículos de um usuário, foram consideradas algumas configurações a serem exibidas para o usuário final. 
Foram criados dois novos atributos no objeto do carro, sendo eles:

1.) Dia do rodízio deste carro, baseado no último número do ano do veículo, considerando as condicionais:
Final 0-1: segunda-feira
Final 2-3: terça-feira
Final 4-5: quarta-feira
Final 6-7: quinta-feira
Final 8-9: sexta-feira

2.) Também foi criardo um atributo de rodízio ativo, que compara a data atual do sistema com as condicionais anteriores e, 
quando for o dia ativo do rodizio, retorna true; caso contrario, false.

Exemplo A: hoje é segunda-feira, o carro é da marca Fiat, modelo Uno do ano de 2001, ou seja, seu rodízio será às segundas-feiras 
e o atributo de rodízio ativo será TRUE.
Exemplo B: hoje é quinta-feira, o carro é da marca Hyundai, modelo HB20 do ano de 2021, ou seja, seu rodizio será às segundas-feiras
e o atributo de rodízio ativo será FALSE.
