package com.ucu.olimpiadas.Controller;

import com.ucu.olimpiadas.Model.Judge;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/judge")
public class JudgeController {
    @GetMapping(path = "/getAllJudges")
    public List<Judge> getAllJudges() {
        return null;
    }

    @GetMapping(path = "/getJudge")
    public Judge getJudge(@RequestBody int id) {
        return null;
    }

    @PostMapping(path = "/addJudge")
    public Judge addJudge(Judge judge) {
        return judge;
    }
}
