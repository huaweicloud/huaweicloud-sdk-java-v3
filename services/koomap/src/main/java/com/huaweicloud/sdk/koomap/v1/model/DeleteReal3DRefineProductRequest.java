package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteReal3DRefineProductRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refine_product_id")

    private String refineProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Object body;

    public DeleteReal3DRefineProductRequest withRefineProductId(String refineProductId) {
        this.refineProductId = refineProductId;
        return this;
    }

    /**
     * 精修后处理成果数据ID。
     * @return refineProductId
     */
    public String getRefineProductId() {
        return refineProductId;
    }

    public void setRefineProductId(String refineProductId) {
        this.refineProductId = refineProductId;
    }

    public DeleteReal3DRefineProductRequest withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
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
        DeleteReal3DRefineProductRequest that = (DeleteReal3DRefineProductRequest) obj;
        return Objects.equals(this.refineProductId, that.refineProductId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refineProductId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteReal3DRefineProductRequest {\n");
        sb.append("    refineProductId: ").append(toIndentedString(refineProductId)).append("\n");
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
