package com.huaweicloud.sdk.aom.v1.model;





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
public class UpdateWorkflowTriggerStatusRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_id")
    

    private String workflowId;
    /**
     * 启动或暂停任务的定时执行。enable为开启定时任务，disable为关闭定时任务
     */
    public static final class ActionEnum {

        
        /**
         * Enum ENABLE for value: "enable"
         */
        public static final ActionEnum ENABLE = new ActionEnum("enable");
        
        /**
         * Enum DISABLE for value: "disable"
         */
        public static final ActionEnum DISABLE = new ActionEnum("disable");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    

    private ActionEnum action;

    public UpdateWorkflowTriggerStatusRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    


    /**
     * 任务id，待修改任务的id。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    

    public UpdateWorkflowTriggerStatusRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 启动或暂停任务的定时执行。enable为开启定时任务，disable为关闭定时任务
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWorkflowTriggerStatusRequest updateWorkflowTriggerStatusRequest = (UpdateWorkflowTriggerStatusRequest) o;
        return Objects.equals(this.workflowId, updateWorkflowTriggerStatusRequest.workflowId) &&
            Objects.equals(this.action, updateWorkflowTriggerStatusRequest.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(workflowId, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkflowTriggerStatusRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

