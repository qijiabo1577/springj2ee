package test.baobaotao.demo.httpGet;
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
 * �������Ҫ���ڷ�����������
 * @author lixueyi
 *
 */
/**
public class SendRequest {
    //�����緢��get����,���ҽ����󵽵���ݽ��н�����������sp�ļ���
    //����ʹ��һ�����ֽ��б�ʶ����ͬ�ı�ʾ�����ò�ͬ��json��������
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
