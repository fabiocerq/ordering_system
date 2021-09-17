# ordering_system

---------[PORTUGUÊS]----------
Olá, esse é meu primeiro commit oficial e admito que não é um projeto nada complicado.
Porém, como eu me desafiei para fazer uma mudança, resolvi subir no git e vou explicar o porquê.

IDE: Eclipse
Versão do Projeto: Java SE-16
JDK 11.0.11 (64-bit)

Objetivo: Elaborar um sistema de fazer pedidos.

Estou fazendo um curso de java para aprender POO e cheguei no seguinte exercício:
"Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()"

O professor seguiu a seguinte estrutura:

- Application
     Main
- Entities 
     Product (parâmetros: name, price)
     Client (parâmetros: name, email, birth date)
     OrderItem (parâmetros: quantity, price & método: subTotal())
     Order (parâmetros: date (actual moment), order status & métodos: addItem, removeItem, total()) => apareceram os métodos add e remove porque uma lista foi criada para armazenar as informações de produto
- Enums
     OrderStatus (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED)

Contudo, a classe OrderItem estava me incomodando porque me parecia inútil, visto que eu poderia apenas acrescentar o método subTotal() em Product usando quantity como parâmetro na classe.
E então eu fiz dessa forma.

Minha estrutura ficou assim:

- Application
     Main
- Entities 
     Product (parâmetros: name, price, quantity & método: subtotal()) => método subTotal implementado
     Client (parâmetros: name, email, birth date)
     Order (parâmetros: date (actual moment), order status & métodos: addItem, removeItem, total()) 
- Enums
     OrderStatus (PENDING_PAYMENT, PROCESSING, COMPLETED, SHIPPED, DELIVERED) => Status COMPLETED criado porque me parecia razoável ter um estágio entre PROCESSING e SHIPPED para melhorar a gestão de informação.
