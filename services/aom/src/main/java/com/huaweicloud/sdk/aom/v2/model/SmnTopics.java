package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * smn主题相关信息
 */
public class SmnTopics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="push_policy")
    
    
    private Integer pushPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_urn")
    
    
    private String topicUrn;

    public SmnTopics withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * Topic的显示名，推送邮件消息时，作为邮件发件人显示。显示名的长度为192byte或64个中文。默认值为空。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    public SmnTopics withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 创建topic的名字。Topic名称只能包含大写字母、小写字母、数字、-和_，且必须由大写字母、小写字母或数字开头，长度为1到255个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SmnTopics withPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
        return this;
    }

    


    /**
     * SMN消息推送策略。取值为0或1
     * minimum: 0
     * maximum: 1
     * @return pushPolicy
     */
    public Integer getPushPolicy() {
        return pushPolicy;
    }

    public void setPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
    }

    

    public SmnTopics withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * topic中订阅者的状态。0:主题已删除或主题下订阅列表为空。1:主题下的订阅列表存在状态为“已订阅”的订阅信息。2:主题下的订阅信息状态处于“未订阅”或“已取消”。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public SmnTopics withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    


    /**
     * Topic的唯一的资源标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmnTopics smnTopics = (SmnTopics) o;
        return Objects.equals(this.displayName, smnTopics.displayName) &&
            Objects.equals(this.name, smnTopics.name) &&
            Objects.equals(this.pushPolicy, smnTopics.pushPolicy) &&
            Objects.equals(this.status, smnTopics.status) &&
            Objects.equals(this.topicUrn, smnTopics.topicUrn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(displayName, name, pushPolicy, status, topicUrn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnTopics {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pushPolicy: ").append(toIndentedString(pushPolicy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
