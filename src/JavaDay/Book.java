package JavaDay;

public class Book {
    private String title;
    private int pageNum=200;
    public void Showdetail() {
    	System.out.println("������"+title+"\t"+"ҳ����"+pageNum);
    }
    public Book(String title) {
    	this.title=title;
    }
    public Book(String title,int pageNum) {
    	this.title=title;
    	if(pageNum>200) {
    		this.pageNum=pageNum;
    	}
    	else {
    		System.out.println("�����ҳ������");
    	}
    }
    
}
