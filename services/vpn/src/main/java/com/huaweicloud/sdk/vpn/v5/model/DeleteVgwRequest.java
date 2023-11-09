package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    public DeleteVgwRequest withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * VPN网关实例ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVgwRequest that = (DeleteVgwRequest) obj;
        return Objects.equals(this.vgwId, that.vgwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vgwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVgwRequest {\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
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
