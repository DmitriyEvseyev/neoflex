package  com.neoflex.task1.singleton;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassLog {
    private static ClassLog instance;

    public static ClassLog getInstance() {
        if (instance == null) {
            instance = new ClassLog();
        }
        return instance;
    }

    private ClassLog() {   }

    public void classLogg(Object obj, String info) {
        // Получаем имя класса
        String className = obj.getClass().getSimpleName();

        // Форматируем текущую дату
        String date = new SimpleDateFormat("dd.MM.yy").format(new Date());

        // Формируем сообщение
        String logMessage = String.format("Log info: %s - %s - %s", date, className, info);

        // Выводим сообщение в консоль
        System.out.println(logMessage);
    }
}