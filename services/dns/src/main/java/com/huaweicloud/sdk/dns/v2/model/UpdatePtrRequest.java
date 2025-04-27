package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePtrRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptr_id")

    private String ptrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePtrRequestBody body;

    public UpdatePtrRequest withPtrId(String ptrId) {
        this.ptrId = ptrId;
        return this;
    }

    /**
     * 反向解析ID。
     * @return ptrId
     */
    public String getPtrId() {
        return ptrId;
    }

    public void setPtrId(String ptrId) {
        this.ptrId = ptrId;
    }

    public UpdatePtrRequest withBody(UpdatePtrRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePtrRequest withBody(Consumer<UpdatePtrRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePtrRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePtrRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePtrRequestBody body) {
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
        UpdatePtrRequest that = (UpdatePtrRequest) obj;
        return Objects.equals(this.ptrId, that.ptrId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ptrId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePtrRequest {\n");
        sb.append("    ptrId: ").append(toIndentedString(ptrId)).append("\n");
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
