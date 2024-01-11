package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AttachVipBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vport")

    private VirtualPortResponse vport;

    public AttachVipBandwidthResponse withVport(VirtualPortResponse vport) {
        this.vport = vport;
        return this;
    }

    public AttachVipBandwidthResponse withVport(Consumer<VirtualPortResponse> vportSetter) {
        if (this.vport == null) {
            this.vport = new VirtualPortResponse();
            vportSetter.accept(this.vport);
        }

        return this;
    }

    /**
     * Get vport
     * @return vport
     */
    public VirtualPortResponse getVport() {
        return vport;
    }

    public void setVport(VirtualPortResponse vport) {
        this.vport = vport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachVipBandwidthResponse that = (AttachVipBandwidthResponse) obj;
        return Objects.equals(this.vport, that.vport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachVipBandwidthResponse {\n");
        sb.append("    vport: ").append(toIndentedString(vport)).append("\n");
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
