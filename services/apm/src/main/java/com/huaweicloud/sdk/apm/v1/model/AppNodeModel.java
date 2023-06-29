package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 组件信息。
 */
public class AppNodeModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private LocalDate gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify")

    private LocalDate gmtModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_business_id")

    private Long subBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_domain_id")

    private Integer innerDomainId;

    public AppNodeModel withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 组件id。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AppNodeModel withGmtCreate(LocalDate gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * 创建时间。
     * @return gmtCreate
     */
    public LocalDate getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDate gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public AppNodeModel withGmtModify(LocalDate gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    /**
     * 修改时间。
     * @return gmtModify
     */
    public LocalDate getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(LocalDate gmtModify) {
        this.gmtModify = gmtModify;
    }

    public AppNodeModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppNodeModel withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public AppNodeModel withSubBusinessId(Long subBusinessId) {
        this.subBusinessId = subBusinessId;
        return this;
    }

    /**
     * 子应用id。
     * @return subBusinessId
     */
    public Long getSubBusinessId() {
        return subBusinessId;
    }

    public void setSubBusinessId(Long subBusinessId) {
        this.subBusinessId = subBusinessId;
    }

    public AppNodeModel withInnerDomainId(Integer innerDomainId) {
        this.innerDomainId = innerDomainId;
        return this;
    }

    /**
     * 租户id。
     * @return innerDomainId
     */
    public Integer getInnerDomainId() {
        return innerDomainId;
    }

    public void setInnerDomainId(Integer innerDomainId) {
        this.innerDomainId = innerDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppNodeModel that = (AppNodeModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.gmtModify, that.gmtModify) && Objects.equals(this.name, that.name)
            && Objects.equals(this.businessId, that.businessId)
            && Objects.equals(this.subBusinessId, that.subBusinessId)
            && Objects.equals(this.innerDomainId, that.innerDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gmtCreate, gmtModify, name, businessId, subBusinessId, innerDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppNodeModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    subBusinessId: ").append(toIndentedString(subBusinessId)).append("\n");
        sb.append("    innerDomainId: ").append(toIndentedString(innerDomainId)).append("\n");
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
