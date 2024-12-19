package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDirectConnectLocationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_location_id")

    private String directConnectLocationId;

    public ShowDirectConnectLocationRequest withDirectConnectLocationId(String directConnectLocationId) {
        this.directConnectLocationId = directConnectLocationId;
        return this;
    }

    /**
     * direct-connect-locationID。
     * @return directConnectLocationId
     */
    public String getDirectConnectLocationId() {
        return directConnectLocationId;
    }

    public void setDirectConnectLocationId(String directConnectLocationId) {
        this.directConnectLocationId = directConnectLocationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDirectConnectLocationRequest that = (ShowDirectConnectLocationRequest) obj;
        return Objects.equals(this.directConnectLocationId, that.directConnectLocationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directConnectLocationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDirectConnectLocationRequest {\n");
        sb.append("    directConnectLocationId: ").append(toIndentedString(directConnectLocationId)).append("\n");
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
