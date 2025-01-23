package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 慢日志单个条目
 */
public class SlowlogItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_name")

    private String shardName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private Integer databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    private String nodeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    public SlowlogItem withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 慢日志的唯一标识
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SlowlogItem withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 慢命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public SlowlogItem withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 执行开始时间,格式为“2020-06-19T07:06:07Z”
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SlowlogItem withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时间，单位是ms
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public SlowlogItem withShardName(String shardName) {
        this.shardName = shardName;
        return this;
    }

    /**
     * 慢命令所在的分片名称，仅在实例类型为集群时支持
     * @return shardName
     */
    public String getShardName() {
        return shardName;
    }

    public void setShardName(String shardName) {
        this.shardName = shardName;
    }

    public SlowlogItem withDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * 数据库id，当前只对指定客户开放
     * @return databaseId
     */
    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public SlowlogItem withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 操作慢日志的账号名称，当前只对指定客户开放
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SlowlogItem withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * **参数解释**： 节点类型。 **取值范围**： 不涉及。 
     * @return nodeRole
     */
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public SlowlogItem withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * **参数解释**： 客户端IP地址。 **取值范围**： 不涉及。 
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowlogItem that = (SlowlogItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.command, that.command)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.shardName, that.shardName) && Objects.equals(this.databaseId, that.databaseId)
            && Objects.equals(this.username, that.username) && Objects.equals(this.nodeRole, that.nodeRole)
            && Objects.equals(this.clientIp, that.clientIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, command, startTime, duration, shardName, databaseId, username, nodeRole, clientIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowlogItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    shardName: ").append(toIndentedString(shardName)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
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
