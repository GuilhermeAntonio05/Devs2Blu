CREATE TABLE Clientes (
    Id serial PRIMARY KEY,
    Nome varchar(40)
);

CREATE TABLE Produtos (
    Id serial PRIMARY KEY,
    Descricao varchar(40),
    Preco DECIMAL(6,2)
);

CREATE TABLE Pedidos (
    Id serial PRIMARY KEY,
    Data DATE,
    ClienteId int
);

CREATE TABLE ItensPedido (
    ProdutoId int,
    PedidoId int,
    Quantidade int,
    ValorUnitario DECIMAL(6,2)
);
 
ALTER TABLE Pedidos ADD CONSTRAINT FK_cliente
    FOREIGN KEY (ClienteId)
    REFERENCES Clientes (Id);
 
ALTER TABLE ItensPedido ADD CONSTRAINT FK_pedido
    FOREIGN KEY (PedidoId)
    REFERENCES Pedidos (Id);

ALTER TABLE ItensPedido ADD CONSTRAINT FK_produto
    FOREIGN KEY (ProdutoId)
    REFERENCES Produtos(Id);