package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

import java.util.List;

public class AutoPage {

    public AutoPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//div[@class= 'carousel-inner'])[1]")
    public WebElement homePageSlider;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement loginErrorMessage;

    @FindBy(xpath = "//*[text()='Category']")
    public WebElement categories;

    @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement WomencategoryClick;

    @FindBy(xpath = "//*[@id='Women']/div/ul/li[1]/a")
    public WebElement dressClick;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement WomenDressProductsText;

    @FindBy(xpath = "(//span[@class='badge pull-right'])[2]")
    public WebElement catagoryMen;

    @FindBy(xpath = "//*[@id='Men']/div/ul/li[1]/a")
    public WebElement catagoryMenTsort;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement MenProductsText;

    @FindBy(xpath = "//*[h2='Login to your account']")
    public WebElement Logintoyouraccount;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailauto;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@type='submit'][1]")
    public WebElement autoLogin;

    @FindBy(xpath = "//li[10]")
    public WebElement Loggedinas;

    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteaccount;

    @FindBy (xpath = "//*[text()='New User Signup!']")
    public WebElement newUserYaziElementi;

    @FindBy (xpath = "//*[@data-qa='signup-name']")
    public WebElement nameButton;

    @FindBy (xpath = "//*[@data-qa='signup-email']")
    public WebElement emailButton;

    @FindBy (xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy (xpath = "//*[text()='Email Address already exist!']")
    public WebElement hataMesaji;

    @FindBy(xpath = "//li[2]")
    public WebElement productsLinki;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[2]")
    public WebElement urunResmi2;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement addToCart2;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[text()='Blue Top']")
    public WebElement BlueTopInCart;

    @FindBy(xpath = "//*[text()='Men Tshirt']")
    public WebElement MenTshirtInCart;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[1]")
    public WebElement totalprice1;

    @FindBy(xpath = "(//*[@class='cart_price'])[1]")
    public WebElement price1;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement quantity1;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public WebElement urunResmi;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homepagelink;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement singupbutton;

    @FindBy(xpath = "//li[10]")
    public WebElement loggedtext;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    public  WebElement accdeleted;

    @FindBy(xpath = "//*[@href='/view_cart']")
    public  WebElement cartButton;

    @FindBy(xpath = "//*[@class='active']")
    public  WebElement cartVerify;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public  WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public  WebElement registerLoginButton;

    @FindBy(xpath = "//*[text()='Address Details']")
    public  WebElement adressDetailsVerify;

    @FindBy(xpath = "//*[text()='Review Your Order']")
    public  WebElement reviewYourOrderVerify;

    @FindBy(xpath = "//*[@class='form-control']")
    public  WebElement textArea;
  
    @FindBy(xpath ="//li[@class='active']")
    public WebElement shoppingCart;
  
    @FindBy(id = "search_product")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchBoxButton;

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement  ProductsClick;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement  allProducts;

    @FindBy(id = "search_product")
    public WebElement searchproduct;

    @FindBy(id = "submit_search")
    public WebElement submitsearchClick;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProducts;

    @FindBy(xpath ="(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addtocart1;

    @FindBy(xpath ="(//a[@class='btn btn-default add-to-cart'])[2]")
    public WebElement addtocart2;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopping1;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signInLoginLinki20;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBox1;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox1;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginLinkiClick1;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsText;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutLinki;

    @FindBy(xpath = "//*[text()='Your delivery address']")
    public WebElement Yourdeliveryaddress;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement commentTextArea;

    @FindBy(xpath = "//*[@href='/payment']")
    public WebElement placeOrder;

    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCasesButton;

    @FindBy(xpath = "//*[h2='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//*[text()='Test Cases']")
    public WebElement navigatedToTestCasesPage;

    @FindBy(xpath = "//*[text()='Place Order']")
    public  WebElement placeOrderButton;

    @FindBy(xpath = "//*[@data-qa='name-on-card']")
    public  WebElement nameOnCardBox;

    @FindBy(xpath = "//*[@data-qa='card-number']")
    public  WebElement cardNumberBox;

    @FindBy(xpath = "//*[@data-qa='cvc']")
    public  WebElement cvcBox;

    @FindBy(xpath = "//*[@data-qa='expiry-month']")
    public  WebElement expiryMonthBox;

    @FindBy(xpath = "//*[@data-qa='expiry-year']")
    public  WebElement expiryYearBox;

    @FindBy(xpath = "//*[@data-qa='pay-button']")
    public  WebElement payAndConfirmButton;

    @FindBy(xpath = "//*[@class='alert-success alert']")
    public  WebElement orderPlacedSuccesVerify;

    @FindBy(id = "susbscribe_email")
    public WebElement subscribeEmail;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscribeEmailArrow;

    @FindBy(id = "success-subscribe")
    public WebElement successSubscribe;

    @FindBy(xpath = "//li//span")
    public List<WebElement>  brandsElements;

    @FindBy(xpath = "//*[@href='/brand_products/Kookie Kids']")
    public WebElement  kookieKidsButton;

    @FindBy(xpath = "//img[@alt='ecommerce website products']")
    public List<WebElement> productElements;

    @FindBy(xpath = "//*[@href='/brand_products/Biba']")
    public WebElement  bibaButton;

    @FindBy(xpath =" (//a[@style='color: brown;'])[1]")
    public WebElement viewProductWomenClick;

    @FindBy (xpath = "//p/b")
    public List<WebElement> productDetailsList;

    @FindBy (xpath = "//*[@class='product-information']")
    public WebElement productDetail;

    @FindBy (xpath = "//*[text()='Blue Top']")
    public WebElement productName;

    @FindBy (xpath = "//p[text()='Category: Women > Tops']")
    public WebElement categoryElementi;

    @FindBy (xpath = "//*[text()='Rs. 500']")
    public WebElement priceElementi;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement womenDressProductsText;

    @FindBy(xpath =" (//a[@style='color: brown;'])[1]")
    public WebElement viewProducWomentClick;

    @FindBy(xpath = "//*[text()='Write Your Review']")
    public WebElement writeYourReviewText;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement yourReviewNameBox;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement yourReviewİmailBox;

    @FindBy(xpath = "//textarea[@name='review']")
    public WebElement addReviewHereBox;

    @FindBy(id = "button-review")
    public WebElement buttonReview;
}