package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateExtendAttributeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interface_id")

    private String virtualInterfaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateExtendAttributeRequestBody body;

    public UpdateExtendAttributeRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * 虚拟接口ID。
     * @return virtualInterfaceId
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    public UpdateExtendAttributeRequest withBody(UpdateExtendAttributeRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateExtendAttributeRequest withBody(Consumer<UpdateExtendAttributeRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateExtendAttributeRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateExtendAttributeRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateExtendAttributeRequestBody body) {
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
        UpdateExtendAttributeRequest that = (UpdateExtendAttributeRequest) obj;
        return Objects.equals(this.virtualInterfaceId, that.virtualInterfaceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualInterfaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExtendAttributeRequest {\n");
        sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
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
