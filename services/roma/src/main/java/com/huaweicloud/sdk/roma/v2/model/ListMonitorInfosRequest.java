package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListMonitorInfosRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;
    /**
     * 需要搜索任务的执行状态, 只允许如下枚举值：UNSTARTED-未启动, WAITING-等待执行,RUNNING-执行中, SUCCESS-执行成功, CANCELLED-任务取消, ERROR-执行异常</br> 非必填参数，如果为空，搜索所有任务
     */
    public static final class ExecuteStatusEnum {

        
        /**
         * Enum UNSTARTED for value: "UNSTARTED"
         */
        public static final ExecuteStatusEnum UNSTARTED = new ExecuteStatusEnum("UNSTARTED");
        
        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final ExecuteStatusEnum WAITING = new ExecuteStatusEnum("WAITING");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final ExecuteStatusEnum RUNNING = new ExecuteStatusEnum("RUNNING");
        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final ExecuteStatusEnum SUCCESS = new ExecuteStatusEnum("SUCCESS");
        
        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final ExecuteStatusEnum CANCELLED = new ExecuteStatusEnum("CANCELLED");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ExecuteStatusEnum ERROR = new ExecuteStatusEnum("ERROR");
        

        private static final Map<String, ExecuteStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecuteStatusEnum> createStaticFields() {
            Map<String, ExecuteStatusEnum> map = new HashMap<>();
            map.put("UNSTARTED", UNSTARTED);
            map.put("WAITING", WAITING);
            map.put("RUNNING", RUNNING);
            map.put("SUCCESS", SUCCESS);
            map.put("CANCELLED", CANCELLED);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecuteStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExecuteStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ExecuteStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExecuteStatusEnum(value);
            }
            return result;
        }

        public static ExecuteStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ExecuteStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ExecuteStatusEnum) {
                return this.value.equals(((ExecuteStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_status")
    
    private ExecuteStatusEnum executeStatus;

    public ListMonitorInfosRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListMonitorInfosRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于1
     * minimum: 1
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListMonitorInfosRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示条目数量，最大数量999，超过999后只返回999
     * minimum: 0
     * maximum: 999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListMonitorInfosRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 需要搜索的任务名称，支持模糊搜索，大小写敏感，非必填参数，如果为空，搜索所有任务
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    

    public ListMonitorInfosRequest withExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    


    /**
     * 需要搜索任务的执行状态, 只允许如下枚举值：UNSTARTED-未启动, WAITING-等待执行,RUNNING-执行中, SUCCESS-执行成功, CANCELLED-任务取消, ERROR-执行异常</br> 非必填参数，如果为空，搜索所有任务
     * @return executeStatus
     */
    public ExecuteStatusEnum getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteStatusEnum executeStatus) {
        this.executeStatus = executeStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMonitorInfosRequest listMonitorInfosRequest = (ListMonitorInfosRequest) o;
        return Objects.equals(this.instanceId, listMonitorInfosRequest.instanceId) &&
            Objects.equals(this.offset, listMonitorInfosRequest.offset) &&
            Objects.equals(this.limit, listMonitorInfosRequest.limit) &&
            Objects.equals(this.taskName, listMonitorInfosRequest.taskName) &&
            Objects.equals(this.executeStatus, listMonitorInfosRequest.executeStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, taskName, executeStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonitorInfosRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
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

