package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import java.util.Objects;

/**
 * 成功时返回的文本消息内容，只允许英文、数字、短横、下划线，英文符号.与,的组合
 */
public class SuccessMessage {

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
        sb.append("class SuccessMessage {\n");
        sb.append("}");
        return sb.toString();
    }

}
