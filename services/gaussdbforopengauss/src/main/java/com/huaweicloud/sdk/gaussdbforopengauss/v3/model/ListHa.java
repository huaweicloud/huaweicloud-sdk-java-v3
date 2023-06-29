package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 获取分布式/主备版实例时返回。
 */
public class ListHa {

    /**
     * 数据库一致性类型，分布式模式实例仅有。取值为“strong”、“eventual”，分别表示强一致性、最终一致性。
     */
    public static final class ConsistencyEnum {

        /**
         * Enum STRONG for value: "strong"
         */
        public static final ConsistencyEnum STRONG = new ConsistencyEnum("strong");

        /**
         * Enum EVENTUAL for value: "eventual"
         */
        public static final ConsistencyEnum EVENTUAL = new ConsistencyEnum("eventual");

        private static final Map<String, ConsistencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsistencyEnum> createStaticFields() {
            Map<String, ConsistencyEnum> map = new HashMap<>();
            map.put("strong", STRONG);
            map.put("eventual", EVENTUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsistencyEnum(String value) {
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
        public static ConsistencyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConsistencyEnum(value));
        }

        public static ConsistencyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsistencyEnum) {
                return this.value.equals(((ConsistencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency")

    private ConsistencyEnum consistency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_mode")

    private String replicationMode;

    public ListHa withConsistency(ConsistencyEnum consistency) {
        this.consistency = consistency;
        return this;
    }

    /**
     * 数据库一致性类型，分布式模式实例仅有。取值为“strong”、“eventual”，分别表示强一致性、最终一致性。
     * @return consistency
     */
    public ConsistencyEnum getConsistency() {
        return consistency;
    }

    public void setConsistency(ConsistencyEnum consistency) {
        this.consistency = consistency;
    }

    public ListHa withReplicationMode(String replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    /**
     * 备机同步参数。  取值：非空。  GaussDB为 “sync” 说明： “sync”为同步模式。
     * @return replicationMode
     */
    public String getReplicationMode() {
        return replicationMode;
    }

    public void setReplicationMode(String replicationMode) {
        this.replicationMode = replicationMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHa that = (ListHa) obj;
        return Objects.equals(this.consistency, that.consistency)
            && Objects.equals(this.replicationMode, that.replicationMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consistency, replicationMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHa {\n");
        sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
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
