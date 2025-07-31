package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 防护状态   - closed : 未防护   - opened : 防护中   - open_failed : 防护失败   - opening : 正在开启   - partial_protection : 部分防护
 */
public class WtpStatus {

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
        sb.append("class WtpStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
