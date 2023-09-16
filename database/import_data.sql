INSERT INTO public.customers (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, 1001, 'John Doe', 'john.doe@gmail.com', '+372 5555555');
INSERT INTO public.customers (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, 1002, 'John Smith', 'john.smith@gmail.com', '+372 5666666');
INSERT INTO public.customers (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, 1003, 'Anna Miller', 'anna.miller@gmail.com', '+372 5777777');
INSERT INTO public.customers (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, 1004, 'Mary Johnson', 'mary.johnson@gmail.com', '+372 5888888');

INSERT INTO public.orders (id, customer_id, dos) VALUES (DEFAULT, 1, '2023-09-15');
INSERT INTO public.orders (id, customer_id, dos) VALUES (DEFAULT, 2, '2023-09-16');
INSERT INTO public.orders (id, customer_id, dos) VALUES (DEFAULT, 3, '2023-09-17');
INSERT INTO public.orders (id, customer_id, dos) VALUES (DEFAULT, 4, '2023-09-18');

INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'apples', 45678, 2);
INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT,'oranges', 45678, 3);
INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'potatoes', 45678, 4);
INSERT INTO public.product (id,name, sku_code, unit_price) VALUES (DEFAULT, 'tomatoes', 45678, 5);

INSERT INTO public.orderline (id,product_id, order_id, quantity) VALUES (DEFAULT, 1, 1, 100);
INSERT INTO public.orderline (id,product_id, order_id, quantity) VALUES (DEFAULT, 2 ,2, 200);
INSERT INTO public.orderline (id,product_id, order_id, quantity) VALUES (DEFAULT, 3 ,3, 300);
INSERT INTO public.orderline (id,product_id, order_id, quantity) VALUES (DEFAULT, 4, 4, 400);

