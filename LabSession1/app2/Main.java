package LabSession1.app2;

public class Main {

    private static final int noOfThreads=6;

    private static final int processorLoad=1000000;

    public static void main(String[] args){

        new Controller().start(noOfThreads, processorLoad);
    }
}