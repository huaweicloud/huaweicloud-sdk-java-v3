package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 伸缩实例生命周期回调
 */
public class CompleteLifecycleActionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_action_key")
    
    private String lifecycleActionKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_hook_name")
    
    private String lifecycleHookName;
    /**
     * 生命周期回调操作。ABANDON：终止。CONTINUE：继续。EXTEND：延长超时时间，每次延长1小时。
     */
    public static class LifecycleActionResultEnum {

        
        /**
         * Enum ABANDON for value: "ABANDON"
         */
        public static final LifecycleActionResultEnum ABANDON = new LifecycleActionResultEnum("ABANDON");

        
        /**
         * Enum CONTINUE for value: "CONTINUE"
         */
        public static final LifecycleActionResultEnum CONTINUE = new LifecycleActionResultEnum("CONTINUE");

        
        /**
         * Enum EXTEND for value: "EXTEND"
         */
        public static final LifecycleActionResultEnum EXTEND = new LifecycleActionResultEnum("EXTEND");

        

        public static Map<String, LifecycleActionResultEnum> staticFields =
                new HashMap<String, LifecycleActionResultEnum>() {
                    { 
                        put("ABANDON", ABANDON);
                        put("CONTINUE", CONTINUE);
                        put("EXTEND", EXTEND);
                    }
                };

        private String value;

        LifecycleActionResultEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LifecycleActionResultEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            LifecycleActionResultEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new LifecycleActionResultEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static LifecycleActionResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LifecycleActionResultEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LifecycleActionResultEnum) {
                return this.value.equals(((LifecycleActionResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_action_result")
    
    private LifecycleActionResultEnum lifecycleActionResult;

    public CompleteLifecycleActionRequestBody withLifecycleActionKey(String lifecycleActionKey) {
        this.lifecycleActionKey = lifecycleActionKey;
        return this;
    }

    


    /**
     * 生命周期操作令牌，通过查询伸缩实例挂起信息接口获取。指定生命周期回调对象，当不传入instance_id字段时，该字段为必选。当该字段与instance_id字段都传入，优先使用该字段进行回调。
     * @return lifecycleActionKey
     */
    public String getLifecycleActionKey() {
        return lifecycleActionKey;
    }

    public void setLifecycleActionKey(String lifecycleActionKey) {
        this.lifecycleActionKey = lifecycleActionKey;
    }

    public CompleteLifecycleActionRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。指定生命周期回调对象，当不传入lifecycle_action_key字段时，该字段为必选。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CompleteLifecycleActionRequestBody withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    


    /**
     * 生命周期挂钩名称。指定生命周期回调对象，当不传入lifecycle_action_key字段时，该字段为必选。
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }

    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    public CompleteLifecycleActionRequestBody withLifecycleActionResult(LifecycleActionResultEnum lifecycleActionResult) {
        this.lifecycleActionResult = lifecycleActionResult;
        return this;
    }

    


    /**
     * 生命周期回调操作。ABANDON：终止。CONTINUE：继续。EXTEND：延长超时时间，每次延长1小时。
     * @return lifecycleActionResult
     */
    public LifecycleActionResultEnum getLifecycleActionResult() {
        return lifecycleActionResult;
    }

    public void setLifecycleActionResult(LifecycleActionResultEnum lifecycleActionResult) {
        this.lifecycleActionResult = lifecycleActionResult;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteLifecycleActionRequestBody completeLifecycleActionRequestBody = (CompleteLifecycleActionRequestBody) o;
        return Objects.equals(this.lifecycleActionKey, completeLifecycleActionRequestBody.lifecycleActionKey) &&
            Objects.equals(this.instanceId, completeLifecycleActionRequestBody.instanceId) &&
            Objects.equals(this.lifecycleHookName, completeLifecycleActionRequestBody.lifecycleHookName) &&
            Objects.equals(this.lifecycleActionResult, completeLifecycleActionRequestBody.lifecycleActionResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lifecycleActionKey, instanceId, lifecycleHookName, lifecycleActionResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteLifecycleActionRequestBody {\n");
            sb.append("    lifecycleActionKey: ").append(toIndentedString(lifecycleActionKey)).append("\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    lifecycleHookName: ").append(toIndentedString(lifecycleHookName)).append("\n");
            sb.append("    lifecycleActionResult: ").append(toIndentedString(lifecycleActionResult)).append("\n");
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

