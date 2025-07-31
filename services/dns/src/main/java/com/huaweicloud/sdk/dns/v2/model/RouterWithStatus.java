package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RouterWithStatus
 */
public class RouterWithStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_region")

    private String routerRegion;

    public RouterWithStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 关联VPC的状态。 **取值范围：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RouterWithStatus withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * **参数解释：** 关联VPC的ID。 **取值范围：** 不涉及。
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public RouterWithStatus withRouterRegion(String routerRegion) {
        this.routerRegion = routerRegion;
        return this;
    }

    /**
     * **参数解释：** 关联VPC所在的region。 **取值范围：** 不涉及。
     * @return routerRegion
     */
    public String getRouterRegion() {
        return routerRegion;
    }

    public void setRouterRegion(String routerRegion) {
        this.routerRegion = routerRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouterWithStatus that = (RouterWithStatus) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.routerId, that.routerId)
            && Objects.equals(this.routerRegion, that.routerRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, routerId, routerRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouterWithStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
        sb.append("    routerRegion: ").append(toIndentedString(routerRegion)).append("\n");
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
