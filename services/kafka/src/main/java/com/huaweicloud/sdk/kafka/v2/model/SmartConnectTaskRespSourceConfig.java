package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartConnectTaskRespSourceConfig
 */
public class SmartConnectTaskRespSourceConfig {

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

    private Integer replicationFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_num")

    private Integer taskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rename_topic_enabled")

    private Boolean renameTopicEnabled;

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

    public SmartConnectTaskRespSourceConfig withReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /**
     * 副本数。（仅源端类型为Kafka时会显示）
     * @return replicationFactor
     */
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public SmartConnectTaskRespSourceConfig withTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
        return this;
    }

    /**
     * 任务数。（仅源端类型为Kafka时会显示）
     * @return taskNum
     */
    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    public SmartConnectTaskRespSourceConfig withRenameTopicEnabled(Boolean renameTopicEnabled) {
        this.renameTopicEnabled = renameTopicEnabled;
        return this;
    }

    /**
     * 是否重命名Topic。（仅源端类型为Kafka时会显示）
     * @return renameTopicEnabled
     */
    public Boolean getRenameTopicEnabled() {
        return renameTopicEnabled;
    }

    public void setRenameTopicEnabled(Boolean renameTopicEnabled) {
        this.renameTopicEnabled = renameTopicEnabled;
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
     * Topic映射。（仅源端类型为Kafka时会显示）
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
        return Objects.equals(this.currentClusterName, that.currentClusterName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.saslMechanism, that.saslMechanism)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.bootstrapServers, that.bootstrapServers)
            && Objects.equals(this.securityProtocol, that.securityProtocol)
            && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.syncConsumerOffsetsEnabled, that.syncConsumerOffsetsEnabled)
            && Objects.equals(this.replicationFactor, that.replicationFactor)
            && Objects.equals(this.taskNum, that.taskNum)
            && Objects.equals(this.renameTopicEnabled, that.renameTopicEnabled)
            && Objects.equals(this.provenanceHeaderEnabled, that.provenanceHeaderEnabled)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.compressionType, that.compressionType)
            && Objects.equals(this.topicsMapping, that.topicsMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentClusterName,
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
            renameTopicEnabled,
            provenanceHeaderEnabled,
            consumerStrategy,
            compressionType,
            topicsMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectTaskRespSourceConfig {\n");
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
        sb.append("    renameTopicEnabled: ").append(toIndentedString(renameTopicEnabled)).append("\n");
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
