package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListReleasePackagesRespData
 */
public class ListReleasePackagesRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_timestamp")

    private String applyTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_user_id")

    private String applyUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_user_name")

    private String applyUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_flag")

    private Integer deleteFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_status")

    private Integer deployStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_timestamp")

    private Long deployTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_user_id")

    private String deployUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_user_name")

    private String deployUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_approvers")

    private List<ListReleasePackagesRespPackageApprovers> packageApprovers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ListReleasePackagesRespData withApplyTimestamp(String applyTimestamp) {
        this.applyTimestamp = applyTimestamp;
        return this;
    }

    /**
     * 申请时间，13位时间戳
     * @return applyTimestamp
     */
    public String getApplyTimestamp() {
        return applyTimestamp;
    }

    public void setApplyTimestamp(String applyTimestamp) {
        this.applyTimestamp = applyTimestamp;
    }

    public ListReleasePackagesRespData withApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
        return this;
    }

    /**
     * 申请人id
     * @return applyUserId
     */
    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public ListReleasePackagesRespData withApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
        return this;
    }

    /**
     * 申请人名称
     * @return applyUserName
     */
    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public ListReleasePackagesRespData withDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    /**
     * 是否删除，0:没有删除，1:删除
     * @return deleteFlag
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public ListReleasePackagesRespData withDeployStatus(Integer deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }

    /**
     * 发布状态，1:待审批,2:成功,3:失败, 5:发布中
     * @return deployStatus
     */
    public Integer getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(Integer deployStatus) {
        this.deployStatus = deployStatus;
    }

    public ListReleasePackagesRespData withDeployTimestamp(Long deployTimestamp) {
        this.deployTimestamp = deployTimestamp;
        return this;
    }

    /**
     * 发布时间，13位时间戳
     * @return deployTimestamp
     */
    public Long getDeployTimestamp() {
        return deployTimestamp;
    }

    public void setDeployTimestamp(Long deployTimestamp) {
        this.deployTimestamp = deployTimestamp;
    }

    public ListReleasePackagesRespData withDeployUserId(String deployUserId) {
        this.deployUserId = deployUserId;
        return this;
    }

    /**
     * 发布人id
     * @return deployUserId
     */
    public String getDeployUserId() {
        return deployUserId;
    }

    public void setDeployUserId(String deployUserId) {
        this.deployUserId = deployUserId;
    }

    public ListReleasePackagesRespData withDeployUserName(String deployUserName) {
        this.deployUserName = deployUserName;
        return this;
    }

    /**
     * 发布人名称
     * @return deployUserName
     */
    public String getDeployUserName() {
        return deployUserName;
    }

    public void setDeployUserName(String deployUserName) {
        this.deployUserName = deployUserName;
    }

    public ListReleasePackagesRespData withPackageApprovers(
        List<ListReleasePackagesRespPackageApprovers> packageApprovers) {
        this.packageApprovers = packageApprovers;
        return this;
    }

    public ListReleasePackagesRespData addPackageApproversItem(
        ListReleasePackagesRespPackageApprovers packageApproversItem) {
        if (this.packageApprovers == null) {
            this.packageApprovers = new ArrayList<>();
        }
        this.packageApprovers.add(packageApproversItem);
        return this;
    }

    public ListReleasePackagesRespData withPackageApprovers(
        Consumer<List<ListReleasePackagesRespPackageApprovers>> packageApproversSetter) {
        if (this.packageApprovers == null) {
            this.packageApprovers = new ArrayList<>();
        }
        packageApproversSetter.accept(this.packageApprovers);
        return this;
    }

    /**
     * 发布包审批信息
     * @return packageApprovers
     */
    public List<ListReleasePackagesRespPackageApprovers> getPackageApprovers() {
        return packageApprovers;
    }

    public void setPackageApprovers(List<ListReleasePackagesRespPackageApprovers> packageApprovers) {
        this.packageApprovers = packageApprovers;
    }

    public ListReleasePackagesRespData withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 发布包id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ListReleasePackagesRespData withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 发布包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ListReleasePackagesRespData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID和空间信息，以 项目ID-workspace-空间ID 拼接。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListReleasePackagesRespData withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 发布包所在空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReleasePackagesRespData that = (ListReleasePackagesRespData) obj;
        return Objects.equals(this.applyTimestamp, that.applyTimestamp)
            && Objects.equals(this.applyUserId, that.applyUserId)
            && Objects.equals(this.applyUserName, that.applyUserName)
            && Objects.equals(this.deleteFlag, that.deleteFlag) && Objects.equals(this.deployStatus, that.deployStatus)
            && Objects.equals(this.deployTimestamp, that.deployTimestamp)
            && Objects.equals(this.deployUserId, that.deployUserId)
            && Objects.equals(this.deployUserName, that.deployUserName)
            && Objects.equals(this.packageApprovers, that.packageApprovers)
            && Objects.equals(this.packageId, that.packageId) && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyTimestamp,
            applyUserId,
            applyUserName,
            deleteFlag,
            deployStatus,
            deployTimestamp,
            deployUserId,
            deployUserName,
            packageApprovers,
            packageId,
            packageName,
            projectId,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReleasePackagesRespData {\n");
        sb.append("    applyTimestamp: ").append(toIndentedString(applyTimestamp)).append("\n");
        sb.append("    applyUserId: ").append(toIndentedString(applyUserId)).append("\n");
        sb.append("    applyUserName: ").append(toIndentedString(applyUserName)).append("\n");
        sb.append("    deleteFlag: ").append(toIndentedString(deleteFlag)).append("\n");
        sb.append("    deployStatus: ").append(toIndentedString(deployStatus)).append("\n");
        sb.append("    deployTimestamp: ").append(toIndentedString(deployTimestamp)).append("\n");
        sb.append("    deployUserId: ").append(toIndentedString(deployUserId)).append("\n");
        sb.append("    deployUserName: ").append(toIndentedString(deployUserName)).append("\n");
        sb.append("    packageApprovers: ").append(toIndentedString(packageApprovers)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
