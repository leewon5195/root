import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class DisplayInfo {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String strFn = "src/twograde.csv";
      
      try {
         Reader rd = new InputStreamReader(new FileInputStream(strFn), "euc-kr");
         BufferedReader bf = new BufferedReader(rd);
         try {
            String strTemp;
            
            int nLine = 0;
            
            while((strTemp = bf.readLine()) != null) {
               nLine++;
            }
            System.out.println(nLine);
            bf.close();
            rd.close();
            
            int nSt = nLine - 1;
            
            GIS[] oneSt = new GIS[nSt];
            
            
            //Scanner 이용하여서 파일을 다시 읽어내면서 한줄단위를(콤마)기준으로 열단위 필드를 배열로 생성한다.
            FileInputStream fin = new FileInputStream(strFn);
            Scanner scanner = new Scanner(fin);
            
            strTemp = scanner.nextLine();
            
            String csvSplitBy = ",";
            String[] strLineArray;
            
            for(int i=0; i<=28; i++) {
            	if(scanner.hasNextLine()) {
            		
            		strTemp = scanner.nextLine();
            		strLineArray = strTemp.split(csvSplitBy);
            		
            		String strDepartment = strLineArray[0];
            		String nGrade = strLineArray[1];
            		String strId = strLineArray[2];
            		String strName = strLineArray[3];
            		String strAddress = strLineArray[4];
            		String email = strLineArray[5];
            		
            		System.out.println(strDepartment);
            		System.out.println(nGrade);
            		System.out.println(strId);
            		System.out.println(strName);
            		System.out.println(strAddress);
            		System.out.println(email);
            		
            		
            	}
            	
            }
            
            
         } catch(Exception e) {
            
            
            
         }
         
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } 
   }

}