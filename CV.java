import java.util.*;
public class CV {
	
public static void main(String args[]) {
	String person = "Kaushik_sabyasachi_parida";
	PERSONAL_INFORMATION(person);
}

    static void PERSONAL_INFORMATION(String person) {
	String NAME = "Kaushik Sabyasachi Parida" ;
	long CONTACT = 8328932057l ;
	String LinkedIn = "Linked IN link";
	String Github = "Github Link";
	
	
	String Education =person;
	EDUCATION(Education);
    }
    
    
    static void EDUCATION(String Education) {
    	String Graduaction = "B.Tech";
    	String Specializtion = "COMPUTER SCIENCE";
    	String College = "Government College Of Engineering ,Keonjhar";
    	int YEAR_OF_PASSING1 = 2022;
    	double CGPA = 8.83;
    	
    	String SCHOOL ="DELHI PUBLI SCHOOL ,DAMANJODI";
    	int YEAR_OF_PASSING2 = 2018;
    	
    	
    	String Technical =Education;
    	TECHNICAL_SKILLS(Technical);
    }
    
    static void TECHNICAL_SKILLS(String Technical) {
    	String Langauges = "JAVA"+"PYTHON"+"C++";
    	String Designing = "Figma";
    	String Developers_Tool = "Github";
    	
    	
    	String Achievement = Technical;
    	ACHIEVEMENTS(Achievement);
    }
    
    static void ACHIEVEMENTS(String Achievement) {
    	String GFG_Ratings ="";
    	String CODECHEF ="";
    	
    	
    	String Certification =Achievement;
    	CERTIFICATION (Certification);
    }
    
    static void CERTIFICATION(String Certification) {
    	String SAP ="";
    	String CISCO ="";
    	
    	
    	String Projects = Certification;
    	PROJECTS(Projects);
    }
    
    static void PROJECTS(String Projects) {
    	/*COLLEGE LIBRARY AND QUIZ :-
    	//CALCULATOR :- */
    }
}