package cn.yt4j.data.interceptor;

import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;

import java.sql.SQLException;

/**
 * 预览过滤器
 * @author gyv12345@163.com
 */
public class PreviewInterceptor implements InnerInterceptor {

    private Boolean preview;

    public PreviewInterceptor(Boolean preview) {
        this.preview = preview;
    }

    @Override
    public boolean willDoUpdate(Executor executor, MappedStatement ms, Object parameter) throws SQLException {
        return this.preview;
    }
}
