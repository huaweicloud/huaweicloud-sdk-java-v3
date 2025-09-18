package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对端大区ID。
 */
public class RemoteAreaId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area_id")

    private RemoteAreaIdDef remoteAreaId;

    public RemoteAreaId withRemoteAreaId(RemoteAreaIdDef remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
        return this;
    }

    /**
     * Get remoteAreaId
     * @return remoteAreaId
     */
    public RemoteAreaIdDef getRemoteAreaId() {
        return remoteAreaId;
    }

    public void setRemoteAreaId(RemoteAreaIdDef remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoteAreaId that = (RemoteAreaId) obj;
        return Objects.equals(this.remoteAreaId, that.remoteAreaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteAreaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoteAreaId {\n");
        sb.append("    remoteAreaId: ").append(toIndentedString(remoteAreaId)).append("\n");
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
