package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 快照视图对象
 */
public class SnapshotsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot2workitem")

    private Object snapshot2workitem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserVO createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserVO modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snap_base_info_id")

    private String snapBaseInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_full_path")

    private String parentFullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_path")

    private String parentPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_number")

    private Integer versionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    public SnapshotsVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 快照标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SnapshotsVO withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项ID。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public SnapshotsVO withSnapshot2workitem(Object snapshot2workitem) {
        this.snapshot2workitem = snapshot2workitem;
        return this;
    }

    /**
     * 快照记录工作项。键为工作项类型编码（如 Bug、IR），值为 IssueVO 对象或工作项ID字符串。
     * @return snapshot2workitem
     */
    public Object getSnapshot2workitem() {
        return snapshot2workitem;
    }

    public void setSnapshot2workitem(Object snapshot2workitem) {
        this.snapshot2workitem = snapshot2workitem;
    }

    public SnapshotsVO withCreatedBy(UserVO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public SnapshotsVO withCreatedBy(Consumer<UserVO> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserVO();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserVO getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserVO createdBy) {
        this.createdBy = createdBy;
    }

    public SnapshotsVO withModifiedBy(UserVO modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public SnapshotsVO withModifiedBy(Consumer<UserVO> modifiedBySetter) {
        if (this.modifiedBy == null) {
            this.modifiedBy = new UserVO();
            modifiedBySetter.accept(this.modifiedBy);
        }

        return this;
    }

    /**
     * Get modifiedBy
     * @return modifiedBy
     */
    public UserVO getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(UserVO modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SnapshotsVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 工作项类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SnapshotsVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SnapshotsVO withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 工作项父子挂载路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SnapshotsVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SnapshotsVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 快照ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnapshotsVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public SnapshotsVO withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 快照创建时间，unix时间戳，单位：毫秒。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public SnapshotsVO withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 快照最后修改时间，unix时间戳，单位：毫秒。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public SnapshotsVO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 项目空间ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public SnapshotsVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 快照类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SnapshotsVO withSnapBaseInfoId(String snapBaseInfoId) {
        this.snapBaseInfoId = snapBaseInfoId;
        return this;
    }

    /**
     * 快照基础信息ID。
     * @return snapBaseInfoId
     */
    public String getSnapBaseInfoId() {
        return snapBaseInfoId;
    }

    public void setSnapBaseInfoId(String snapBaseInfoId) {
        this.snapBaseInfoId = snapBaseInfoId;
    }

    public SnapshotsVO withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * 工作项类型编码。
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public SnapshotsVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父工作项ID。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public SnapshotsVO withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 根工作项ID。
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public SnapshotsVO withParentFullPath(String parentFullPath) {
        this.parentFullPath = parentFullPath;
        return this;
    }

    /**
     * 父工作项完整路径。
     * @return parentFullPath
     */
    public String getParentFullPath() {
        return parentFullPath;
    }

    public void setParentFullPath(String parentFullPath) {
        this.parentFullPath = parentFullPath;
    }

    public SnapshotsVO withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * 父工作项路径。
     * @return parentPath
     */
    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public SnapshotsVO withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * 工作项完整路径。
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public SnapshotsVO withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * 快照版本号。
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public SnapshotsVO withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 是否可删除。
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public SnapshotsVO withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * 工作项类型名称。
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotsVO that = (SnapshotsVO) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.snapshot2workitem, that.snapshot2workitem)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.category, that.category) && Objects.equals(this.description, that.description)
            && Objects.equals(this.path, that.path) && Objects.equals(this.region, that.region)
            && Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.snapBaseInfoId, that.snapBaseInfoId)
            && Objects.equals(this.issueCategory, that.issueCategory) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.rootId, that.rootId) && Objects.equals(this.parentFullPath, that.parentFullPath)
            && Objects.equals(this.parentPath, that.parentPath) && Objects.equals(this.fullPath, that.fullPath)
            && Objects.equals(this.versionNumber, that.versionNumber) && Objects.equals(this.deletable, that.deletable)
            && Objects.equals(this.categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            issueId,
            snapshot2workitem,
            createdBy,
            modifiedBy,
            category,
            description,
            path,
            region,
            id,
            tenantId,
            createdDate,
            modifiedDate,
            domainId,
            type,
            snapBaseInfoId,
            issueCategory,
            parentId,
            rootId,
            parentFullPath,
            parentPath,
            fullPath,
            versionNumber,
            deletable,
            categoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotsVO {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    snapshot2workitem: ").append(toIndentedString(snapshot2workitem)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    snapBaseInfoId: ").append(toIndentedString(snapBaseInfoId)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    parentFullPath: ").append(toIndentedString(parentFullPath)).append("\n");
        sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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
