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
public class ShowInternalVpcIgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igw_id")

    private String vpcIgwId;

    public ShowInternalVpcIgwRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ShowInternalVpcIgwRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowInternalVpcIgwRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 形式为\\\"fields=id&fields=project_id&...\\\"，支持字段：id/project_id/vpc_id/created_at/updated_at/igw_cluster
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ShowInternalVpcIgwRequest withVpcIgwId(String vpcIgwId) {
        this.vpcIgwId = vpcIgwId;
        return this;
    }

    /**
     * 虚拟igw的uuid
     * @return vpcIgwId
     */
    public String getVpcIgwId() {
        return vpcIgwId;
    }

    public void setVpcIgwId(String vpcIgwId) {
        this.vpcIgwId = vpcIgwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInternalVpcIgwRequest that = (ShowInternalVpcIgwRequest) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.vpcIgwId, that.vpcIgwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, vpcIgwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInternalVpcIgwRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    vpcIgwId: ").append(toIndentedString(vpcIgwId)).append("\n");
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
