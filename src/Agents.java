import java.util.Scanner;

public class Agents {
    Car car;
    Train train;
    Plane plane;
    A a;
    B b;
    C c;
    D d;
    int town1size;
    int town2size;
int carsize = 1;
int trainsize = 2;
int planesize = 3;

    public Agents(Car car, Train train, Plane plane, A a, B b, C c, D d) {
        this.car = car;
        this.train = train;
        this.plane = plane;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void Agents() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите города отправителя и получателя");
        String town1 = sc.nextLine();
        String town2 = sc.nextLine();

        if (town1.equals("A")){
            int town1Size = a.aSize;
        } else if (town1.equals("B")) {
            int town1Size = b.bSize;
        } else if (town1.equals("C")) {
            int town1Size = c.cSize;
        } else if (town1.equals("D")) {
            int town1Size = d.dSize;
        }
        if(town2.equals("A")){
            int town2Size=a.aSize;
        }
        else if (town2.equals("B")) {
            int town2Size = b.bSize;
        }
        else if(town2.equals("C")) {
            int town2Size = c.cSize;
        }
        else if (town2.equals("D")) {
            int town2Size = d.dSize;
        }
        System.out.println("Введите тип транспорта(1.Автомобиль. 2.Поезд. 3.Самолет)");
        int x = sc.nextInt();
        switch (x){
            case 1:
                if(carsize<=town1size && carsize<=town2size){

                }
        }
        }
        }



