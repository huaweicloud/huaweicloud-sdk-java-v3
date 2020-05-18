package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 批量操作实例
 */
public class UpdateScalingGroupInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances_id")
    
    private List<String> instancesId = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_delete")
    
    private String instanceDelete;
    /**
     * 批量操作实例action标识：添加：ADD  移除： REMOVE  设置实例保护： PROTECT  取消实例保护： UNPROTECT；转入备用状态：ENTER_STANDBY 移出备用状态:EXIT_STANDBY
     */
    public static class ActionEnum {

        
        /**
         * Enum ADD for value: "ADD"
         */
        public static final ActionEnum ADD = new ActionEnum("ADD");

        
        /**
         * Enum REMOVE for value: "REMOVE"
         */
        public static final ActionEnum REMOVE = new ActionEnum("REMOVE");

        
        /**
         * Enum PROTECT for value: "PROTECT"
         */
        public static final ActionEnum PROTECT = new ActionEnum("PROTECT");

        
        /**
         * Enum UNPROTECT for value: "UNPROTECT"
         */
        public static final ActionEnum UNPROTECT = new ActionEnum("UNPROTECT");

        
        /**
         * Enum ENTER_STANDBY for value: "ENTER_STANDBY"
         */
        public static final ActionEnum ENTER_STANDBY = new ActionEnum("ENTER_STANDBY");

        
        /**
         * Enum EXIT_STANDBY for value: "EXIT_STANDBY"
         */
        public static final ActionEnum EXIT_STANDBY = new ActionEnum("EXIT_STANDBY");

        

        public static Map<String, ActionEnum> staticFields =
                new HashMap<String, ActionEnum>() {
                    { 
                        put("ADD", ADD);
                        put("REMOVE", REMOVE);
                        put("PROTECT", PROTECT);
                        put("UNPROTECT", UNPROTECT);
                        put("ENTER_STANDBY", ENTER_STANDBY);
                        put("EXIT_STANDBY", EXIT_STANDBY);
                    }
                };

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ActionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_append")
    
    private String instanceAppend;

    public UpdateScalingGroupInstanceRequestBody withInstancesId(List<String> instancesId) {
        this.instancesId = instancesId;
        return this;
    }

    
    public UpdateScalingGroupInstanceRequestBody addInstancesIdItem(String instancesIdItem) {
        this.instancesId.add(instancesIdItem);
        return this;
    }

    public UpdateScalingGroupInstanceRequestBody withInstancesId(Consumer<List<String>> instancesIdSetter) {
        if(this.instancesId == null ){
            this.instancesId = new ArrayList<>();
        }
        instancesIdSetter.accept(this.instancesId);
        return this;
    }

    /**
     * 云服务器ID。
     * @return instancesId
     */
    public List<String> getInstancesId() {
        return instancesId;
    }

    public void setInstancesId(List<String> instancesId) {
        this.instancesId = instancesId;
    }

    public UpdateScalingGroupInstanceRequestBody withInstanceDelete(String instanceDelete) {
        this.instanceDelete = instanceDelete;
        return this;
    }

    


    /**
     * 从伸缩组中移出实例时，是否删除云服务器。默认为no；可选值为yes或no。只有action为REMOVE时，这个字段才生效。
     * @return instanceDelete
     */
    public String getInstanceDelete() {
        return instanceDelete;
    }

    public void setInstanceDelete(String instanceDelete) {
        this.instanceDelete = instanceDelete;
    }

    public UpdateScalingGroupInstanceRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 批量操作实例action标识：添加：ADD  移除： REMOVE  设置实例保护： PROTECT  取消实例保护： UNPROTECT；转入备用状态：ENTER_STANDBY 移出备用状态:EXIT_STANDBY
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public UpdateScalingGroupInstanceRequestBody withInstanceAppend(String instanceAppend) {
        this.instanceAppend = instanceAppend;
        return this;
    }

    


    /**
     * 将实例移入备用状态时，是否补充新的云服务器。取值如下：no：不补充新的实例，默认情况为no。yes：补充新的实例。只有action为ENTER_STANDBY时，这个字段才生效。
     * @return instanceAppend
     */
    public String getInstanceAppend() {
        return instanceAppend;
    }

    public void setInstanceAppend(String instanceAppend) {
        this.instanceAppend = instanceAppend;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateScalingGroupInstanceRequestBody updateScalingGroupInstanceRequestBody = (UpdateScalingGroupInstanceRequestBody) o;
        return Objects.equals(this.instancesId, updateScalingGroupInstanceRequestBody.instancesId) &&
            Objects.equals(this.instanceDelete, updateScalingGroupInstanceRequestBody.instanceDelete) &&
            Objects.equals(this.action, updateScalingGroupInstanceRequestBody.action) &&
            Objects.equals(this.instanceAppend, updateScalingGroupInstanceRequestBody.instanceAppend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instancesId, instanceDelete, action, instanceAppend);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScalingGroupInstanceRequestBody {\n");
            sb.append("    instancesId: ").append(toIndentedString(instancesId)).append("\n");
            sb.append("    instanceDelete: ").append(toIndentedString(instanceDelete)).append("\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    instanceAppend: ").append(toIndentedString(instanceAppend)).append("\n");
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

