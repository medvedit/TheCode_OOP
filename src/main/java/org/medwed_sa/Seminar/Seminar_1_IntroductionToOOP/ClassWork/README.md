#### Семинар 1, commit 001:  
Содали две папки:
* product:>
  * Product - класс родитель для всех последующих дочерних классов продуктов.
  Он содержит в себе поля присущие любым созданным в дальнейшем продуктам.
  Кроме этого в нем есть необходимые геттеры и сеттеры и переопределенный
  метод toString() для красивого вывода всех созданных продуктов в консоль.
  * Bottle - класс наследник от класса Product. В нем добавлено свое необходимое
  поле -> volume которое хранит значение емкости в литрах. Доступ к полям 
  родительского класса осуществляется через конструктор, в котором поля 
  класса родителя помечены ключевым словом super, и ниже добавлено поле volume.  
  Так-же в классе присутствует геттер и переопределенный метод toString() 
  возвращающий метод super toString() - класса родителя + объем класса Bottle.
* vending: 
  * VendingMachine - класс описывающий работу автомата с хранящимися в нем 
  продуктами.  
  В классе три поля: 1) final int idMachine - поле серийного номера машины,
  значение поле создается при создании экземпляра класса VendingMachine и больше не 
  меняется. 2) при загрузке товара в машину присваивается id каждому продукту. 
  Присвоение "тупое", просто по порядку. 3) Поле final List<Product> productList -
  будет использовать каждая новая машина.  
  Конструктор класса VendingMachine принимает в себя один параметр при создании 
  новой машины - серийный номер.  
  Геттер дающий возможность прочитать серийный номер машины.  
  Метод getProductByName - выдающий товар из машины с удалением выданного, если товар
  отсутствует - будет напечатано сообщение об его отсутствии.  
  Метод addProduct - добавляет ранее созданные продукты в автомат и присваивает
  для каждого добавленного продукта id.
  Метод getProductListInfo - формирует список всех находящихся в машине продуктов и 
  печатает сформированный список в консоль.
* Main:
  * Точка входа, место создания экземпляров продукта, место здания экземпляров 
  торговых машин и наполнения созданных машин продуктами.  