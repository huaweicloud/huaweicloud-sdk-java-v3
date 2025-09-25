package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 登录类型 **约束限制**: 不涉及 **取值范围**: - mysql：mysql服务。 - rdp：rdp服务。 - ssh：ssh服务。 - vsftp：vsftp服务。  **默认取值**: 不涉及 
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
