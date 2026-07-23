package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCoreGatewayRequestBody
 */
public class UpdateCoreGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_configuration")

    private CoreGatewayUpdateProtocolConfiguration protocolConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_delivery_configuration")

    private CoreGatewayLogDeliveryConfigurationRequestBody logDeliveryConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreGatewayTag> tags = null;

    public UpdateCoreGatewayRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 更新后的网关描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCoreGatewayRequestBody withProtocolConfiguration(
        CoreGatewayUpdateProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }

    public UpdateCoreGatewayRequestBody withProtocolConfiguration(
        Consumer<CoreGatewayUpdateProtocolConfiguration> protocolConfigurationSetter) {
        if (this.protocolConfiguration == null) {
            this.protocolConfiguration = new CoreGatewayUpdateProtocolConfiguration();
            protocolConfigurationSetter.accept(this.protocolConfiguration);
        }

        return this;
    }

    /**
     * Get protocolConfiguration
     * @return protocolConfiguration
     */
    public CoreGatewayUpdateProtocolConfiguration getProtocolConfiguration() {
        return protocolConfiguration;
    }

    public void setProtocolConfiguration(CoreGatewayUpdateProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
    }

    public UpdateCoreGatewayRequestBody withLogDeliveryConfiguration(
        CoreGatewayLogDeliveryConfigurationRequestBody logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
        return this;
    }

    public UpdateCoreGatewayRequestBody withLogDeliveryConfiguration(
        Consumer<CoreGatewayLogDeliveryConfigurationRequestBody> logDeliveryConfigurationSetter) {
        if (this.logDeliveryConfiguration == null) {
            this.logDeliveryConfiguration = new CoreGatewayLogDeliveryConfigurationRequestBody();
            logDeliveryConfigurationSetter.accept(this.logDeliveryConfiguration);
        }

        return this;
    }

    /**
     * Get logDeliveryConfiguration
     * @return logDeliveryConfiguration
     */
    public CoreGatewayLogDeliveryConfigurationRequestBody getLogDeliveryConfiguration() {
        return logDeliveryConfiguration;
    }

    public void setLogDeliveryConfiguration(CoreGatewayLogDeliveryConfigurationRequestBody logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    public UpdateCoreGatewayRequestBody withTags(List<CoreGatewayTag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateCoreGatewayRequestBody addTagsItem(CoreGatewayTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateCoreGatewayRequestBody withTags(Consumer<List<CoreGatewayTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表。
     * @return tags
     */
    public List<CoreGatewayTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreGatewayTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreGatewayRequestBody that = (UpdateCoreGatewayRequestBody) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.protocolConfiguration, that.protocolConfiguration)
            && Objects.equals(this.logDeliveryConfiguration, that.logDeliveryConfiguration)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, protocolConfiguration, logDeliveryConfiguration, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreGatewayRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocolConfiguration: ").append(toIndentedString(protocolConfiguration)).append("\n");
        sb.append("    logDeliveryConfiguration: ").append(toIndentedString(logDeliveryConfiguration)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
