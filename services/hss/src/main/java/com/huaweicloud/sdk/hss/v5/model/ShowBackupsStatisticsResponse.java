package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupsStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_backedup_server")

    private Integer countBackedupServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_restored_task")

    private Integer countRestoredTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_used_capacity")

    private Integer countUsedCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_total_capacity")

    private Integer countTotalCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_status")

    private String vaultStatus;

    public ShowBackupsStatisticsResponse withCountBackedupServer(Integer countBackedupServer) {
        this.countBackedupServer = countBackedupServer;
        return this;
    }

    /**
     * **参数解释**： 已备份服务器数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countBackedupServer
     */
    public Integer getCountBackedupServer() {
        return countBackedupServer;
    }

    public void setCountBackedupServer(Integer countBackedupServer) {
        this.countBackedupServer = countBackedupServer;
    }

    public ShowBackupsStatisticsResponse withCountRestoredTask(Integer countRestoredTask) {
        this.countRestoredTask = countRestoredTask;
        return this;
    }

    /**
     * **参数解释**： 已恢复的备份任务数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countRestoredTask
     */
    public Integer getCountRestoredTask() {
        return countRestoredTask;
    }

    public void setCountRestoredTask(Integer countRestoredTask) {
        this.countRestoredTask = countRestoredTask;
    }

    public ShowBackupsStatisticsResponse withCountUsedCapacity(Integer countUsedCapacity) {
        this.countUsedCapacity = countUsedCapacity;
        return this;
    }

    /**
     * **参数解释**： 已使用容量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countUsedCapacity
     */
    public Integer getCountUsedCapacity() {
        return countUsedCapacity;
    }

    public void setCountUsedCapacity(Integer countUsedCapacity) {
        this.countUsedCapacity = countUsedCapacity;
    }

    public ShowBackupsStatisticsResponse withCountTotalCapacity(Integer countTotalCapacity) {
        this.countTotalCapacity = countTotalCapacity;
        return this;
    }

    /**
     * **参数解释**： 总容量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countTotalCapacity
     */
    public Integer getCountTotalCapacity() {
        return countTotalCapacity;
    }

    public void setCountTotalCapacity(Integer countTotalCapacity) {
        this.countTotalCapacity = countTotalCapacity;
    }

    public ShowBackupsStatisticsResponse withVaultStatus(String vaultStatus) {
        this.vaultStatus = vaultStatus;
        return this;
    }

    /**
     * **参数解释**： 存储库状态 **取值范围**： 字符长度0-64位 
     * @return vaultStatus
     */
    public String getVaultStatus() {
        return vaultStatus;
    }

    public void setVaultStatus(String vaultStatus) {
        this.vaultStatus = vaultStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupsStatisticsResponse that = (ShowBackupsStatisticsResponse) obj;
        return Objects.equals(this.countBackedupServer, that.countBackedupServer)
            && Objects.equals(this.countRestoredTask, that.countRestoredTask)
            && Objects.equals(this.countUsedCapacity, that.countUsedCapacity)
            && Objects.equals(this.countTotalCapacity, that.countTotalCapacity)
            && Objects.equals(this.vaultStatus, that.vaultStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countBackedupServer, countRestoredTask, countUsedCapacity, countTotalCapacity, vaultStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupsStatisticsResponse {\n");
        sb.append("    countBackedupServer: ").append(toIndentedString(countBackedupServer)).append("\n");
        sb.append("    countRestoredTask: ").append(toIndentedString(countRestoredTask)).append("\n");
        sb.append("    countUsedCapacity: ").append(toIndentedString(countUsedCapacity)).append("\n");
        sb.append("    countTotalCapacity: ").append(toIndentedString(countTotalCapacity)).append("\n");
        sb.append("    vaultStatus: ").append(toIndentedString(vaultStatus)).append("\n");
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
