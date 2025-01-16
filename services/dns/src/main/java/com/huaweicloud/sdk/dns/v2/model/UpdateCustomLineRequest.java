package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCustomLineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_id")

    private String lineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCustomLineRequestBody body;

    public UpdateCustomLineRequest withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * 自定义线路id
     * @return lineId
     */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public UpdateCustomLineRequest withBody(UpdateCustomLineRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCustomLineRequest withBody(Consumer<UpdateCustomLineRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCustomLineRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCustomLineRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCustomLineRequestBody body) {
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
        UpdateCustomLineRequest that = (UpdateCustomLineRequest) obj;
        return Objects.equals(this.lineId, that.lineId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomLineRequest {\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
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
