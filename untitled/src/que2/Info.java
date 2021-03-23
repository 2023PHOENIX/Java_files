package que2;


class Player{
    int total_player = 10;
//    constructor for parent class
    Player(int player){
        this.total_player = player;
    }
//    this function going to return instance total player
    int count_player(){
        return total_player;
    }
}
class Cricket_Player extends Player{
//        construtor for child class
    Cricket_Player(int p){
//       invoking parent class constructor
        super(p);
    }
}
class Football_player extends Player{
    Football_player(int p){
        super(p);
    }
}

class Hocker_player extends Player{
    Hocker_player(int p){
        super(p);
    }
}
public class Info {

    public static void main(String[] args) {
        Cricket_Player C = new Cricket_Player(11);
        Hocker_player H = new Hocker_player(6);
        Football_player F = new Football_player(11);

        System.out.println("Hockey team has :"+H.count_player());
        System.out.println("Football team has :" + F.count_player());
        System.out.println("Cricket team has :" + C.count_player());
    }
}
