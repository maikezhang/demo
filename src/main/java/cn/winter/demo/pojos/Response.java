package cn.winter.demo.pojos;

/**
 * Description:
 * Created with IntelliJ IDEA.
 * User: zhangyingjie
 * Date: 2017/11/18
 * Time: 下午8:23
 */
public class Response<T>  {

    private int code =0;
    private String msg="请求已处理";
    private T res;


    private Response(T res) {
        this.res = res;
    }

    public static  <V> Response<V> ok(V res){
        return new Response(res);
    }


}
