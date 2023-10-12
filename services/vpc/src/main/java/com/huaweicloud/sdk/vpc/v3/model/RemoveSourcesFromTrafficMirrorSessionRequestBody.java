package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class RemoveSourcesFromTrafficMirrorSessionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session")

    private TrafficMirrorSourcesOption trafficMirrorSession;

    public RemoveSourcesFromTrafficMirrorSessionRequestBody withTrafficMirrorSession(
        TrafficMirrorSourcesOption trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
        return this;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequestBody withTrafficMirrorSession(
        Consumer<TrafficMirrorSourcesOption> trafficMirrorSessionSetter) {
        if (this.trafficMirrorSession == null) {
            this.trafficMirrorSession = new TrafficMirrorSourcesOption();
            trafficMirrorSessionSetter.accept(this.trafficMirrorSession);
        }

        return this;
    }

    /**
     * Get trafficMirrorSession
     * @return trafficMirrorSession
     */
    public TrafficMirrorSourcesOption getTrafficMirrorSession() {
        return trafficMirrorSession;
    }

    public void setTrafficMirrorSession(TrafficMirrorSourcesOption trafficMirrorSession) {
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
        RemoveSourcesFromTrafficMirrorSessionRequestBody that = (RemoveSourcesFromTrafficMirrorSessionRequestBody) obj;
        return Objects.equals(this.trafficMirrorSession, that.trafficMirrorSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSession);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveSourcesFromTrafficMirrorSessionRequestBody {\n");
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
