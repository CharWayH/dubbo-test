import com.charwayh.HelloService;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

/**
 * @author charwayH
 */

public class Test {
    public static void main(String[] args) {
        // 获取扩展加载器
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        // 遍历所有支持的扩展点 META-INF.dubbo
        Set<String> extensions = extensionLoader.getSupportedExtensions();
        for(String extension : extensions){
            System.out.println(extension);
            System.out.println(extensionLoader.getExtension(extension).sayHello());
        }
    }
}
