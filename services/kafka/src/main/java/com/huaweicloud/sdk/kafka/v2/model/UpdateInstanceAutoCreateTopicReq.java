package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateInstanceAutoCreateTopicReq
 */
public class UpdateInstanceAutoCreateTopicReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_topic")
    
    private Boolean enableAutoTopic;

    public UpdateInstanceAutoCreateTopicReq withEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
        return this;
    }

    


    /**
     * 是否开启自动创建topic功能。
     * @return enableAutoTopic
     */
    public Boolean getEnableAutoTopic() {
        return enableAutoTopic;
    }

    public void setEnableAutoTopic(Boolean enableAutoTopic) {
        this.enableAutoTopic = enableAutoTopic;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceAutoCreateTopicReq updateInstanceAutoCreateTopicReq = (UpdateInstanceAutoCreateTopicReq) o;
        return Objects.equals(this.enableAutoTopic, updateInstanceAutoCreateTopicReq.enableAutoTopic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enableAutoTopic);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceAutoCreateTopicReq {\n");
        sb.append("    enableAutoTopic: ").append(toIndentedString(enableAutoTopic)).append("\n");
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

