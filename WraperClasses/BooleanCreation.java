public class BooleanCreation {
    public static void main(String[] args) {
        //Конструктор 
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        
        //valueOf()
        Boolean b3 = Boolean.valueOf(true);
        
        //Автоупаковка
        Boolean b6 = true;
        
        //parseBoolean() + valueOf()
        Boolean b7 = Boolean.valueOf(Boolean.parseBoolean("true"));
        
        //Из строки
        Boolean b8 = Boolean.valueOf("false");
        Boolean b9 = Boolean.valueOf("anything");

    }
}
