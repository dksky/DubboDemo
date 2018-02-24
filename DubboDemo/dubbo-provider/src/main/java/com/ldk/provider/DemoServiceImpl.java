package com.ldk.provider;

import java.util.ArrayList;
import java.util.List;
import com.ldk.dubboApi.DemoService;

public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}