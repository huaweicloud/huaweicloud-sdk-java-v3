package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowClouddcnSubnetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_subnet_id")

    private String clouddcnSubnetId;

    public ShowClouddcnSubnetRequest withClouddcnSubnetId(String clouddcnSubnetId) {
        this.clouddcnSubnetId = clouddcnSubnetId;
        return this;
    }

    /**
     * clouddcn子网ID
     * @return clouddcnSubnetId
     */
    public String getClouddcnSubnetId() {
        return clouddcnSubnetId;
    }

    public void setClouddcnSubnetId(String clouddcnSubnetId) {
        this.clouddcnSubnetId = clouddcnSubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClouddcnSubnetRequest that = (ShowClouddcnSubnetRequest) obj;
        return Objects.equals(this.clouddcnSubnetId, that.clouddcnSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clouddcnSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClouddcnSubnetRequest {\n");
        sb.append("    clouddcnSubnetId: ").append(toIndentedString(clouddcnSubnetId)).append("\n");
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
