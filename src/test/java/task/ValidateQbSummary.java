package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateQbSummary {

	static String sourceText="PI Planning Document – Result Admission Taskbar\r\n"
			+ "Overview\r\n"
			+ "\r\n"
			+ "The Result Admission Taskbar project is a key initiative under the upcoming Program Increment (PI). The goal of this PI is to streamline the student admission process by integrating result publication and admission workflows into a single, intuitive interface. Currently, students must navigate multiple portals for exam results and admission-related activities, which causes delays, confusion, and missed deadlines. The proposed solution will introduce a unified taskbar that centralizes result access, admission notifications, and action items, ensuring a smooth and transparent process for students, administrators, and faculty members.\r\n"
			+ "\r\n"
			+ "Business Objectives\r\n"
			+ "\r\n"
			+ "Improve Student Experience: Provide a single point of access where students can view exam results, receive admission offers, and complete enrollment steps.\r\n"
			+ "\r\n"
			+ "Operational Efficiency: Reduce manual intervention and administrative overhead by automating communication and status tracking.\r\n"
			+ "\r\n"
			+ "Compliance: Ensure that admission processes adhere to institutional regulations and timelines.\r\n"
			+ "\r\n"
			+ "Scalability: Support a growing number of applicants and courses without performance degradation.\r\n"
			+ "\r\n"
			+ "Key Features in Scope\r\n"
			+ "\r\n"
			+ "Unified Result & Admission Dashboard: Displays exam results alongside pending admission tasks.\r\n"
			+ "\r\n"
			+ "Notification System: Real-time updates on admission status, deadlines, and document requirements.\r\n"
			+ "\r\n"
			+ "Automated Workflow: Admission steps automatically progress once prerequisites are met (e.g., result verification).\r\n"
			+ "\r\n"
			+ "Analytics & Reporting: Provide insights into admission trends, student demographics, and completion rates.\r\n"
			+ "\r\n"
			+ "Role-Based Access Control: Separate interfaces and permissions for students, faculty, and administrators.\r\n"
			+ "\r\n"
			+ "Out of Scope\r\n"
			+ "\r\n"
			+ "Third-party integrations with external universities (deferred to future PI).\r\n"
			+ "\r\n"
			+ "Mobile application support (planned for later release).\r\n"
			+ "\r\n"
			+ "Program Increment Objectives\r\n"
			+ "\r\n"
			+ "Launch the Result Admission Taskbar MVP with results and admission integration.\r\n"
			+ "\r\n"
			+ "Enable automated notifications for at least 80% of admission workflows.\r\n"
			+ "\r\n"
			+ "Deliver analytics dashboards for admission administrators.\r\n"
			+ "\r\n"
			+ "Achieve 95% uptime during admission season to handle peak loads.\r\n"
			+ "\r\n"
			+ "Dependencies\r\n"
			+ "\r\n"
			+ "Student database service for fetching exam results.\r\n"
			+ "\r\n"
			+ "Admission management system for status updates.\r\n"
			+ "\r\n"
			+ "Notification gateway (email/SMS).\r\n"
			+ "\r\n"
			+ "Identity and access management for user authentication.\r\n"
			+ "\r\n"
			+ "Risks & Mitigations\r\n"
			+ "\r\n"
			+ "Risk: High system load during admission result publication.\r\n"
			+ "\r\n"
			+ "Mitigation: Implement load balancing and cloud autoscaling.\r\n"
			+ "\r\n"
			+ "Risk: Data inconsistency between result and admission systems.\r\n"
			+ "\r\n"
			+ "Mitigation: Establish automated reconciliation jobs.\r\n"
			+ "\r\n"
			+ "Risk: Delayed integration testing due to dependency on the student database team.\r\n"
			+ "\r\n"
			+ "Mitigation: Use mock APIs to simulate dependent systems.\r\n"
			+ "\r\n"
			+ "Team Assignments\r\n"
			+ "\r\n"
			+ "Team A (Frontend): Build the dashboard UI and taskbar experience.\r\n"
			+ "\r\n"
			+ "Team B (Backend): Develop APIs for result and admission data integration.\r\n"
			+ "\r\n"
			+ "Team C (Notifications): Implement real-time communication channels.\r\n"
			+ "\r\n"
			+ "Team D (Analytics): Build reporting and visualization modules.\r\n"
			+ "\r\n"
			+ "Milestones\r\n"
			+ "\r\n"
			+ "Week 1–2: Requirement finalization and architecture design.\r\n"
			+ "\r\n"
			+ "Week 3–6: Development of core dashboard and workflows.\r\n"
			+ "\r\n"
			+ "Week 7–8: Integration testing and UAT.\r\n"
			+ "\r\n"
			+ "Week 9: Deployment and release readiness review.";
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://quillbot.com/summarize");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement summarizeTexbox= driver.findElement(By.xpath("//div[@role='textbox']"));
		summarizeTexbox.sendKeys(sourceText);
		summarizeTexbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']/span[text()='Summarize']")).click();
		Thread.sleep(3000);
		WebElement qB_SummaryTextBox= driver.findElement(By.xpath("//div[@id='outputBoxSummarizer']"));
		Thread.sleep(2000);
		String qBsummary =qB_SummaryTextBox.getText();
		System.out.println( qBsummary);
      
		driver.quit();

	}

}
