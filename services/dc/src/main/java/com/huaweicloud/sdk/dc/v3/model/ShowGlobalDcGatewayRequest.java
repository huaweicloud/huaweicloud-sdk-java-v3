package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowGlobalDcGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_fields")

    private List<String> extFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    public ShowGlobalDcGatewayRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowGlobalDcGatewayRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ShowGlobalDcGatewayRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowGlobalDcGatewayRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 显示字段列表
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ShowGlobalDcGatewayRequest withExtFields(List<String> extFields) {
        this.extFields = extFields;
        return this;
    }

    public ShowGlobalDcGatewayRequest addExtFieldsItem(String extFieldsItem) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        this.extFields.add(extFieldsItem);
        return this;
    }

    public ShowGlobalDcGatewayRequest withExtFields(Consumer<List<String>> extFieldsSetter) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        extFieldsSetter.accept(this.extFields);
        return this;
    }

    /**
     * show response ext-fields
     * @return extFields
     */
    public List<String> getExtFields() {
        return extFields;
    }

    public void setExtFields(List<String> extFields) {
        this.extFields = extFields;
    }

    public ShowGlobalDcGatewayRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ShowGlobalDcGatewayRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ShowGlobalDcGatewayRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤资源实例
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowGlobalDcGatewayRequest withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * 全域接入网关ID
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGlobalDcGatewayRequest that = (ShowGlobalDcGatewayRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.extFields, that.extFields)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, fields, extFields, enterpriseProjectId, globalDcGatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGlobalDcGatewayRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    extFields: ").append(toIndentedString(extFields)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
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
