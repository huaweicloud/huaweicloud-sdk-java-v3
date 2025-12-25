package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProjectRolePermissionDo
 */
public class ProjectRolePermissionDo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private Integer roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devuc_role_id")

    private String devucRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_permission_config")

    private Boolean isPermissionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_change_pkg_status")

    private Boolean isChangePkgStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_upload")

    private Boolean isUpload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_restore_test_pkg")

    private Boolean isDeleteRestoreTestPkg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_restore_prod_pkg")

    private Boolean isDeleteRestoreProdPkg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_edit_test_pkg")

    private Boolean isEditTestPkg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_mkdir")

    private Boolean isMkdir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_download")

    private Boolean isDownload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_restore_all")

    private Boolean isRestoreAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_empty")

    private Boolean isEmpty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrated_630")

    private Integer migrated630;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private String roles;

    public ProjectRolePermissionDo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: ID。 **取值范围**: 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectRolePermissionDo withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释**: 角色ID。 **取值范围**: 不涉及。
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public ProjectRolePermissionDo withDevucRoleId(String devucRoleId) {
        this.devucRoleId = devucRoleId;
        return this;
    }

    /**
     * **参数解释**: DEVUC角色ID。 **取值范围**: 不涉及。
     * @return devucRoleId
     */
    public String getDevucRoleId() {
        return devucRoleId;
    }

    public void setDevucRoleId(String devucRoleId) {
        this.devucRoleId = devucRoleId;
    }

    public ProjectRolePermissionDo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID。 **取值范围**: 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProjectRolePermissionDo withIsPermissionConfig(Boolean isPermissionConfig) {
        this.isPermissionConfig = isPermissionConfig;
        return this;
    }

    /**
     * **参数解释**: 是否具有权限配置能力。 **取值范围**: - true：能够配置权限。 - false：不能配置权限。
     * @return isPermissionConfig
     */
    public Boolean getIsPermissionConfig() {
        return isPermissionConfig;
    }

    public void setIsPermissionConfig(Boolean isPermissionConfig) {
        this.isPermissionConfig = isPermissionConfig;
    }

    public ProjectRolePermissionDo withIsChangePkgStatus(Boolean isChangePkgStatus) {
        this.isChangePkgStatus = isChangePkgStatus;
        return this;
    }

    /**
     * **参数解释**: 能否更改软件包状态。 **取值范围**: - true：能够更改软件包状态。 - false：不能更改软件包状态。
     * @return isChangePkgStatus
     */
    public Boolean getIsChangePkgStatus() {
        return isChangePkgStatus;
    }

    public void setIsChangePkgStatus(Boolean isChangePkgStatus) {
        this.isChangePkgStatus = isChangePkgStatus;
    }

    public ProjectRolePermissionDo withIsUpload(Boolean isUpload) {
        this.isUpload = isUpload;
        return this;
    }

    /**
     * **参数解释**: 能否进行上传。 **取值范围**: - true：能够进行上传。 - false：不能上传。
     * @return isUpload
     */
    public Boolean getIsUpload() {
        return isUpload;
    }

    public void setIsUpload(Boolean isUpload) {
        this.isUpload = isUpload;
    }

    public ProjectRolePermissionDo withIsDeleteRestoreTestPkg(Boolean isDeleteRestoreTestPkg) {
        this.isDeleteRestoreTestPkg = isDeleteRestoreTestPkg;
        return this;
    }

    /**
     * **参数解释**: 能否删除和还原测试状态的软件包。 **取值范围**: - true：能够删除和还原测试状态的软件包。 - false：不能删除和还原测试状态的软件包。
     * @return isDeleteRestoreTestPkg
     */
    public Boolean getIsDeleteRestoreTestPkg() {
        return isDeleteRestoreTestPkg;
    }

    public void setIsDeleteRestoreTestPkg(Boolean isDeleteRestoreTestPkg) {
        this.isDeleteRestoreTestPkg = isDeleteRestoreTestPkg;
    }

    public ProjectRolePermissionDo withIsDeleteRestoreProdPkg(Boolean isDeleteRestoreProdPkg) {
        this.isDeleteRestoreProdPkg = isDeleteRestoreProdPkg;
        return this;
    }

    /**
     * **参数解释**: 能否删除和还原生产状态的软件包。 **取值范围**: - true：能够删除和还原生产状态的软件包。 - false：不能删除和还原生产状态的软件包。
     * @return isDeleteRestoreProdPkg
     */
    public Boolean getIsDeleteRestoreProdPkg() {
        return isDeleteRestoreProdPkg;
    }

    public void setIsDeleteRestoreProdPkg(Boolean isDeleteRestoreProdPkg) {
        this.isDeleteRestoreProdPkg = isDeleteRestoreProdPkg;
    }

    public ProjectRolePermissionDo withIsEditTestPkg(Boolean isEditTestPkg) {
        this.isEditTestPkg = isEditTestPkg;
        return this;
    }

    /**
     * **参数解释**: 能否编辑测试状态的软件包。 **取值范围**: - true：能够编辑测试状态的软件包。 - false：不能编辑测试状态的软件包。
     * @return isEditTestPkg
     */
    public Boolean getIsEditTestPkg() {
        return isEditTestPkg;
    }

    public void setIsEditTestPkg(Boolean isEditTestPkg) {
        this.isEditTestPkg = isEditTestPkg;
    }

    public ProjectRolePermissionDo withIsMkdir(Boolean isMkdir) {
        this.isMkdir = isMkdir;
        return this;
    }

    /**
     * **参数解释**: 能否创建文件夹。 **取值范围**: - true：能够创建目录。 - false：不能创建目录。
     * @return isMkdir
     */
    public Boolean getIsMkdir() {
        return isMkdir;
    }

    public void setIsMkdir(Boolean isMkdir) {
        this.isMkdir = isMkdir;
    }

    public ProjectRolePermissionDo withIsDownload(Boolean isDownload) {
        this.isDownload = isDownload;
        return this;
    }

    /**
     * **参数解释**: 能否进行下载。 **取值范围**: - true：能够下载。 - false：不能下载。
     * @return isDownload
     */
    public Boolean getIsDownload() {
        return isDownload;
    }

    public void setIsDownload(Boolean isDownload) {
        this.isDownload = isDownload;
    }

    public ProjectRolePermissionDo withIsRestoreAll(Boolean isRestoreAll) {
        this.isRestoreAll = isRestoreAll;
        return this;
    }

    /**
     * **参数解释**: 能否还原回收站。 **取值范围**: - true：能够在回收站还原所有。 - false：不能在回收站还原所有。
     * @return isRestoreAll
     */
    public Boolean getIsRestoreAll() {
        return isRestoreAll;
    }

    public void setIsRestoreAll(Boolean isRestoreAll) {
        this.isRestoreAll = isRestoreAll;
    }

    public ProjectRolePermissionDo withIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
        return this;
    }

    /**
     * **参数解释**: 能否清空回收站。 **取值范围**: - true：能够清空回收站。 - false：不能清空回收站。
     * @return isEmpty
     */
    public Boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public ProjectRolePermissionDo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 **取值范围**: 不涉及。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ProjectRolePermissionDo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**: 更新时间。 **取值范围**: 不涉及。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ProjectRolePermissionDo withMigrated630(Integer migrated630) {
        this.migrated630 = migrated630;
        return this;
    }

    /**
     * **参数解释**: 权限迁移状态。 **取值范围**: 不涉及。
     * @return migrated630
     */
    public Integer getMigrated630() {
        return migrated630;
    }

    public void setMigrated630(Integer migrated630) {
        this.migrated630 = migrated630;
    }

    public ProjectRolePermissionDo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: 区域。 **取值范围**: 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProjectRolePermissionDo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**: 用户id。 **取值范围**: 不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProjectRolePermissionDo withRoles(String roles) {
        this.roles = roles;
        return this;
    }

    /**
     * **参数解释**: 角色。 **取值范围**: 不涉及。
     * @return roles
     */
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectRolePermissionDo that = (ProjectRolePermissionDo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.devucRoleId, that.devucRoleId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.isPermissionConfig, that.isPermissionConfig)
            && Objects.equals(this.isChangePkgStatus, that.isChangePkgStatus)
            && Objects.equals(this.isUpload, that.isUpload)
            && Objects.equals(this.isDeleteRestoreTestPkg, that.isDeleteRestoreTestPkg)
            && Objects.equals(this.isDeleteRestoreProdPkg, that.isDeleteRestoreProdPkg)
            && Objects.equals(this.isEditTestPkg, that.isEditTestPkg) && Objects.equals(this.isMkdir, that.isMkdir)
            && Objects.equals(this.isDownload, that.isDownload) && Objects.equals(this.isRestoreAll, that.isRestoreAll)
            && Objects.equals(this.isEmpty, that.isEmpty) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.migrated630, that.migrated630)
            && Objects.equals(this.region, that.region) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            roleId,
            devucRoleId,
            projectId,
            isPermissionConfig,
            isChangePkgStatus,
            isUpload,
            isDeleteRestoreTestPkg,
            isDeleteRestoreProdPkg,
            isEditTestPkg,
            isMkdir,
            isDownload,
            isRestoreAll,
            isEmpty,
            createTime,
            updateTime,
            migrated630,
            region,
            userId,
            roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectRolePermissionDo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    devucRoleId: ").append(toIndentedString(devucRoleId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isPermissionConfig: ").append(toIndentedString(isPermissionConfig)).append("\n");
        sb.append("    isChangePkgStatus: ").append(toIndentedString(isChangePkgStatus)).append("\n");
        sb.append("    isUpload: ").append(toIndentedString(isUpload)).append("\n");
        sb.append("    isDeleteRestoreTestPkg: ").append(toIndentedString(isDeleteRestoreTestPkg)).append("\n");
        sb.append("    isDeleteRestoreProdPkg: ").append(toIndentedString(isDeleteRestoreProdPkg)).append("\n");
        sb.append("    isEditTestPkg: ").append(toIndentedString(isEditTestPkg)).append("\n");
        sb.append("    isMkdir: ").append(toIndentedString(isMkdir)).append("\n");
        sb.append("    isDownload: ").append(toIndentedString(isDownload)).append("\n");
        sb.append("    isRestoreAll: ").append(toIndentedString(isRestoreAll)).append("\n");
        sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    migrated630: ").append(toIndentedString(migrated630)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
