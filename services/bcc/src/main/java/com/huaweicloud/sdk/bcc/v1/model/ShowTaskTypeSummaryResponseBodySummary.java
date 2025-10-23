package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 统计数据
 */
public class ShowTaskTypeSummaryResponseBodySummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_count")

    private Integer totalTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_task_count")

    private Integer backupTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_task_count")

    private Integer replicationTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_task_count")

    private Integer restoreTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_task_count")

    private Integer deleteTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_delete_task_count")

    private Integer vaultDeleteTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_resource_task_count")

    private Integer removeResourceTaskCount;

    public ShowTaskTypeSummaryResponseBodySummary withTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
        return this;
    }

    /**
     * 总任务数据
     * @return totalTaskCount
     */
    public Integer getTotalTaskCount() {
        return totalTaskCount;
    }

    public void setTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodySummary withBackupTaskCount(Integer backupTaskCount) {
        this.backupTaskCount = backupTaskCount;
        return this;
    }

    /**
     * 备份任务总数
     * @return backupTaskCount
     */
    public Integer getBackupTaskCount() {
        return backupTaskCount;
    }

    public void setBackupTaskCount(Integer backupTaskCount) {
        this.backupTaskCount = backupTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodySummary withReplicationTaskCount(Integer replicationTaskCount) {
        this.replicationTaskCount = replicationTaskCount;
        return this;
    }

    /**
     * 复制任务总数
     * @return replicationTaskCount
     */
    public Integer getReplicationTaskCount() {
        return replicationTaskCount;
    }

    public void setReplicationTaskCount(Integer replicationTaskCount) {
        this.replicationTaskCount = replicationTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodySummary withRestoreTaskCount(Integer restoreTaskCount) {
        this.restoreTaskCount = restoreTaskCount;
        return this;
    }

    /**
     * 恢复任务总数
     * @return restoreTaskCount
     */
    public Integer getRestoreTaskCount() {
        return restoreTaskCount;
    }

    public void setRestoreTaskCount(Integer restoreTaskCount) {
        this.restoreTaskCount = restoreTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodySummary withDeleteTaskCount(Integer deleteTaskCount) {
        this.deleteTaskCount = deleteTaskCount;
        return this;
    }

    /**
     * 删除备份任务总数
     * @return deleteTaskCount
     */
    public Integer getDeleteTaskCount() {
        return deleteTaskCount;
    }

    public void setDeleteTaskCount(Integer deleteTaskCount) {
        this.deleteTaskCount = deleteTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodySummary withVaultDeleteTaskCount(Integer vaultDeleteTaskCount) {
        this.vaultDeleteTaskCount = vaultDeleteTaskCount;
        return this;
    }

    /**
     * 删除存储库任务总数
     * @return vaultDeleteTaskCount
     */
    public Integer getVaultDeleteTaskCount() {
        return vaultDeleteTaskCount;
    }

    public void setVaultDeleteTaskCount(Integer vaultDeleteTaskCount) {
        this.vaultDeleteTaskCount = vaultDeleteTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodySummary withRemoveResourceTaskCount(Integer removeResourceTaskCount) {
        this.removeResourceTaskCount = removeResourceTaskCount;
        return this;
    }

    /**
     * 移除存储库资源总数
     * @return removeResourceTaskCount
     */
    public Integer getRemoveResourceTaskCount() {
        return removeResourceTaskCount;
    }

    public void setRemoveResourceTaskCount(Integer removeResourceTaskCount) {
        this.removeResourceTaskCount = removeResourceTaskCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskTypeSummaryResponseBodySummary that = (ShowTaskTypeSummaryResponseBodySummary) obj;
        return Objects.equals(this.totalTaskCount, that.totalTaskCount)
            && Objects.equals(this.backupTaskCount, that.backupTaskCount)
            && Objects.equals(this.replicationTaskCount, that.replicationTaskCount)
            && Objects.equals(this.restoreTaskCount, that.restoreTaskCount)
            && Objects.equals(this.deleteTaskCount, that.deleteTaskCount)
            && Objects.equals(this.vaultDeleteTaskCount, that.vaultDeleteTaskCount)
            && Objects.equals(this.removeResourceTaskCount, that.removeResourceTaskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalTaskCount,
            backupTaskCount,
            replicationTaskCount,
            restoreTaskCount,
            deleteTaskCount,
            vaultDeleteTaskCount,
            removeResourceTaskCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskTypeSummaryResponseBodySummary {\n");
        sb.append("    totalTaskCount: ").append(toIndentedString(totalTaskCount)).append("\n");
        sb.append("    backupTaskCount: ").append(toIndentedString(backupTaskCount)).append("\n");
        sb.append("    replicationTaskCount: ").append(toIndentedString(replicationTaskCount)).append("\n");
        sb.append("    restoreTaskCount: ").append(toIndentedString(restoreTaskCount)).append("\n");
        sb.append("    deleteTaskCount: ").append(toIndentedString(deleteTaskCount)).append("\n");
        sb.append("    vaultDeleteTaskCount: ").append(toIndentedString(vaultDeleteTaskCount)).append("\n");
        sb.append("    removeResourceTaskCount: ").append(toIndentedString(removeResourceTaskCount)).append("\n");
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
