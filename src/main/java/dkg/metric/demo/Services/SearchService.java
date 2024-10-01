package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.SearchDTO;
import dkg.metric.demo.DTOs.returnDTO;
import dkg.metric.demo.Repositories.SearshRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    private SearshRepository repository;


    public returnDTO create(SearchDTO data){
        return new returnDTO("Criado",200);
    }







}
