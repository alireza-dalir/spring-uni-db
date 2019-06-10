package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Bill;
import com.example.hotelmysql.repository.BillRepository;
import com.example.hotelmysql.service.BillService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BillSDJpaService implements BillService {

    private final BillRepository billRepository;

    public BillSDJpaService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @Override
    public Set<Bill> findAll() {

        Set<Bill> bills = new HashSet<>();
        billRepository.findAll().forEach(bills::add);

        return bills;
    }

    @Override
    public Bill findById(Long aLong) {
        return billRepository.findById(aLong).orElse(null);
    }

    @Override
    public Bill save(Bill object) {
        return billRepository.save(object);
    }

    @Override
    public void delete(Bill bill) {
        billRepository.delete(bill);
    }

    @Override
    public void deleteById(Long aLong) {
        billRepository.deleteById(aLong);
    }
}
