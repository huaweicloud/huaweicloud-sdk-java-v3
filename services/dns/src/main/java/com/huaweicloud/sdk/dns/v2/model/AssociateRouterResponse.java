package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AssociateRouterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_region")

    private String routerRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public AssociateRouterResponse withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * 关联VPC的ID。
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public AssociateRouterResponse withRouterRegion(String routerRegion) {
        this.routerRegion = routerRegion;
        return this;
    }

    /**
     * 关联VPC所在的region。
     * @return routerRegion
     */
    public String getRouterRegion() {
        return routerRegion;
    }

    public void setRouterRegion(String routerRegion) {
        this.routerRegion = routerRegion;
    }

    public AssociateRouterResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateRouterResponse that = (AssociateRouterResponse) obj;
        return Objects.equals(this.routerId, that.routerId) && Objects.equals(this.routerRegion, that.routerRegion)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routerId, routerRegion, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateRouterResponse {\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
        sb.append("    routerRegion: ").append(toIndentedString(routerRegion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
