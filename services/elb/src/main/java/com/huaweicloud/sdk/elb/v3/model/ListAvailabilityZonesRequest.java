package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAvailabilityZonesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    public ListAvailabilityZonesRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * **参数解释**：公网边界组。  **约束限制**：不涉及  **取值范围**： - center：表示中心站点的公网边界组 - 边缘站点名称：表示边缘站点的公网边界组  **默认取值**：不涉及
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListAvailabilityZonesRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器ID。传入可查询对应ELB支持的可用区列表。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailabilityZonesRequest that = (ListAvailabilityZonesRequest) obj;
        return Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicBorderGroup, loadbalancerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailabilityZonesRequest {\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
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
