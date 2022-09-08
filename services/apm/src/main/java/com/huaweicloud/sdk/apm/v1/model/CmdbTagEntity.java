package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CmdbTagEntity
 */
public class CmdbTagEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descp")

    private String descp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Long creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id_list")

    private List<Long> envIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private LocalDate gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_modify")

    private LocalDate gmtModify;

    public CmdbTagEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 环境标签名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CmdbTagEntity withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public CmdbTagEntity withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * UUID
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CmdbTagEntity withDescp(String descp) {
        this.descp = descp;
        return this;
    }

    /**
     * 描述信息
     * @return descp
     */
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public CmdbTagEntity withCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者id
     * @return creatorId
     */
    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public CmdbTagEntity withEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
        return this;
    }

    public CmdbTagEntity addEnvIdListItem(Long envIdListItem) {
        if (this.envIdList == null) {
            this.envIdList = new ArrayList<>();
        }
        this.envIdList.add(envIdListItem);
        return this;
    }

    public CmdbTagEntity withEnvIdList(Consumer<List<Long>> envIdListSetter) {
        if (this.envIdList == null) {
            this.envIdList = new ArrayList<>();
        }
        envIdListSetter.accept(this.envIdList);
        return this;
    }

    /**
     * 环境id列表
     * @return envIdList
     */
    public List<Long> getEnvIdList() {
        return envIdList;
    }

    public void setEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
    }

    public CmdbTagEntity withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 环境标签id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CmdbTagEntity withGmtCreate(LocalDate gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * 创建时间
     * @return gmtCreate
     */
    public LocalDate getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDate gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public CmdbTagEntity withGmtModify(LocalDate gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    /**
     * 修改时间
     * @return gmtModify
     */
    public LocalDate getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(LocalDate gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CmdbTagEntity cmdbTagEntity = (CmdbTagEntity) o;
        return Objects.equals(this.name, cmdbTagEntity.name)
            && Objects.equals(this.businessId, cmdbTagEntity.businessId)
            && Objects.equals(this.uuid, cmdbTagEntity.uuid) && Objects.equals(this.descp, cmdbTagEntity.descp)
            && Objects.equals(this.creatorId, cmdbTagEntity.creatorId)
            && Objects.equals(this.envIdList, cmdbTagEntity.envIdList) && Objects.equals(this.id, cmdbTagEntity.id)
            && Objects.equals(this.gmtCreate, cmdbTagEntity.gmtCreate)
            && Objects.equals(this.gmtModify, cmdbTagEntity.gmtModify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, businessId, uuid, descp, creatorId, envIdList, id, gmtCreate, gmtModify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CmdbTagEntity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    descp: ").append(toIndentedString(descp)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    envIdList: ").append(toIndentedString(envIdList)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    gmtModify: ").append(toIndentedString(gmtModify)).append("\n");
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
