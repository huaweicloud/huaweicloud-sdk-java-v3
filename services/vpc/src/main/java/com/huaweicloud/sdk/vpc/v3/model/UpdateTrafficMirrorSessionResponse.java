package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateTrafficMirrorSessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session")

    private TrafficMirrorSession trafficMirrorSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public UpdateTrafficMirrorSessionResponse withTrafficMirrorSession(TrafficMirrorSession trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
        return this;
    }

    public UpdateTrafficMirrorSessionResponse withTrafficMirrorSession(
        Consumer<TrafficMirrorSession> trafficMirrorSessionSetter) {
        if (this.trafficMirrorSession == null) {
            this.trafficMirrorSession = new TrafficMirrorSession();
            trafficMirrorSessionSetter.accept(this.trafficMirrorSession);
        }

        return this;
    }

    /**
     * Get trafficMirrorSession
     * @return trafficMirrorSession
     */
    public TrafficMirrorSession getTrafficMirrorSession() {
        return trafficMirrorSession;
    }

    public void setTrafficMirrorSession(TrafficMirrorSession trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
    }

    public UpdateTrafficMirrorSessionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrafficMirrorSessionResponse that = (UpdateTrafficMirrorSessionResponse) obj;
        return Objects.equals(this.trafficMirrorSession, that.trafficMirrorSession)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSession, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorSessionResponse {\n");
        sb.append("    trafficMirrorSession: ").append(toIndentedString(trafficMirrorSession)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
