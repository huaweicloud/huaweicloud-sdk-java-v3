package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RunInstancesOptionsNetworkInterfaces
 */
public class RunInstancesOptionsNetworkInterfaces {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    public RunInstancesOptionsNetworkInterfaces withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * subnet id
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunInstancesOptionsNetworkInterfaces that = (RunInstancesOptionsNetworkInterfaces) obj;
        return Objects.equals(this.subnetId, that.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunInstancesOptionsNetworkInterfaces {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
