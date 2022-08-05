import ru.netology.packages.round.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.numberOfSQR(200, 400));

    }
}
