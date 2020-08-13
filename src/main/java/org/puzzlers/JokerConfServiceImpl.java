package org.puzzlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class JokerConfServiceImpl implements JokerConfService {

    private String conference;

    public JokerConfServiceImpl() {
        System.out.println("JokerConfServiceImpl shu service ishlayapti");
    }

    @Autowired
    public JokerConfServiceImpl(String conference) {
        System.out.println("JokerConfServiceImpl shu service ishlayapti");
        this.conference = conference;
    }

//    @Audit
    public void pay() {
        System.out.println("pay ishladimi +++++++++++++++++++++++++++++++++");
    }

}
