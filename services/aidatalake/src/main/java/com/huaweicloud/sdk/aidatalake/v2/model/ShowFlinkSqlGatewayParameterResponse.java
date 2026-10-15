package com.huaweicloud.sdk.aidatalake.v2.model;

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
 * **参数解释**：SQL Gateway作业参数响应，包含Gateway连接信息。
 */
public class ShowFlinkSqlGatewayParameterResponse {

    /**
     * **参数解释**：作业类型。 **约束限制**：不涉及。 **取值范围**：   - FLINK_SQL_GATEWAY：SQL Gateway作业。
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
    @JsonProperty(value = "sql_gateway_config")

    private ShowFlinkSqlGatewayConfigResponseBody sqlGatewayConfig;

    public ShowFlinkSqlGatewayParameterResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：不涉及。 **取值范围**：   - FLINK_SQL_GATEWAY：SQL Gateway作业。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowFlinkSqlGatewayParameterResponse withSqlGatewayConfig(
        ShowFlinkSqlGatewayConfigResponseBody sqlGatewayConfig) {
        this.sqlGatewayConfig = sqlGatewayConfig;
        return this;
    }

    public ShowFlinkSqlGatewayParameterResponse withSqlGatewayConfig(
        Consumer<ShowFlinkSqlGatewayConfigResponseBody> sqlGatewayConfigSetter) {
        if (this.sqlGatewayConfig == null) {
            this.sqlGatewayConfig = new ShowFlinkSqlGatewayConfigResponseBody();
            sqlGatewayConfigSetter.accept(this.sqlGatewayConfig);
        }

        return this;
    }

    /**
     * Get sqlGatewayConfig
     * @return sqlGatewayConfig
     */
    public ShowFlinkSqlGatewayConfigResponseBody getSqlGatewayConfig() {
        return sqlGatewayConfig;
    }

    public void setSqlGatewayConfig(ShowFlinkSqlGatewayConfigResponseBody sqlGatewayConfig) {
        this.sqlGatewayConfig = sqlGatewayConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkSqlGatewayParameterResponse that = (ShowFlinkSqlGatewayParameterResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sqlGatewayConfig, that.sqlGatewayConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sqlGatewayConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkSqlGatewayParameterResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sqlGatewayConfig: ").append(toIndentedString(sqlGatewayConfig)).append("\n");
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
