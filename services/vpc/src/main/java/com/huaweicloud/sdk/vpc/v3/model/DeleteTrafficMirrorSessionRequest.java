package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTrafficMirrorSessionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session_id")

    private String trafficMirrorSessionId;

    public DeleteTrafficMirrorSessionRequest withTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }

    /**
     * 流量镜像会话ID
     * @return trafficMirrorSessionId
     */
    public String getTrafficMirrorSessionId() {
        return trafficMirrorSessionId;
    }

    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTrafficMirrorSessionRequest that = (DeleteTrafficMirrorSessionRequest) obj;
        return Objects.equals(this.trafficMirrorSessionId, that.trafficMirrorSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSessionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTrafficMirrorSessionRequest {\n");
        sb.append("    trafficMirrorSessionId: ").append(toIndentedString(trafficMirrorSessionId)).append("\n");
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
