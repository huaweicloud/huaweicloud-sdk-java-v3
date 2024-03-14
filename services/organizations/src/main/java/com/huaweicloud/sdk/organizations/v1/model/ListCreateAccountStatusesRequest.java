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
public class ListCreateAccountStatusesRequest {

    /**
     * 创建账号的状态，in_progress处理中，succeeded成功，failed失败
     */
    public static final class StatesEnum {

        /**
         * Enum IN_PROGRESS for value: "in_progress"
         */
        public static final StatesEnum IN_PROGRESS = new StatesEnum("in_progress");

        /**
         * Enum SUCCEEDED for value: "succeeded"
         */
        public static final StatesEnum SUCCEEDED = new StatesEnum("succeeded");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatesEnum FAILED = new StatesEnum("failed");

        private static final Map<String, StatesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatesEnum> createStaticFields() {
            Map<String, StatesEnum> map = new HashMap<>();
            map.put("in_progress", IN_PROGRESS);
            map.put("succeeded", SUCCEEDED);
            map.put("failed", FAILED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListCreateAccountStatusesRequest withStates(List<StatesEnum> states) {
        this.states = states;
        return this;
    }

    public ListCreateAccountStatusesRequest addStatesItem(StatesEnum statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public ListCreateAccountStatusesRequest withStates(Consumer<List<StatesEnum>> statesSetter) {
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

    public ListCreateAccountStatusesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 页面中最大结果数量。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCreateAccountStatusesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCreateAccountStatusesRequest that = (ListCreateAccountStatusesRequest) obj;
        return Objects.equals(this.states, that.states) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(states, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCreateAccountStatusesRequest {\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
