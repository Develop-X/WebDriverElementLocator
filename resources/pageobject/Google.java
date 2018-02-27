
public class Google {
		@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Images']")
		public WebElement xpath_1;

		@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Gmail']")
		public WebElement xpath_2;

		@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Settings']")
		public WebElement xpath_3;

		@FindBy(how=How.ID,using="gb_70")
		public WebElement gb_70;

		@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Advanced search']")
		public WebElement xpath_4;

		@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Privacy']")
		public WebElement xpath_5;

		@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Terms']")
		public WebElement xpath_6;

		@FindBy(how=How.NAME,using="source")
		public WebElement source;

		@FindBy(how=How.NAME,using="q")
		public WebElement q;

		@FindBy(how=How.NAME,using="btnG")
		public WebElement btnG;

		@FindBy(how=How.NAME,using="btnI")
		public WebElement btnI;

		@FindBy(how=How.ID,using="footer")
		public WebElement footer;

}