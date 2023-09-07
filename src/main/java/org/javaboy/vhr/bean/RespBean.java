package org.javaboy.vhr.bean;

import lombok.Data;

/**
 * @author Acrossthewind
 * @version 1.0
 * @description: TODO
 * @date 2023/9/7 8:42
 */
@Data
public class RespBean {
    private Integer status;
    private String msg;
    private Object obj;

    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }

    public static RespBean ok(String msg,Object obj){
        return new RespBean(200,msg,obj);
    }

    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }

    public static RespBean error(String msg, Object obj){
        return new RespBean(500,msg,obj);
    }

    private RespBean(){}

    public RespBean(Integer status,String msg,Object obj){
        this.status=status;
        this.msg=msg;
        this.obj=obj;
    }

    public Integer getStatus(){
        return status;
    }





}
