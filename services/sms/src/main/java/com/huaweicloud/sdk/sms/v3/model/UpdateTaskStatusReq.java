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
     * 操作任务的具体动作
     */
    public static final class OperationEnum {

        
        /**
         * Enum START_ for value: "start：启动任务"
         */
        public static final OperationEnum START_ = new OperationEnum("start：启动任务");
        
        /**
         * Enum STOP_ for value: "stop：停止任务"
         */
        public static final OperationEnum STOP_ = new OperationEnum("stop：停止任务");
        
        /**
         * Enum COLLECT_LOG_ for value: "collect_log：搜集日志"
         */
        public static final OperationEnum COLLECT_LOG_ = new OperationEnum("collect_log：搜集日志");
        
        /**
         * Enum TEST_ for value: "test：启动目的端"
         */
        public static final OperationEnum TEST_ = new OperationEnum("test：启动目的端");
        
        /**
         * Enum CLONE_TEST_ for value: "clone_test：克隆目的端"
         */
        public static final OperationEnum CLONE_TEST_ = new OperationEnum("clone_test：克隆目的端");
        
        /**
         * Enum RESTART_ for value: "restart：恢复实时同步"
         */
        public static final OperationEnum RESTART_ = new OperationEnum("restart：恢复实时同步");
        
        /**
         * Enum SYNC_FAILED_ROLLBACK_ for value: "sync_failed_rollback：同步失败回滚"
         */
        public static final OperationEnum SYNC_FAILED_ROLLBACK_ = new OperationEnum("sync_failed_rollback：同步失败回滚");
        

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("start：启动任务", START_);
            map.put("stop：停止任务", STOP_);
            map.put("collect_log：搜集日志", COLLECT_LOG_);
            map.put("test：启动目的端", TEST_);
            map.put("clone_test：克隆目的端", CLONE_TEST_);
            map.put("restart：恢复实时同步", RESTART_);
            map.put("sync_failed_rollback：同步失败回滚", SYNC_FAILED_ROLLBACK_);
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
     * 操作任务的具体动作
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
        if(this.param == null) {
            this.param = new HashMap<>();
        }
        this.param.put(key, paramItem);
        return this;
    }

    public UpdateTaskStatusReq withParam(Consumer<Map<String, String>> paramSetter) {
        if(this.param == null) {
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

