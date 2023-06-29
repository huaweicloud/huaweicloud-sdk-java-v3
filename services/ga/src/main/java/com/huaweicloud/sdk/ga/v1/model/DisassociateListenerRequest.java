package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateListenerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group_id")

    private String ipGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DisassociateListenerRequestBody body;

    public DisassociateListenerRequest withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * IP地址组ID。
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    public DisassociateListenerRequest withBody(DisassociateListenerRequestBody body) {
        this.body = body;
        return this;
    }

    public DisassociateListenerRequest withBody(Consumer<DisassociateListenerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DisassociateListenerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DisassociateListenerRequestBody getBody() {
        return body;
    }

    public void setBody(DisassociateListenerRequestBody body) {
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
        DisassociateListenerRequest that = (DisassociateListenerRequest) obj;
        return Objects.equals(this.ipGroupId, that.ipGroupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateListenerRequest {\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
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
