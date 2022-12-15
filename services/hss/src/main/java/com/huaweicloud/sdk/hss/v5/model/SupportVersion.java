package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 支持的版本，包含如下:   - hss.version.basic ：基础版策略组   - hss.version.enterprise : 企业版策略组   - hss.version.premium : 旗舰版策略组   - hss.version.wtp : 网页防篡改版策略组   - hss.version.container.enterprise : 容器版策略组
 */
public class SupportVersion {

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
        sb.append("class SupportVersion {\n");
        sb.append("}");
        return sb.toString();
    }

}
