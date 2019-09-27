package StepDefinitions;

import Pages.SeleniumPage;
import TestBase.Base;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SolutionStepDef extends Base{
	
	public SolutionStepDef()
	{

	}

	SeleniumPage page;


	@Before
	public void setUP()
	{
	Base.intialization();

	page = new SeleniumPage();


	}

	
	
	@Given("^User opened the application$")
	public void user_opened_the_application(){
		//Base.intialization();
		page.fnOpenBrowser();
	    
	}
	
	@When("^The page \"([^\"]*)\" is opened$")
	public void the_page_is_opened(String title){
	    page.fnVerifytitle(title);
	}

	@Then("^All the external links should work$")
	public void all_the_external_links_should_work() throws Exception{
	    page.fnvalidateExternalLinks();
	    
	}

	@When("^User clicks on oxygen link$")
	public void user_clicks_on_oxygen_link(){
	    page.clickOxygenLink();
	    
	}	

	@Then("^\"([^\"]*)\" page should be opened$")
	public void page_should_be_opened(String title) {
	    page.fnVerifytitle(title);
	}

	@Then("^Featured article icon should not be present$")
	public void featured_article_icon_should_not_be_present(){
	    page.fnVerifyFeaturedArticle();
	    
	}

	@Then("^Screenshot should be taken$")
	public void screenshot_should_be_taken() throws Exception{
	    page.fnTakeScreenShot();
	    
	}

	@Then("^Count the number pdf links$")
	public void count_the_number_pdf_links(){
	    page.fnCountPDFLinks();
	}

	@When("^User enters pluto in search box$")
	public void user_enters_pluto_in_search_box(){
		page.fnEnterPluto();
	    
	    
	}

	@Then("^Second suggestion should be selected$")
	public void second_suggestion_should_be_selected(){
		page.fnSelect2ndOption();
	    
	}
	
	@Then("^Browser should be closed$")
	public void browser_should_be_closed(){
	    page.teardown();
	}
	

}
