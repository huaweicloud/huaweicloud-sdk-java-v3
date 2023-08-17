package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVrrpConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_id")

    private String iegId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_router_id")

    private Integer virtualRouterId;

    public DeleteVrrpConfigRequest withIegId(String iegId) {
        this.iegId = iegId;
        return this;
    }

    /**
     * 智能企业网关ID
     * @return iegId
     */
    public String getIegId() {
        return iegId;
    }

    public void setIegId(String iegId) {
        this.iegId = iegId;
    }

    public DeleteVrrpConfigRequest withVirtualRouterId(Integer virtualRouterId) {
        this.virtualRouterId = virtualRouterId;
        return this;
    }

    /**
     * 虚路由ID
     * @return virtualRouterId
     */
    public Integer getVirtualRouterId() {
        return virtualRouterId;
    }

    public void setVirtualRouterId(Integer virtualRouterId) {
        this.virtualRouterId = virtualRouterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVrrpConfigRequest that = (DeleteVrrpConfigRequest) obj;
        return Objects.equals(this.iegId, that.iegId) && Objects.equals(this.virtualRouterId, that.virtualRouterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iegId, virtualRouterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVrrpConfigRequest {\n");
        sb.append("    iegId: ").append(toIndentedString(iegId)).append("\n");
        sb.append("    virtualRouterId: ").append(toIndentedString(virtualRouterId)).append("\n");
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
