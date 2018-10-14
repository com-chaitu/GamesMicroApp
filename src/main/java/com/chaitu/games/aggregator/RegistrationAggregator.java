package com.chaitu.games.aggregator;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chaitu.games.constants.Constants;
import com.chaitu.games.dao.CustomerDao;
import com.chaitu.games.dao.LoginInfoDao;
import com.chaitu.games.model.RegistrationModel;
import com.chaitu.games.repository.CustomerRepository;
import com.chaitu.games.repository.LoginInfoRepository;
import com.chaitu.games.util.GamesUtil;
@Component
public class RegistrationAggregator {
	
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	LoginInfoRepository loginInfoRepo;

	public CustomerDao registerUser(RegistrationModel regInputData) throws ParseException {
		CustomerDao custDao = new CustomerDao();
		custDao.setUser_id(regInputData.getEmailId());
		custDao.setFirst_name(regInputData.getFirstName());
		custDao.setLast_name(regInputData.getLastName());
		java.util.Date sdfDate = new SimpleDateFormat(Constants.inputDateFormat).parse(regInputData.getDob());
		custDao.setDate_of_birth(new Date(sdfDate.getTime()));
		custDao.setMobile_no(Long.parseLong(regInputData.getMobieNumber()));
		custDao.setAddressLine1(regInputData.getAddressLine1());
		custDao.setAddressLine2(regInputData.getAddressLine2());
		custDao.setLandmark(regInputData.getLandmark());		
		custDao.setPincode(regInputData.getPincode());
		custDao.setActivated_date(new Date(new java.util.Date().getTime()));
		custDao.setQr_code(GamesUtil.generateQrCode());		
		return custRepo.save(custDao);
	}
	
	public boolean savePassword(RegistrationModel regInputData) {
		String userId = regInputData.getEmailId();
		if (custRepo.existsById(userId) && !loginInfoRepo.existsById(userId)) {
			LoginInfoDao loginInfoDao = new LoginInfoDao();
			loginInfoDao.setUser_id(userId);
			loginInfoDao.setEncoded_password(GamesUtil.getEncodedPassword(regInputData.getPassword()));
			loginInfoRepo.save(loginInfoDao);
			return true;
		} 
		return false;
	}
}
