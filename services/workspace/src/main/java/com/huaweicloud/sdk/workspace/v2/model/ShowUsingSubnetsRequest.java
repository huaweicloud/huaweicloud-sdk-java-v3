package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowUsingSubnetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private String subnetIds;

    public ShowUsingSubnetsRequest withSubnetIds(String subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * 子网id列表逗号分隔。
     * @return subnetIds
     */
    public String getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(String subnetIds) {
        this.subnetIds = subnetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUsingSubnetsRequest that = (ShowUsingSubnetsRequest) obj;
        return Objects.equals(this.subnetIds, that.subnetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUsingSubnetsRequest {\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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
