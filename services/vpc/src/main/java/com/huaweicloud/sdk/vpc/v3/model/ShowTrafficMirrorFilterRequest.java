package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTrafficMirrorFilterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_id")

    private String trafficMirrorFilterId;

    public ShowTrafficMirrorFilterRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrafficMirrorFilterRequest that = (ShowTrafficMirrorFilterRequest) obj;
        return Objects.equals(this.trafficMirrorFilterId, that.trafficMirrorFilterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrafficMirrorFilterRequest {\n");
        sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
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
