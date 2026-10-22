package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAuraJobV2
 */
public class UpdateAuraJobV2 {

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：AuraJobV2。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum AURAJOBV2 for value: "AuraJobV2"
         */
        public static final TypeEnum AURAJOBV2 = new TypeEnum("AuraJobV2");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("AuraJobV2", AURAJOBV2);
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
    @JsonProperty(value = "worker_group_config")

    private List<WorkerGroupConfig> workerGroupConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_cpu_resource")

    private Boolean expandCpuResource;

    public UpdateAuraJobV2 withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：AuraJobV2。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateAuraJobV2 withWorkerGroupConfig(List<WorkerGroupConfig> workerGroupConfig) {
        this.workerGroupConfig = workerGroupConfig;
        return this;
    }

    public UpdateAuraJobV2 addWorkerGroupConfigItem(WorkerGroupConfig workerGroupConfigItem) {
        if (this.workerGroupConfig == null) {
            this.workerGroupConfig = new ArrayList<>();
        }
        this.workerGroupConfig.add(workerGroupConfigItem);
        return this;
    }

    public UpdateAuraJobV2 withWorkerGroupConfig(Consumer<List<WorkerGroupConfig>> workerGroupConfigSetter) {
        if (this.workerGroupConfig == null) {
            this.workerGroupConfig = new ArrayList<>();
        }
        workerGroupConfigSetter.accept(this.workerGroupConfig);
        return this;
    }

    /**
     * **参数解释**：工作组补充配置，和外部capacity对应。 **约束限制**：最多10个。
     * @return workerGroupConfig
     */
    public List<WorkerGroupConfig> getWorkerGroupConfig() {
        return workerGroupConfig;
    }

    public void setWorkerGroupConfig(List<WorkerGroupConfig> workerGroupConfig) {
        this.workerGroupConfig = workerGroupConfig;
    }

    public UpdateAuraJobV2 withExpandCpuResource(Boolean expandCpuResource) {
        this.expandCpuResource = expandCpuResource;
        return this;
    }

    /**
     * **参数解释**：开启后，通算工作组作业能够使用智算工作组空闲CPU及内存资源，该操作可能会导致智算任务因资源不足而排队。 **约束限制**：不涉及。 **取值范围**：   - true：开启通算工作组作业使用智算工作组空闲CPU及内存资源。   - false：关闭通算工作组作业使用智算工作组空闲CPU及内存资源。 **默认取值**：false。
     * @return expandCpuResource
     */
    public Boolean getExpandCpuResource() {
        return expandCpuResource;
    }

    public void setExpandCpuResource(Boolean expandCpuResource) {
        this.expandCpuResource = expandCpuResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAuraJobV2 that = (UpdateAuraJobV2) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.workerGroupConfig, that.workerGroupConfig)
            && Objects.equals(this.expandCpuResource, that.expandCpuResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, workerGroupConfig, expandCpuResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuraJobV2 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workerGroupConfig: ").append(toIndentedString(workerGroupConfig)).append("\n");
        sb.append("    expandCpuResource: ").append(toIndentedString(expandCpuResource)).append("\n");
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
