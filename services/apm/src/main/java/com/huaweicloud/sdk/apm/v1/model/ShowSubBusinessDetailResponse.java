package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSubBusinessDetailResponse extends SdkResponse {

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
    @JsonProperty(value = "parent_id")

    private Long parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_domain_id")

    private Integer innerDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Long creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

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

    public ShowSubBusinessDetailResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 子应用id。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowSubBusinessDetailResponse withGmtCreate(LocalDate gmtCreate) {
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

    public ShowSubBusinessDetailResponse withGmtModify(LocalDate gmtModify) {
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

    public ShowSubBusinessDetailResponse withParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父亲的子应用id。
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public ShowSubBusinessDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子应用的英文名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSubBusinessDetailResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 子应用的展示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowSubBusinessDetailResponse withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 所属应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public ShowSubBusinessDetailResponse withInnerDomainId(Integer innerDomainId) {
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

    public ShowSubBusinessDetailResponse withCreatorId(Long creatorId) {
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

    public ShowSubBusinessDetailResponse withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 应用的UUID。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ShowSubBusinessDetailResponse withDescp(String descp) {
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

    public ShowSubBusinessDetailResponse withCreateTime(String createTime) {
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

    public ShowSubBusinessDetailResponse withModifyTime(String modifyTime) {
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

    public ShowSubBusinessDetailResponse withCreatorName(String creatorName) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubBusinessDetailResponse that = (ShowSubBusinessDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.gmtModify, that.gmtModify) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.businessId, that.businessId)
            && Objects.equals(this.innerDomainId, that.innerDomainId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.descp, that.descp)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.modifyTime, that.modifyTime)
            && Objects.equals(this.creatorName, that.creatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            gmtCreate,
            gmtModify,
            parentId,
            name,
            displayName,
            businessId,
            innerDomainId,
            creatorId,
            uuid,
            descp,
            createTime,
            modifyTime,
            creatorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubBusinessDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    innerDomainId: ").append(toIndentedString(innerDomainId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
