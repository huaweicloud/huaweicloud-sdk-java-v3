package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新微服务引擎配置请求体。
 */
public class EngineConfigureReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authType")

    private String authType;

    public EngineConfigureReq withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * authType安全认证类型，支持填写NONE和RBAC。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineConfigureReq that = (EngineConfigureReq) obj;
        return Objects.equals(this.authType, that.authType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineConfigureReq {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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
