package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBusinessDetailResponse extends SdkResponse {

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
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_domain_id")

    private Integer innerDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Long creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descp")

    private String descp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private String modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    public ShowBusinessDetailResponse withId(Long id) {
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

    public ShowBusinessDetailResponse withGmtCreate(LocalDate gmtCreate) {
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

    public ShowBusinessDetailResponse withGmtModify(LocalDate gmtModify) {
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

    public ShowBusinessDetailResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否是默认的应用。
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public ShowBusinessDetailResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 应用的英文名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowBusinessDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用的展示名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBusinessDetailResponse withIsDefault(Boolean isDefault) {
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

    public ShowBusinessDetailResponse withInnerDomainId(Integer innerDomainId) {
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

    public ShowBusinessDetailResponse withEpsId(String epsId) {
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

    public ShowBusinessDetailResponse withCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者的userId。
     * @return creatorId
     */
    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public ShowBusinessDetailResponse withDescp(String descp) {
        this.descp = descp;
        return this;
    }

    /**
     * 应用描述说明。
     * @return descp
     */
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public ShowBusinessDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowBusinessDetailResponse withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 修改时间。
     * @return modifyTime
     */
    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public ShowBusinessDetailResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者的用户名。
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBusinessDetailResponse showBusinessDetailResponse = (ShowBusinessDetailResponse) o;
        return Objects.equals(this.id, showBusinessDetailResponse.id)
            && Objects.equals(this.gmtCreate, showBusinessDetailResponse.gmtCreate)
            && Objects.equals(this.gmtModify, showBusinessDetailResponse.gmtModify)
            && Objects.equals(this._default, showBusinessDetailResponse._default)
            && Objects.equals(this.displayName, showBusinessDetailResponse.displayName)
            && Objects.equals(this.name, showBusinessDetailResponse.name)
            && Objects.equals(this.isDefault, showBusinessDetailResponse.isDefault)
            && Objects.equals(this.innerDomainId, showBusinessDetailResponse.innerDomainId)
            && Objects.equals(this.epsId, showBusinessDetailResponse.epsId)
            && Objects.equals(this.creatorId, showBusinessDetailResponse.creatorId)
            && Objects.equals(this.descp, showBusinessDetailResponse.descp)
            && Objects.equals(this.createTime, showBusinessDetailResponse.createTime)
            && Objects.equals(this.modifyTime, showBusinessDetailResponse.modifyTime)
            && Objects.equals(this.creatorName, showBusinessDetailResponse.creatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            gmtCreate,
            gmtModify,
            _default,
            displayName,
            name,
            isDefault,
            innerDomainId,
            epsId,
            creatorId,
            descp,
            createTime,
            modifyTime,
            creatorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBusinessDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    innerDomainId: ").append(toIndentedString(innerDomainId)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    descp: ").append(toIndentedString(descp)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
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
