package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Recipient;
import com.example.hotelmysql.repository.RecipientRepository;
import com.example.hotelmysql.service.RecipientService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipientSDJpaService implements RecipientService {

    private final RecipientRepository recipientRepository;

    public RecipientSDJpaService(RecipientRepository recipientRepository) {
        this.recipientRepository = recipientRepository;
    }

    @Override
    public Set<Recipient> findAll() {
        Set<Recipient> recipients = new HashSet<>();
        recipientRepository.findAll().forEach(recipients::add);
        return recipients;
    }

    @Override
    public Recipient findById(Long aLong) {
        return recipientRepository.findById(aLong).orElse(null);
    }

    @Override
    public Recipient save(Recipient object) {
        return recipientRepository.save(object);
    }

    @Override
    public void delete(Recipient recipient) {
        recipientRepository.delete(recipient);
    }

    @Override
    public void deleteById(Long aLong) {
        recipientRepository.deleteById(aLong);
    }
}
