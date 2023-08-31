package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BasicInfo
 */
public class BasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeUser")

    private String executeUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceTimeout")

    private Integer instanceTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customFields")

    private Object customFields;

    public BasicInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 作业责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BasicInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BasicInfo withExecuteUser(String executeUser) {
        this.executeUser = executeUser;
        return this;
    }

    /**
     * 作业执行用户
     * @return executeUser
     */
    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    public BasicInfo withInstanceTimeout(Integer instanceTimeout) {
        this.instanceTimeout = instanceTimeout;
        return this;
    }

    /**
     * 实例超时时间
     * @return instanceTimeout
     */
    public Integer getInstanceTimeout() {
        return instanceTimeout;
    }

    public void setInstanceTimeout(Integer instanceTimeout) {
        this.instanceTimeout = instanceTimeout;
    }

    public BasicInfo withCustomFields(Object customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     * 用户自定义属性字段
     * @return customFields
     */
    public Object getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Object customFields) {
        this.customFields = customFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicInfo that = (BasicInfo) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.executeUser, that.executeUser)
            && Objects.equals(this.instanceTimeout, that.instanceTimeout)
            && Objects.equals(this.customFields, that.customFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, priority, executeUser, instanceTimeout, customFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicInfo {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    executeUser: ").append(toIndentedString(executeUser)).append("\n");
        sb.append("    instanceTimeout: ").append(toIndentedString(instanceTimeout)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
