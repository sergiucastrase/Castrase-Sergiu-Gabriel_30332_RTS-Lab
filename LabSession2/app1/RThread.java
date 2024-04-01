package LabSession2.app1;

public class RThread extends Thread {
    FileService service;

    public RThread(FileService service) {
        this.service = service;
    }

    public void run() {
        while (!Main.isStopThreads()) {
            try {
                String readMsg;
                synchronized (service) {
                    readMsg = service.read();
                }
                System.out.println(readMsg);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
