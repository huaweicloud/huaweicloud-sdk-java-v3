package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建模型服务请求体
 */
public class CreateModelServiceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_mode")

    private String requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private Platform platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_obs_output")

    private String trainObsOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_type")

    private InferType inferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private ModelServiceConfig serviceConfig;

    public CreateModelServiceReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 部署名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateModelServiceReq withRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }

    /**
     * 推理类型
     * @return requestMode
     */
    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public CreateModelServiceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateModelServiceReq withPlatform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get platform
     * @return platform
     */
    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public CreateModelServiceReq withTrainObsOutput(String trainObsOutput) {
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

    public CreateModelServiceReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public CreateModelServiceReq withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * 对话ID
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public CreateModelServiceReq withInferType(InferType inferType) {
        this.inferType = inferType;
        return this;
    }

    /**
     * Get inferType
     * @return inferType
     */
    public InferType getInferType() {
        return inferType;
    }

    public void setInferType(InferType inferType) {
        this.inferType = inferType;
    }

    public CreateModelServiceReq withServiceConfig(ModelServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public CreateModelServiceReq withServiceConfig(Consumer<ModelServiceConfig> serviceConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateModelServiceReq that = (CreateModelServiceReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.requestMode, that.requestMode)
            && Objects.equals(this.description, that.description) && Objects.equals(this.platform, that.platform)
            && Objects.equals(this.trainObsOutput, that.trainObsOutput) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.chatId, that.chatId) && Objects.equals(this.inferType, that.inferType)
            && Objects.equals(this.serviceConfig, that.serviceConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, requestMode, description, platform, trainObsOutput, assetId, chatId, inferType, serviceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModelServiceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    trainObsOutput: ").append(toIndentedString(trainObsOutput)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    inferType: ").append(toIndentedString(inferType)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
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
