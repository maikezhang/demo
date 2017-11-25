package cn.winter.demo.pojos;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Description:
 * Created with IntelliJ IDEA.
 * User: zhangyingjie
 * Date: 2017/11/19
 * Time: 上午12:29
 */
public class Base implements Serializable {
    protected static final Gson GSON = new Gson();

    @Override
    public String toString() {
        return GSON.toJson(this);
    }
}
