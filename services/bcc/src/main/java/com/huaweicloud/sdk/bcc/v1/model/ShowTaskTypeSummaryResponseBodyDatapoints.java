package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowTaskTypeSummaryResponseBodyDatapoints
 */
public class ShowTaskTypeSummaryResponseBodyDatapoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_date")

    private String statisticsDate;

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

    public ShowTaskTypeSummaryResponseBodyDatapoints withStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate;
        return this;
    }

    /**
     * 统计日期
     * @return statisticsDate
     */
    public String getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的所有类型任务数量
     * @return totalTaskCount
     */
    public Integer getTotalTaskCount() {
        return totalTaskCount;
    }

    public void setTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withBackupTaskCount(Integer backupTaskCount) {
        this.backupTaskCount = backupTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的备份任务数
     * @return backupTaskCount
     */
    public Integer getBackupTaskCount() {
        return backupTaskCount;
    }

    public void setBackupTaskCount(Integer backupTaskCount) {
        this.backupTaskCount = backupTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withReplicationTaskCount(Integer replicationTaskCount) {
        this.replicationTaskCount = replicationTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的复制任务数
     * @return replicationTaskCount
     */
    public Integer getReplicationTaskCount() {
        return replicationTaskCount;
    }

    public void setReplicationTaskCount(Integer replicationTaskCount) {
        this.replicationTaskCount = replicationTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withRestoreTaskCount(Integer restoreTaskCount) {
        this.restoreTaskCount = restoreTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的恢复任务数
     * @return restoreTaskCount
     */
    public Integer getRestoreTaskCount() {
        return restoreTaskCount;
    }

    public void setRestoreTaskCount(Integer restoreTaskCount) {
        this.restoreTaskCount = restoreTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withDeleteTaskCount(Integer deleteTaskCount) {
        this.deleteTaskCount = deleteTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的删除备份任务数
     * @return deleteTaskCount
     */
    public Integer getDeleteTaskCount() {
        return deleteTaskCount;
    }

    public void setDeleteTaskCount(Integer deleteTaskCount) {
        this.deleteTaskCount = deleteTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withVaultDeleteTaskCount(Integer vaultDeleteTaskCount) {
        this.vaultDeleteTaskCount = vaultDeleteTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的删除存储库任务数
     * @return vaultDeleteTaskCount
     */
    public Integer getVaultDeleteTaskCount() {
        return vaultDeleteTaskCount;
    }

    public void setVaultDeleteTaskCount(Integer vaultDeleteTaskCount) {
        this.vaultDeleteTaskCount = vaultDeleteTaskCount;
    }

    public ShowTaskTypeSummaryResponseBodyDatapoints withRemoveResourceTaskCount(Integer removeResourceTaskCount) {
        this.removeResourceTaskCount = removeResourceTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的移除存储库资源数
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
        ShowTaskTypeSummaryResponseBodyDatapoints that = (ShowTaskTypeSummaryResponseBodyDatapoints) obj;
        return Objects.equals(this.statisticsDate, that.statisticsDate)
            && Objects.equals(this.totalTaskCount, that.totalTaskCount)
            && Objects.equals(this.backupTaskCount, that.backupTaskCount)
            && Objects.equals(this.replicationTaskCount, that.replicationTaskCount)
            && Objects.equals(this.restoreTaskCount, that.restoreTaskCount)
            && Objects.equals(this.deleteTaskCount, that.deleteTaskCount)
            && Objects.equals(this.vaultDeleteTaskCount, that.vaultDeleteTaskCount)
            && Objects.equals(this.removeResourceTaskCount, that.removeResourceTaskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticsDate,
            totalTaskCount,
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
        sb.append("class ShowTaskTypeSummaryResponseBodyDatapoints {\n");
        sb.append("    statisticsDate: ").append(toIndentedString(statisticsDate)).append("\n");
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
