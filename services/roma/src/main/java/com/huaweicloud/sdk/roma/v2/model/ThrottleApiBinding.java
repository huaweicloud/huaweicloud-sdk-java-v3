package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ThrottleApiBinding
 */
public class ThrottleApiBinding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    private String publishId;

    /**
     * 策略作用域，取值如下： - 1：整个API - 2： 单个用户 - 3：单个APP  目前只支持1
     */
    public static final class ScopeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ScopeEnum NUMBER_1 = new ScopeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ScopeEnum NUMBER_2 = new ScopeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ScopeEnum NUMBER_3 = new ScopeEnum(3);

        private static final Map<Integer, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ScopeEnum> createStaticFields() {
            Map<Integer, ScopeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ScopeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScopeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScopeEnum(value);
            }
            return result;
        }

        public static ScopeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private String strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private OffsetDateTime applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ThrottleApiBinding withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /**
     * API的发布记录编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public ThrottleApiBinding withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 策略作用域，取值如下： - 1：整个API - 2： 单个用户 - 3：单个APP  目前只支持1
     * @return scope
     */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public ThrottleApiBinding withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * 流控策略的ID
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public ThrottleApiBinding withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 绑定时间
     * @return applyTime
     */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public ThrottleApiBinding withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 绑定关系的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleApiBinding throttleApiBinding = (ThrottleApiBinding) o;
        return Objects.equals(this.publishId, throttleApiBinding.publishId)
            && Objects.equals(this.scope, throttleApiBinding.scope)
            && Objects.equals(this.strategyId, throttleApiBinding.strategyId)
            && Objects.equals(this.applyTime, throttleApiBinding.applyTime)
            && Objects.equals(this.id, throttleApiBinding.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishId, scope, strategyId, applyTime, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleApiBinding {\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
