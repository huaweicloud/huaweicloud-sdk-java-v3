package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTenantVpcIgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igw_id")

    private String vpcIgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTenantVpcIgwRequestBody body;

    public UpdateTenantVpcIgwRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public UpdateTenantVpcIgwRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public UpdateTenantVpcIgwRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 形式为\\\"fields=id&fields=project_id&...\\\"，支持字段：id/project_id/vpc_id/created_at/updated_at/name
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public UpdateTenantVpcIgwRequest withVpcIgwId(String vpcIgwId) {
        this.vpcIgwId = vpcIgwId;
        return this;
    }

    /**
     * vpc-igw的uuid
     * @return vpcIgwId
     */
    public String getVpcIgwId() {
        return vpcIgwId;
    }

    public void setVpcIgwId(String vpcIgwId) {
        this.vpcIgwId = vpcIgwId;
    }

    public UpdateTenantVpcIgwRequest withBody(UpdateTenantVpcIgwRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTenantVpcIgwRequest withBody(Consumer<UpdateTenantVpcIgwRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTenantVpcIgwRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTenantVpcIgwRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTenantVpcIgwRequestBody body) {
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
        UpdateTenantVpcIgwRequest that = (UpdateTenantVpcIgwRequest) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.vpcIgwId, that.vpcIgwId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, vpcIgwId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantVpcIgwRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    vpcIgwId: ").append(toIndentedString(vpcIgwId)).append("\n");
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
