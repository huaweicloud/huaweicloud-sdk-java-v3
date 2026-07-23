package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** Iam凭证提供者配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayIamCredentialProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    public CoreGatewayIamCredentialProvider withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * **参数解释：** 凭证提供者名称。 **约束限制：** 不涉及。 **取值范围：** 长度为 1-56 个字符，由字母、数字、下划线或短横线组成的、长度为1到56个字符的字符串，符合正则条件^[a-zA-Z0-9_-]{1,56}$。 **默认取值：** 不涉及。 
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayIamCredentialProvider that = (CoreGatewayIamCredentialProvider) obj;
        return Objects.equals(this.providerName, that.providerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayIamCredentialProvider {\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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
