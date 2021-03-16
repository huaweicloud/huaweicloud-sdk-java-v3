package com.huaweicloud.sdk.roma.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用认证访问SECRET,未提供（字段不存在或值为null）时随机生成 - 字符集：英文字母、数字、！、@、#、$、%、+、&#x3D;、点、中划线、斜线/ - 复杂度：满足大小写字母、数字、特殊字符的复杂度组合，考虑兼容性暂时可不做
 */
public class AppSecret  {


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppSecret {\n");
        sb.append("}");
        return sb.toString();
    }
    
}

