### Идея лекции:

1. Введение
2. Класс и объект: детали
3. Наполнение
4. Концепты ООП
5. Примеры использования

Вопрос и ответы:   
`Правильный` план – реализация только после абстракций.  
`Абстракция` – что именно делает та или иная сущность?  
`Поведение` – каким именно обладает экземпляр или представитель сущности?  
`Спецификация` – набор правил, описывающих API.  
Класс:  
`Класс` – это «чертеж» (описание) сущности
предметной области, позволяющий выделить
некоторые общие характеристики, состояние
и поведение, зависящее от состояния.  
`Предметная область` — множество всех предметов
(явлений) решаемой проблемы.  
Экземпляр класса:  
`Экземпляр класса` – отдельный представитель
класса, имеющий КОНКРЕТНОЕ состояние
и поведение, которое полностью определяется
описанием класса.  
`Состояние` – набор данных -> поля, константы, события, атрибуты,
члены класса.  
`Поведение` – функции, конструкторы и методы для работы с данными
и выполнения полезной работы.

* Суть ООП, точнее суть этой лекции написать и писать в дальнейшем такой код, и что бы он не был завязан
  конкретных данных в класс, в метод. Правильнее создать класс с необходимыми полями, геттерами и сеттерами для
  чтения и изменения данных и далее создавать экземпляры классов, от класса "родителя".
* Увидим переиспользование и перегрузку методов.
* Инкапсуляция `Ex004`