package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：重启集群操作的详情。 
 */
public class SqlRestartCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    /**
     * **参数解释**：集群重启策略，用于指定重启方式。 **取值范围**：         - FORCE：强制重启，不等待正在运行的作业完成。 - GRACEFUL：优雅重启，等待所有正在运行的作业完成后再重启。 
     */
    public static final class RestartStrategyEnum {

        /**
         * Enum GRACEFUL for value: "GRACEFUL"
         */
        public static final RestartStrategyEnum GRACEFUL = new RestartStrategyEnum("GRACEFUL");

        /**
         * Enum FORCE for value: "FORCE"
         */
        public static final RestartStrategyEnum FORCE = new RestartStrategyEnum("FORCE");

        private static final Map<String, RestartStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RestartStrategyEnum> createStaticFields() {
            Map<String, RestartStrategyEnum> map = new HashMap<>();
            map.put("GRACEFUL", GRACEFUL);
            map.put("FORCE", FORCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RestartStrategyEnum(String value) {
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
        public static RestartStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RestartStrategyEnum(value));
        }

        public static RestartStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RestartStrategyEnum) {
                return this.value.equals(((RestartStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_strategy")

    private RestartStrategyEnum restartStrategy;

    public SqlRestartCluster withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：固定值为 RESTART_CLUSTER。 **取值范围**：不涉及。 **默认取值**：RESTART_CLUSTER。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SqlRestartCluster withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：SparkSql端点名称。 **取值范围**：只能由小写字母、数字及中划线组成，必须以小写字母开头，以小写字母或数字结尾，且长度为1~63个字符。 
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public SqlRestartCluster withRestartStrategy(RestartStrategyEnum restartStrategy) {
        this.restartStrategy = restartStrategy;
        return this;
    }

    /**
     * **参数解释**：集群重启策略，用于指定重启方式。 **取值范围**：         - FORCE：强制重启，不等待正在运行的作业完成。 - GRACEFUL：优雅重启，等待所有正在运行的作业完成后再重启。 
     * @return restartStrategy
     */
    public RestartStrategyEnum getRestartStrategy() {
        return restartStrategy;
    }

    public void setRestartStrategy(RestartStrategyEnum restartStrategy) {
        this.restartStrategy = restartStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlRestartCluster that = (SqlRestartCluster) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.restartStrategy, that.restartStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, endpointName, restartStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlRestartCluster {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    restartStrategy: ").append(toIndentedString(restartStrategy)).append("\n");
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
