package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 在线会场信息。
 */
public class RealTimeConfInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairID")

    private String chairID;

    public RealTimeConfInfo withChairID(String chairID) {
        this.chairID = chairID;
        return this;
    }

    /**
     * 主持人与会者标识。
     * @return chairID
     */
    public String getChairID() {
        return chairID;
    }

    public void setChairID(String chairID) {
        this.chairID = chairID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RealTimeConfInfo realTimeConfInfo = (RealTimeConfInfo) o;
        return Objects.equals(this.chairID, realTimeConfInfo.chairID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chairID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeConfInfo {\n");
        sb.append("    chairID: ").append(toIndentedString(chairID)).append("\n");
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
