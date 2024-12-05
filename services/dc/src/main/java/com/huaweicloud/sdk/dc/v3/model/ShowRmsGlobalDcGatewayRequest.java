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
public class ShowRmsGlobalDcGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rp_name")

    private String rpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_fields")

    private List<String> extFields = null;

    public ShowRmsGlobalDcGatewayRequest withRpName(String rpName) {
        this.rpName = rpName;
        return this;
    }

    /**
     * 通过rp_name过滤记录
     * @return rpName
     */
    public String getRpName() {
        return rpName;
    }

    public void setRpName(String rpName) {
        this.rpName = rpName;
    }

    public ShowRmsGlobalDcGatewayRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domain_id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowRmsGlobalDcGatewayRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region_id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowRmsGlobalDcGatewayRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * resource_type
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowRmsGlobalDcGatewayRequest withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * 全球接入网关ID
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public ShowRmsGlobalDcGatewayRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ShowRmsGlobalDcGatewayRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowRmsGlobalDcGatewayRequest withFields(Consumer<List<String>> fieldsSetter) {
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

    public ShowRmsGlobalDcGatewayRequest withExtFields(List<String> extFields) {
        this.extFields = extFields;
        return this;
    }

    public ShowRmsGlobalDcGatewayRequest addExtFieldsItem(String extFieldsItem) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        this.extFields.add(extFieldsItem);
        return this;
    }

    public ShowRmsGlobalDcGatewayRequest withExtFields(Consumer<List<String>> extFieldsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRmsGlobalDcGatewayRequest that = (ShowRmsGlobalDcGatewayRequest) obj;
        return Objects.equals(this.rpName, that.rpName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.extFields, that.extFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rpName, domainId, regionId, resourceType, globalDcGatewayId, fields, extFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRmsGlobalDcGatewayRequest {\n");
        sb.append("    rpName: ").append(toIndentedString(rpName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    extFields: ").append(toIndentedString(extFields)).append("\n");
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
