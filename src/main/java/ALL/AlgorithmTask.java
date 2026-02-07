package ALL;
//Класс-модель, представляющий алгоритмическую задачу.
//Это POJO (Plain Old Java Object) - простой Java-объект без зависимостей от фреймворков.
//1. Приватные поля (инкапсуляция)
//2. Публичные геттеры и сеттеры (доступ к полям)
//3. Конструкторы (как минимум пустой)
//4. Переопределенные equals(), hashCode(), toString() (опционально, но рекомендуется)
public class AlgorithmTask {
    //Поля приватные из-за инкапсуляции
    //Long вместо long, что бы мог хранится null
    private Long id;
    private String title;
    private String description;
    private String difficulty;
    private String category;
    private String tag;

    //Конструкторы
    //Хотя бы один пустой - обязательно для spring, hibernate, библиотек сериализации\десериализации
    public AlgorithmTask() {

    }

    //Используется при создании,задаются все поля кроме id, id присвоит БД
    public AlgorithmTask (String title, String description, String difficulty, String category, String tag) {
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.category = category;
        this.tag = tag;
    }

    //Полный конструктор, используется для загрузки задачи из БД
    public AlgorithmTask(Long id, String title, String description, String difficulty, String category, String tag) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.category = category;
        this.tag = tag;
    }

    //TODO геттеры\сеттеры\переопределения
}
