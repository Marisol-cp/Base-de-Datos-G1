
use NORTHWND
go 
create or alter proc sp_solicitar_promedio_prod
@catego int --Parametro de entrada
as
begin
select avg(UnitPrice) as 'Promedio precio de los productos'
from Products
where CategoryID = @catego;
end 
go 

exec sp_solicitar_promedio_prod 2

exec sp_solicitar_promedio_prod @catego = 5


