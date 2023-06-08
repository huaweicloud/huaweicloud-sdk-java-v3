package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAppsResponseBodyResult
 */
public class ListAppsResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mark_for_delete")

    private Integer markForDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_cn")

    private String descCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_en")

    private String descEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_type")

    private String databaseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private String environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owners")

    private List<String> owners = null;

    public ListAppsResponseBodyResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAppsResponseBodyResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAppsResponseBodyResult withMarkForDelete(Integer markForDelete) {
        this.markForDelete = markForDelete;
        return this;
    }

    /**
     * 删除标记。 - 0：未删除 - 1：删除
     * @return markForDelete
     */
    public Integer getMarkForDelete() {
        return markForDelete;
    }

    public void setMarkForDelete(Integer markForDelete) {
        this.markForDelete = markForDelete;
    }

    public ListAppsResponseBodyResult withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ListAppsResponseBodyResult withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListAppsResponseBodyResult withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public ListAppsResponseBodyResult withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ListAppsResponseBodyResult withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 应用的中文名称。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public ListAppsResponseBodyResult withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 应用的英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ListAppsResponseBodyResult withDescCn(String descCn) {
        this.descCn = descCn;
        return this;
    }

    /**
     * 应用的中文描述。
     * @return descCn
     */
    public String getDescCn() {
        return descCn;
    }

    public void setDescCn(String descCn) {
        this.descCn = descCn;
    }

    public ListAppsResponseBodyResult withDescEn(String descEn) {
        this.descEn = descEn;
        return this;
    }

    /**
     * 应用的英文描述。
     * @return descEn
     */
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public ListAppsResponseBodyResult withDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * 应用的数据库类型。
     * @return databaseType
     */
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public ListAppsResponseBodyResult withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 运行服务的环境标识。
     * @return environment
     */
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public ListAppsResponseBodyResult withOwners(List<String> owners) {
        this.owners = owners;
        return this;
    }

    public ListAppsResponseBodyResult addOwnersItem(String ownersItem) {
        if (this.owners == null) {
            this.owners = new ArrayList<>();
        }
        this.owners.add(ownersItem);
        return this;
    }

    public ListAppsResponseBodyResult withOwners(Consumer<List<String>> ownersSetter) {
        if (this.owners == null) {
            this.owners = new ArrayList<>();
        }
        ownersSetter.accept(this.owners);
        return this;
    }

    /**
     * 应用责任人。
     * @return owners
     */
    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppsResponseBodyResult listAppsResponseBodyResult = (ListAppsResponseBodyResult) o;
        return Objects.equals(this.id, listAppsResponseBodyResult.id)
            && Objects.equals(this.projectId, listAppsResponseBodyResult.projectId)
            && Objects.equals(this.markForDelete, listAppsResponseBodyResult.markForDelete)
            && Objects.equals(this.createBy, listAppsResponseBodyResult.createBy)
            && Objects.equals(this.createTime, listAppsResponseBodyResult.createTime)
            && Objects.equals(this.updateBy, listAppsResponseBodyResult.updateBy)
            && Objects.equals(this.updateTime, listAppsResponseBodyResult.updateTime)
            && Objects.equals(this.nameCn, listAppsResponseBodyResult.nameCn)
            && Objects.equals(this.nameEn, listAppsResponseBodyResult.nameEn)
            && Objects.equals(this.descCn, listAppsResponseBodyResult.descCn)
            && Objects.equals(this.descEn, listAppsResponseBodyResult.descEn)
            && Objects.equals(this.databaseType, listAppsResponseBodyResult.databaseType)
            && Objects.equals(this.environment, listAppsResponseBodyResult.environment)
            && Objects.equals(this.owners, listAppsResponseBodyResult.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            markForDelete,
            createBy,
            createTime,
            updateBy,
            updateTime,
            nameCn,
            nameEn,
            descCn,
            descEn,
            databaseType,
            environment,
            owners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppsResponseBodyResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    markForDelete: ").append(toIndentedString(markForDelete)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    descCn: ").append(toIndentedString(descCn)).append("\n");
        sb.append("    descEn: ").append(toIndentedString(descEn)).append("\n");
        sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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
