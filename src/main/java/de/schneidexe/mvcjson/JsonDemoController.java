package de.schneidexe.mvcjson;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller("/mvcjson")
public class JsonDemoController {

    @RequestMapping(method = RequestMethod.GET, value = "/map")
    public @ResponseBody Map getJsonMap() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("key", "value");
        return map;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/object")
    public @ResponseBody DemoObject getJsonObject() {
        DemoObject demo1 = new DemoObject();
        demo1.setDemoString("demo1");
        demo1.setDemoLong(1L);
        demo1.setDemoDouble(1.23);
        demo1.setDemoLocale(Locale.GERMAN);

        DemoObject demo2 = new DemoObject();
        demo2.setDemoString("demo2");
        demo2.setDemoLong(2L);
        demo2.setDemoDouble(2.46);
        demo2.setDemoLocale(Locale.UK);
        demo2.setNestedDemoObject(demo1);

        return demo2;
    }

}
