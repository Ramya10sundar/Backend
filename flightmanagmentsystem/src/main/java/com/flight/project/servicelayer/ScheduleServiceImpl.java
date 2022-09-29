//package com.flight.project.servicelayer;
//
//import java.util.List;
//import org.springframework.stereotype.Service;
//import com.flight.project.dto.Schedule;
//import com.flight.project.exception.ScheduleException;
//import com.flight.project.repository.ScheduleRepository;
//
//@Service
//public class ScheduleServiceImpl implements ScheduleService {
//	private ScheduleRepository sch;
//
//	public ScheduleServiceImpl(ScheduleRepository sch) {
//		super();
//		this.sch = sch;
//	}
//	@Override
//	public Schedule saveSchedule(Schedule schedule) {
//        return sch.save(schedule);
//    }
//	@Override
//    public List<Schedule> getAllSchedules() {
//        return sch.findAll();
//	}
//	@Override
//    public Schedule getScheduleById(long id) {
//        return sch.findById(id).orElseThrow(()->
//        new ScheduleException("Schedule","ID",id));
//        
//}
//	@Override
//	public Schedule updateSchedule(Schedule schedule,long id) {
//		
//		Schedule existingSch = sch.findById(id).orElseThrow(()->
//		new ScheduleException("Order","ID",id));
//		
//		existingSch.setSourceAirport(schedule.getSourceAirport());
//		existingSch.setDestinationAirport(schedule.getDestinationAirport());
//		existingSch.setArrivalTime(schedule.getArrivalTime());
//		existingSch.setDepartureTime(schedule.getDepartureTime());
//		
//		sch.save(existingSch);
//		return existingSch;
//	}
//	@Override
//	public void deleteSchedule(long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
