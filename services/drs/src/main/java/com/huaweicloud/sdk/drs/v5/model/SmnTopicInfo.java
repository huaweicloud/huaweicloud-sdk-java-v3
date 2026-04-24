package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 收件方式与信息体
 */
public class SmnTopicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_policy")

    private String pushPolicy;

    public SmnTopicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Topic的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmnTopicInfo withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * Topic的唯一的资源标识。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public SmnTopicInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Topic的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SmnTopicInfo withPushPolicy(String pushPolicy) {
        this.pushPolicy = pushPolicy;
        return this;
    }

    /**
     * 消息推送的策略，取值： - RETRY_ON_FAILURE：发送失败，保留到失败队列。 - DROP_ON_FAILURE：直接丢弃发送失败的消息。
     * @return pushPolicy
     */
    public String getPushPolicy() {
        return pushPolicy;
    }

    public void setPushPolicy(String pushPolicy) {
        this.pushPolicy = pushPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmnTopicInfo that = (SmnTopicInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.description, that.description) && Objects.equals(this.pushPolicy, that.pushPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, urn, description, pushPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnTopicInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    pushPolicy: ").append(toIndentedString(pushPolicy)).append("\n");
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
