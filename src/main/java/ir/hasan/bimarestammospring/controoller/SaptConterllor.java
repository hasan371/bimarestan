package ir.hasan.bimarestammospring.controoller;

import ir.hasan.bimarestammospring.model.Sapt;
import ir.hasan.bimarestammospring.repository.SaptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sapt")
public class SaptConterllor {
    @Autowired
    private SaptRepository saptRepository;
    @GetMapping
    public List<Sapt> getsapt(@RequestParam (required = false) String name1)
    {
        if (name1 != null ) {
            return saptRepository.findByMeli(name1);
        } else {
            List<Sapt> sapt = new ArrayList<>();
            saptRepository.findAll().forEach(sapt::add);
            return sapt;
        }
    }

}
