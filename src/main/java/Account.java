public class Account {

    private final String name;


    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int spaceCount = name.split(" ").length - 1;

        if ((name.length() >= 3) && (name.length() <= 19) && name.equals(name.trim()) && name.contains(" ") && spaceCount == 1) {
            System.out.println("Подходящее имя");
            return  true;
        }
        System.out.println("Неподходящее имя");
        return false;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
                в строке не меньше 3 и не больше 19 символов,
                в строке есть только один пробел,
                пробел стоит не в начале и не в конце строки.
         */


    }

}