package com.huaweicloud.sdk.roma.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

/**
 * 父字典编码,为空时代表自身就是最顶级字典
 */
public class DictionaryParent  {

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
        sb.append("class DictionaryParent {\n");
        sb.append("}");
        return sb.toString();
    }
    
}

