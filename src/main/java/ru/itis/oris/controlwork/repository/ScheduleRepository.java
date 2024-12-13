package ru.itis.oris.controlwork.repository;

import ru.itis.oris.controlwork.model.Schedule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleRepository {

    private DbWork db = DbWork.getInstance();

    public Schedule findById(Long id) {
        Schedule shedule;
        try (Connection connection = db.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "select * from schedule where id=?");

            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            shedule = new Schedule(
                        resultSet.getLong("id"),
                        resultSet.getInt("room"),
                        resultSet.getString("date"),
                        resultSet.getString("weekday"),
                        resultSet.getString("teacher"),
                        resultSet.getString("group_number")
                );
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return shedule;
    }

    public List<Schedule> getAll() {
        List<Schedule> schedules = new ArrayList<>();

        try (Connection connection = db.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "select * from schedule");

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Schedule schedule = new Schedule(
                        resultSet.getLong("id"),
                        resultSet.getInt("room"),
                        resultSet.getString("date"),
                        resultSet.getString("weekday"),
                        resultSet.getString("teacher"),
                        resultSet.getString("group_number")
                        );
                schedules.add(schedule);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return schedules;
    }
}