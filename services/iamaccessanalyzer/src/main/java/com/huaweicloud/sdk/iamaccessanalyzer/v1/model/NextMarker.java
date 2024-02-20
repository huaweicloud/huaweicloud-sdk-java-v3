package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import java.util.Objects;

/**
 * 如果存在更多可用的输出，那么该值表示可用输出比当前响应中包含的更多。在后续调用此操作时，您可以在标记请求参数中使用此值，以获取输出的下一部分。您应该重复这个过程，直到next_marker返回为null。
 */
public class NextMarker {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
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
        sb.append("class NextMarker {\n");
        sb.append("}");
        return sb.toString();
    }

}
