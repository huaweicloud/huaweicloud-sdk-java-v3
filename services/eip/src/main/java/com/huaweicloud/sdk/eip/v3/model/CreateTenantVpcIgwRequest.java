package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTenantVpcIgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private String fields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTenantVpcIgwRequestBody body;

    public CreateTenantVpcIgwRequest withFields(String fields) {
        this.fields = fields;
        return this;
    }

    /**
     * 形式为\\\"fields=id&fields=project_id&...\\\"，支持字段：id/project_id/vpc_id/created_at/updated_at/name
     * @return fields
     */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public CreateTenantVpcIgwRequest withBody(CreateTenantVpcIgwRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTenantVpcIgwRequest withBody(Consumer<CreateTenantVpcIgwRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTenantVpcIgwRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTenantVpcIgwRequestBody getBody() {
        return body;
    }

    public void setBody(CreateTenantVpcIgwRequestBody body) {
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
        CreateTenantVpcIgwRequest that = (CreateTenantVpcIgwRequest) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTenantVpcIgwRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
