
-- Table: Customers
CREATE TABLE Customers (
                           id serial  NOT NULL,
                           registration_code int  NOT NULL,
                           full_name varchar(255)  NOT NULL,
                           email varchar(255)  NOT NULL,
                           telephone varchar(255)  NOT NULL,
                           CONSTRAINT Customers_pk PRIMARY KEY (id)
);

-- Table: OrderLine
CREATE TABLE OrderLine (
                           id serial  NOT NULL,
                           Order_id int  NOT NULL,
                           quantity int  NOT NULL,
                           CONSTRAINT OrderLine_pk PRIMARY KEY (id)
);

-- Table: Orders
CREATE TABLE Orders (
                        id serial  NOT NULL,
                        Customer_id int  NOT NULL,
                        dos date  NOT NULL,
                        CONSTRAINT Orders_pk PRIMARY KEY (id)
);

-- Table: Product
CREATE TABLE Product (
                         id serial  NOT NULL,
                         OrderLine_id int  NOT NULL,
                         name varchar(255)  NOT NULL,
                         sku_code int  NOT NULL,
                         unit_price int  NOT NULL,
                         CONSTRAINT Product_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: OrderLine_Order (table: OrderLine)
ALTER TABLE OrderLine ADD CONSTRAINT OrderLine_Order
    FOREIGN KEY (Order_id)
        REFERENCES Orders (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: Order_Customer (table: Orders)
ALTER TABLE Orders ADD CONSTRAINT Order_Customer
    FOREIGN KEY (Customer_id)
        REFERENCES Customers (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: Product_OrderLine (table: Product)
ALTER TABLE Product ADD CONSTRAINT Product_OrderLine
    FOREIGN KEY (OrderLine_id)
        REFERENCES OrderLine (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;


