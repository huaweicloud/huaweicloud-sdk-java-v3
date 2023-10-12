package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTrafficMirrorFilterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter")

    private TrafficMirrorFilter trafficMirrorFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowTrafficMirrorFilterResponse withTrafficMirrorFilter(TrafficMirrorFilter trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
        return this;
    }

    public ShowTrafficMirrorFilterResponse withTrafficMirrorFilter(
        Consumer<TrafficMirrorFilter> trafficMirrorFilterSetter) {
        if (this.trafficMirrorFilter == null) {
            this.trafficMirrorFilter = new TrafficMirrorFilter();
            trafficMirrorFilterSetter.accept(this.trafficMirrorFilter);
        }

        return this;
    }

    /**
     * Get trafficMirrorFilter
     * @return trafficMirrorFilter
     */
    public TrafficMirrorFilter getTrafficMirrorFilter() {
        return trafficMirrorFilter;
    }

    public void setTrafficMirrorFilter(TrafficMirrorFilter trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
    }

    public ShowTrafficMirrorFilterResponse withRequestId(String requestId) {
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
        ShowTrafficMirrorFilterResponse that = (ShowTrafficMirrorFilterResponse) obj;
        return Objects.equals(this.trafficMirrorFilter, that.trafficMirrorFilter)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilter, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrafficMirrorFilterResponse {\n");
        sb.append("    trafficMirrorFilter: ").append(toIndentedString(trafficMirrorFilter)).append("\n");
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
