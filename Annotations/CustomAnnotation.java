import java.lang.annotation.*;

// Цель: аннотация применяется к классам и методам
@Target({ElementType.TYPE, ElementType.METHOD})
// Политика: доступна во время выполнения (через рефлексию)
@Retention(RetentionPolicy.RUNTIME)
@interface BaseAction {
    int level();
    String description() default "Нет описания";
}

// Использование аннотации
@BaseAction(level = 2, description = "Главный класс приложения")
public class CustomAnnotation {
    
    @BaseAction(level = 1)
    public void start() {
        System.out.println("Запуск приложения");
    }
    
    public static void main(String[] args) {
        // Получение данных аннотации через рефлексию
        Class<?> clazz = CustomAnnotation.class;
        BaseAction classAnnotation = clazz.getAnnotation(BaseAction.class);
        
        if (classAnnotation != null) {
            System.out.println("Класс: уровень = " + classAnnotation.level());
            System.out.println("Класс: описание = " + classAnnotation.description());
        }
        
        // Чтение аннотации с метода
        try {
            BaseAction methodAnnotation = CustomAnnotation.class
                .getMethod("start")
                .getAnnotation(BaseAction.class);
            
            if (methodAnnotation != null) {
                System.out.println("Метод: уровень = " + methodAnnotation.level());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
