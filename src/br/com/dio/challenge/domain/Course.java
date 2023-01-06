package br.com.dio.challenge.domain;

public class Course extends Content{

    private int workload;

    public Course() {
    }

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    @Override
    public double calculate_Xp() {
        return XP_PATTERN*workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}