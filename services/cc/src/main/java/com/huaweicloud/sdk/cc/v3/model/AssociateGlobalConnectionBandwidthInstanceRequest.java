package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateGlobalConnectionBandwidthInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateGlobalConnectionBandwidthInstanceRequestBody body;

    public AssociateGlobalConnectionBandwidthInstanceRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源的Id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AssociateGlobalConnectionBandwidthInstanceRequest withBody(
        AssociateGlobalConnectionBandwidthInstanceRequestBody body) {
        this.body = body;
        return this;
    }

    public AssociateGlobalConnectionBandwidthInstanceRequest withBody(
        Consumer<AssociateGlobalConnectionBandwidthInstanceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateGlobalConnectionBandwidthInstanceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociateGlobalConnectionBandwidthInstanceRequestBody getBody() {
        return body;
    }

    public void setBody(AssociateGlobalConnectionBandwidthInstanceRequestBody body) {
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
        AssociateGlobalConnectionBandwidthInstanceRequest that =
            (AssociateGlobalConnectionBandwidthInstanceRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateGlobalConnectionBandwidthInstanceRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
