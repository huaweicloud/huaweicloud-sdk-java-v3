package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联外部链接返回结果
 */
public class CreateThirdPartyAssociateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem_id")

    private String workitemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public CreateThirdPartyAssociateDTO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户唯一标识ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateThirdPartyAssociateDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 工作项下关联外部链接的名称。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateThirdPartyAssociateDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 外部链接的类别。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateThirdPartyAssociateDTO withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 工作项下关联外部链接的修改时间。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public CreateThirdPartyAssociateDTO withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 工作项下关联外部链接的创建人。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public CreateThirdPartyAssociateDTO withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 工作项下关联外部链接的地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateThirdPartyAssociateDTO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户下项目唯一标识ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateThirdPartyAssociateDTO withWorkitemId(String workitemId) {
        this.workitemId = workitemId;
        return this;
    }

    /**
     * 工作项实例对应的唯一标识ID。
     * @return workitemId
     */
    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    public CreateThirdPartyAssociateDTO withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 工作项下关联外部链接的修改人。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public CreateThirdPartyAssociateDTO withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 外部链接操作项ID。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public CreateThirdPartyAssociateDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 新关联外部链接时会创建一条数据，该数据的唯一标识ID，可以在查询外部链接接口以及关联外部链接接口响应体中找到。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateThirdPartyAssociateDTO withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 工作项下关联外部链接的创建时间。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public CreateThirdPartyAssociateDTO withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 外部链接的生命周期。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateThirdPartyAssociateDTO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 外部链接的类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateThirdPartyAssociateDTO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域 。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateThirdPartyAssociateDTO that = (CreateThirdPartyAssociateDTO) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.type, that.type) && Objects.equals(this.modifiedDate, that.modifiedDate)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.url, that.url)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.workitemId, that.workitemId)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.operationId, that.operationId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.state, that.state) && Objects.equals(this.category, that.category)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
            title,
            type,
            modifiedDate,
            createdBy,
            url,
            domainId,
            workitemId,
            modifiedBy,
            operationId,
            id,
            createdDate,
            state,
            category,
            region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThirdPartyAssociateDTO {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
