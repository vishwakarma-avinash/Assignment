use inductionbatchdb;


/* Create a csv file with following details

ProductId,ProductDescription,ProductPrice
P1001       XYZ                 34000
P1002       ABC                 45000


Load data from above csv into database table product.*/

create table Product
( ProductId varchar(10),
  ProductDescription varchar(10),
  ProductPrice double
);

load data infile 'D:\JavaTrainingMySQL\Product.csv'
into table Product
fields terminated by ','
lines terminated by '\r\n'
ignore 1 rows; 

/*Create table called item with following attributes,

   itemId
   itemDesc
   itemPrice

 put  data into item table and export data in .csv format*/
 
create table Item
( ItemId varchar(10),
  ItemDescription varchar(50),
  ItemPrice double
  )
  
  select * from Item;
  
  insert into Item(ItemId, ItemDescription, ItemPrice)
  values ('M101' , 'HP Monitor', '23000'),
		('M102' , 'Dell Monitor', '25000'),
        ('M103' , 'LG Monitor', '210000');
        
  select * into outfile 'D:\JavaTrainingMySQL\Item.csv'
  fields terminated by ','
  optionally enclosed by "'"
  lines terminated by '\r\n'
  from Item;
  
													