package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络平面ID。
 */
public class CentralNetworkConnectionPlaneId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plane_id")

    private String planeId;

    public CentralNetworkConnectionPlaneId withPlaneId(String planeId) {
        this.planeId = planeId;
        return this;
    }

    /**
     * 中心网络平面ID。
     * @return planeId
     */
    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkConnectionPlaneId that = (CentralNetworkConnectionPlaneId) obj;
        return Objects.equals(this.planeId, that.planeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkConnectionPlaneId {\n");
        sb.append("    planeId: ").append(toIndentedString(planeId)).append("\n");
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
