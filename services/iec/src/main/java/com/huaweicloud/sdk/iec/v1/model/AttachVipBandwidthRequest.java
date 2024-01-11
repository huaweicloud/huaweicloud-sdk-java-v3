package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AttachVipBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vport_id")

    private String vportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AttachVipBandwidthRequestBody body;

    public AttachVipBandwidthRequest withVportId(String vportId) {
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

    public AttachVipBandwidthRequest withBody(AttachVipBandwidthRequestBody body) {
        this.body = body;
        return this;
    }

    public AttachVipBandwidthRequest withBody(Consumer<AttachVipBandwidthRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AttachVipBandwidthRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AttachVipBandwidthRequestBody getBody() {
        return body;
    }

    public void setBody(AttachVipBandwidthRequestBody body) {
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
        AttachVipBandwidthRequest that = (AttachVipBandwidthRequest) obj;
        return Objects.equals(this.vportId, that.vportId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vportId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachVipBandwidthRequest {\n");
        sb.append("    vportId: ").append(toIndentedString(vportId)).append("\n");
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
