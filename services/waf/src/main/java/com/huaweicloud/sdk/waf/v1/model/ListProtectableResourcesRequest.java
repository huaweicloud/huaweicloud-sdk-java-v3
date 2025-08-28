package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProtectableResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public ListProtectableResourcesRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器所在VPC ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListProtectableResourcesRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 租户region **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListProtectableResourcesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释：** 查询的防护资源类型，目前支持的资源类型为:elb **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** elb
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProtectableResourcesRequest that = (ListProtectableResourcesRequest) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, region, resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectableResourcesRequest {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
