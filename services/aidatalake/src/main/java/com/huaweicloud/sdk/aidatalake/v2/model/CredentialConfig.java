package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Endpoint级别用户委托名称，用于Endpoint的存储等配置权限认证，以及作为作业运行时的默认委托。
 */
public class CredentialConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public CredentialConfig withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**：Endpoint级别用户委托名称，用于Endpoint的存储等配置权限认证，以及作为作业运行时的默认委托。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字及特殊字符，长度为1~64个字符。 **默认取值**：不涉及。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CredentialConfig that = (CredentialConfig) obj;
        return Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialConfig {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
