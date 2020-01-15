package com.zs.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * 
 * 类: HttpClient <br>
 * 描述: httpclient工具类 <br>
 * 作者: song<br>
 * 时间: 2017年7月21日 下午3:15:27
 */
public class HttpClientUtil {
	
	static CloseableHttpClient client = null;
	static {
		//1、创建httpClient实例
		client = HttpClients.createDefault();
	}
	
	/**
	 * 
	 * 方法: get <br>
	 * 描述: get请求 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017年7月21日 下午3:15:25
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String get(String url,HashMap<String, Object> params){
		try {
			//2、创建get对象
			HttpGet httpGet = new HttpGet();
			
			//3、拼接完成的get请求路径
			Set<String> keySet = params.keySet();
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(url).append("?t=").append(System.currentTimeMillis());
			for (String key : keySet) {
				stringBuffer.append("&").append(key).append("=").append(params.get(key));
			}
			
			httpGet.setURI(new URI(stringBuffer.toString()));
			//4、执行execute方法，发送请求
			CloseableHttpResponse execute = client.execute(httpGet);
			//5、获取请求的状态码
			int statusCode = execute.getStatusLine().getStatusCode();
			//判断请求是否成功
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
/*			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 
	 * 方法: post <br>
	 * 描述: post请求 <br>
	 * 作者: Teacher song<br>
	 * 时间: 2017年7月21日 下午3:20:31
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String post(String url,HashMap<String, Object> params) {
		try {
			HttpPost httpPost = new HttpPost();
			httpPost.setURI(new URI(url));
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				NameValuePair e = new BasicNameValuePair(key, params.get(key).toString());
				parameters.add(e);
			}
			
			HttpEntity entity = new UrlEncodedFormEntity(parameters , "utf-8");
			httpPost.setEntity(entity);
			
			CloseableHttpResponse execute = client.execute(httpPost);
			
			int statusCode = execute.getStatusLine().getStatusCode();
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
/*			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/			
			e.printStackTrace();
			return null;
		}
	}
	
	public static String post2(String url,String params) {
		try {
			HttpPost httpPost = new HttpPost();
			httpPost.setURI(new URI(url));
			//设置头信息
			httpPost.addHeader("Content-Type", "application/json");
			
			StringEntity stringEntity = new StringEntity(params,  "utf-8");
			httpPost.setEntity(stringEntity);
			
			CloseableHttpResponse execute = client.execute(httpPost);
			
			int statusCode = execute.getStatusLine().getStatusCode();
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
/*			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/			
			e.printStackTrace();
			return null;
		}
	}	
	
	//调用短信接口：给header传参
	public static String post3(String url,HashMap<String, Object> params,HashMap<String, Object> headerParam) {
		try {
			HttpPost httpPost = new HttpPost();
			httpPost.setURI(new URI(url));
			
			//设置header的参数
			Set<String> headSet = headerParam.keySet();
			for (String key : headSet) {
				httpPost.setHeader(key,headerParam.get(key).toString());
			}
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				NameValuePair e = new BasicNameValuePair(key, params.get(key).toString());
				parameters.add(e);
			}
			
			HttpEntity entity = new UrlEncodedFormEntity(parameters , "utf-8");
			httpPost.setEntity(entity);
			
			CloseableHttpResponse execute = client.execute(httpPost);
			
			int statusCode = execute.getStatusLine().getStatusCode();
			if (200 != statusCode) {
				return "";
			}
			return EntityUtils.toString(execute.getEntity(), "utf-8");
		}catch (Exception e) {
			//6、关闭连接
/*			try {
				client.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/			
			e.printStackTrace();
			return null;
		}
	}	

}
