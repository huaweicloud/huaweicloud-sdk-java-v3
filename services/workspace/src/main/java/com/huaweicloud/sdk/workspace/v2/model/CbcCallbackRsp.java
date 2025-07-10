package com.huaweicloud.sdk.workspace.v2.model;

import java.util.Objects;

/**
 * CBC回调创建包周期桌面时的响应体。注意：根据云运营平台的API规范，部分参数为驼峰型，不能修改为下划线连接，API规范检查时需要忽略。
 */
public class CbcCallbackRsp {

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
        sb.append("class CbcCallbackRsp {\n");
        sb.append("}");
        return sb.toString();
    }

}
