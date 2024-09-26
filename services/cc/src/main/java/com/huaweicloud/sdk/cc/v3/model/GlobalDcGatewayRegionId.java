package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Gdgw的RegionID。
 */
public class GlobalDcGatewayRegionId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_region_id")

    private String globalDcGatewayRegionId;

    public GlobalDcGatewayRegionId withGlobalDcGatewayRegionId(String globalDcGatewayRegionId) {
        this.globalDcGatewayRegionId = globalDcGatewayRegionId;
        return this;
    }

    /**
     * Gdgw的RegionID。
     * @return globalDcGatewayRegionId
     */
    public String getGlobalDcGatewayRegionId() {
        return globalDcGatewayRegionId;
    }

    public void setGlobalDcGatewayRegionId(String globalDcGatewayRegionId) {
        this.globalDcGatewayRegionId = globalDcGatewayRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalDcGatewayRegionId that = (GlobalDcGatewayRegionId) obj;
        return Objects.equals(this.globalDcGatewayRegionId, that.globalDcGatewayRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGatewayRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalDcGatewayRegionId {\n");
        sb.append("    globalDcGatewayRegionId: ").append(toIndentedString(globalDcGatewayRegionId)).append("\n");
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
