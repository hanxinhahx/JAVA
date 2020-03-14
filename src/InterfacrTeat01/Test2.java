package InterfacrTeat01;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class Test2 {
  public static void main(String[] args) {
	  FileFilter FileFilter=new FileFilter() {

		@Override
		public boolean accept(File f) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return null;
		}
		  
	  }
	  
 }
}
