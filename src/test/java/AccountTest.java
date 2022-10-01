import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;  // Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] cardNameData() {
        return new Object[][] {
                { "Тимотина Шаламеидзе", true},
                { "Тимотия Шаламеидзе", true},
                { "Т Ш", true},
                { "Тимоти Шаламе", true},
                { "ТимотиШаламе", false},
                { "", false},
                { " ", false},
                { "Т ", false},
                { " Тимоти Шаламе", false},
                { "Тимоти Шаламе ", false},
                { " ТимотиШаламе", false},
                { "ТимотиШаламе ", false},
                { "Тимоти  Шаламе", false},
                { "Тимотина Шаламеидзев", false},

                // Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsCorrectNameForPrint() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals(expected, actual);
    }
}