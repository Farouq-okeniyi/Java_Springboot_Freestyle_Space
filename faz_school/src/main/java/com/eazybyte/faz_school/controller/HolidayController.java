package com.eazybyte.faz_school.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.eazybyte.faz_school.model.Holiday;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HolidayController {
    // @GetMapping("/holidays")
    @GetMapping("/holidays/{display}")
    // public String displayHolidays(@RequestParam(required= false) Boolean festival, @RequestParam(required= false)Boolean federal, @RequestParam(required= false) Boolean religious, Model model){
    public String displayHolidays(@PathVariable String display, Model model){

        // model.addAttribute("festival", festival);
        // model.addAttribute("federal", federal);
        // model.addAttribute("religious", religious);
        if(null != display & display.equals("all")){
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
            model.addAttribute("religious", true);
        }else if(null != display & display.equals("festival")){
            model.addAttribute("festival", true);
        }else if(null != display & display.equals("federal")){
            model.addAttribute("federal", true);
        }else if(null != display & display.equals("religious")){
            model.addAttribute("religious", true);
        }else{
            model.addAttribute(null);
        }
        
        List<Holiday> holidays = Arrays.asList(
            new Holiday("Jan 1", "New Year’s Day", Holiday.Type.FEDERAL),
            new Holiday("May 1", "Workers’ Day", Holiday.Type.FEDERAL),
            new Holiday("Jun 12", "Democracy Day", Holiday.Type.FEDERAL),
            new Holiday("Oct 1", "Independence Day", Holiday.Type.FEDERAL),

            new Holiday("Feb 14", "Valentine’s Day", Holiday.Type.FESTIVAL),
            new Holiday("Dec 26", "Boxing Day", Holiday.Type.FESTIVAL),
            new Holiday("Dec 31", "New Year’s Eve", Holiday.Type.FESTIVAL),

            new Holiday("Apr 9", "Easter Sunday", Holiday.Type.RELIGIOUS),
            new Holiday("Apr 7", "Good Friday", Holiday.Type.RELIGIOUS),
            new Holiday("Apr 10", "Easter Monday", Holiday.Type.RELIGIOUS),
            new Holiday("Dec 25", "Christmas Day", Holiday.Type.RELIGIOUS),
            new Holiday("Apr 21", "Eid al-Fitr", Holiday.Type.RELIGIOUS),
            new Holiday("Jun 28", "Eid al-Adha", Holiday.Type.RELIGIOUS),
            new Holiday("Mar 23", "Ramadan Begins", Holiday.Type.RELIGIOUS),
            new Holiday("Sep 16", "Maulud Nabiy", Holiday.Type.RELIGIOUS)

    );
    Holiday.Type[] types = Holiday.Type.values();
    for (Holiday.Type type : types){
        model.addAttribute(type.toString(),
            (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
    }       
        System.out.print(types);
        log.debug(Arrays.toString(types));
        log.debug("reached the holiday controller");

        return "holidays.html";
    }

    // @PostMapping(value ="/saveHoliday")
    // public ModelAndView saveMessage(Holiday holiday){
    //     holidayService.saveHolidayDetails(holiday);
    //     return new ModelAndView("redirect:/contact");
    // }
}
