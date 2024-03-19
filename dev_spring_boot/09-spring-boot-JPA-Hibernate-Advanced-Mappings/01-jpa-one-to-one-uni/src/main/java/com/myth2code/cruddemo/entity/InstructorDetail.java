package com.myth2code.cruddemo.entity;

import jakarta.persistence.*;
import org.aspectj.apache.bcel.generic.Instruction;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel")
    private String youtuberChannel;

    @Column(name = "hobby")
    private String hobby;

    public InstructorDetail(){

    }

    public InstructorDetail(String youtuberChannel, String hobby) {
        this.youtuberChannel = youtuberChannel;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutuberChannel() {
        return youtuberChannel;
    }

    public void setYoutuberChannel(String youtoberChannel) {
        this.youtuberChannel = youtoberChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtuberChannel='" + youtuberChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
