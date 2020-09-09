package com.huaweicloud.sdk.eps.v1.model;




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
 * 停用启用企业项目操作
 */
public class EnableAction  {

    /**
     * 启用操作
     */
    public static final class ActionEnum {

        
        /**
         * Enum ENABLE for value: "enable"
         */
        public static final ActionEnum ENABLE = new ActionEnum("enable");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            return Collections.unmodifiableMap(map);
        }

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
    
    private ActionEnum action = ActionEnum.ENABLE;

    public EnableAction withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 启用操作
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
        EnableAction enableAction = (EnableAction) o;
        return Objects.equals(this.action, enableAction.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableAction {\n");
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

