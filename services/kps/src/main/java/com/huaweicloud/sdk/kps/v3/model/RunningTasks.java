package com.huaweicloud.sdk.kps.v3.model;




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
 * 正在处理的任务详细信息。
 */
public class RunningTasks  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;
    /**
     * 操作类型。 - FAILED_RESET 重置 - FAILED_REPLACE 替换 - FAILED_UNBIND 解绑
     */
    public static final class OperateTypeEnum {

        
        /**
         * Enum FAILED_RESET for value: "FAILED_RESET"
         */
        public static final OperateTypeEnum FAILED_RESET = new OperateTypeEnum("FAILED_RESET");
        
        /**
         * Enum FAILED_REPLACE for value: "FAILED_REPLACE"
         */
        public static final OperateTypeEnum FAILED_REPLACE = new OperateTypeEnum("FAILED_REPLACE");
        
        /**
         * Enum FAILED_UNBIND for value: "FAILED_UNBIND"
         */
        public static final OperateTypeEnum FAILED_UNBIND = new OperateTypeEnum("FAILED_UNBIND");
        

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("FAILED_RESET", FAILED_RESET);
            map.put("FAILED_REPLACE", FAILED_REPLACE);
            map.put("FAILED_UNBIND", FAILED_UNBIND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
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
        public static OperateTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperateTypeEnum(value);
            }
            return result;
        }

        public static OperateTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_type")
    
    private OperateTypeEnum operateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_time")
    
    private Long taskTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_name")
    
    private String serverName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypair_name")
    
    private String keypairName;

    public RunningTasks withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 虚拟机ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public RunningTasks withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    


    /**
     * 操作类型。 - FAILED_RESET 重置 - FAILED_REPLACE 替换 - FAILED_UNBIND 解绑
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    

    public RunningTasks withTaskTime(Long taskTime) {
        this.taskTime = taskTime;
        return this;
    }

    


    /**
     * 任务时间
     * minimum: 0
     * maximum: 10000000000000
     * @return taskTime
     */
    public Long getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Long taskTime) {
        this.taskTime = taskTime;
    }

    

    public RunningTasks withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    


    /**
     * 虚拟机名称
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    

    public RunningTasks withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 虚拟机ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    

    public RunningTasks withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    


    /**
     * 密钥对名称
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunningTasks runningTasks = (RunningTasks) o;
        return Objects.equals(this.taskId, runningTasks.taskId) &&
            Objects.equals(this.operateType, runningTasks.operateType) &&
            Objects.equals(this.taskTime, runningTasks.taskTime) &&
            Objects.equals(this.serverName, runningTasks.serverName) &&
            Objects.equals(this.serverId, runningTasks.serverId) &&
            Objects.equals(this.keypairName, runningTasks.keypairName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, operateType, taskTime, serverName, serverId, keypairName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunningTasks {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    taskTime: ").append(toIndentedString(taskTime)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
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

