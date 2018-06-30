package com.example.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis.HotSpotNew;
import com.example.mybatis.HotSpotNewMapper;


@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    HotSpotNewMapper hotSpotNewMapper;

    @RequestMapping(value={"/selectUserById"}, method=RequestMethod.GET)
    public HotSpotNew selectUserById(String id){
        HotSpotNew hotSpotNew = hotSpotNewMapper.selectUserById(Integer.parseInt(id));
        return hotSpotNew;
    }

    @RequestMapping(value={"/addUser"}, method=RequestMethod.POST)
    public void addUser(HotSpotNew hotSpotNew){
        hotSpotNewMapper.addUser(hotSpotNew);
    }

    @RequestMapping(value={"/updateUser"}, method=RequestMethod.POST)
    public void updateUser(HotSpotNew hotSpotNew){
        hotSpotNewMapper.updateUser(hotSpotNew);
    }

    @RequestMapping(value={"/deleteUser"}, method=RequestMethod.POST)
    public void deleteUser(String id){
        hotSpotNewMapper.deleteUser(Integer.parseInt(id));
    }
}
