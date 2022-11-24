package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowLineGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linegroup_id")

    private String linegroupId;

    public ShowLineGroupRequest withLinegroupId(String linegroupId) {
        this.linegroupId = linegroupId;
        return this;
    }

    /**
     * 待查询的线路分组ID。
     * @return linegroupId
     */
    public String getLinegroupId() {
        return linegroupId;
    }

    public void setLinegroupId(String linegroupId) {
        this.linegroupId = linegroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLineGroupRequest showLineGroupRequest = (ShowLineGroupRequest) o;
        return Objects.equals(this.linegroupId, showLineGroupRequest.linegroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linegroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLineGroupRequest {\n");
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
