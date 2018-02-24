package com.ldk.dubboApi;
import java.util.List;

public interface DemoService {
    List<String> getPermissions(long id);
}