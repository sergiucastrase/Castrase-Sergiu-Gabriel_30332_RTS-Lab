package LabSession1.app2;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer{

    Window window;
    public void start(int noOfThreads, int processorLoad) {
        window = new Window(noOfThreads);

        for (int i = 0; i < noOfThreads; i++) {
            Fir fir = new Fir(i, processorLoad);
            fir.addObserver(this);

            Thread firThread = new Thread(fir);
            if (i + 2 > Thread.MAX_PRIORITY) {
                break;
            } else {
                firThread.setPriority(i + 2);
                firThread.start();
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        window.setProgressValue((UpdateObserver)arg);
    }
}