package dkg.metric.demo.DTOs.Dkg;

import dkg.metric.demo.Entities.Users;
import org.apache.catalina.User;

import java.util.List;

public record DkgDTO(
        boolean click,
        List<String> contents,
        List<Integer> click_index,
        Double sum_pi,
        Users user


) {
}
