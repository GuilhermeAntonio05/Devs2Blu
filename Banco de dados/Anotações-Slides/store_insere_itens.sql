CREATE OR REPLACE PROCEDURE inserirItens(
pPedidoId int, pProdutoId int, pQuantidade decimal)
LANGUAGE plpgsql
AS $$
declare
  precoProduto decimal;
  quantidadeEstoque decimal;
BEGIN
   if exists(select 1 from produtos where id = pProdutoId) then
	   select preco, estoque into precoProduto, quantidadeEstoque
	   from produtos where id = pProdutoId; 
	   if (quantidadeEstoque < pQuantidade ) then
	       raise notice 'Estoque insuficiente.';
	   else
	     insert into itenspedido(pedidoId,produtoId,quantidade,valorunitario)
	     values(pPedidoId, pProdutoId,pQuantidade, precoProduto);

		 update produtos set estoque = estoque - pQuantidade 
		 where id =  pProdutoId;
		 
		 raise notice 'Item adicionado com sucesso';
	   end if;  
	else
      raise notice 'O produto Id:% não existe.',pProdutoId; 
	end if;

	exception
	   when foreign_key_violation then
	     raise notice 'O pedido Id:% não existe.',pPedidoId; 

	   when others then
	     raise notice 'Ocorreu um erro inesperado.'; 
END;
$$