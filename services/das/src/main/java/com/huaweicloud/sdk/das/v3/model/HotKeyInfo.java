package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HotKeyInfo
 */
public class HotKeyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * key类型。取值：string、hash、list、zset、set、stream、exhash
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final TypeEnum STRING = new TypeEnum("string");

        /**
         * Enum HASH for value: "hash"
         */
        public static final TypeEnum HASH = new TypeEnum("hash");

        /**
         * Enum LIST for value: "list"
         */
        public static final TypeEnum LIST = new TypeEnum("list");

        /**
         * Enum ZSET for value: "zset"
         */
        public static final TypeEnum ZSET = new TypeEnum("zset");

        /**
         * Enum SET for value: "set"
         */
        public static final TypeEnum SET = new TypeEnum("set");

        /**
         * Enum STREAM for value: "stream"
         */
        public static final TypeEnum STREAM = new TypeEnum("stream");

        /**
         * Enum EXHASH for value: "exhash"
         */
        public static final TypeEnum EXHASH = new TypeEnum("exhash");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("hash", HASH);
            map.put("list", LIST);
            map.put("zset", ZSET);
            map.put("set", SET);
            map.put("stream", STREAM);
            map.put("exhash", EXHASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Long qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_in")

    private Long trafficIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_out")

    private Long trafficOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    public HotKeyInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * key名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotKeyInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * key类型。取值：string、hash、list、zset、set、stream、exhash
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public HotKeyInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 最新执行命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public HotKeyInfo withQps(Long qps) {
        this.qps = qps;
        return this;
    }

    /**
     * QPS值
     * minimum: 0
     * maximum: 9223372036854775807
     * @return qps
     */
    public Long getQps() {
        return qps;
    }

    public void setQps(Long qps) {
        this.qps = qps;
    }

    public HotKeyInfo withTrafficIn(Long trafficIn) {
        this.trafficIn = trafficIn;
        return this;
    }

    /**
     * 入口流量（字节/秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return trafficIn
     */
    public Long getTrafficIn() {
        return trafficIn;
    }

    public void setTrafficIn(Long trafficIn) {
        this.trafficIn = trafficIn;
    }

    public HotKeyInfo withTrafficOut(Long trafficOut) {
        this.trafficOut = trafficOut;
        return this;
    }

    /**
     * 出口流量（字节/秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return trafficOut
     */
    public Long getTrafficOut() {
        return trafficOut;
    }

    public void setTrafficOut(Long trafficOut) {
        this.trafficOut = trafficOut;
    }

    public HotKeyInfo withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * DB ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HotKeyInfo that = (HotKeyInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.command, that.command) && Objects.equals(this.qps, that.qps)
            && Objects.equals(this.trafficIn, that.trafficIn) && Objects.equals(this.trafficOut, that.trafficOut)
            && Objects.equals(this.dbId, that.dbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, command, qps, trafficIn, trafficOut, dbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotKeyInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    trafficIn: ").append(toIndentedString(trafficIn)).append("\n");
        sb.append("    trafficOut: ").append(toIndentedString(trafficOut)).append("\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
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
