package ru.itis.oris.controlwork.service;

import ru.itis.oris.controlwork.model.Schedule;
import ru.itis.oris.controlwork.repository.ScheduleRepository;

import java.util.List;

public class ScheduleService {

    private ScheduleRepository repository;

    public ScheduleService() {
        repository = new ScheduleRepository();
    }

    public List<Schedule> getAll() {
        return repository.getAll();
    }

    public Schedule findById(Long id) {return repository.findById(id);}
}
