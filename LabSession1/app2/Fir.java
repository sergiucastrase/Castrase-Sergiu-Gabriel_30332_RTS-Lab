package LabSession1.app2;

import java.util.Observable;

public class Fir extends Observable implements Runnable {

    int id;
    int processorLoad;

    Fir(int id, int prcLoad){

        this.id = id;
        this.processorLoad = prcLoad;
    }

    public void run(){

        int c = 0;
        while(c < 1000){
            for(int j = 0; j < this.processorLoad; j++){
                j++;
                j--;
            }
            c++;
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println("Thread cannot sleep");
            }
            this.setChanged();
            this.notifyObservers(new UpdateObserver(id, c));
        }
    }
}