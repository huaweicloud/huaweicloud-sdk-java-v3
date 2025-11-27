package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTransitSubnetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_subnet_id")

    private String transitSubnetId;

    public DeleteTransitSubnetRequest withTransitSubnetId(String transitSubnetId) {
        this.transitSubnetId = transitSubnetId;
        return this;
    }

    /**
     * 中转子网ID。
     * @return transitSubnetId
     */
    public String getTransitSubnetId() {
        return transitSubnetId;
    }

    public void setTransitSubnetId(String transitSubnetId) {
        this.transitSubnetId = transitSubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTransitSubnetRequest that = (DeleteTransitSubnetRequest) obj;
        return Objects.equals(this.transitSubnetId, that.transitSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTransitSubnetRequest {\n");
        sb.append("    transitSubnetId: ").append(toIndentedString(transitSubnetId)).append("\n");
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
