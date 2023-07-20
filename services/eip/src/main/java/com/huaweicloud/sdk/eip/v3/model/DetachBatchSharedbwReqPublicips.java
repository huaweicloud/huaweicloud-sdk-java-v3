package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DetachBatchSharedbwReqPublicips
 */
public class DetachBatchSharedbwReqPublicips {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private DetachSharedbwDict bandwidth;

    public DetachBatchSharedbwReqPublicips withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * - 功能说明：EIP ID
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public DetachBatchSharedbwReqPublicips withBandwidth(DetachSharedbwDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public DetachBatchSharedbwReqPublicips withBandwidth(Consumer<DetachSharedbwDict> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new DetachSharedbwDict();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public DetachSharedbwDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(DetachSharedbwDict bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachBatchSharedbwReqPublicips that = (DetachBatchSharedbwReqPublicips) obj;
        return Objects.equals(this.publicipId, that.publicipId) && Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachBatchSharedbwReqPublicips {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
