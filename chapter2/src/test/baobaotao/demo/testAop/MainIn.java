package test.baobaotao.demo.testAop;

public class MainIn {
	
	public static void main(String[] args) {
		ForumService fsForumService=new ForumServiceImpl();
		fsForumService.removeTopic();
	}
}
