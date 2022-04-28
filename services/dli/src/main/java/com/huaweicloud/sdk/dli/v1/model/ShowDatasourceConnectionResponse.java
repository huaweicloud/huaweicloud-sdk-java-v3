package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDatasourceConnectionResponse extends SdkResponse {

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
    @JsonProperty(value = "available_queue_info")

    private List<ShowDatasourceConnectionRespAvailableQueueInfo> availableQueueInfo = null;

    public ShowDatasourceConnectionResponse withIsSuccess(Boolean isSuccess) {
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

    public ShowDatasourceConnectionResponse withMessage(String message) {
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

    public ShowDatasourceConnectionResponse withConnectionId(String connectionId) {
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

    public ShowDatasourceConnectionResponse withDestination(String destination) {
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

    public ShowDatasourceConnectionResponse withState(String state) {
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

    public ShowDatasourceConnectionResponse withProcess(Double process) {
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

    public ShowDatasourceConnectionResponse withName(String name) {
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

    public ShowDatasourceConnectionResponse withConnectionUrl(String connectionUrl) {
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

    public ShowDatasourceConnectionResponse withClusterName(String clusterName) {
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

    public ShowDatasourceConnectionResponse withService(String service) {
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

    public ShowDatasourceConnectionResponse withCreateTime(Long createTime) {
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

    public ShowDatasourceConnectionResponse withAvailableQueueInfo(
        List<ShowDatasourceConnectionRespAvailableQueueInfo> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
        return this;
    }

    public ShowDatasourceConnectionResponse addAvailableQueueInfoItem(
        ShowDatasourceConnectionRespAvailableQueueInfo availableQueueInfoItem) {
        if (this.availableQueueInfo == null) {
            this.availableQueueInfo = new ArrayList<>();
        }
        this.availableQueueInfo.add(availableQueueInfoItem);
        return this;
    }

    public ShowDatasourceConnectionResponse withAvailableQueueInfo(
        Consumer<List<ShowDatasourceConnectionRespAvailableQueueInfo>> availableQueueInfoSetter) {
        if (this.availableQueueInfo == null) {
            this.availableQueueInfo = new ArrayList<>();
        }
        availableQueueInfoSetter.accept(this.availableQueueInfo);
        return this;
    }

    /**
     * 各个队列创建跨源连接的信息，详细信息请参考表available_queue_info参数说明。
     * @return availableQueueInfo
     */
    public List<ShowDatasourceConnectionRespAvailableQueueInfo> getAvailableQueueInfo() {
        return availableQueueInfo;
    }

    public void setAvailableQueueInfo(List<ShowDatasourceConnectionRespAvailableQueueInfo> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDatasourceConnectionResponse showDatasourceConnectionResponse = (ShowDatasourceConnectionResponse) o;
        return Objects.equals(this.isSuccess, showDatasourceConnectionResponse.isSuccess)
            && Objects.equals(this.message, showDatasourceConnectionResponse.message)
            && Objects.equals(this.connectionId, showDatasourceConnectionResponse.connectionId)
            && Objects.equals(this.destination, showDatasourceConnectionResponse.destination)
            && Objects.equals(this.state, showDatasourceConnectionResponse.state)
            && Objects.equals(this.process, showDatasourceConnectionResponse.process)
            && Objects.equals(this.name, showDatasourceConnectionResponse.name)
            && Objects.equals(this.connectionUrl, showDatasourceConnectionResponse.connectionUrl)
            && Objects.equals(this.clusterName, showDatasourceConnectionResponse.clusterName)
            && Objects.equals(this.service, showDatasourceConnectionResponse.service)
            && Objects.equals(this.createTime, showDatasourceConnectionResponse.createTime)
            && Objects.equals(this.availableQueueInfo, showDatasourceConnectionResponse.availableQueueInfo);
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
            availableQueueInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatasourceConnectionResponse {\n");
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
        sb.append("    availableQueueInfo: ").append(toIndentedString(availableQueueInfo)).append("\n");
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
