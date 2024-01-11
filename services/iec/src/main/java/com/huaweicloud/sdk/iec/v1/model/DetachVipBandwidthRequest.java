package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DetachVipBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vport_id")

    private String vportId;

    public DetachVipBandwidthRequest withVportId(String vportId) {
        this.vportId = vportId;
        return this;
    }

    /**
     * IPv6虚拟IP或者IPv6私网IP ID。
     * @return vportId
     */
    public String getVportId() {
        return vportId;
    }

    public void setVportId(String vportId) {
        this.vportId = vportId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachVipBandwidthRequest that = (DetachVipBandwidthRequest) obj;
        return Objects.equals(this.vportId, that.vportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vportId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachVipBandwidthRequest {\n");
        sb.append("    vportId: ").append(toIndentedString(vportId)).append("\n");
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
