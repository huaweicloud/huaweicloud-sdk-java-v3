package com.huaweicloud.sdk.clouddc.v1.model;

import java.util.Objects;

/**
 * 创建实例过程中待注入实例自定义数据。支持注入文本、文本文件。   说明： user_data的值为base64编码之后的内容。 注入内容（编码之前的内容）最大长度为32K。
 */
public class UserData {

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
        sb.append("class UserData {\n");
        sb.append("}");
        return sb.toString();
    }

}
