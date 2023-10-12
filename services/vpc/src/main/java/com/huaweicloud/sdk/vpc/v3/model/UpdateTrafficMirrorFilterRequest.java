package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTrafficMirrorFilterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_id")

    private String trafficMirrorFilterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTrafficMirrorFilterRequestBody body;

    public UpdateTrafficMirrorFilterRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * 流量镜像筛选条件ID
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    public UpdateTrafficMirrorFilterRequest withBody(UpdateTrafficMirrorFilterRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTrafficMirrorFilterRequest withBody(Consumer<UpdateTrafficMirrorFilterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTrafficMirrorFilterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTrafficMirrorFilterRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTrafficMirrorFilterRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrafficMirrorFilterRequest that = (UpdateTrafficMirrorFilterRequest) obj;
        return Objects.equals(this.trafficMirrorFilterId, that.trafficMirrorFilterId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorFilterRequest {\n");
        sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
