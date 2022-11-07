
Select ContactName, CompanyName, City from Customers
Select * from Customers where City = 'Berlin'
Select * from Products where categoryId = 1 or categoryId = 3
Select * from Products where categoryId = 1 and categoryId >= 6
Select * from Products order by ProductName
Select * from Products order by CategoryID, ProductName
Select * from Products order by UnitPrice asc  
Select * from Products order by UnitPrice desc 
Select * from Products where categoryId = 1 order by UnitPrice asc 
select count(*) from Products
select count(*) from Products where CategoryID = 2
Select categoryID from Products group by CategoryID
Select categoryID,count(*) from Products group by CategoryID
Select categoryID,count(*) from Products group by CategoryID having count(*)<10
Select categoryID,count(*) from Products where UnitPrice>20
group by CategoryID having count(*)>10
Select Products.ProductID, Products.ProductName, Products.UnitPrice,
Categories.CategoryName from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
Select Products.ProductID, Products.ProductName, Products.UnitPrice,
Categories.CategoryName from Products inner join Categories
on Products.CategoryID = Categories.CategoryID where Products.UnitPrice>10
Select * from Products p left join [Order Details] od
on p.ProductID = o.ProductID
Select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null