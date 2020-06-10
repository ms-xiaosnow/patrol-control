package com.hik.icv.patrol.service;

public interface SerialService {

    /**
     * @Description 系统启动即串口打开并监听
     * @Author LuoJiaLei
     * @Date 2020/6/10
     * @Time 11:13
     */
    void serialListen();

    /**
     * @Description 串口传输数据
     * @Author LuoJiaLei
     * @Date 2020/6/10
     * @Time 15:30  
     */
    void serialSendData();

}
