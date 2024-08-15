package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指定资源合规规则修正最新执行结果。
 */
public class RemediationExecutionStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_key")

    private RemediationResourceKey resourceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_time")

    private String invocationTime;

    /**
     * 合规规则修正执行的状态。
     */
    public static final class StateEnum {

        /**
         * Enum IN_QUEUE for value: "IN_QUEUE"
         */
        public static final StateEnum IN_QUEUE = new StateEnum("IN_QUEUE");

        /**
         * Enum IN_PROGRESS for value: "IN_PROGRESS"
         */
        public static final StateEnum IN_PROGRESS = new StateEnum("IN_PROGRESS");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StateEnum SUCCEEDED = new StateEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("IN_QUEUE", IN_QUEUE);
            map.put("IN_PROGRESS", IN_PROGRESS);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public RemediationExecutionStatus withResourceKey(RemediationResourceKey resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }

    public RemediationExecutionStatus withResourceKey(Consumer<RemediationResourceKey> resourceKeySetter) {
        if (this.resourceKey == null) {
            this.resourceKey = new RemediationResourceKey();
            resourceKeySetter.accept(this.resourceKey);
        }

        return this;
    }

    /**
     * Get resourceKey
     * @return resourceKey
     */
    public RemediationResourceKey getResourceKey() {
        return resourceKey;
    }

    public void setResourceKey(RemediationResourceKey resourceKey) {
        this.resourceKey = resourceKey;
    }

    public RemediationExecutionStatus withInvocationTime(String invocationTime) {
        this.invocationTime = invocationTime;
        return this;
    }

    /**
     * 补救执行的开始时间。
     * @return invocationTime
     */
    public String getInvocationTime() {
        return invocationTime;
    }

    public void setInvocationTime(String invocationTime) {
        this.invocationTime = invocationTime;
    }

    public RemediationExecutionStatus withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 合规规则修正执行的状态。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RemediationExecutionStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 合规规则修正执行的信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemediationExecutionStatus that = (RemediationExecutionStatus) obj;
        return Objects.equals(this.resourceKey, that.resourceKey)
            && Objects.equals(this.invocationTime, that.invocationTime) && Objects.equals(this.state, that.state)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceKey, invocationTime, state, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemediationExecutionStatus {\n");
        sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
        sb.append("    invocationTime: ").append(toIndentedString(invocationTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
