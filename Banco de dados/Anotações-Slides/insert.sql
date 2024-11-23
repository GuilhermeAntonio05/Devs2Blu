insert into clientes(Nome)values('Maria');
insert into clientes(Nome)values('Joao');
select * from clientes;

insert into produtos(Descricao, Preco)values('uva', 2);
insert into produtos(Descricao, Preco)values('banana', 1.5);
insert into produtos(Descricao, Preco)values('Laranja', 3.75);
select * from produtos;

insert into pedidos(data,clienteId)values('2024-10-01',1);
insert into pedidos(data,clienteId)values('2024-09-01',2);
select * from pedidos;

select p.*, c.Nome from pedidos p
inner join clientes c on p.ClienteId = c.Id

insert into itensPedido(produtoId, PedidoId, quantidade, valorUnitario)
values(1,1,2,2);

insert into itensPedido(produtoId, PedidoId, quantidade, valorUnitario)
values(2,1,2, (select Preco from produtos where id = 2));

insert into itensPedido(produtoId, PedidoId, quantidade, valorUnitario)
values(1,2,2,2);

insert into itensPedido(produtoId, PedidoId, quantidade, valorUnitario)
values(2,2,2, (select Preco from produtos where id = 2));

insert into itensPedido(produtoId, PedidoId, quantidade, valorUnitario)
values(3,2,2, (select Preco from produtos where id = 3));

select p.Id, p.Descricao, i.quantidade, i.ValorUnitario ,
(i.quantidade * i.ValorUnitario) as Subtotal
from itensPedido i
inner join produtos p on p.id = i.ProdutoId
where i.pedidoId = 2;

select sum(i.quantidade * i.valorunitario)
from itensPedido i
where i.pedidoId = 2



