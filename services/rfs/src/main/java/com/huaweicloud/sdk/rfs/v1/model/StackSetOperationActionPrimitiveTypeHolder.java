package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StackSetOperationActionPrimitiveTypeHolder
 */
public class StackSetOperationActionPrimitiveTypeHolder {

    /**
     * 用户当前的操作   * `CREATE_STACK_INSTANCES` - 创建资源栈实例   * `DELETE_STACK_INSTANCES` - 删除资源栈实例   * `DEPLOY_STACK_SET` - 部署资源栈集   * `DEPLOY_STACK_INSTANCES` - 部署资源栈实例   * `UPDATE_STACK_INSTANCES` - 更新资源栈实例
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE_STACK_INSTANCES for value: "CREATE_STACK_INSTANCES"
         */
        public static final ActionEnum CREATE_STACK_INSTANCES = new ActionEnum("CREATE_STACK_INSTANCES");

        /**
         * Enum DELETE_STACK_INSTANCES for value: "DELETE_STACK_INSTANCES"
         */
        public static final ActionEnum DELETE_STACK_INSTANCES = new ActionEnum("DELETE_STACK_INSTANCES");

        /**
         * Enum DEPLOY_STACK_SET for value: "DEPLOY_STACK_SET"
         */
        public static final ActionEnum DEPLOY_STACK_SET = new ActionEnum("DEPLOY_STACK_SET");

        /**
         * Enum DEPLOY_STACK_INSTANCES for value: "DEPLOY_STACK_INSTANCES"
         */
        public static final ActionEnum DEPLOY_STACK_INSTANCES = new ActionEnum("DEPLOY_STACK_INSTANCES");

        /**
         * Enum UPDATE_STACK_INSTANCES for value: "UPDATE_STACK_INSTANCES"
         */
        public static final ActionEnum UPDATE_STACK_INSTANCES = new ActionEnum("UPDATE_STACK_INSTANCES");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("CREATE_STACK_INSTANCES", CREATE_STACK_INSTANCES);
            map.put("DELETE_STACK_INSTANCES", DELETE_STACK_INSTANCES);
            map.put("DEPLOY_STACK_SET", DEPLOY_STACK_SET);
            map.put("DEPLOY_STACK_INSTANCES", DEPLOY_STACK_INSTANCES);
            map.put("UPDATE_STACK_INSTANCES", UPDATE_STACK_INSTANCES);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "action")

    private ActionEnum action;

    public StackSetOperationActionPrimitiveTypeHolder withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 用户当前的操作   * `CREATE_STACK_INSTANCES` - 创建资源栈实例   * `DELETE_STACK_INSTANCES` - 删除资源栈实例   * `DEPLOY_STACK_SET` - 部署资源栈集   * `DEPLOY_STACK_INSTANCES` - 部署资源栈实例   * `UPDATE_STACK_INSTANCES` - 更新资源栈实例
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackSetOperationActionPrimitiveTypeHolder that = (StackSetOperationActionPrimitiveTypeHolder) obj;
        return Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackSetOperationActionPrimitiveTypeHolder {\n");
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
