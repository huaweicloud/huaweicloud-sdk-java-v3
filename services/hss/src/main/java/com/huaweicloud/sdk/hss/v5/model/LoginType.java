package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 登录类型，包含如下: - \&quot;mysql\&quot; # mysql服务 - \&quot;rdp\&quot; # rdp服务服务 - \&quot;ssh\&quot; # ssh服务 - \&quot;vsftp\&quot; # vsftp服务
 */
public class LoginType {

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
        sb.append("class LoginType {\n");
        sb.append("}");
        return sb.toString();
    }

}
