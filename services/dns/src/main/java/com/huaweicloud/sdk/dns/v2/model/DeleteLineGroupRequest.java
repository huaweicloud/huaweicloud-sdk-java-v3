package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLineGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linegroup_id")

    private String linegroupId;

    public DeleteLineGroupRequest withLinegroupId(String linegroupId) {
        this.linegroupId = linegroupId;
        return this;
    }

    /**
     * 线路分组ID。
     * @return linegroupId
     */
    public String getLinegroupId() {
        return linegroupId;
    }

    public void setLinegroupId(String linegroupId) {
        this.linegroupId = linegroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLineGroupRequest that = (DeleteLineGroupRequest) obj;
        return Objects.equals(this.linegroupId, that.linegroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linegroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLineGroupRequest {\n");
        sb.append("    linegroupId: ").append(toIndentedString(linegroupId)).append("\n");
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
