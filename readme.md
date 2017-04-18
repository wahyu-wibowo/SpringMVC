On a retail website, the following discounts apply: 
1.      If the user is an employee of the store, he gets a 30% discount 
2.      If the user is an affiliate of the store, he gets a 15% discount 
3.      If the user has been a customer for over 2 years, he gets a 5% discount. 
4.      For every $100 on the bill, there would be a $5 discount (e.g. for $990, you get $45 as a discount). 
5.      The percentage based discounts do not apply on groceries. 
6.      A user can get only one of the percentage based discounts on a bill. 
7.      Write a program with test cases such that given a bill, it finds the net payable amount. 



Need to create database: simplehr
Need to add new db user: shoppingcart, with passwd: 12345




NEED TO INJECT SQL SCRIPT BELOW TO SQL SERVER:

    create table Order_Details (
        ID varchar(50) not null,
        Amount double precision not null,
        Price double precision not null,
        Quanity int not null,
        ORDER_ID varchar(50) not null,
        PRODUCT_ID varchar(20) not null,
        primary key (ID)
    );
 
    create table Orders (
        ID varchar(50) not null,
        Amount double precision not null,
        Discount double precision not null,
        Customer_ID varchar(20) not null,
        Order_Date datetime not null,
        Order_Num int not null,
        primary key (ID)
    );

    create table Customers (
        Customer_ID varchar(20) not null,
        Customer_Name varchar(255) not null,
        Customer_Address varchar(255) not null,
        Customer_Email varchar(128) not null,
        Customer_Phone varchar(128) not null,
        Customer_Type varchar(20) not null,
        Join_Date datetime not null,
        primary key (Customer_ID)
    );
 
    create table Products (
        Code varchar(20) not null,
        Create_Date datetime not null,
        Image image,
        Name varchar(255) not null,
        Price double precision not null,
        primary key (Code)
    );
 
    alter table Orders
        add constraint UK_sxhpvsj665kmi4f7jdu9d2791  unique (Order_Num);

    alter table Orders
        add constraint ORDER_CUST_FK
        foreign key (Customer_ID)
        references Customers;
 
    alter table Order_Details
        add constraint ORDER_DETAIL_ORD_FK
        foreign key (ORDER_ID)
        references Orders;
 
    alter table Order_Details
        add constraint ORDER_DETAIL_PROD_FK
        foreign key (PRODUCT_ID)
        references Products;
 
---------------------------------------  
insert into Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
values ('employee1', 1, '123', 'EMPLOYEE');
 
insert into Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
values ('manager1', 1, '123', 'MANAGER');
 
----------------
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('S001', 'Core Java', 100, SYSDATETIME() );
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('S002', 'Spring for Beginners', 50, SYSDATETIME() );
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('S003', 'Swift for Beginners', 120, SYSDATETIME() );
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('S004', 'Oracle XML Parser', 120, SYSDATETIME() );
 
insert into products (CODE, NAME, PRICE, CREATE_DATE)
values ('S005', 'CSharp Tutorial for Beginers', 110, SYSDATETIME() );

insert into Customers (Customer_ID, Customer_Name, Customer_Address, Customer_Email, Customer_Phone, Customer_Type, Join_Date)
VALUES ('1','Roy1', '1234561', 'Roy@balabala.com1', '1231', 'A', SYSDATETIME())
insert into Customers (Customer_ID, Customer_Name, Customer_Address, Customer_Email, Customer_Phone, Customer_Type, Join_Date)
VALUES ('2','Royco', '223456', 'Royco@balabala.com', '223', 'E', SYSDATETIME())
