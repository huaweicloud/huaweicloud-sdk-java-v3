package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 业务数据结构。
 */
public class BusinessNodeModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private LocalDate gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify")

    private LocalDate gmtModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_domain_id")

    private Integer innerDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public BusinessNodeModel withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 默认应用。
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public BusinessNodeModel withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 应用展示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BusinessNodeModel withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目的id。
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public BusinessNodeModel withGmtCreate(LocalDate gmtCreate) {
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

    public BusinessNodeModel withGmtModify(LocalDate gmtModify) {
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

    public BusinessNodeModel withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 应用id。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BusinessNodeModel withInnerDomainId(Integer innerDomainId) {
        this.innerDomainId = innerDomainId;
        return this;
    }

    /**
     * 内部租户id。
     * @return innerDomainId
     */
    public Integer getInnerDomainId() {
        return innerDomainId;
    }

    public void setInnerDomainId(Integer innerDomainId) {
        this.innerDomainId = innerDomainId;
    }

    public BusinessNodeModel withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否是默认的应用。
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public BusinessNodeModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用的英文名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessNodeModel that = (BusinessNodeModel) obj;
        return Objects.equals(this._default, that._default) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.epsId, that.epsId) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.gmtModify, that.gmtModify) && Objects.equals(this.id, that.id)
            && Objects.equals(this.innerDomainId, that.innerDomainId) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_default, displayName, epsId, gmtCreate, gmtModify, id, innerDomainId, isDefault, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessNodeModel {\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    innerDomainId: ").append(toIndentedString(innerDomainId)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
