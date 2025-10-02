package task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ComparingTest {

	public static void main(String[] args) {
		
		String QbSummary = "The Result Admission Taskbar project is an essential initiative within the upcoming Program Increment (PI) aimed at optimizing the student admission process. This project seeks to integrate result publication and admission workflows into a singular, user-friendly interface. Currently, students face challenges by navigating through multiple portals to access exam results and perform admission activities, which leads to delays and confusion. The proposed taskbar intends to consolidate result access, admission notifications, and actionable items, promoting an efficient and transparent experience for students, faculty, and administrators alike.\r\n"
				+ "\r\n"
				+ "The overarching business objectives of this project include enhancing the student experience by offering a centralized access point for exam results, admission offers, and enrollment processes. It aims to improve operational efficiency by minimizing manual tasks and administrative burdens through automation. Compliance with institutional regulations and timelines is prioritized to ensure a smooth admission process. Furthermore, the system is designed to be scalable, accommodating an increasing applicant pool and additional courses without performance issues.\r\n"
				+ "\r\n"
				+ "Key features planned for development encompass a Unified Result & Admission Dashboard that presents exam results alongside outstanding admission tasks, a Notification System for real-time updates regarding admission status and requirements, and Automated Workflows that facilitate the progression of admission steps upon meeting preset criteria. Additionally, the platform will include Analytics & Reporting capabilities, providing valuable insights into admission trends and student demographics. Role-Based Access Control will be implemented to ensure distinct interfaces and permissions for varying user types including students, faculty, and administrators.\r\n"
				+ "\r\n"
				+ "It is important to note that certain elements are out of scope for this PI, such as third-party integrations with external universities and mobile application support, the latter identified for future development.\r\n"
				+ "\r\n"
				+ "The program increment objectives include launching a Minimum Viable Product (MVP) for the Result Admission Taskbar with integrated results and admission functionalities, automating notifications for at least 80% of admission processes, delivering analytical dashboards for admission staff, and ensuring a 95% uptime during peak admission periods.\r\n"
				+ "\r\n"
				+ "Several dependencies are vital for the project’s success, including the student database service for exam result retrieval, the admission management system for status updates, a notification gateway for communication, and identity management systems for user authentication.\r\n"
				+ "\r\n"
				+ "Identified risks associated with this project include potential high system load upon result publication, with mitigation strategies involving load balancing and cloud autoscaling. There are also concerns regarding data consistency between result and admission systems, which will be managed by automated reconciliation processes. Delays in integration testing due to reliance on the student database team are anticipated; to counter this, mock APIs will be utilized to replicate dependent functionalities.\r\n"
				+ "\r\n"
				+ "Team assignments are clearly allocated, with designated groups responsible for frontend development (Team A), backend API development (Team B), notifications (Team C), and analytics (Team D). The project timeline outlines critical milestones: weeks 1-2 for requirement finalization and architectural design, weeks 3-6 for core dashboard and workflow development, weeks 7-8 for integration testing and user acceptance testing, leading to project deployment and readiness review by week 9.";
		String ModelSummary ="Result Admission Taskbar Project Overview\r\n"
				+ "Purpose\r\n"
				+ "Centralize result publication and admission workflows into a unified interface to streamline processes for students, faculty, and administrators.\r\n"
				+ "\r\n"
				+ "Business Objectives\r\n"
				+ "Enhanced User Experience: Single access point for results, admission offers, and enrollment.\r\n"
				+ "Operational Efficiency: Reduce manual work via automation.\r\n"
				+ "Compliance: Align with institutional regulations and deadlines.\r\n"
				+ "Scalability: Support growing applicant pools and courses.\r\n"
				+ "Key Features\r\n"
				+ "Feature	Description\r\n"
				+ "Unified Dashboard	Combines exam results with admission tasks in one interface.\r\n"
				+ "Real-Time Notifications	Alerts for admission status changes or requirements.\r\n"
				+ "Automated Workflows	Progress admission steps automatically when criteria are met.\r\n"
				+ "Analytics & Reporting	Dashboards for admission trends and demographic insights.\r\n"
				+ "Role-Based Access	Custom interfaces/permissions for students, faculty, admins.\r\n"
				+ "Out-of-Scope\r\n"
				+ "Third-party integrations (external universities).\r\n"
				+ "Mobile app support (deferred to future PIs).\r\n"
				+ "Critical Dependencies\r\n"
				+ "Student database service (results retrieval).\r\n"
				+ "Admission management system (status updates).\r\n"
				+ "Notification gateway (communications).\r\n"
				+ "Identity management (authentication).\r\n"
				+ "Key Risks & Mitigation\r\n"
				+ "High System Load: Use load balancing and cloud autoscaling.\r\n"
				+ "Data Consistency: Implement automated reconciliation between systems.\r\n"
				+ "Integration Delays: Use mock APIs to simulate dependent systems during testing.\r\n"
				+ "Timeline\r\n"
				+ "Weeks 1–2: Finalize requirements and design.\r\n"
				+ "Weeks 3–6: Develop core dashboard and workflows.\r\n"
				+ "Weeks 7–8: Integration testing and UAT.\r\n"
				+ "Week 9: Deployment and readiness review.\r\n"
				+ "Program Increment Goals\r\n"
				+ "Launch MVP with integrated results and admission features.\r\n"
				+ "Achieve 80% automated notifications.\r\n"
				+ "Deliver analytics dashboards for admissions staff.\r\n"
				+ "Ensure 95% uptime during peak periods.\r\n"
				+ "Team Responsibilities\r\n"
				+ "Team A: Frontend development (dashboard UI).\r\n"
				+ "Team B: Backend API development (workflows/data integration).\r\n"
				+ "Team C: Notification system integration.\r\n"
				+ "Team D: Analytics and reporting tools."
				+ "";
		
		QbSummary=QbSummary.toLowerCase();
		ModelSummary=ModelSummary.toLowerCase();
		String[] qbText=QbSummary.split(" ");
		String[] mText=ModelSummary.split(" ");
		
		  Set<String> set1 = new HashSet<>(Arrays.asList(qbText));
	      Set<String> set2 = new HashSet<>(Arrays.asList(mText));
	        
	      // Find common words
	        Set<String> commonWords = new HashSet<>(set1);
	        commonWords.retainAll(set2);
	        
	        // Find total unique words
	        Set<String> allWords = new HashSet<>(set1);
	        allWords.addAll(set2);
	        
	        double percentage = (commonWords.size() * 100.0) / allWords.size();
	         
	        String status ;
	         if (percentage >= 85)
	         {
	             status = "PASS";
	         }
	         else if (percentage >= 65)
	         {
	             status = "MODERATE";
	         } 
	         else 
	         {
	             status = "FAIL";
	         }
	        System.out.println("QuillBot Summary : " + qbText);
	        System.out.println("Open Router Summary : " + mText);
	        System.out.println("Matching Common Words : " + commonWords);
	        System.out.println("Match Percentage: " + status + "%");
		
	}

}
