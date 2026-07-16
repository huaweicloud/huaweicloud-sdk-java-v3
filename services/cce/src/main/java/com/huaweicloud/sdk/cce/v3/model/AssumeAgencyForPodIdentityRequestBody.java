package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 使用ServiceAccount token获取对应的pod-identity关联相关委托临时凭据请求参数
 */
public class AssumeAgencyForPodIdentityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public AssumeAgencyForPodIdentityRequestBody withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * **参数解释：** pod-identity关联所绑定的ServiceAccount token。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 无
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumeAgencyForPodIdentityRequestBody that = (AssumeAgencyForPodIdentityRequestBody) obj;
        return Objects.equals(this.token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyForPodIdentityRequestBody {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
