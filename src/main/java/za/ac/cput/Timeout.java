package za.ac.cput;

import java.util.concurrent.TimeUnit;

public class Timeout {

    double money = 10.0;
    double interest = 1.14;

    public double InterestCalucation() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(900);
        return money / interest;
    }
}
