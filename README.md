# miniproject
Test Programming Create Restful API with Java Spring Boot

# MySQL Database
- create database using name : miniprojectdb
- import file miniprojectdb.sql on your Database

# Postman API Platform 
**ITEM (GET, POST, PUT)**
- Create new item with **POST** METHOD : http://localhost:8080/items/
*JSON POST example :*
```ruby
  {
    "code":"Prod1",
    "name":"Bag A",
    "qty":10,
    "price":100000
  }
```
  
- Show all item with **GET** METHOD : http://localhost:8080/items/

- Show selected item by id with **GET** METHOD : http://localhost:8080/items/?orders_id=    *add your item id after link

- Update selected item by id with **PUT** METHOD : http://localhost:8080/items/?orders_id=    *add your item id after link
*JSON PUT example :*
```ruby
  {
    "code":"Prod1",
    "name":"Bag A",
    "qty":20,
    "price":110000
  }
```

- Delete selected item by id with **DELETE** METHOD : http://localhost:8080/items/?orders_id=    *add your item id after link

**ORDER (GET, POST, PUT)**
- Create new order with **POST** METHOD : http://localhost:8080/orders/
*JSON POST example :*
```ruby
  {
    "code": "Ord1",
    "name": "Dimas Anggara Putra",
    "address": "Kendangsari gang 10 no 09 Surabaya",
    "total_price": 220000,
    "note": ""
  }
```

- Show all order with **GET** METHOD : http://localhost:8080/orders/

- Show selected order by id with **GET** METHOD : http://localhost:8080/orders/?orders_id=    *add your order id after link

- Update selected order by id with **PUT** METHOD : http://localhost:8080/orders/?orders_id=    *add your order id after link
*JSON PUT example :*
```ruby
  {
    "code": "Ord1",
    "name": "Dimas Anggara Putra",
    "address": "Kendangsari gang 10 no 09 Surabaya",
    "total_price": 330000,
    "note": "Tambah 1 item"
  }
```

- Delete selected item by id with **DELETE** METHOD : http://localhost:8080/orders/?orders_id=    *add your order id after link

**DETAIL ORDER (GET, POST, PUT)**
- Create new detail order with **POST** METHOD : http://localhost:8080/detail_orders/
*JSON POST example :*
```ruby
  {
    "order_id":1,
    "item_id":1,
    "item_qty":2,
    "total_price":220000
  }
```

- Show all detail order with **GET** METHOD : http://localhost:8080/detail_orders/

- Show selected detail order by id with **GET** METHOD : http://localhost:8080/detail_orders/?detail_id=    *add your detail order id after link

- Show selected detail order by order id with **GET** METHOD : http://localhost:8080/detail_orders/?order_id=    *add your detail order id after link

- Update selected detail order by id with **PUT** METHOD : http://localhost:8080/detail_orders/?detail_id=    *add your detail order id after link
*JSON PUT example :*
```ruby
  {
    "order_id":1,
    "item_id":1,
    "item_qty":3,
    "total_price":330000
  }
```

- Delete selected item by id with **DELETE** METHOD : http://localhost:8080/detail_orders/?detail_id= *add your detail order id after link
