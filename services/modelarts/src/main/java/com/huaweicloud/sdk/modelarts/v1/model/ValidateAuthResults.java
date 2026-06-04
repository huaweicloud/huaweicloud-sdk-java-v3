package com.huaweicloud.sdk.modelarts.v1.model;

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
 * ValidateAuthResults
 */
public class ValidateAuthResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    /**
     * **参数解释**：鉴权通过与否。 **取值范围**： - allow：通过。 - deny：不通过。
     */
    public static final class VerdictEnum {

        /**
         * Enum ALLOW for value: "allow"
         */
        public static final VerdictEnum ALLOW = new VerdictEnum("allow");

        /**
         * Enum DENY for value: "deny"
         */
        public static final VerdictEnum DENY = new VerdictEnum("deny");

        private static final Map<String, VerdictEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VerdictEnum> createStaticFields() {
            Map<String, VerdictEnum> map = new HashMap<>();
            map.put("allow", ALLOW);
            map.put("deny", DENY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VerdictEnum(String value) {
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
        public static VerdictEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VerdictEnum(value));
        }

        public static VerdictEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VerdictEnum) {
                return this.value.equals(((VerdictEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verdict")

    private VerdictEnum verdict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause")

    private List<Cause> cause = null;

    public ValidateAuthResults withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：细粒度权限。 **取值范围**：不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ValidateAuthResults withVerdict(VerdictEnum verdict) {
        this.verdict = verdict;
        return this;
    }

    /**
     * **参数解释**：鉴权通过与否。 **取值范围**： - allow：通过。 - deny：不通过。
     * @return verdict
     */
    public VerdictEnum getVerdict() {
        return verdict;
    }

    public void setVerdict(VerdictEnum verdict) {
        this.verdict = verdict;
    }

    public ValidateAuthResults withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * **参数解释**：随机的uuid，用来定位问题使用。 **取值范围**：不涉及。
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public ValidateAuthResults withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * **参数解释**：请求资源。 **取值范围**：不涉及。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ValidateAuthResults withCause(List<Cause> cause) {
        this.cause = cause;
        return this;
    }

    public ValidateAuthResults addCauseItem(Cause causeItem) {
        if (this.cause == null) {
            this.cause = new ArrayList<>();
        }
        this.cause.add(causeItem);
        return this;
    }

    public ValidateAuthResults withCause(Consumer<List<Cause>> causeSetter) {
        if (this.cause == null) {
            this.cause = new ArrayList<>();
        }
        causeSetter.accept(this.cause);
        return this;
    }

    /**
     * **参数解释**：失败情况下原因。
     * @return cause
     */
    public List<Cause> getCause() {
        return cause;
    }

    public void setCause(List<Cause> cause) {
        this.cause = cause;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateAuthResults that = (ValidateAuthResults) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.verdict, that.verdict)
            && Objects.equals(this.actionId, that.actionId) && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.cause, that.cause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, verdict, actionId, resource, cause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateAuthResults {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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
