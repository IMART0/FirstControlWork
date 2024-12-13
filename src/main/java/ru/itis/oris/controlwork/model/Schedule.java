package ru.itis.oris.controlwork.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Schedule {
    //Расписание (номер аудитории, время, день недели, преподаватель, группа)
    private Long id;
    private Integer room;
    private String date;
    private String weekday;
    private String teacher;
    private String group_number;

    public Schedule() {
    }

    public Schedule(Long id, Integer room, String date, String weekday, String teacher, String group) {
        this.id = id;
        this.room = room;
        this.date = date;
        this.weekday = weekday;
        this.teacher = teacher;
        this.group_number = group;
    }
}
