package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowModelServiceDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_desc")

    private String serviceDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_type")

    private String inferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private String deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip_type")

    private String chipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_mode")

    private String requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_sub_type")

    private String assetSubType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_url")

    private String apiUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_obs_output")

    private String trainObsOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_type")

    private String useType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private ModelServiceConfig serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ShowModelServiceDetailResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ShowModelServiceDetailResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShowModelServiceDetailResponse withServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
        return this;
    }

    /**
     * 服务描述
     * @return serviceDesc
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public ShowModelServiceDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 服务状态，INIT/RUNNING/STOPPED/FAILED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowModelServiceDetailResponse withInferType(String inferType) {
        this.inferType = inferType;
        return this;
    }

    /**
     * 推理类型，分为online和edge
     * @return inferType
     */
    public String getInferType() {
        return inferType;
    }

    public void setInferType(String inferType) {
        this.inferType = inferType;
    }

    public ShowModelServiceDetailResponse withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 设备类型
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public ShowModelServiceDetailResponse withChipType(String chipType) {
        this.chipType = chipType;
        return this;
    }

    /**
     * 芯片类型
     * @return chipType
     */
    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    public ShowModelServiceDetailResponse withRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }

    /**
     * 请求类型
     * @return requestMode
     */
    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public ShowModelServiceDetailResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 推理服务所关联的模型ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ShowModelServiceDetailResponse withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 推理服务所关联的模型名称
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ShowModelServiceDetailResponse withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 推理服务所关联的模型类型
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ShowModelServiceDetailResponse withAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
        return this;
    }

    /**
     * 推理服务所关联的模型子类型
     * @return assetSubType
     */
    public String getAssetSubType() {
        return assetSubType;
    }

    public void setAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
    }

    public ShowModelServiceDetailResponse withApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
        return this;
    }

    /**
     * API调用地址
     * @return apiUrl
     */
    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public ShowModelServiceDetailResponse withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * 关联对话ID
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public ShowModelServiceDetailResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 模型部署服务的用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowModelServiceDetailResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 模型部署服务的用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowModelServiceDetailResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 部署平台，Modelarts或者CCE
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ShowModelServiceDetailResponse withTrainObsOutput(String trainObsOutput) {
        this.trainObsOutput = trainObsOutput;
        return this;
    }

    /**
     * 训练产物OBS地址
     * @return trainObsOutput
     */
    public String getTrainObsOutput() {
        return trainObsOutput;
    }

    public void setTrainObsOutput(String trainObsOutput) {
        this.trainObsOutput = trainObsOutput;
    }

    public ShowModelServiceDetailResponse withUseType(String useType) {
        this.useType = useType;
        return this;
    }

    /**
     * 使用类型，private表示用户创建的服务，public表示预置服务
     * @return useType
     */
    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public ShowModelServiceDetailResponse withServiceConfig(ModelServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public ShowModelServiceDetailResponse withServiceConfig(Consumer<ModelServiceConfig> serviceConfigSetter) {
        if (this.serviceConfig == null) {
            this.serviceConfig = new ModelServiceConfig();
            serviceConfigSetter.accept(this.serviceConfig);
        }

        return this;
    }

    /**
     * Get serviceConfig
     * @return serviceConfig
     */
    public ModelServiceConfig getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(ModelServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public ShowModelServiceDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowModelServiceDetailResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
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
        ShowModelServiceDetailResponse that = (ShowModelServiceDetailResponse) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.serviceDesc, that.serviceDesc) && Objects.equals(this.status, that.status)
            && Objects.equals(this.inferType, that.inferType) && Objects.equals(this.deviceType, that.deviceType)
            && Objects.equals(this.chipType, that.chipType) && Objects.equals(this.requestMode, that.requestMode)
            && Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.assetSubType, that.assetSubType)
            && Objects.equals(this.apiUrl, that.apiUrl) && Objects.equals(this.chatId, that.chatId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.platform, that.platform) && Objects.equals(this.trainObsOutput, that.trainObsOutput)
            && Objects.equals(this.useType, that.useType) && Objects.equals(this.serviceConfig, that.serviceConfig)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId,
            serviceName,
            serviceDesc,
            status,
            inferType,
            deviceType,
            chipType,
            requestMode,
            assetId,
            assetName,
            assetType,
            assetSubType,
            apiUrl,
            chatId,
            userId,
            userName,
            platform,
            trainObsOutput,
            useType,
            serviceConfig,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModelServiceDetailResponse {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceDesc: ").append(toIndentedString(serviceDesc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inferType: ").append(toIndentedString(inferType)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    chipType: ").append(toIndentedString(chipType)).append("\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetSubType: ").append(toIndentedString(assetSubType)).append("\n");
        sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    trainObsOutput: ").append(toIndentedString(trainObsOutput)).append("\n");
        sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
