package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询经典型跨源连接的响应参数。
 */
public class ShowDatasourceConnectionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private Double process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_url")

    private String connectionUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_list")

    private List<String> queueList = null;

    public ShowDatasourceConnectionResp withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowDatasourceConnectionResp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowDatasourceConnectionResp withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID，用于标识跨源连接的UUID。
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ShowDatasourceConnectionResp withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 创建连接时，用户填写的队列的访问地址。
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ShowDatasourceConnectionResp withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 连接状态。CREATING：跨源连接正在创建中；ACTIVE：跨源连接创建成功，与目的地址连接正常；FAILED：跨源连接创建失败；DELETED：跨源连接已被删除。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowDatasourceConnectionResp withProcess(Double process) {
        this.process = process;
        return this;
    }

    /**
     * 正在创建的跨源连接进度，显示0.0至1.0代表0%至100%。
     * @return process
     */
    public Double getProcess() {
        return process;
    }

    public void setProcess(Double process) {
        this.process = process;
    }

    public ShowDatasourceConnectionResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建连接时，用户自定义的连接名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDatasourceConnectionResp withConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        return this;
    }

    /**
     * 用于建立跨源关联表时，需要使用到的连接url。
     * @return connectionUrl
     */
    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public ShowDatasourceConnectionResp withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Serverless Spark队列名称。SQL队列模式下建立的跨源连接，该字段为空。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowDatasourceConnectionResp withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 创建连接时，用户指定的对端服务（CloudTable/CloudTable.OpenTSDB/MRS.OpenTSDB/DWS/RDS/CSS）。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ShowDatasourceConnectionResp withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建连接的时间。为UTC的时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowDatasourceConnectionResp withQueueList(List<String> queueList) {
        this.queueList = queueList;
        return this;
    }

    public ShowDatasourceConnectionResp addQueueListItem(String queueListItem) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        this.queueList.add(queueListItem);
        return this;
    }

    public ShowDatasourceConnectionResp withQueueList(Consumer<List<String>> queueListSetter) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        queueListSetter.accept(this.queueList);
        return this;
    }

    /**
     * 当前跨源已绑定的队列名
     * @return queueList
     */
    public List<String> getQueueList() {
        return queueList;
    }

    public void setQueueList(List<String> queueList) {
        this.queueList = queueList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatasourceConnectionResp that = (ShowDatasourceConnectionResp) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.destination, that.destination) && Objects.equals(this.state, that.state)
            && Objects.equals(this.process, that.process) && Objects.equals(this.name, that.name)
            && Objects.equals(this.connectionUrl, that.connectionUrl)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.service, that.service)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.queueList, that.queueList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            connectionId,
            destination,
            state,
            process,
            name,
            connectionUrl,
            clusterName,
            service,
            createTime,
            queueList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatasourceConnectionResp {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    connectionUrl: ").append(toIndentedString(connectionUrl)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    queueList: ").append(toIndentedString(queueList)).append("\n");
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
