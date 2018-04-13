package io.zipcoder.service;

import io.zipcoder.domain.Bill;
import io.zipcoder.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public BillService() {}

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public ResponseEntity<Iterable<Bill>> getAllBillsForAccount() {
        Iterable<Bill> allBillsForAccount = billRepository.findAll();
        return new ResponseEntity<>(allBillsForAccount, HttpStatus.OK);
    }

    public ResponseEntity<Bill> getBillById(Long billId) {
        Bill bill = billRepository.findOne(billId);
        return new ResponseEntity<>(bill, HttpStatus.OK);
    }

//    public ResponseEntity<Iterable<Bill>> getAllBillsForCustomer(Customer customerId) {
//        Iterable<Bill> allBillsForCustomer = billRepository.findAll();
//        return new ResponseEntity<>(allBillsForCustomer, HttpStatus.OK);
//    }
}