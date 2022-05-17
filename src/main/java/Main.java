import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int Minvalue;
        int Maxvalue;
        int result = service.squareNumbers (10, 99);
        System.out.println(result);
        }

    }

