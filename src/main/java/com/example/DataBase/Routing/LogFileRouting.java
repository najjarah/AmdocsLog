package com.example.DataBase.Routing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.DataBase.Repository.AppRepository;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.Repository.DefectRepository;
import com.example.DataBase.Repository.LogFileRepository;
import com.example.DataBase.domain.App;
import com.example.DataBase.domain.Defect;
import com.example.DataBase.domain.DefectInstance;
import com.example.DataBase.domain.LogFile;

//@RestController
public class LogFileRouting {
	
	public static final int typePosition = 5;
	public static final int SeverityPosition = 4;
	public static final int ErrorPosition = 3;
	
	
	public List<Defect> defList = new ArrayList<Defect>();
	public List<App> appList = new ArrayList<App>();
	public List<DefectInstance> defInsList = new ArrayList<DefectInstance>();
	public List<LogFile> logFList = new ArrayList<LogFile>();
	
//	  @Autowired 
//      private AppRepository appRepository;
//
//	  @Autowired 
//      private DefectRepository defectRepository;
//	  
//	  @Autowired 
//      private LogFileRepository logFileRepository;
//	  
//	  @Autowired 
//      private DefectInstanceRepository defectInstanceRepository;

	 
//-----------------------------------------------------getters and setters----------------------------------------------------------------
	 

		
//----------------------------------------------------------controller methods-----------------------------------------------------------
	
	public void SearchDefects(File file, String searchStr,AppRepository appRepo, DefectRepository defRepo, LogFileRepository logRepo, DefectInstanceRepository definsRepo) throws Exception 
	
	{

		
		int Counter = 0;
		Scanner scanFile = new Scanner(file);
		String line = scanFile.nextLine().toString();
		LogFile templogfile = new LogFile(file.getName(),"today","now");
		
		
		
		while (scanFile.hasNext()) {
			
			
			Defect tempDefect = new Defect() ;
			App tempApp = new App() ;
			DefectInstance tempDefectInstance = new DefectInstance();
			line = scanFile.nextLine().toString();
			String arr[] = line.split(" ");
			
			if (arr.length > ErrorPosition && line.contains(searchStr)) {
				if (arr[ErrorPosition].startsWith("(") && arr[ErrorPosition].endsWith(")")) {
					Counter++;
					int pos = arr[ErrorPosition].indexOf("-");
					String ProgramName = arr[ErrorPosition].substring(1, pos - 1);
					String defCode = arr[ErrorPosition].substring(pos + 1, arr[ErrorPosition].length() - 1);
					
					tempDefect.setErrorCode(defCode);
					tempApp.setName(ProgramName);
					
					
					
					int redDig = Character.getNumericValue(tempDefect.getErrorCode().charAt(typePosition));
					// level of defect (1-3) critical, (4-6) error, more than 6 warning
					if (1 <= redDig && redDig <= 3) {
						tempDefect.setSeverity("Critical");
					
					}
					if (4 <= redDig && redDig <= 6) {
						tempDefect.setSeverity("Error");
					}
					if (redDig > 6) {
						tempDefect.setSeverity("Warning");
					}
					if (arr[ErrorPosition].charAt(4) == '1')
						tempApp.setType("Core");
					else
						tempApp.setType("Custom");
					
					appList = appRepo.checkAppexist(tempApp.getName() ,tempApp.getType() );
					if(appList.isEmpty()) {
						appRepo.save(tempApp);
					}
					else {
						tempDefectInstance.setApp(appList.get(0));
					}
					
					defList = defRepo.checkDefectexist(tempDefect.getErrorCode());
					if(defList.isEmpty()) {
						defRepo.save(tempDefect);
					}
					else {
						tempDefectInstance.setDefect(defList.get(0));
					}
					//tempDefectInstance.setApp(tempApp);
					//tempDefectInstance.setDefect(tempDefect);
					tempDefectInstance.setLogfile(templogfile);
					
				
					defInsList.add(tempDefectInstance);
					
	
			}
		}


	}
		logFList.add(templogfile);
		System.out.println(Counter + " '" + searchStr + "' founded in log file " );
		scanFile.close();
		
		
		//defRepo.deleteAll();
		logRepo.deleteAll();
		//appRepo.deleteAll();
		definsRepo.deleteAll();
			
		//defRepo.saveAll(defList);
		logRepo.saveAll(logFList);
		//appRepo.saveAll(appList);
		definsRepo.saveAll(defInsList);
}
	


}
