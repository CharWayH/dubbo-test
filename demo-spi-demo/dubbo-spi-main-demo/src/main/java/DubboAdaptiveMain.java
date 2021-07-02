import com.charwayh.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author charwayH
 */
public class DubboAdaptiveMain {
    public static void main(String[] args) {
        // 重点是?后的内容hello.service相当于HelloService，=后填具体的key的内容
        URL url = URL.valueOf("test://localhost/hello?hello.service=dog");
        HelloService addativeExtension = ExtensionLoader.getExtensionLoader(HelloService.class).getAdaptiveExtension();
        // 调用对应的接口方法(填入URL)
        String msg = addativeExtension.sayHello(url);
        System.out.println(msg);
    }
}
