package JavaDay;

class Rectangle1 {
    private int width;
    private int height;
    public Rectangle1() {
    	this.height=3;
    	this.width=2;
    }
    public Rectangle1(int width,int height) {
    	this.width=width;
    	this.height=height;
    }
    public void eare() {
    	System.out.println("���Ϊ��"+width*height);
    }
    public void girth() {
    	System.out.println("�ܳ���"+2*(width+height));
    }
}
