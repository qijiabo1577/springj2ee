/**
package com.baobaotao.demo.httpGet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.bobo.util.ArrayMap;
import com.bobo.util.Constant;
import com.bobo.util.JsonHelper;

import android.content.SharedPreferences;

/**
 * 这个类主要用于发送网络请求
 * @author lixueyi
 *
 */
/**
public class SendRequest {
    //向网络发送get请求,并且将请求到的数据进行解析，保存在sp文件中
    //这里使用一个数字进行标识，不同的表示代表调用不同的json解析方法
    public List<Map<String,Object>> sendGetRequest(String url,SharedPreferences sp,String key,int type){
        HttpGet get=new HttpGet(url);
        try {
            HttpResponse response=new DefaultHttpClient().execute(get);
            if(response.getStatusLine().getStatusCode()==200){
                String result=EntityUtils.toString(response.getEntity());
                if(result!=null&&!result.equals("")){
                     new JsonHelper().parse(arrayMap,result,sp,key,type);
                    
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        } 
         return arrayMap.list;
        
    }
}**/
