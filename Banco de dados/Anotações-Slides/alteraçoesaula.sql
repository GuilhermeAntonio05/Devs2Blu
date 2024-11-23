/*Comandos DDL */
create table categorias(
   id serial primary key,
   descricao varchar(20)
)

alter table produtos add column estoque decimal(6,2) not null default  100
alter table produtos add column categoriaId int null

alter table produtos add constraint fk_categoria 
foreign key(categoriaId) references categorias(id)

/*Comandos DML */
select * from produtos

insert into categorias(descricao)
values('Frutas'),('Carnes'),('Lacticinios')

select * from categorias

update produtos set
categoriaId = 1
insert into produtos(descricao,preco,estoque)values
('Sabão',16.90,3),
('Yerba Mate',17.90,5)
