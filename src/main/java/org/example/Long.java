package org.example;

public class Long {
    private Long id;
    private Student student;
    private Car car;

    public Long(Long id, Student student, Car car) {
        this.id = id;
        this.student = student;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Long{" +
                "id=" + id +
                ", student=" + student +
                ", car=" + car +
                '}';
    }
}
