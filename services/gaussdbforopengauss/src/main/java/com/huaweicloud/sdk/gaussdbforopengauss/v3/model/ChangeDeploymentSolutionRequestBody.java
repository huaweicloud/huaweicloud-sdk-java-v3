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
 * **参数解释**: 部署方案变更请求体。 **约束限制**: 不涉及。
 */
public class ChangeDeploymentSolutionRequestBody {

    /**
     * **参数解释**: 变更后的目标部署形态。 **约束限制**: 必填。取值需为当前实例允许变更的目标形态。 **取值范围**: - logger：一主一备一日志节点 - triset：一主两备三节点  **默认取值**: 不涉及。
     */
    public static final class SolutionEnum {

        /**
         * Enum LOGGER for value: "logger"
         */
        public static final SolutionEnum LOGGER = new SolutionEnum("logger");

        /**
         * Enum TRISET for value: "triset"
         */
        public static final SolutionEnum TRISET = new SolutionEnum("triset");

        private static final Map<String, SolutionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SolutionEnum> createStaticFields() {
            Map<String, SolutionEnum> map = new HashMap<>();
            map.put("logger", LOGGER);
            map.put("triset", TRISET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SolutionEnum(String value) {
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
        public static SolutionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SolutionEnum(value));
        }

        public static SolutionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SolutionEnum) {
                return this.value.equals(((SolutionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private SolutionEnum solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_az")

    private String masterAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logger_az")

    private String loggerAz;

    public ChangeDeploymentSolutionRequestBody withSolution(SolutionEnum solution) {
        this.solution = solution;
        return this;
    }

    /**
     * **参数解释**: 变更后的目标部署形态。 **约束限制**: 必填。取值需为当前实例允许变更的目标形态。 **取值范围**: - logger：一主一备一日志节点 - triset：一主两备三节点  **默认取值**: 不涉及。
     * @return solution
     */
    public SolutionEnum getSolution() {
        return solution;
    }

    public void setSolution(SolutionEnum solution) {
        this.solution = solution;
    }

    public ChangeDeploymentSolutionRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**: 部署可用区，多个可用区以英文逗号\",\"隔开。 **约束限制**: 必填。不可包含 []()^%&\\\\'`|\";=?$<> 等特殊字符。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ChangeDeploymentSolutionRequestBody withMasterAz(String masterAz) {
        this.masterAz = masterAz;
        return this;
    }

    /**
     * **参数解释**: 主可用区。 **约束限制**: 不填时默认使用当前主可用区。 **取值范围**: 不涉及。 **默认取值**: 当前实例的主可用区。
     * @return masterAz
     */
    public String getMasterAz() {
        return masterAz;
    }

    public void setMasterAz(String masterAz) {
        this.masterAz = masterAz;
    }

    public ChangeDeploymentSolutionRequestBody withLoggerAz(String loggerAz) {
        this.loggerAz = loggerAz;
        return this;
    }

    /**
     * **参数解释**: 日志可用区。 **约束限制**: 带日志节点的部署形态（如 logger）需要传该参数。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return loggerAz
     */
    public String getLoggerAz() {
        return loggerAz;
    }

    public void setLoggerAz(String loggerAz) {
        this.loggerAz = loggerAz;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeDeploymentSolutionRequestBody that = (ChangeDeploymentSolutionRequestBody) obj;
        return Objects.equals(this.solution, that.solution)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.masterAz, that.masterAz) && Objects.equals(this.loggerAz, that.loggerAz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(solution, availabilityZone, masterAz, loggerAz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeDeploymentSolutionRequestBody {\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    masterAz: ").append(toIndentedString(masterAz)).append("\n");
        sb.append("    loggerAz: ").append(toIndentedString(loggerAz)).append("\n");
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
