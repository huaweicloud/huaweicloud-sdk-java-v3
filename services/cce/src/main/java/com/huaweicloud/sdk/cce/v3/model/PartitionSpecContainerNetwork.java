package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PartitionSpecContainerNetwork
 */
public class PartitionSpecContainerNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetID")

    private String subnetID;

    public PartitionSpecContainerNetwork withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * 子网ID
     * @return subnetID
     */
    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartitionSpecContainerNetwork that = (PartitionSpecContainerNetwork) obj;
        return Objects.equals(this.subnetID, that.subnetID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionSpecContainerNetwork {\n");
        sb.append("    subnetID: ").append(toIndentedString(subnetID)).append("\n");
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
