package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int custNum = 1;
        int iat = 0;
        int clock = 0;
        int sBegins = 0;
        int st;
        int queue = 0;
        int sEnds = 0;
        int timeInSys = 0;
        int idleTime = 0;

        while (custNum < 16) {
            int x = generate_IAT() ;
            iat = Rn_IAT(x);
            int y = generate_ST() ;
            st = Rn_ST(y);
            clock+=iat ;
            if(sEnds > clock) {
                queue = sEnds-clock ;
                sBegins = sEnds ;
            }
            else {
                sBegins =clock ;
                idleTime = clock - sEnds ;

            }
            sEnds = sBegins + st ;
            timeInSys = st + queue ;

            System.out.println("Customer Number : "+ custNum +"| RN_IAT : "+ x +"| IAT : "+ iat + "| Clock : "+ clock + "| Service Begins : " + sBegins + "| RN_ST : "+ y +
                    "| Service Time : " +st + "| Queue : "+ queue + "| Service Ends : "+ sEnds + "| Time in system : "+ timeInSys +"| Idle time : "+ idleTime);






        idleTime = 0 ;
        queue = 0;
        custNum++ ;

        }


    }

    public static int generate_random_number() {
        Random random_number = new Random();
        return random_number.nextInt(100);

    }

    public static int generate_IAT() {
        int IAT = generate_random_number();
        return IAT;
    }

    public static int generate_ST() {
        int ST = generate_random_number();
        return ST;
    }

    public static int Rn_IAT(int x) {
        if (x >= 0 && x <= 4) {
            return 1;
        } else if (x >= 5 && x <= 14) {
            return 2;
        } else if (x >= 15 && x <= 54) {
            return 3;
        } else if (x >= 55 && x <= 89) {
            return 4;
        } else
            return 5;

    }

    public static int Rn_ST(int x) {
        if (x >= 0 && x <= 24) {
            return 1;
        } else if (x >= 25 && x <= 49) {
            return 2;
        } else if (x >= 50 && x <= 74) {
            return 3;
        } else
            return 4;

    }

}
