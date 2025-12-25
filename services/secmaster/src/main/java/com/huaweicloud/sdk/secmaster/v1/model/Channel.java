package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Channel
 */
public class Channel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ChannelAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private ConfigStatus configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by_user")

    private String createByUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_type")

    private ChannelErrorType errorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_status")

    private HealthStatus healthStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_id")

    private String inputId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_name")

    private String inputName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_status")

    private InstallStatus installStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_time")

    private Long installTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_refer_count")

    private Long nodeReferCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private ChannelOperationStatus operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_id")

    private String outputId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_name")

    private String outputName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_id")

    private String parserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_name")

    private String parserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_write")

    private ReadWrite readWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public Channel withAction(ChannelAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    public ChannelAction getAction() {
        return action;
    }

    public void setAction(ChannelAction action) {
        this.action = action;
    }

    public Channel withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * UUID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Channel withConfigStatus(ConfigStatus configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * Get configStatus
     * @return configStatus
     */
    public ConfigStatus getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(ConfigStatus configStatus) {
        this.configStatus = configStatus;
    }

    public Channel withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * Iam用户ID
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Channel withCreateByUser(String createByUser) {
        this.createByUser = createByUser;
        return this;
    }

    /**
     * Iam用户名称
     * @return createByUser
     */
    public String getCreateByUser() {
        return createByUser;
    }

    public void setCreateByUser(String createByUser) {
        this.createByUser = createByUser;
    }

    public Channel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Channel withErrorType(ChannelErrorType errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * Get errorType
     * @return errorType
     */
    public ChannelErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ChannelErrorType errorType) {
        this.errorType = errorType;
    }

    public Channel withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     * @return healthStatus
     */
    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Channel withInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }

    /**
     * UUID
     * @return inputId
     */
    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public Channel withInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }

    /**
     * 所属租户名称
     * @return inputName
     */
    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public Channel withInstallStatus(InstallStatus installStatus) {
        this.installStatus = installStatus;
        return this;
    }

    /**
     * Get installStatus
     * @return installStatus
     */
    public InstallStatus getInstallStatus() {
        return installStatus;
    }

    public void setInstallStatus(InstallStatus installStatus) {
        this.installStatus = installStatus;
    }

    public Channel withInstallTime(Long installTime) {
        this.installTime = installTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return installTime
     */
    public Long getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Long installTime) {
        this.installTime = installTime;
    }

    public Channel withNodeReferCount(Long nodeReferCount) {
        this.nodeReferCount = nodeReferCount;
        return this;
    }

    /**
     * 关联的节点个数
     * minimum: 0
     * maximum: 1024
     * @return nodeReferCount
     */
    public Long getNodeReferCount() {
        return nodeReferCount;
    }

    public void setNodeReferCount(Long nodeReferCount) {
        this.nodeReferCount = nodeReferCount;
    }

    public Channel withOperationStatus(ChannelOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * Get operationStatus
     * @return operationStatus
     */
    public ChannelOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(ChannelOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Channel withOutputId(String outputId) {
        this.outputId = outputId;
        return this;
    }

    /**
     * UUID
     * @return outputId
     */
    public String getOutputId() {
        return outputId;
    }

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    public Channel withOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * 所属租户名称
     * @return outputName
     */
    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public Channel withParserId(String parserId) {
        this.parserId = parserId;
        return this;
    }

    /**
     * UUID
     * @return parserId
     */
    public String getParserId() {
        return parserId;
    }

    public void setParserId(String parserId) {
        this.parserId = parserId;
    }

    public Channel withParserName(String parserName) {
        this.parserName = parserName;
        return this;
    }

    /**
     * 所属租户名称
     * @return parserName
     */
    public String getParserName() {
        return parserName;
    }

    public void setParserName(String parserName) {
        this.parserName = parserName;
    }

    public Channel withReadWrite(ReadWrite readWrite) {
        this.readWrite = readWrite;
        return this;
    }

    public Channel withReadWrite(Consumer<ReadWrite> readWriteSetter) {
        if (this.readWrite == null) {
            this.readWrite = new ReadWrite();
            readWriteSetter.accept(this.readWrite);
        }

        return this;
    }

    /**
     * Get readWrite
     * @return readWrite
     */
    public ReadWrite getReadWrite() {
        return readWrite;
    }

    public void setReadWrite(ReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    public Channel withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 相关标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Channel withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Channel that = (Channel) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.channelId, that.channelId)
            && Objects.equals(this.configStatus, that.configStatus) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createByUser, that.createByUser)
            && Objects.equals(this.description, that.description) && Objects.equals(this.errorType, that.errorType)
            && Objects.equals(this.healthStatus, that.healthStatus) && Objects.equals(this.inputId, that.inputId)
            && Objects.equals(this.inputName, that.inputName) && Objects.equals(this.installStatus, that.installStatus)
            && Objects.equals(this.installTime, that.installTime)
            && Objects.equals(this.nodeReferCount, that.nodeReferCount)
            && Objects.equals(this.operationStatus, that.operationStatus)
            && Objects.equals(this.outputId, that.outputId) && Objects.equals(this.outputName, that.outputName)
            && Objects.equals(this.parserId, that.parserId) && Objects.equals(this.parserName, that.parserName)
            && Objects.equals(this.readWrite, that.readWrite) && Objects.equals(this.title, that.title)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            channelId,
            configStatus,
            createBy,
            createByUser,
            description,
            errorType,
            healthStatus,
            inputId,
            inputName,
            installStatus,
            installTime,
            nodeReferCount,
            operationStatus,
            outputId,
            outputName,
            parserId,
            parserName,
            readWrite,
            title,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Channel {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createByUser: ").append(toIndentedString(createByUser)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
        sb.append("    inputName: ").append(toIndentedString(inputName)).append("\n");
        sb.append("    installStatus: ").append(toIndentedString(installStatus)).append("\n");
        sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
        sb.append("    nodeReferCount: ").append(toIndentedString(nodeReferCount)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
        sb.append("    parserId: ").append(toIndentedString(parserId)).append("\n");
        sb.append("    parserName: ").append(toIndentedString(parserName)).append("\n");
        sb.append("    readWrite: ").append(toIndentedString(readWrite)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
