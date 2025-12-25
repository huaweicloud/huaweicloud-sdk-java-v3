package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateExtendAttributeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_attribute")

    private VifExtendAttribute extendAttribute;

    public UpdateExtendAttributeResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateExtendAttributeResponse withExtendAttribute(VifExtendAttribute extendAttribute) {
        this.extendAttribute = extendAttribute;
        return this;
    }

    public UpdateExtendAttributeResponse withExtendAttribute(Consumer<VifExtendAttribute> extendAttributeSetter) {
        if (this.extendAttribute == null) {
            this.extendAttribute = new VifExtendAttribute();
            extendAttributeSetter.accept(this.extendAttribute);
        }

        return this;
    }

    /**
     * Get extendAttribute
     * @return extendAttribute
     */
    public VifExtendAttribute getExtendAttribute() {
        return extendAttribute;
    }

    public void setExtendAttribute(VifExtendAttribute extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateExtendAttributeResponse that = (UpdateExtendAttributeResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.extendAttribute, that.extendAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, extendAttribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExtendAttributeResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    extendAttribute: ").append(toIndentedString(extendAttribute)).append("\n");
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
