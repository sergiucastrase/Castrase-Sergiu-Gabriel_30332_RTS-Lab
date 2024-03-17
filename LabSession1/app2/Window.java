package LabSession1.app2;

import javax.swing.*;
import java.util.ArrayList;

public class Window extends JFrame {
    ArrayList<JProgressBar> bars=new ArrayList<JProgressBar>();
    public ArrayList<JProgressBar> getBars(){
        return this.bars;
    }
    public Window(int noOfThreads) {
        setLayout(null);
        setSize(450,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(noOfThreads);
        this.setVisible(true);

    }
    private void init(int n){

        for(int i=0 ;i<n; i++){
            JProgressBar pb=new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50,(i+1)*30,350,20);
            this.add(pb);
            this.bars.add(pb);

        }
    }
    public void setProgressValue(UpdateObserver updateObserver){
        bars.get(updateObserver.getId()).setValue(updateObserver.getProgress());
    }
}