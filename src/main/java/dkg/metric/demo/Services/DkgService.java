package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.Dkg.DkgDTO;
import dkg.metric.demo.Repositories.DkgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DkgService {

    @Autowired
    private DkgRepository repository;



}
