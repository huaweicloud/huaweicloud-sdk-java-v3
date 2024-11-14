package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateObsTargetAttributesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private ObsTargetAttributes attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public UpdateObsTargetAttributesResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 绑定关系Id
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public UpdateObsTargetAttributesResponse withAttributes(ObsTargetAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public UpdateObsTargetAttributesResponse withAttributes(Consumer<ObsTargetAttributes> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ObsTargetAttributes();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public ObsTargetAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ObsTargetAttributes attributes) {
        this.attributes = attributes;
    }

    public UpdateObsTargetAttributesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateObsTargetAttributesResponse that = (UpdateObsTargetAttributesResponse) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.attributes, that.attributes)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, attributes, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateObsTargetAttributesResponse {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
