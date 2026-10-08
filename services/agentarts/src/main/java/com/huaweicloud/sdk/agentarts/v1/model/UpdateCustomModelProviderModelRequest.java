package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCustomModelProviderModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private UUID modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_model_provider_id")

    private UUID customModelProviderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCustomModelProviderModelRequestBody body;

    public UpdateCustomModelProviderModelRequest withModelId(UUID modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：** 模型配置ID。 **约束限制：** 长度固定为36字符，必须为UUID格式。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return modelId
     */
    public UUID getModelId() {
        return modelId;
    }

    public void setModelId(UUID modelId) {
        this.modelId = modelId;
    }

    public UpdateCustomModelProviderModelRequest withCustomModelProviderId(UUID customModelProviderId) {
        this.customModelProviderId = customModelProviderId;
        return this;
    }

    /**
     * **参数解释：** 模型提供商ID。 **约束限制：** 长度固定为36字符，必须为UUID格式。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return customModelProviderId
     */
    public UUID getCustomModelProviderId() {
        return customModelProviderId;
    }

    public void setCustomModelProviderId(UUID customModelProviderId) {
        this.customModelProviderId = customModelProviderId;
    }

    public UpdateCustomModelProviderModelRequest withBody(UpdateCustomModelProviderModelRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCustomModelProviderModelRequest withBody(
        Consumer<UpdateCustomModelProviderModelRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCustomModelProviderModelRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCustomModelProviderModelRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCustomModelProviderModelRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCustomModelProviderModelRequest that = (UpdateCustomModelProviderModelRequest) obj;
        return Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.customModelProviderId, that.customModelProviderId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, customModelProviderId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomModelProviderModelRequest {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    customModelProviderId: ").append(toIndentedString(customModelProviderId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
