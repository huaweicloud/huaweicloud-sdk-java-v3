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
 * 实例部署形态。
 */
public class OpenGaussHaResult {

    /**
     * GaussDB 分布式模式，返回值为：enterprise（企业版）；主备版，返回值为：centralization_standard(主备版)。
     */
    public static final class ModeEnum {

        /**
         * Enum ENTERPRISE for value: "Enterprise"
         */
        public static final ModeEnum ENTERPRISE = new ModeEnum("Enterprise");

        /**
         * Enum CENTRALIZATION_STANDARD for value: "centralization_standard"
         */
        public static final ModeEnum CENTRALIZATION_STANDARD = new ModeEnum("centralization_standard");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Enterprise", ENTERPRISE);
            map.put("centralization_standard", CENTRALIZATION_STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /**
     * 备机同步参数。  取值：  GaussDB为“sync”。 说明： - “sync”为同步模式。
     */
    public static final class ReplicationModeEnum {

        /**
         * Enum SYNC for value: "sync"
         */
        public static final ReplicationModeEnum SYNC = new ReplicationModeEnum("sync");

        private static final Map<String, ReplicationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicationModeEnum> createStaticFields() {
            Map<String, ReplicationModeEnum> map = new HashMap<>();
            map.put("sync", SYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplicationModeEnum(String value) {
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
        public static ReplicationModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplicationModeEnum(value));
        }

        public static ReplicationModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicationModeEnum) {
                return this.value.equals(((ReplicationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_mode")

    private ReplicationModeEnum replicationMode;

    /**
     * GaussDB的预留参数：指定实例一致性类型，取值范围：strong（强一致性） | eventual(最终一致性)。
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
    @JsonProperty(value = "consistency_protocol")

    private String consistencyProtocol;

    public OpenGaussHaResult withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * GaussDB 分布式模式，返回值为：enterprise（企业版）；主备版，返回值为：centralization_standard(主备版)。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public OpenGaussHaResult withReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    /**
     * 备机同步参数。  取值：  GaussDB为“sync”。 说明： - “sync”为同步模式。
     * @return replicationMode
     */
    public ReplicationModeEnum getReplicationMode() {
        return replicationMode;
    }

    public void setReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
    }

    public OpenGaussHaResult withConsistency(ConsistencyEnum consistency) {
        this.consistency = consistency;
        return this;
    }

    /**
     * GaussDB的预留参数：指定实例一致性类型，取值范围：strong（强一致性） | eventual(最终一致性)。
     * @return consistency
     */
    public ConsistencyEnum getConsistency() {
        return consistency;
    }

    public void setConsistency(ConsistencyEnum consistency) {
        this.consistency = consistency;
    }

    public OpenGaussHaResult withConsistencyProtocol(String consistencyProtocol) {
        this.consistencyProtocol = consistencyProtocol;
        return this;
    }

    /**
     * 指定副本一致性协议类型，取值范围：quorum | paxos。不填时，默认为quorum。
     * @return consistencyProtocol
     */
    public String getConsistencyProtocol() {
        return consistencyProtocol;
    }

    public void setConsistencyProtocol(String consistencyProtocol) {
        this.consistencyProtocol = consistencyProtocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenGaussHaResult that = (OpenGaussHaResult) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.replicationMode, that.replicationMode)
            && Objects.equals(this.consistency, that.consistency)
            && Objects.equals(this.consistencyProtocol, that.consistencyProtocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, replicationMode, consistency, consistencyProtocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussHaResult {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
        sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
        sb.append("    consistencyProtocol: ").append(toIndentedString(consistencyProtocol)).append("\n");
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
