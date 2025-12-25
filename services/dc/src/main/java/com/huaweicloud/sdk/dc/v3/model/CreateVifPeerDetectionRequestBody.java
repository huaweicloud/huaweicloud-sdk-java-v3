package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建虚拟接口对等体连通性探测实例请求体
 */
public class CreateVifPeerDetectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_peer_detection")

    private CreateVifPeerDetectionRequestBodyVifPeerDetection vifPeerDetection;

    public CreateVifPeerDetectionRequestBody withVifPeerDetection(
        CreateVifPeerDetectionRequestBodyVifPeerDetection vifPeerDetection) {
        this.vifPeerDetection = vifPeerDetection;
        return this;
    }

    public CreateVifPeerDetectionRequestBody withVifPeerDetection(
        Consumer<CreateVifPeerDetectionRequestBodyVifPeerDetection> vifPeerDetectionSetter) {
        if (this.vifPeerDetection == null) {
            this.vifPeerDetection = new CreateVifPeerDetectionRequestBodyVifPeerDetection();
            vifPeerDetectionSetter.accept(this.vifPeerDetection);
        }

        return this;
    }

    /**
     * Get vifPeerDetection
     * @return vifPeerDetection
     */
    public CreateVifPeerDetectionRequestBodyVifPeerDetection getVifPeerDetection() {
        return vifPeerDetection;
    }

    public void setVifPeerDetection(CreateVifPeerDetectionRequestBodyVifPeerDetection vifPeerDetection) {
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
        CreateVifPeerDetectionRequestBody that = (CreateVifPeerDetectionRequestBody) obj;
        return Objects.equals(this.vifPeerDetection, that.vifPeerDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vifPeerDetection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVifPeerDetectionRequestBody {\n");
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
