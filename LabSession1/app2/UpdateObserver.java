package LabSession1.app2;

public class UpdateObserver {
    public int id;
    public int progress;
    public int getId() {
        return id;
    }
    public int getProgress() {
        return progress;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setProgress(int progress) {
        this.progress = progress;
    }
    public UpdateObserver(int id, int progress) {
        this.id = id;
        this.progress = progress;
    }
}