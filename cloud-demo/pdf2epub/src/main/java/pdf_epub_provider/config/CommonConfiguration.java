package pdf_epub_provider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pdf_epub_provider.entity.PathTotal;

/**
 * @author yishnee
 * @version 1.0
 */

@Configuration
public class CommonConfiguration {

    /**
     * 配置路径
     * @return 返回被注入值的路径类到spring容器内
     */
    @Bean
    @ConfigurationProperties("com.path")
    public PathTotal pathTotal() {
        return new PathTotal();
    }
}
