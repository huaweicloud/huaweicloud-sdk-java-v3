package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConformancePackRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_id")

    private String conformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateConformancePackRequestBody body;

    public UpdateConformancePackRequest withConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
        return this;
    }

    /**
     * 合规规则包ID。
     * @return conformancePackId
     */
    public String getConformancePackId() {
        return conformancePackId;
    }

    public void setConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
    }

    public UpdateConformancePackRequest withBody(UpdateConformancePackRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateConformancePackRequest withBody(Consumer<UpdateConformancePackRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateConformancePackRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateConformancePackRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateConformancePackRequestBody body) {
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
        UpdateConformancePackRequest that = (UpdateConformancePackRequest) obj;
        return Objects.equals(this.conformancePackId, that.conformancePackId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conformancePackId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConformancePackRequest {\n");
        sb.append("    conformancePackId: ").append(toIndentedString(conformancePackId)).append("\n");
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
