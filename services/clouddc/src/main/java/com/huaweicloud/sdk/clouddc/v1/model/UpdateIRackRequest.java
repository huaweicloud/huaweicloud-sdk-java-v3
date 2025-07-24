package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateIRackRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "irack_id")

    private String irackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IRackRequest body;

    public UpdateIRackRequest withIrackId(String irackId) {
        this.irackId = irackId;
        return this;
    }

    /**
     * iRack 唯一标识符
     * @return irackId
     */
    public String getIrackId() {
        return irackId;
    }

    public void setIrackId(String irackId) {
        this.irackId = irackId;
    }

    public UpdateIRackRequest withBody(IRackRequest body) {
        this.body = body;
        return this;
    }

    public UpdateIRackRequest withBody(Consumer<IRackRequest> bodySetter) {
        if (this.body == null) {
            this.body = new IRackRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IRackRequest getBody() {
        return body;
    }

    public void setBody(IRackRequest body) {
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
        UpdateIRackRequest that = (UpdateIRackRequest) obj;
        return Objects.equals(this.irackId, that.irackId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(irackId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIRackRequest {\n");
        sb.append("    irackId: ").append(toIndentedString(irackId)).append("\n");
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
