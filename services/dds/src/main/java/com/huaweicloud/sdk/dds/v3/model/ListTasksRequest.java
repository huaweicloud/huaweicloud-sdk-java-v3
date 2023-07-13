package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTasksRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始，Z指时区偏移量
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTasksRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”，且大于查询开始时间，时间跨度不超过30天。 其中，T指某个时间的开始，Z指时区偏移量。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListTasksRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态： 取值为“Running”为执行中； 取值为“Completed”为完成； 取值为“Failed” 为失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListTasksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称。对应取值如下： - \"CreateMongoDB\"：创建集群实例 - \"CreateMongoDBReplica\"：创建副本集实例 - \"CreateMongoDBReplicaSingle\"：创建单节点实例 - \"EnlargeMongoDBVolume\"：磁盘扩容 - \"ResizeMongoDBInstance\"：社区版实例规格变更 - \"ResizeDfvMongoDBInstance\"：社区增强版实例规格变更 - \"EnlargeMongoDBGroup\"：添加节点 - \"ReplicaSetEnlargeNode\"：副本集添加备节点 - \"AddReadonlyNode\"：添加只读节点 - \"RestartInstance\"：重启集群实例 - \"RestartGroup\"：重启集群节点组 - \"RestartNode\"：重启集群节点 - \"RestartReplicaSetInstance\"：重启副本集实例 - \"RestartReplicaSingleInstance\"：重启单节点实例 - \"SwitchPrimary\"：主备切换 - \"ModifyIp\"：修改内网地址 - \"ModifySecurityGroup\"：修改安全组 - \"ModifyPort\"：修改数据库端口 - \"BindPublicIP\"：绑定弹性IP - \"UnbindPublicIP\"：解绑弹性IP - \"SwitchInstanceSSL\"：切换SSL - \"AzMigrate\"：迁移可用区 - \"CreateIp\"：显示shard/config IP - \"ModifyOpLogSize\"：修改oplog大小 - \"RestoreMongoDB\"：集群恢复到新实例 - \"RestoreMongoDB_Replica\"：副本集恢复到新实例 - \"RestoreMongoDB_Replica_Single\"：单节点恢复到新实例 - \"RestoreMongoDB_Replica_PITR\"：副本集恢复到指定时间点 - \"MongodbSnapshotBackup\"：创建物理备份 - \"MongodbSnapshotEBackup\"：创建快照备份 - \"MongodbRestoreData2CurrentInstance\"：备份恢复到当前实例 - \"MongodbRestoreData2NewInstance\"：备份恢复到新实例 - \"MongodbPitr2CurrentInstance\"：备份恢复到当前实例指定时间点 - \"MongodbPitr2NewInstance\"：备份恢复到新实例指定时间点 - \"MongodbRecycleBackup\"：备份回收 - \"MongodbRestoreTable\"：库表级时间点恢复 - \"UpgradeDatabaseVersion\"：升级数据库补丁
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为100，不能为负数，最小值为1，最大值为100。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequest that = (ListTasksRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, status, name, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
