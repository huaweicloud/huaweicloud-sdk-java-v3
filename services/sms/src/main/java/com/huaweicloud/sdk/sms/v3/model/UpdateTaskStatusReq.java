package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateTaskStatusReq  {

    /**
     * 操作任务的具体动作 start：启动任务,stop：停止任务,collect_log：搜集日志,test：启动目的端,clone_test：克隆目的端,restart：恢复实时同步,sync_failed_rollback：同步失败回滚
     */
    public static final class OperationEnum {

        
        /**
         * Enum START for value: "start"
         */
        public static final OperationEnum START = new OperationEnum("start");
        
        /**
         * Enum STOP for value: "stop"
         */
        public static final OperationEnum STOP = new OperationEnum("stop");
        
        /**
         * Enum COLLECT_LOG for value: "collect_log"
         */
        public static final OperationEnum COLLECT_LOG = new OperationEnum("collect_log");
        
        /**
         * Enum TEST for value: "test"
         */
        public static final OperationEnum TEST = new OperationEnum("test");
        
        /**
         * Enum CLONE_TEST for value: "clone_test"
         */
        public static final OperationEnum CLONE_TEST = new OperationEnum("clone_test");
        
        /**
         * Enum RESTART for value: "restart"
         */
        public static final OperationEnum RESTART = new OperationEnum("restart");
        
        /**
         * Enum SYNC_FAILED_ROLLBACK for value: "sync_failed_rollback"
         */
        public static final OperationEnum SYNC_FAILED_ROLLBACK = new OperationEnum("sync_failed_rollback");
        

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("start", START);
            map.put("stop", STOP);
            map.put("collect_log", COLLECT_LOG);
            map.put("test", TEST);
            map.put("clone_test", CLONE_TEST);
            map.put("restart", RESTART);
            map.put("sync_failed_rollback", SYNC_FAILED_ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationEnum(value);
            }
            return result;
        }

        public static OperationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private OperationEnum operation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param")
    
    private Map<String, String> param = null;
    
    public UpdateTaskStatusReq withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * 操作任务的具体动作 start：启动任务,stop：停止任务,collect_log：搜集日志,test：启动目的端,clone_test：克隆目的端,restart：恢复实时同步,sync_failed_rollback：同步失败回滚
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public UpdateTaskStatusReq withParam(Map<String, String> param) {
        this.param = param;
        return this;
    }

    

    public UpdateTaskStatusReq putParamItem(String key, String paramItem) {
         if (this.param == null) {
            this.param = new HashMap<>();
         }
        this.param.put(key, paramItem);
        return this;
    }

    public UpdateTaskStatusReq withParam(Consumer<Map<String, String>> paramSetter) {
        if(this.param == null ){
            this.param = new HashMap<>();
        }
        paramSetter.accept(this.param);
        return this;
    }
    /**
     * 操作参数
     * @return param
     */
    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskStatusReq updateTaskStatusReq = (UpdateTaskStatusReq) o;
        return Objects.equals(this.operation, updateTaskStatusReq.operation) &&
            Objects.equals(this.param, updateTaskStatusReq.param);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operation, param);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskStatusReq {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

