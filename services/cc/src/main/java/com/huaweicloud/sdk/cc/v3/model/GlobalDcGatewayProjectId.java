package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Gdgw的项目ID。
 */
public class GlobalDcGatewayProjectId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_project_id")

    private String globalDcGatewayProjectId;

    public GlobalDcGatewayProjectId withGlobalDcGatewayProjectId(String globalDcGatewayProjectId) {
        this.globalDcGatewayProjectId = globalDcGatewayProjectId;
        return this;
    }

    /**
     * Gdgw的项目ID。
     * @return globalDcGatewayProjectId
     */
    public String getGlobalDcGatewayProjectId() {
        return globalDcGatewayProjectId;
    }

    public void setGlobalDcGatewayProjectId(String globalDcGatewayProjectId) {
        this.globalDcGatewayProjectId = globalDcGatewayProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalDcGatewayProjectId that = (GlobalDcGatewayProjectId) obj;
        return Objects.equals(this.globalDcGatewayProjectId, that.globalDcGatewayProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGatewayProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalDcGatewayProjectId {\n");
        sb.append("    globalDcGatewayProjectId: ").append(toIndentedString(globalDcGatewayProjectId)).append("\n");
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
