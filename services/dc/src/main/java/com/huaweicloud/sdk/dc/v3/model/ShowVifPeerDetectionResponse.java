package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVifPeerDetectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peer_detection")

    private VifPeerDetection vifPeerDetection;

    public ShowVifPeerDetectionResponse withRequestId(String requestId) {
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

    public ShowVifPeerDetectionResponse withVifPeerDetection(VifPeerDetection vifPeerDetection) {
        this.vifPeerDetection = vifPeerDetection;
        return this;
    }

    public ShowVifPeerDetectionResponse withVifPeerDetection(Consumer<VifPeerDetection> vifPeerDetectionSetter) {
        if (this.vifPeerDetection == null) {
            this.vifPeerDetection = new VifPeerDetection();
            vifPeerDetectionSetter.accept(this.vifPeerDetection);
        }

        return this;
    }

    /**
     * Get vifPeerDetection
     * @return vifPeerDetection
     */
    public VifPeerDetection getVifPeerDetection() {
        return vifPeerDetection;
    }

    public void setVifPeerDetection(VifPeerDetection vifPeerDetection) {
        this.vifPeerDetection = vifPeerDetection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVifPeerDetectionResponse that = (ShowVifPeerDetectionResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.vifPeerDetection, that.vifPeerDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, vifPeerDetection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVifPeerDetectionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    vifPeerDetection: ").append(toIndentedString(vifPeerDetection)).append("\n");
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
