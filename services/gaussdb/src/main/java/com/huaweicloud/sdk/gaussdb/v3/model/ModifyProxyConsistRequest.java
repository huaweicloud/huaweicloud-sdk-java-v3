package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改代理一致性请求体
 */
public class ModifyProxyConsistRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_consistence")

    private String sessionConsistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistence_mode")

    private String consistenceMode;

    public ModifyProxyConsistRequest withSessionConsistence(String sessionConsistence) {
        this.sessionConsistence = sessionConsistence;
        return this;
    }

    /**
     * 会话一致性。 - 取值\"true\"时表示会话一致性开启。 - 取值\"false\"时表示会话一致性关闭。
     * @return sessionConsistence
     */
    public String getSessionConsistence() {
        return sessionConsistence;
    }

    public void setSessionConsistence(String sessionConsistence) {
        this.sessionConsistence = sessionConsistence;
    }

    public ModifyProxyConsistRequest withConsistenceMode(String consistenceMode) {
        this.consistenceMode = consistenceMode;
        return this;
    }

    /**
     * 一致性模式。默认值为空，此时以会话一致性参数session_consistence为准。 - session: 会话一致性 - global: 全局一致性 - eventual: 最终一致性
     * @return consistenceMode
     */
    public String getConsistenceMode() {
        return consistenceMode;
    }

    public void setConsistenceMode(String consistenceMode) {
        this.consistenceMode = consistenceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyProxyConsistRequest that = (ModifyProxyConsistRequest) obj;
        return Objects.equals(this.sessionConsistence, that.sessionConsistence)
            && Objects.equals(this.consistenceMode, that.consistenceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionConsistence, consistenceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyProxyConsistRequest {\n");
        sb.append("    sessionConsistence: ").append(toIndentedString(sessionConsistence)).append("\n");
        sb.append("    consistenceMode: ").append(toIndentedString(consistenceMode)).append("\n");
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
