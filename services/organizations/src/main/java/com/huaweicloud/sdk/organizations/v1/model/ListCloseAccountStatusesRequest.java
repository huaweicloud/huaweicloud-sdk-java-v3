package com.huaweicloud.sdk.organizations.v1.model;

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
 * Request Object
 */
public class ListCloseAccountStatusesRequest {

    /**
     * pending_closure关闭中，suspended已关闭
     */
    public static final class StatesEnum {

        /**
         * Enum PENDING_CLOSURE for value: "pending_closure"
         */
        public static final StatesEnum PENDING_CLOSURE = new StatesEnum("pending_closure");

        /**
         * Enum SUSPENDED for value: "suspended"
         */
        public static final StatesEnum SUSPENDED = new StatesEnum("suspended");

        private static final Map<String, StatesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatesEnum> createStaticFields() {
            Map<String, StatesEnum> map = new HashMap<>();
            map.put("pending_closure", PENDING_CLOSURE);
            map.put("suspended", SUSPENDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatesEnum(String value) {
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
        public static StatesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatesEnum(value));
        }

        public static StatesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatesEnum) {
                return this.value.equals(((StatesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<StatesEnum> states = null;

    public ListCloseAccountStatusesRequest withStates(List<StatesEnum> states) {
        this.states = states;
        return this;
    }

    public ListCloseAccountStatusesRequest addStatesItem(StatesEnum statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public ListCloseAccountStatusesRequest withStates(Consumer<List<StatesEnum>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 要包含在响应中的一个或多个状态的列表。如果此参数不存在，则所有请求都包含在响应中。
     * @return states
     */
    public List<StatesEnum> getStates() {
        return states;
    }

    public void setStates(List<StatesEnum> states) {
        this.states = states;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloseAccountStatusesRequest that = (ListCloseAccountStatusesRequest) obj;
        return Objects.equals(this.states, that.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(states);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloseAccountStatusesRequest {\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
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
