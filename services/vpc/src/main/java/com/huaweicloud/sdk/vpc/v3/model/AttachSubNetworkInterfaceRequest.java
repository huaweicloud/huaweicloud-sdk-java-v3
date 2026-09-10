package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AttachSubNetworkInterfaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interface_id")

    private String subNetworkInterfaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AttachSubNetworkInterfaceRequestBody body;

    public AttachSubNetworkInterfaceRequest withSubNetworkInterfaceId(String subNetworkInterfaceId) {
        this.subNetworkInterfaceId = subNetworkInterfaceId;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡的资源ID。 **取值范围**： 不涉及。
     * @return subNetworkInterfaceId
     */
    public String getSubNetworkInterfaceId() {
        return subNetworkInterfaceId;
    }

    public void setSubNetworkInterfaceId(String subNetworkInterfaceId) {
        this.subNetworkInterfaceId = subNetworkInterfaceId;
    }

    public AttachSubNetworkInterfaceRequest withBody(AttachSubNetworkInterfaceRequestBody body) {
        this.body = body;
        return this;
    }

    public AttachSubNetworkInterfaceRequest withBody(Consumer<AttachSubNetworkInterfaceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AttachSubNetworkInterfaceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AttachSubNetworkInterfaceRequestBody getBody() {
        return body;
    }

    public void setBody(AttachSubNetworkInterfaceRequestBody body) {
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
        AttachSubNetworkInterfaceRequest that = (AttachSubNetworkInterfaceRequest) obj;
        return Objects.equals(this.subNetworkInterfaceId, that.subNetworkInterfaceId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subNetworkInterfaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachSubNetworkInterfaceRequest {\n");
        sb.append("    subNetworkInterfaceId: ").append(toIndentedString(subNetworkInterfaceId)).append("\n");
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
