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
 * 执行或启用或停止伸缩策略
 */
public class ExecuteScalingPolicyRequestBody  {

    /**
     * 执行或启用或停止伸缩策略操作的标识。执行：execute。启用：resume。停止：pause。
     */
    public static class ActionEnum {

        
        /**
         * Enum EXECUTE for value: "execute"
         */
        public static final ActionEnum EXECUTE = new ActionEnum("execute");

        
        /**
         * Enum RESUME for value: "resume"
         */
        public static final ActionEnum RESUME = new ActionEnum("resume");

        
        /**
         * Enum PAUSE for value: "pause"
         */
        public static final ActionEnum PAUSE = new ActionEnum("pause");

        

        public static Map<String, ActionEnum> staticFields =
                new HashMap<String, ActionEnum>() {
                    { 
                        put("execute", EXECUTE);
                        put("resume", RESUME);
                        put("pause", PAUSE);
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

    public ExecuteScalingPolicyRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 执行或启用或停止伸缩策略操作的标识。执行：execute。启用：resume。停止：pause。
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
        ExecuteScalingPolicyRequestBody executeScalingPolicyRequestBody = (ExecuteScalingPolicyRequestBody) o;
        return Objects.equals(this.action, executeScalingPolicyRequestBody.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteScalingPolicyRequestBody {\n");
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

