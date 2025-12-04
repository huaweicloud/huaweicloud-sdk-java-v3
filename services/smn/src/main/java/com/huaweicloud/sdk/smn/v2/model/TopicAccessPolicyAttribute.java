package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopicAccessPolicyAttribute
 */
public class TopicAccessPolicyAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private String accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public TopicAccessPolicyAttribute withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * topic的访问策略
     * @return accessPolicy
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public TopicAccessPolicyAttribute withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * topic的访问策略创建时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TopicAccessPolicyAttribute withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * topic的访问策略更新时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
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
        TopicAccessPolicyAttribute that = (TopicAccessPolicyAttribute) obj;
        return Objects.equals(this.accessPolicy, that.accessPolicy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPolicy, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicAccessPolicyAttribute {\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
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
