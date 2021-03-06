package com.imdrissi.rbc.ace.robots.service;


import com.imdrissi.rbc.ace.robots.domain.Robot;
import com.imdrissi.rbc.ace.robots.repository.RobotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RobotService {

  @Autowired
  private RobotRepository robotRepository;


  public Iterable<Robot> allRobots() {
    return robotRepository.findAll();
  }


  public Robot getRobotById(Long id) {
    return robotRepository.findOne(id);
  }

  @Transactional
  public Robot saveRobot(Robot robot) {
    return robotRepository.save(robot);
  }

  @Transactional
  public void deleteRobot(Long id) {
    robotRepository.delete(id);
  }

  @Transactional
  public void deleteByRobotId(String robotId) {
    robotRepository.deleteByRobotId(robotId);
  }

  @Transactional
  public void softDeleteByRobotId(String robotId) {
    robotRepository.softDeleteByRobotId(robotId);
  }

  public Iterable<Robot> findBin() {
    return robotRepository.findBin();
  }

  public Iterable<Robot> findAllNotDeleted() {
    return robotRepository.findAllNotDeleted();
  }

  public Robot getRobotByRobotId(String robotId) {
    return robotRepository.findByRobotId(robotId);
  }

  public Robot findByRobotId(String robotId) {
    return robotRepository.findByRobotId(robotId);
  }

  public Robot updateRobot(Robot currentRobot) {
    return robotRepository.save(currentRobot);
  }
}
