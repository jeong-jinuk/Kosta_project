package kr.or.kosta.mvc.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.ExcelVO;


//@Repository
public class LoadPoiDao {
	
	private LoadPoiDao poi;
	
	public List<Map<String,Object>> readExsel(String fileName) throws IOException {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		
		//엑셀파일이 있는 경로도 확인해서 수정해야함
		String path = "C:\\bigdataStudy\\webapp\\spring\\spring_MVC\\WebContent\\resources\\xls\\"+fileName;
		FileInputStream fis = new FileInputStream(path);
		// 액셀파일을 생성
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		int rowindex = 0;
		int columnindex = 0;
		// 시트 수 (첫번째에만 존재하므로 0을 준다)
		// 만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
		HSSFSheet sheet = workbook.getSheetAt(0);
		// 행의 수
		int rows = sheet.getPhysicalNumberOfRows();
		for (rowindex = 1; rowindex < rows; rowindex++) {
			ExcelVO vo = new ExcelVO();
			HashMap<String, Object> map2 = new HashMap<String, Object>();
		
			// 행을 읽는다
			HSSFRow row = sheet.getRow(rowindex);
			if (row != null) {
				// 셀의 수
				int cells = row.getPhysicalNumberOfCells();
				for (columnindex = 0; columnindex <= cells; columnindex++) {
					
					// 셀값을 읽는다
					HSSFCell cell = row.getCell(columnindex);
//					if(cell != null) {
//					System.out.println("cell "+cell);
//					}
					String key= "";
					String value = "";
					String count="";
					// 셀이 빈값일경우를 위한 널체크
					if (cell == null) {
						continue;
					} else {
						// 타입별로 내용 읽기
						switch (cell.getCellType()) {
						case HSSFCell.CELL_TYPE_FORMULA:
							value = cell.getCellFormula();
							break;
						case HSSFCell.CELL_TYPE_NUMERIC:
							value = String.valueOf(cell.getNumericCellValue() + "");
							count = String.valueOf(cell.getNumericCellValue() + "");
							break;
						case HSSFCell.CELL_TYPE_STRING:
							
							value = cell.getStringCellValue() + "";
							break;
						case HSSFCell.CELL_TYPE_BLANK:
							value = cell.getBooleanCellValue() + "";
							break;
						case HSSFCell.CELL_TYPE_ERROR:
							value = cell.getErrorCellValue() + "";
							break;
						}
					}
					
					
					if (columnindex == 0) {
						vo.setKeyword(value);
						map2.put("keyword",value);
					
						
					} else {
						map2.put("count",count);
						
						if(columnindex == 1) {
							data.add(map2);
						}
					}
				
				}
			}
		}
		return data;
	}
	
	public void excelDataMerge() {
		  Map<String, Map<String, Object>> resultMap = new HashMap<String, Map<String, Object>>();
		  
		  //합칠 파일이 있는 경로
		  String folder="C:\\bigdataStudy\\webapp\\spring\\spring_MVC\\WebContent\\resources\\xls";
		  //폴더명으로 파일객체 생성
		  File file=new File(folder);

		  if(!file.isDirectory()){
		   System.out.println("해당디렉토리는 존재하지 않습니다");
		   System.exit(1);
		   
		  }
		  //폴더라면 폴더가 가진 파일객체를 리스트로 받는다.
		  File[] list=file.listFiles();
		  LoadPoiDao poi = new LoadPoiDao();
		  List<Map<String,Object>> aa = null;
		  try {	
				for(int a=0; a<list.length; a++) {
				aa = poi.readExsel(list[a].getName()); //이 메소드에 합칠 파일의 이름들을 넣으면 파일의 내용들이 list에 저장되어 리턴된다
					for(int i=0; i<aa.size(); i++){
						String orderNumber = aa.get(i).get("keyword").toString(); //KEY VALUE
						
						if(resultMap.containsKey(orderNumber)){
						
							//KEY값이 존재하면 해당 키값의 해당되는 가격을 가져와 더해줌
							resultMap.get(orderNumber).put("count", 
							  Integer.parseInt(resultMap.get(orderNumber).get("count").toString().replace(".0","")) 
							+ Integer.parseInt(aa.get(i).get("count").toString().replace(".0","")) );
					
						}else{
							//KEY값이 존재하지 않으면 MAP에 데이터를 넣어줌
							resultMap.put(orderNumber, aa.get(i));
							
						}
						
					}
				} 
			   	
				//파일이 저장되는 경로
				String path="C:\\Users\\KOSTA\\Downloads\\TagDataExcel.csv";
				PrintWriter pw = null;
				
				try {
					pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))),true);
					StringBuffer sb = new StringBuffer();
					String cNameList=",";
					//리스트
					sb.append(cNameList);
					sb.append("\n");
					
					//키의 값을 가져와야  하는데 동적키라서 get이 아닌 entry 로 뽑아내어 사용
					for (Entry<String, Map<String, Object>> entry : resultMap.entrySet()) {
						String key = entry.getKey();
			 	        Object value = entry.getValue();
			 	        sb.append(key).append(",");
						sb.append(resultMap.get(key).get("count"));
						sb.append("\n");
					}

					pw.write(sb.toString());
					pw.close();
					System.out.println("마무리!");
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		//메인메소드는 여기서 바로 작업하기 위해 작성
		public static void main(String[] args) {
		
		LoadPoiDao poi = new LoadPoiDao();
		
		poi.excelDataMerge();
		
		
	}


}
