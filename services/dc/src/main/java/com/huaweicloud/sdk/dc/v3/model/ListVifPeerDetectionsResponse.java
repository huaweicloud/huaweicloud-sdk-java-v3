package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVifPeerDetectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peer_detections")

    private List<VifPeerDetection> vifPeerDetections = null;

    public ListVifPeerDetectionsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVifPeerDetectionsResponse withVifPeerDetections(List<VifPeerDetection> vifPeerDetections) {
        this.vifPeerDetections = vifPeerDetections;
        return this;
    }

    public ListVifPeerDetectionsResponse addVifPeerDetectionsItem(VifPeerDetection vifPeerDetectionsItem) {
        if (this.vifPeerDetections == null) {
            this.vifPeerDetections = new ArrayList<>();
        }
        this.vifPeerDetections.add(vifPeerDetectionsItem);
        return this;
    }

    public ListVifPeerDetectionsResponse withVifPeerDetections(
        Consumer<List<VifPeerDetection>> vifPeerDetectionsSetter) {
        if (this.vifPeerDetections == null) {
            this.vifPeerDetections = new ArrayList<>();
        }
        vifPeerDetectionsSetter.accept(this.vifPeerDetections);
        return this;
    }

    /**
     * Get vifPeerDetections
     * @return vifPeerDetections
     */
    public List<VifPeerDetection> getVifPeerDetections() {
        return vifPeerDetections;
    }

    public void setVifPeerDetections(List<VifPeerDetection> vifPeerDetections) {
        this.vifPeerDetections = vifPeerDetections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVifPeerDetectionsResponse that = (ListVifPeerDetectionsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.vifPeerDetections, that.vifPeerDetections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, vifPeerDetections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVifPeerDetectionsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    vifPeerDetections: ").append(toIndentedString(vifPeerDetections)).append("\n");
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
