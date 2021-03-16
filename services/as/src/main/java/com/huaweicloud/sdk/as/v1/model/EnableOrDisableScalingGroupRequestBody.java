package com.huaweicloud.sdk.as.v1.model;




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
 * 启停伸缩组请求
 */
public class EnableOrDisableScalingGroupRequestBody  {

    /**
     * 启用或停止伸缩组操作的标识。启用：resume 停止：pause
     */
    public static final class ActionEnum {

        
        /**
         * Enum RESUME for value: "resume"
         */
        public static final ActionEnum RESUME = new ActionEnum("resume");
        
        /**
         * Enum PAUSE for value: "pause"
         */
        public static final ActionEnum PAUSE = new ActionEnum("pause");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("resume", RESUME);
            map.put("pause", PAUSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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

    public EnableOrDisableScalingGroupRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 启用或停止伸缩组操作的标识。启用：resume 停止：pause
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
        EnableOrDisableScalingGroupRequestBody enableOrDisableScalingGroupRequestBody = (EnableOrDisableScalingGroupRequestBody) o;
        return Objects.equals(this.action, enableOrDisableScalingGroupRequestBody.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableOrDisableScalingGroupRequestBody {\n");
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

