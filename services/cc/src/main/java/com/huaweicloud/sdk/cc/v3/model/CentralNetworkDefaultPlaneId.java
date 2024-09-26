package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络默认平面的ID。
 */
public class CentralNetworkDefaultPlaneId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_plane_id")

    private String defaultPlaneId;

    public CentralNetworkDefaultPlaneId withDefaultPlaneId(String defaultPlaneId) {
        this.defaultPlaneId = defaultPlaneId;
        return this;
    }

    /**
     * 中心网络默认平面的ID。
     * @return defaultPlaneId
     */
    public String getDefaultPlaneId() {
        return defaultPlaneId;
    }

    public void setDefaultPlaneId(String defaultPlaneId) {
        this.defaultPlaneId = defaultPlaneId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkDefaultPlaneId that = (CentralNetworkDefaultPlaneId) obj;
        return Objects.equals(this.defaultPlaneId, that.defaultPlaneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultPlaneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkDefaultPlaneId {\n");
        sb.append("    defaultPlaneId: ").append(toIndentedString(defaultPlaneId)).append("\n");
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
