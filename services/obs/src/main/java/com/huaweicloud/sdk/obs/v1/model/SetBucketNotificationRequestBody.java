package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置桶事件通知的根元素，如果子元素为空，说明消息通知功能处于关闭状态。 
 */
@JacksonXmlRootElement(localName = "NotificationConfiguration")
public class SetBucketNotificationRequestBody extends SdkXmlBody<SetBucketNotificationRequestBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TopicConfiguration")

    @JacksonXmlProperty(localName = "TopicConfiguration")
    private List<TopicConfiguration> topicConfiguration = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FunctionStageConfiguration")

    @JacksonXmlProperty(localName = "FunctionStageConfiguration")
    private List<FunctionStageConfiguration> functionStageConfiguration = null;

    public SetBucketNotificationRequestBody withTopicConfiguration(List<TopicConfiguration> topicConfiguration) {
        this.topicConfiguration = topicConfiguration;
        return this;
    }

    public SetBucketNotificationRequestBody addTopicConfigurationItem(TopicConfiguration topicConfigurationItem) {
        if (this.topicConfiguration == null) {
            this.topicConfiguration = new ArrayList<>();
        }
        this.topicConfiguration.add(topicConfigurationItem);
        return this;
    }

    public SetBucketNotificationRequestBody withTopicConfiguration(
        Consumer<List<TopicConfiguration>> topicConfigurationSetter) {
        if (this.topicConfiguration == null) {
            this.topicConfiguration = new ArrayList<>();
        }
        topicConfigurationSetter.accept(this.topicConfiguration);
        return this;
    }

    /**
     * Get topicConfiguration
     * @return topicConfiguration
     */
    public List<TopicConfiguration> getTopicConfiguration() {
        return topicConfiguration;
    }

    public void setTopicConfiguration(List<TopicConfiguration> topicConfiguration) {
        this.topicConfiguration = topicConfiguration;
    }

    public SetBucketNotificationRequestBody withFunctionStageConfiguration(
        List<FunctionStageConfiguration> functionStageConfiguration) {
        this.functionStageConfiguration = functionStageConfiguration;
        return this;
    }

    public SetBucketNotificationRequestBody addFunctionStageConfigurationItem(
        FunctionStageConfiguration functionStageConfigurationItem) {
        if (this.functionStageConfiguration == null) {
            this.functionStageConfiguration = new ArrayList<>();
        }
        this.functionStageConfiguration.add(functionStageConfigurationItem);
        return this;
    }

    public SetBucketNotificationRequestBody withFunctionStageConfiguration(
        Consumer<List<FunctionStageConfiguration>> functionStageConfigurationSetter) {
        if (this.functionStageConfiguration == null) {
            this.functionStageConfiguration = new ArrayList<>();
        }
        functionStageConfigurationSetter.accept(this.functionStageConfiguration);
        return this;
    }

    /**
     * Get functionStageConfiguration
     * @return functionStageConfiguration
     */
    public List<FunctionStageConfiguration> getFunctionStageConfiguration() {
        return functionStageConfiguration;
    }

    public void setFunctionStageConfiguration(List<FunctionStageConfiguration> functionStageConfiguration) {
        this.functionStageConfiguration = functionStageConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketNotificationRequestBody that = (SetBucketNotificationRequestBody) obj;
        return Objects.equals(this.topicConfiguration, that.topicConfiguration)
            && Objects.equals(this.functionStageConfiguration, that.functionStageConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicConfiguration, functionStageConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketNotificationRequestBody {\n");
        sb.append("    topicConfiguration: ").append(toIndentedString(topicConfiguration)).append("\n");
        sb.append("    functionStageConfiguration: ").append(toIndentedString(functionStageConfiguration)).append("\n");
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
