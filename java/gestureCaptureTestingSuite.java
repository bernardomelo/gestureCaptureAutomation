//JUnit5 + Appium Client5
package com.example.testing2;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;



public class gestureCaptureTestSuit {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeEach
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "ADB DEVICES CODE HERE");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='Mais opções']")).click();
        driver.findElement(By.xpath("//*[@text='Choose the gesture']")).click();
        driver.findElement(By.xpath("//*[@text='Navigation Routine']")).click();
        driver.findElement(By.xpath("//*[@text='START']")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc1() {
        driver.findElement(By.xpath("//*[@text='Telefone']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc1']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc2() {
        driver.findElement(By.xpath("//*[@text='Telefone']")).click();
        driver.findElement(By.xpath("//*[@text='Contatos']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_1']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc2']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc3() {
        driver.findElement(By.xpath("//*[@text='Telefone']")).click();
        driver.findElement(By.xpath("//*[@text='Recentes']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_2']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc3']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc4() {
        driver.swipe(401, 1500, 437, 581, 274);
        driver.findElement(By.xpath("//*[@text='Calculadora']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_3']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc4']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc5() {
        driver.swipe(364, 1470, 296, 14, 800);
        driver.findElement(By.xpath("//*[@text='Calculadora']")).click();
        driver.findElement(By.xpath("//*[@text='2']")).click();
        driver.findElement(By.xpath("//*[@text='+']")).click();
        driver.findElement(By.xpath("//*[@text='2']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_4']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc5']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc6() {
        driver.findElement(By.xpath("//*[@text='Câmera']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_5']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc6']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc7() {
        driver.findElement(By.xpath("//*[@text='Câmera']")).click();
        driver.swipe(624, 751, 96, 750, 265);
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_6']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc7']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc8() {
        driver.findElement(By.xpath("//*[@text='Câmera']")).click();
        driver.swipe(54, 795, 625, 820, 265);
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_7']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc8']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc9() {
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.findElement(By.xpath("//*[@text='Relógio']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_8']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc9']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc10() {
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.findElement(By.xpath("//*[@text='Relógio']")).click();
        driver.findElement(By.xpath("//*[@id='fab']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_9']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc10']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc11() {
        driver.swipe(401, 1500, 437, 581, 274);
        driver.findElement(By.xpath("//*[@text='Configurar']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc11']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc12() {
        driver.swipe(401, 1500, 437, 581, 274);
        driver.findElement(By.xpath("//*[@text='Configurar']")).click();
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.swipe(401, 1500, 437, 581, 274);
        driver.findElement(By.xpath("//*[@text='Sobre o telefone']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_1']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc12']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc13() {
        driver.findElement(By.xpath("//*[@text='YouTube']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_2']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc13']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc14() {
        driver.findElement(By.xpath("//*[@text='Mensagens']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_3']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc14']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @Test
    public void testtc16() {
        driver.findElement(By.xpath("//*[@text='Mensagens']")).click();
        driver.findElement(By.xpath("//*[@text='Iniciar chat']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@id='key_pos_ime_action']]/*[@class='android.widget.ImageView'])[2]")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.swipe(635, 751, 124, 744, 217);
        driver.swipe(624, 751, 96, 750, 265);
        driver.findElement(By.xpath("//*[@text='GestureCapture']")).click();
        driver.findElement(By.xpath("//*[@text='STOP']")).click();
        driver.findElement(By.xpath("//*[@id='saveButton']")).click();
        driver.findElement(By.xpath("//*[@id='testCaseName']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_0_4']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_2_3']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_0']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_5']]")).click();
        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
        driver.findElement(By.xpath("//*[@id='shareButton']")).click();
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.swipe(379, 1351, 411, 535, 433);
        driver.findElement(By.xpath("//*[@text='tc16']"));
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @AfterEach
    public void tearDown() {
        driver.findElement(By.xpath("//*[@id='recent_apps']")).click();
        driver.swipe(358, 1056, 283, 229, 185);
        driver.swipe(358, 1056, 283, 229, 185);
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.quit();
    }
}