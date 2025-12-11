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
 * Request Object
 */
public class ShowDeploymentFormRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    /**
     * 解决方案模板名称。
     */
    public static final class SolutionEnum {

        /**
         * Enum TRISET for value: "triset"
         */
        public static final SolutionEnum TRISET = new SolutionEnum("triset");

        /**
         * Enum SINGLE for value: "single"
         */
        public static final SolutionEnum SINGLE = new SolutionEnum("single");

        private static final Map<String, SolutionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SolutionEnum> createStaticFields() {
            Map<String, SolutionEnum> map = new HashMap<>();
            map.put("triset", TRISET);
            map.put("single", SINGLE);
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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency")

    private String consistency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency_protocol")

    private String consistencyProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    public ShowDeploymentFormRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowDeploymentFormRequest withSolution(SolutionEnum solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 解决方案模板名称。
     * @return solution
     */
    public SolutionEnum getSolution() {
        return solution;
    }

    public void setSolution(SolutionEnum solution) {
        this.solution = solution;
    }

    public ShowDeploymentFormRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowDeploymentFormRequest withConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }

    /**
     * **参数解释**: 事务一致性类型。 **约束限制**: 不涉及。 **取值范围**: - strong - eventual **默认取值**: 不涉及。
     * @return consistency
     */
    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

    public ShowDeploymentFormRequest withConsistencyProtocol(String consistencyProtocol) {
        this.consistencyProtocol = consistencyProtocol;
        return this;
    }

    /**
     * **参数解释**: 副本一致性协议类型。 **约束限制**: 不涉及。 **取值范围**: - quorum - paxos **默认取值**: 不涉及。
     * @return consistencyProtocol
     */
    public String getConsistencyProtocol() {
        return consistencyProtocol;
    }

    public void setConsistencyProtocol(String consistencyProtocol) {
        this.consistencyProtocol = consistencyProtocol;
    }

    public ShowDeploymentFormRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**: 引擎版本号。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeploymentFormRequest that = (ShowDeploymentFormRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.consistency, that.consistency)
            && Objects.equals(this.consistencyProtocol, that.consistencyProtocol)
            && Objects.equals(this.engineVersion, that.engineVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, solution, instanceId, consistency, consistencyProtocol, engineVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeploymentFormRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
        sb.append("    consistencyProtocol: ").append(toIndentedString(consistencyProtocol)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
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
