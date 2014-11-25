package com.baobaotao.util;

import java.sql.*;  
import java.io.*;

import javax.xml.parsers.*; 

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.*; //工厂包
import org.xml.sax.SAXException;

import com.baobaotao.util.ConnectionPool.PooledConnection;


public class ImportXmlUtil {
	public static void main(String[] args) throws Exception, SAXException, IOException{
		conn = getConn();
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document doc=builder.parse(new File("E:/AS7ZSZD7W7T824OWY1IZXQGJZDNCNB_new.xml"));
		org.w3c.dom.NodeList list=doc.getElementsByTagName("Row");
		for(int i=0;i<list.getLength();i++){
			if(i%2000==0){
				System.gc();
			}
			Node node=list.item(i);
			NodeList childNodes=node.getChildNodes();
			String bh="";
			String mc="";
			String jc="";
			String flag="";
			String status="";
			for(int j=0;j<childNodes.getLength();j++){
				Node cNode=childNodes.item(j);
				if("BH".equals(cNode.getNodeName())){
					bh=StringUtils.isEmpty(cNode.getFirstChild().getNodeValue())?"":cNode.getFirstChild().getNodeValue();
				}else if("MC".equals(cNode.getNodeName())){
					mc=StringUtils.isEmpty(cNode.getFirstChild().getNodeValue())?"":cNode.getFirstChild().getNodeValue();
				}else if("JC".equals(cNode.getNodeName())){
					jc=StringUtils.isEmpty(cNode.getFirstChild().getNodeValue())?"":cNode.getFirstChild().getNodeValue();
				}else if("IS_ZSJG".equals(cNode.getNodeName())){
					flag=StringUtils.isEmpty(cNode.getFirstChild().getNodeValue())?"":cNode.getFirstChild().getNodeValue();
				}else if("STATUS".equals(cNode.getNodeName())){
					status=StringUtils.isEmpty(cNode.getFirstChild().getNodeValue())?"":cNode.getFirstChild().getNodeValue();
				}
			}
			//new CommonUtil().insertTmpGxsDm(bh, mc, jc, flag, status);
			
			System.out.println("bh:"+bh+"mc:"+mc+"jc:"+jc+"flag:"+flag+"status:"+status);
			PreparedStatement stat = null;
			try {
			String sql = "insert into tmp_gxsdm (BH, MC, JC, IS_ZSJG, STATUS) " +
					" values (?,?,?,?,?)";
			stat = conn.prepareStatement(sql);
			stat.setString(1, bh);//字典级别
			stat.setString(2, mc);//字典代码
			stat.setString(3, jc);//父节点代码
			stat.setString(4, flag);//字典类型：GXSDM
			stat.setString(5, status);//字典值
			stat.executeUpdate();
			stat.close();
			stat = null;
			} catch (Exception e) {
				e.printStackTrace();
				stat.close();
				stat = null;
				continue;
			}
		}
	}
	private static ConnectionPool connectionPool;//连接池
	private static PooledConnection conn = null;//连接
	private static PooledConnection getConn(){
		try {
			String driver="oracle.jdbc.driver.OracleDriver";
			String dbUrl="jdbc:oracle:thin:@192.168.1.168:1521:yppt";
			String userName="yppt_gd";
			String passWord="yppt_gd";
			//如果连接池为空，创建一个
			if(connectionPool==null){
				connectionPool = new ConnectionPool(driver, dbUrl, userName, passWord);
			}
			conn = connectionPool.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
