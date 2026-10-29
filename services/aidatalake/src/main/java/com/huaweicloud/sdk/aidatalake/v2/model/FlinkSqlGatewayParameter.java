package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：SQL Gateway作业参数，用于创建交互式SQL Gateway实例。 **约束限制**：不涉及。
 */
public class FlinkSqlGatewayParameter {

    /**
     * **参数解释**：作业类型。 **约束限制**：固定值为 FLINK_SQL_GATEWAY。 **取值范围**：不涉及。 **默认取值**：FLINK_SQL_GATEWAY。
     */
    public static final class TypeEnum {

        /**
         * Enum FLINK_SQL_GATEWAY for value: "FLINK_SQL_GATEWAY"
         */
        public static final TypeEnum FLINK_SQL_GATEWAY = new TypeEnum("FLINK_SQL_GATEWAY");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FLINK_SQL_GATEWAY", FLINK_SQL_GATEWAY);
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
    @JsonProperty(value = "sql_gateway_token")

    private String sqlGatewayToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_enabled")

    private Boolean idleEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_timeout")

    private Integer idleTimeout;

    public FlinkSqlGatewayParameter withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：固定值为 FLINK_SQL_GATEWAY。 **取值范围**：不涉及。 **默认取值**：FLINK_SQL_GATEWAY。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public FlinkSqlGatewayParameter withSqlGatewayToken(String sqlGatewayToken) {
        this.sqlGatewayToken = sqlGatewayToken;
        return this;
    }

    /**
     * **参数解释**：用户自定义的SQL Gateway访问鉴权Token，调用方通过HTTP请求头 Authorization: Bearer {token} 携带。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 **默认取值**：不涉及。
     * @return sqlGatewayToken
     */
    public String getSqlGatewayToken() {
        return sqlGatewayToken;
    }

    public void setSqlGatewayToken(String sqlGatewayToken) {
        this.sqlGatewayToken = sqlGatewayToken;
    }

    public FlinkSqlGatewayParameter withIdleEnabled(Boolean idleEnabled) {
        this.idleEnabled = idleEnabled;
        return this;
    }

    /**
     * **参数解释**：是否开启空闲自动释放。 **约束限制**：不涉及。 **取值范围**：   - true：开启空闲自动释放。   - false：关闭空闲自动释放。 **默认取值**：false。
     * @return idleEnabled
     */
    public Boolean getIdleEnabled() {
        return idleEnabled;
    }

    public void setIdleEnabled(Boolean idleEnabled) {
        this.idleEnabled = idleEnabled;
    }

    public FlinkSqlGatewayParameter withIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    /**
     * **参数解释**：最大空闲时长，单位为分钟，用于指定SQL Gateway空闲多长时间后自动停止。空闲指会话内没有正在运行的作业，创建会话等其他操作不计为非空闲。 **约束限制**：不涉及。 **取值范围**：10~1440。 **默认取值**：30。
     * minimum: 10
     * maximum: 1440
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkSqlGatewayParameter that = (FlinkSqlGatewayParameter) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sqlGatewayToken, that.sqlGatewayToken)
            && Objects.equals(this.idleEnabled, that.idleEnabled) && Objects.equals(this.idleTimeout, that.idleTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sqlGatewayToken, idleEnabled, idleTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkSqlGatewayParameter {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sqlGatewayToken: ").append(toIndentedString(sqlGatewayToken)).append("\n");
        sb.append("    idleEnabled: ").append(toIndentedString(idleEnabled)).append("\n");
        sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
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
