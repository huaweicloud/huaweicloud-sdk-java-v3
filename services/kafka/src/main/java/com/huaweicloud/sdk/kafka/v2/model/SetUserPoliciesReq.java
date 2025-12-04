package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetUserPoliciesReq
 */
public class SetUserPoliciesReq {

    /**
     * **参数解释**： 操作名称。 **约束限制**： 不涉及。 **取值范围**： - create：提交创建用户策略任务。 - delete：提交删除用户策略任务。 **默认取值**： 不涉及。
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("create", CREATE);
            map.put("delete", DELETE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<UserPolicyEntity> policies = null;

    public SetUserPoliciesReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 操作名称。 **约束限制**： 不涉及。 **取值范围**： - create：提交创建用户策略任务。 - delete：提交删除用户策略任务。 **默认取值**： 不涉及。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public SetUserPoliciesReq withPolicies(List<UserPolicyEntity> policies) {
        this.policies = policies;
        return this;
    }

    public SetUserPoliciesReq addPoliciesItem(UserPolicyEntity policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public SetUserPoliciesReq withPolicies(Consumer<List<UserPolicyEntity>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * **参数解释**： 用户权限列表。 **约束限制**： 不涉及。
     * @return policies
     */
    public List<UserPolicyEntity> getPolicies() {
        return policies;
    }

    public void setPolicies(List<UserPolicyEntity> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetUserPoliciesReq that = (SetUserPoliciesReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetUserPoliciesReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
