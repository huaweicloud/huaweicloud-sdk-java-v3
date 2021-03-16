package com.huaweicloud.sdk.roma.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

/**
 * 字典名称 - 字符集：中文、英文字母、数字、下划线和空格 - 约束：实例下唯一
 */
public class DictionaryName  {


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
        sb.append("class DictionaryName {\n");
        sb.append("}");
        return sb.toString();
    }
    
}

