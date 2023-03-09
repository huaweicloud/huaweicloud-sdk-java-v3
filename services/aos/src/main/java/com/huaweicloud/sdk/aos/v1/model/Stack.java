package com.huaweicloud.sdk.aos.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.StackDescriptionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackIdPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackNamePrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackStatusPrimitiveTypeHolder;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Stack
 */
public class Stack  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    

    private String stackId;
    /**
     * 资源栈的状态     * `CREATION_COMPLETE` - 生成空资源栈完成，并没有任何部署     * `DEPLOYMENT_IN_PROGRESS` - 正在部署，请等待     * `DEPLOYMENT_FAILED` - 部署失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情     * `DEPLOYMENT_COMPLETE` - 部署完成     * `ROLLBACK_IN_PROGRESS` - 部署失败，正在回滚，请等待     * `ROLLBACK_FAILED` - 回滚失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情     * `ROLLBACK_COMPLETE` - 回滚完成     * `DELETION_IN_PROGRESS` - 正在删除，请等待     * `DELETION_FAILED` - 删除失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情
     */
    public static final class StatusEnum {

        
        /**
         * Enum CREATION_COMPLETE for value: "CREATION_COMPLETE"
         */
        public static final StatusEnum CREATION_COMPLETE = new StatusEnum("CREATION_COMPLETE");
        
        /**
         * Enum DEPLOYMENT_IN_PROGRESS for value: "DEPLOYMENT_IN_PROGRESS"
         */
        public static final StatusEnum DEPLOYMENT_IN_PROGRESS = new StatusEnum("DEPLOYMENT_IN_PROGRESS");
        
        /**
         * Enum DEPLOYMENT_FAILED for value: "DEPLOYMENT_FAILED"
         */
        public static final StatusEnum DEPLOYMENT_FAILED = new StatusEnum("DEPLOYMENT_FAILED");
        
        /**
         * Enum DEPLOYMENT_COMPLETE for value: "DEPLOYMENT_COMPLETE"
         */
        public static final StatusEnum DEPLOYMENT_COMPLETE = new StatusEnum("DEPLOYMENT_COMPLETE");
        
        /**
         * Enum ROLLBACK_IN_PROGRESS for value: "ROLLBACK_IN_PROGRESS"
         */
        public static final StatusEnum ROLLBACK_IN_PROGRESS = new StatusEnum("ROLLBACK_IN_PROGRESS");
        
        /**
         * Enum ROLLBACK_FAILED for value: "ROLLBACK_FAILED"
         */
        public static final StatusEnum ROLLBACK_FAILED = new StatusEnum("ROLLBACK_FAILED");
        
        /**
         * Enum ROLLBACK_COMPLETE for value: "ROLLBACK_COMPLETE"
         */
        public static final StatusEnum ROLLBACK_COMPLETE = new StatusEnum("ROLLBACK_COMPLETE");
        
        /**
         * Enum DELETION_IN_PROGRESS for value: "DELETION_IN_PROGRESS"
         */
        public static final StatusEnum DELETION_IN_PROGRESS = new StatusEnum("DELETION_IN_PROGRESS");
        
        /**
         * Enum DELETION_FAILED for value: "DELETION_FAILED"
         */
        public static final StatusEnum DELETION_FAILED = new StatusEnum("DELETION_FAILED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATION_COMPLETE", CREATION_COMPLETE);
            map.put("DEPLOYMENT_IN_PROGRESS", DEPLOYMENT_IN_PROGRESS);
            map.put("DEPLOYMENT_FAILED", DEPLOYMENT_FAILED);
            map.put("DEPLOYMENT_COMPLETE", DEPLOYMENT_COMPLETE);
            map.put("ROLLBACK_IN_PROGRESS", ROLLBACK_IN_PROGRESS);
            map.put("ROLLBACK_FAILED", ROLLBACK_FAILED);
            map.put("ROLLBACK_COMPLETE", ROLLBACK_COMPLETE);
            map.put("DELETION_IN_PROGRESS", DELETION_IN_PROGRESS);
            map.put("DELETION_FAILED", DELETION_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_message")
    

    private String statusMessage;

    public Stack withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 资源栈的名称。此名字在domain_id+区域+project_id下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public Stack withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 资源栈的描述。可用于客户识别自己的资源栈。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Stack withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈（stack）的唯一Id。  此Id由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给与的stack_id和当前资源栈的ID不一致，则返回400 
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public Stack withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源栈的状态     * `CREATION_COMPLETE` - 生成空资源栈完成，并没有任何部署     * `DEPLOYMENT_IN_PROGRESS` - 正在部署，请等待     * `DEPLOYMENT_FAILED` - 部署失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情     * `DEPLOYMENT_COMPLETE` - 部署完成     * `ROLLBACK_IN_PROGRESS` - 部署失败，正在回滚，请等待     * `ROLLBACK_FAILED` - 回滚失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情     * `ROLLBACK_COMPLETE` - 回滚完成     * `DELETION_IN_PROGRESS` - 正在删除，请等待     * `DELETION_FAILED` - 删除失败。请从status_message获取错误信息汇总，或者调用ListStackEvents获得事件详情
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public Stack withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 资源栈的生成时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public Stack withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 资源栈的更新时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public Stack withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    


    /**
     * 在失败的时候（资源栈状态以FAILED结尾）会显示简要的错误信息总结以供debug
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stack stack = (Stack) o;
        return Objects.equals(this.stackName, stack.stackName) &&
            Objects.equals(this.description, stack.description) &&
            Objects.equals(this.stackId, stack.stackId) &&
            Objects.equals(this.status, stack.status) &&
            Objects.equals(this.createTime, stack.createTime) &&
            Objects.equals(this.updateTime, stack.updateTime) &&
            Objects.equals(this.statusMessage, stack.statusMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackName, description, stackId, status, createTime, updateTime, statusMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stack {\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

