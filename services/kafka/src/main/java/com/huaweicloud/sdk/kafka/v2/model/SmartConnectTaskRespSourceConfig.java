package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartConnectTaskRespSourceConfig
 */
public class SmartConnectTaskRespSourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_address")

    private String redisAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_type")

    private String redisType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_instance_id")

    private String dcsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sync_wait_ms")

    private Integer fullSyncWaitMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sync_max_retry")

    private Integer fullSyncMaxRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratelimit")

    private Integer ratelimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cluster_name")

    private String currentClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_mechanism")

    private String saslMechanism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootstrap_servers")

    private String bootstrapServers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_protocol")

    private String securityProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_consumer_offsets_enabled")

    private Boolean syncConsumerOffsetsEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_factor")

    private String replicationFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_num")

    private String taskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rename_topic_enable")

    private Boolean renameTopicEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provenance_header_enabled")

    private Boolean provenanceHeaderEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_strategy")

    private String consumerStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression_type")

    private String compressionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics_mapping")

    private String topicsMapping;

    public SmartConnectTaskRespSourceConfig withRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
        return this;
    }

    /**
     * Redis实例地址。（仅源端类型为Redis时会显示）
     * @return redisAddress
     */
    public String getRedisAddress() {
        return redisAddress;
    }

    public void setRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
    }

    public SmartConnectTaskRespSourceConfig withRedisType(String redisType) {
        this.redisType = redisType;
        return this;
    }

    /**
     * Redis实例类型。（仅源端类型为Redis时会显示）
     * @return redisType
     */
    public String getRedisType() {
        return redisType;
    }

    public void setRedisType(String redisType) {
        this.redisType = redisType;
    }

    public SmartConnectTaskRespSourceConfig withDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
        return this;
    }

    /**
     * DCS实例ID。（仅源端类型为Redis时会显示）
     * @return dcsInstanceId
     */
    public String getDcsInstanceId() {
        return dcsInstanceId;
    }

    public void setDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
    }

    public SmartConnectTaskRespSourceConfig withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 同步类型，“RDB_ONLY”为全量同步，“CUSTOM_OFFSET”为全量同步+增量同步。（仅源端类型为Redis时会显示）
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public SmartConnectTaskRespSourceConfig withFullSyncWaitMs(Integer fullSyncWaitMs) {
        this.fullSyncWaitMs = fullSyncWaitMs;
        return this;
    }

    /**
     * 全量同步重试间隔时间，单位：毫秒。（仅源端类型为Redis时会显示）
     * @return fullSyncWaitMs
     */
    public Integer getFullSyncWaitMs() {
        return fullSyncWaitMs;
    }

    public void setFullSyncWaitMs(Integer fullSyncWaitMs) {
        this.fullSyncWaitMs = fullSyncWaitMs;
    }

    public SmartConnectTaskRespSourceConfig withFullSyncMaxRetry(Integer fullSyncMaxRetry) {
        this.fullSyncMaxRetry = fullSyncMaxRetry;
        return this;
    }

    /**
     * 全量同步最大重试次数。（仅源端类型为Redis时会显示）
     * @return fullSyncMaxRetry
     */
    public Integer getFullSyncMaxRetry() {
        return fullSyncMaxRetry;
    }

    public void setFullSyncMaxRetry(Integer fullSyncMaxRetry) {
        this.fullSyncMaxRetry = fullSyncMaxRetry;
    }

    public SmartConnectTaskRespSourceConfig withRatelimit(Integer ratelimit) {
        this.ratelimit = ratelimit;
        return this;
    }

    /**
     * 限速，单位为KB/s。-1表示不限速（仅源端类型为Redis时会显示）
     * @return ratelimit
     */
    public Integer getRatelimit() {
        return ratelimit;
    }

    public void setRatelimit(Integer ratelimit) {
        this.ratelimit = ratelimit;
    }

    public SmartConnectTaskRespSourceConfig withCurrentClusterName(String currentClusterName) {
        this.currentClusterName = currentClusterName;
        return this;
    }

    /**
     * 当前Kafka实例别名。（仅源端类型为Kafka时会显示）
     * @return currentClusterName
     */
    public String getCurrentClusterName() {
        return currentClusterName;
    }

    public void setCurrentClusterName(String currentClusterName) {
        this.currentClusterName = currentClusterName;
    }

    public SmartConnectTaskRespSourceConfig withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 对端Kafka实例别名。（仅源端类型为Kafka时会显示）
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public SmartConnectTaskRespSourceConfig withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 对端Kafka用户名。（仅源端类型为Kafka时会显示）
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SmartConnectTaskRespSourceConfig withSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * 对端Kafka认证机制。（仅源端类型为Kafka时会显示）
     * @return saslMechanism
     */
    public String getSaslMechanism() {
        return saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public SmartConnectTaskRespSourceConfig withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 对端Kafka实例ID。（仅源端类型为Kafka时会显示）
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SmartConnectTaskRespSourceConfig withBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
        return this;
    }

    /**
     * 对端Kafka实例地址。（仅源端类型为Kafka时会显示）
     * @return bootstrapServers
     */
    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public SmartConnectTaskRespSourceConfig withSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    /**
     * 对端Kafka认证方式。（仅源端类型为Kafka时会显示）
     * @return securityProtocol
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public SmartConnectTaskRespSourceConfig withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 同步方向。（仅源端类型为Kafka时会显示）
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public SmartConnectTaskRespSourceConfig withSyncConsumerOffsetsEnabled(Boolean syncConsumerOffsetsEnabled) {
        this.syncConsumerOffsetsEnabled = syncConsumerOffsetsEnabled;
        return this;
    }

    /**
     * 是否同步消费进度。（仅源端类型为Kafka时会显示）
     * @return syncConsumerOffsetsEnabled
     */
    public Boolean getSyncConsumerOffsetsEnabled() {
        return syncConsumerOffsetsEnabled;
    }

    public void setSyncConsumerOffsetsEnabled(Boolean syncConsumerOffsetsEnabled) {
        this.syncConsumerOffsetsEnabled = syncConsumerOffsetsEnabled;
    }

    public SmartConnectTaskRespSourceConfig withReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /**
     * 副本数。（仅源端类型为Kafka时会显示）
     * @return replicationFactor
     */
    public String getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public SmartConnectTaskRespSourceConfig withTaskNum(String taskNum) {
        this.taskNum = taskNum;
        return this;
    }

    /**
     * 任务数。（仅源端类型为Kafka时会显示）
     * @return taskNum
     */
    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public SmartConnectTaskRespSourceConfig withRenameTopicEnable(Boolean renameTopicEnable) {
        this.renameTopicEnable = renameTopicEnable;
        return this;
    }

    /**
     * 是否重命名Topic。（仅源端类型为Kafka时会显示）
     * @return renameTopicEnable
     */
    public Boolean getRenameTopicEnable() {
        return renameTopicEnable;
    }

    public void setRenameTopicEnable(Boolean renameTopicEnable) {
        this.renameTopicEnable = renameTopicEnable;
    }

    public SmartConnectTaskRespSourceConfig withProvenanceHeaderEnabled(Boolean provenanceHeaderEnabled) {
        this.provenanceHeaderEnabled = provenanceHeaderEnabled;
        return this;
    }

    /**
     * 是否添加来源header。（仅源端类型为Kafka时会显示）
     * @return provenanceHeaderEnabled
     */
    public Boolean getProvenanceHeaderEnabled() {
        return provenanceHeaderEnabled;
    }

    public void setProvenanceHeaderEnabled(Boolean provenanceHeaderEnabled) {
        this.provenanceHeaderEnabled = provenanceHeaderEnabled;
    }

    public SmartConnectTaskRespSourceConfig withConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * 启动偏移量，latest为获取最新的数据，earliest为获取最早的数据。（仅源端类型为Kafka时会显示）
     * @return consumerStrategy
     */
    public String getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public SmartConnectTaskRespSourceConfig withCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * 压缩算法。（仅源端类型为Kafka时会显示）
     * @return compressionType
     */
    public String getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    public SmartConnectTaskRespSourceConfig withTopicsMapping(String topicsMapping) {
        this.topicsMapping = topicsMapping;
        return this;
    }

    /**
     * topic映射。（仅源端类型为Kafka时会显示）
     * @return topicsMapping
     */
    public String getTopicsMapping() {
        return topicsMapping;
    }

    public void setTopicsMapping(String topicsMapping) {
        this.topicsMapping = topicsMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartConnectTaskRespSourceConfig that = (SmartConnectTaskRespSourceConfig) obj;
        return Objects.equals(this.redisAddress, that.redisAddress) && Objects.equals(this.redisType, that.redisType)
            && Objects.equals(this.dcsInstanceId, that.dcsInstanceId) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.fullSyncWaitMs, that.fullSyncWaitMs)
            && Objects.equals(this.fullSyncMaxRetry, that.fullSyncMaxRetry)
            && Objects.equals(this.ratelimit, that.ratelimit)
            && Objects.equals(this.currentClusterName, that.currentClusterName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.saslMechanism, that.saslMechanism)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.bootstrapServers, that.bootstrapServers)
            && Objects.equals(this.securityProtocol, that.securityProtocol)
            && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.syncConsumerOffsetsEnabled, that.syncConsumerOffsetsEnabled)
            && Objects.equals(this.replicationFactor, that.replicationFactor)
            && Objects.equals(this.taskNum, that.taskNum)
            && Objects.equals(this.renameTopicEnable, that.renameTopicEnable)
            && Objects.equals(this.provenanceHeaderEnabled, that.provenanceHeaderEnabled)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.compressionType, that.compressionType)
            && Objects.equals(this.topicsMapping, that.topicsMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisAddress,
            redisType,
            dcsInstanceId,
            syncMode,
            fullSyncWaitMs,
            fullSyncMaxRetry,
            ratelimit,
            currentClusterName,
            clusterName,
            userName,
            saslMechanism,
            instanceId,
            bootstrapServers,
            securityProtocol,
            direction,
            syncConsumerOffsetsEnabled,
            replicationFactor,
            taskNum,
            renameTopicEnable,
            provenanceHeaderEnabled,
            consumerStrategy,
            compressionType,
            topicsMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectTaskRespSourceConfig {\n");
        sb.append("    redisAddress: ").append(toIndentedString(redisAddress)).append("\n");
        sb.append("    redisType: ").append(toIndentedString(redisType)).append("\n");
        sb.append("    dcsInstanceId: ").append(toIndentedString(dcsInstanceId)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    fullSyncWaitMs: ").append(toIndentedString(fullSyncWaitMs)).append("\n");
        sb.append("    fullSyncMaxRetry: ").append(toIndentedString(fullSyncMaxRetry)).append("\n");
        sb.append("    ratelimit: ").append(toIndentedString(ratelimit)).append("\n");
        sb.append("    currentClusterName: ").append(toIndentedString(currentClusterName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    saslMechanism: ").append(toIndentedString(saslMechanism)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    bootstrapServers: ").append(toIndentedString(bootstrapServers)).append("\n");
        sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    syncConsumerOffsetsEnabled: ").append(toIndentedString(syncConsumerOffsetsEnabled)).append("\n");
        sb.append("    replicationFactor: ").append(toIndentedString(replicationFactor)).append("\n");
        sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
        sb.append("    renameTopicEnable: ").append(toIndentedString(renameTopicEnable)).append("\n");
        sb.append("    provenanceHeaderEnabled: ").append(toIndentedString(provenanceHeaderEnabled)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
        sb.append("    topicsMapping: ").append(toIndentedString(topicsMapping)).append("\n");
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
