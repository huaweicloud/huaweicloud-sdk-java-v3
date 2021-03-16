package com.huaweicloud.sdk.dgc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BasicInfo
 */
public class BasicInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    private String priority;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executeUser")
    
    private String executeUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instanceTimeout")
    
    private String instanceTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customFields")
    
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

    

    public BasicInfo withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 作业优先级
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
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

    

    public BasicInfo withInstanceTimeout(String instanceTimeout) {
        this.instanceTimeout = instanceTimeout;
        return this;
    }

    


    /**
     * 实例超时时间
     * @return instanceTimeout
     */
    public String getInstanceTimeout() {
        return instanceTimeout;
    }

    public void setInstanceTimeout(String instanceTimeout) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasicInfo basicInfo = (BasicInfo) o;
        return Objects.equals(this.owner, basicInfo.owner) &&
            Objects.equals(this.priority, basicInfo.priority) &&
            Objects.equals(this.executeUser, basicInfo.executeUser) &&
            Objects.equals(this.instanceTimeout, basicInfo.instanceTimeout) &&
            Objects.equals(this.customFields, basicInfo.customFields);
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

