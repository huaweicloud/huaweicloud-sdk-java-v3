package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateTrafficMirrorSessionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session")

    private UpdateTrafficMirrorSessionOption trafficMirrorSession;

    public UpdateTrafficMirrorSessionRequestBody withTrafficMirrorSession(
        UpdateTrafficMirrorSessionOption trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
        return this;
    }

    public UpdateTrafficMirrorSessionRequestBody withTrafficMirrorSession(
        Consumer<UpdateTrafficMirrorSessionOption> trafficMirrorSessionSetter) {
        if (this.trafficMirrorSession == null) {
            this.trafficMirrorSession = new UpdateTrafficMirrorSessionOption();
            trafficMirrorSessionSetter.accept(this.trafficMirrorSession);
        }

        return this;
    }

    /**
     * Get trafficMirrorSession
     * @return trafficMirrorSession
     */
    public UpdateTrafficMirrorSessionOption getTrafficMirrorSession() {
        return trafficMirrorSession;
    }

    public void setTrafficMirrorSession(UpdateTrafficMirrorSessionOption trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrafficMirrorSessionRequestBody that = (UpdateTrafficMirrorSessionRequestBody) obj;
        return Objects.equals(this.trafficMirrorSession, that.trafficMirrorSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSession);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorSessionRequestBody {\n");
        sb.append("    trafficMirrorSession: ").append(toIndentedString(trafficMirrorSession)).append("\n");
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
