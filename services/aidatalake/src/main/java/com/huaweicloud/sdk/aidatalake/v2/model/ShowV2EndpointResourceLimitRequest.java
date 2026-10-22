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
 * Request Object
 */
public class ShowV2EndpointResourceLimitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * **参数解释**：端点引擎类型。 **约束限制**：不涉及。 **取值范围**：   - AuraJob：AuraJob引擎。   - SparkSql：SparkSql引擎。   - SparkJob：SparkJob引擎。   - FlinkJob：FlinkJob引擎。   - AuraJobV2作业管理：AuraJobV2引擎。   - RayJob：RayJob引擎。   - RayCluster：RayCluster引擎。   - RayService：RayService引擎。 **默认取值**：不涉及。 
     */
    public static final class EngineTypeEnum {

        /**
         * Enum AURAJOB for value: "AuraJob"
         */
        public static final EngineTypeEnum AURAJOB = new EngineTypeEnum("AuraJob");

        /**
         * Enum SPARKSQL for value: "SparkSql"
         */
        public static final EngineTypeEnum SPARKSQL = new EngineTypeEnum("SparkSql");

        /**
         * Enum SPARKJOB for value: "SparkJob"
         */
        public static final EngineTypeEnum SPARKJOB = new EngineTypeEnum("SparkJob");

        /**
         * Enum FLINKJOB for value: "FlinkJob"
         */
        public static final EngineTypeEnum FLINKJOB = new EngineTypeEnum("FlinkJob");

        /**
         * Enum AURAJOBV2_ for value: "AuraJobV2作业管理"
         */
        public static final EngineTypeEnum AURAJOBV2_ = new EngineTypeEnum("AuraJobV2作业管理");

        /**
         * Enum RAYJOB for value: "RayJob"
         */
        public static final EngineTypeEnum RAYJOB = new EngineTypeEnum("RayJob");

        /**
         * Enum RAYCLUSTER for value: "RayCluster"
         */
        public static final EngineTypeEnum RAYCLUSTER = new EngineTypeEnum("RayCluster");

        /**
         * Enum RAYSERVICE for value: "RayService"
         */
        public static final EngineTypeEnum RAYSERVICE = new EngineTypeEnum("RayService");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("AuraJob", AURAJOB);
            map.put("SparkSql", SPARKSQL);
            map.put("SparkJob", SPARKJOB);
            map.put("FlinkJob", FLINKJOB);
            map.put("AuraJobV2作业管理", AURAJOBV2_);
            map.put("RayJob", RAYJOB);
            map.put("RayCluster", RAYCLUSTER);
            map.put("RayService", RAYSERVICE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private EngineTypeEnum engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_id")

    private String computeId;

    public ShowV2EndpointResourceLimitRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID，可通过[获取工作空间ID](aidatalake_02_0044.xml)获取。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowV2EndpointResourceLimitRequest withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * **参数解释**：端点引擎类型。 **约束限制**：不涉及。 **取值范围**：   - AuraJob：AuraJob引擎。   - SparkSql：SparkSql引擎。   - SparkJob：SparkJob引擎。   - FlinkJob：FlinkJob引擎。   - AuraJobV2作业管理：AuraJobV2引擎。   - RayJob：RayJob引擎。   - RayCluster：RayCluster引擎。   - RayService：RayService引擎。 **默认取值**：不涉及。 
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public ShowV2EndpointResourceLimitRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：端点ID，可通过[查询端点列表](ListV2Endpoints.xml)获取端点ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowV2EndpointResourceLimitRequest withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * **参数解释**：计算资源ID，可通过[查询计算资源列表](ListV2Computes.xml)获取计算资源ID。 **约束限制**：不涉及。 **取值范围**：长度为1-36个英文字母、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return computeId
     */
    public String getComputeId() {
        return computeId;
    }

    public void setComputeId(String computeId) {
        this.computeId = computeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowV2EndpointResourceLimitRequest that = (ShowV2EndpointResourceLimitRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.id, that.id) && Objects.equals(this.computeId, that.computeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, engineType, id, computeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2EndpointResourceLimitRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
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
