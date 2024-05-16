package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueueSrcAssignCreateDTO
 */
public class QueueSrcAssignCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private List<String> queueName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_id")

    private String connId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public QueueSrcAssignCreateDTO withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 队列资源服务(当前只支持mrs、dli)。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public QueueSrcAssignCreateDTO withQueueName(List<String> queueName) {
        this.queueName = queueName;
        return this;
    }

    public QueueSrcAssignCreateDTO addQueueNameItem(String queueNameItem) {
        if (this.queueName == null) {
            this.queueName = new ArrayList<>();
        }
        this.queueName.add(queueNameItem);
        return this;
    }

    public QueueSrcAssignCreateDTO withQueueName(Consumer<List<String>> queueNameSetter) {
        if (this.queueName == null) {
            this.queueName = new ArrayList<>();
        }
        queueNameSetter.accept(this.queueName);
        return this;
    }

    /**
     * 队列名称。
     * @return queueName
     */
    public List<String> getQueueName() {
        return queueName;
    }

    public void setQueueName(List<String> queueName) {
        this.queueName = queueName;
    }

    public QueueSrcAssignCreateDTO withConnId(String connId) {
        this.connId = connId;
        return this;
    }

    /**
     * 数据连接id。
     * @return connId
     */
    public String getConnId() {
        return connId;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public QueueSrcAssignCreateDTO withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public QueueSrcAssignCreateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 当前空间分配资源附加的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueSrcAssignCreateDTO that = (QueueSrcAssignCreateDTO) obj;
        return Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.connId, that.connId) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, queueName, connId, clusterId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueSrcAssignCreateDTO {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    connId: ").append(toIndentedString(connId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
