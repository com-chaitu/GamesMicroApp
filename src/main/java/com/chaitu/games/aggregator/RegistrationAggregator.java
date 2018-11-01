package com.chaitu.games.aggregator;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.chaitu.games.constants.Constants;
import com.chaitu.games.dao.CustomerDao;
import com.chaitu.games.model.RegistrationModel;
import com.chaitu.games.repository.CustomerRepository;
import com.chaitu.games.util.GamesUtil;

@Component
public class RegistrationAggregator {

	@Autowired
	CustomerRepository custRepo;

	public CustomerDao registerUser(RegistrationModel regInputData) throws ParseException {
		CustomerDao resultCustDao = null;
		Optional<CustomerDao> isUserEnrolled = isUserEnrolled(regInputData);
		if (!isUserEnrolled.isPresent()) {
			CustomerDao custDao = new CustomerDao();
			custDao.setUser_id(regInputData.getEmailId());
			custDao.setFirst_name(regInputData.getFirstName());
			custDao.setLast_name(regInputData.getLastName());
			if (!StringUtils.isEmpty(regInputData.getDob())) {
				java.util.Date sdfDate = new SimpleDateFormat(Constants.inputDateFormat).parse(regInputData.getDob());
				custDao.setDate_of_birth(new Date(sdfDate.getTime()));
			}
			custDao.setMobile_no(Long.parseLong(regInputData.getMobile()));
			custDao.setAddressLine1(regInputData.getAddressLine1());
			custDao.setAddressLine2(regInputData.getAddressLine2());
			custDao.setLandmark(regInputData.getLandmark());
			custDao.setPincode(regInputData.getPincode());
			custDao.setActivated_date(new Date(new java.util.Date().getTime()));
			custDao.setQr_code(GamesUtil.generateQrCode());
			custDao.setEncoded_password(GamesUtil.getEncodedPassword(regInputData.getPassword()));
			resultCustDao = custRepo.save(custDao);
		}
		return resultCustDao;
	}

	public Optional<CustomerDao> isUserEnrolled(RegistrationModel regInputData) {
		return custRepo.findById(regInputData.getEmailId());
	}

}
