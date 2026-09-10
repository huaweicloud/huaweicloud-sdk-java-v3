package com.huaweicloud.sdk.agentarts.v1.model;

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
 * 创建智能体优化任务请求体。
 */
public class CreateOpsAgentTuningTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：**  任务类型，用于根据类型筛选任务。  **约束限制：**  不涉及 。  **取值范围：**  tool：工具，skill：技能。   **默认取值：**  无。
     */
    public static final class TypeEnum {

        /**
         * Enum TOOL for value: "tool"
         */
        public static final TypeEnum TOOL = new TypeEnum("tool");

        /**
         * Enum SKILL for value: "skill"
         */
        public static final TypeEnum SKILL = new TypeEnum("skill");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("tool", TOOL);
            map.put("skill", SKILL);
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
    @JsonProperty(value = "agent")

    private OpsAgentTuningTaskAgent agent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_target")

    private OpsTuningTarget tuningTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_duration")

    private OpsSampleDuration sampleDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_strategy")

    private OpsSampleStrategy sampleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    public CreateOpsAgentTuningTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 任务名称，用于标识和区分不同的智能体优化任务。  **约束限制：** 不涉及  **取值范围：** 长度2-64个字符，支持中文、字母、数字、中划线及下划线。  **默认取值：** 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOpsAgentTuningTaskRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 任务的详细描述，用于记录任务目的或备注信息。  **约束限制：** 不涉及  **取值范围：** 长度0-1024个字符。  **默认取值：** 无
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateOpsAgentTuningTaskRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  任务类型，用于根据类型筛选任务。  **约束限制：**  不涉及 。  **取值范围：**  tool：工具，skill：技能。   **默认取值：**  无。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateOpsAgentTuningTaskRequestBody withAgent(OpsAgentTuningTaskAgent agent) {
        this.agent = agent;
        return this;
    }

    public CreateOpsAgentTuningTaskRequestBody withAgent(Consumer<OpsAgentTuningTaskAgent> agentSetter) {
        if (this.agent == null) {
            this.agent = new OpsAgentTuningTaskAgent();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public OpsAgentTuningTaskAgent getAgent() {
        return agent;
    }

    public void setAgent(OpsAgentTuningTaskAgent agent) {
        this.agent = agent;
    }

    public CreateOpsAgentTuningTaskRequestBody withTuningTarget(OpsTuningTarget tuningTarget) {
        this.tuningTarget = tuningTarget;
        return this;
    }

    public CreateOpsAgentTuningTaskRequestBody withTuningTarget(Consumer<OpsTuningTarget> tuningTargetSetter) {
        if (this.tuningTarget == null) {
            this.tuningTarget = new OpsTuningTarget();
            tuningTargetSetter.accept(this.tuningTarget);
        }

        return this;
    }

    /**
     * Get tuningTarget
     * @return tuningTarget
     */
    public OpsTuningTarget getTuningTarget() {
        return tuningTarget;
    }

    public void setTuningTarget(OpsTuningTarget tuningTarget) {
        this.tuningTarget = tuningTarget;
    }

    public CreateOpsAgentTuningTaskRequestBody withSampleDuration(OpsSampleDuration sampleDuration) {
        this.sampleDuration = sampleDuration;
        return this;
    }

    public CreateOpsAgentTuningTaskRequestBody withSampleDuration(Consumer<OpsSampleDuration> sampleDurationSetter) {
        if (this.sampleDuration == null) {
            this.sampleDuration = new OpsSampleDuration();
            sampleDurationSetter.accept(this.sampleDuration);
        }

        return this;
    }

    /**
     * Get sampleDuration
     * @return sampleDuration
     */
    public OpsSampleDuration getSampleDuration() {
        return sampleDuration;
    }

    public void setSampleDuration(OpsSampleDuration sampleDuration) {
        this.sampleDuration = sampleDuration;
    }

    public CreateOpsAgentTuningTaskRequestBody withSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
        return this;
    }

    public CreateOpsAgentTuningTaskRequestBody withSampleStrategy(Consumer<OpsSampleStrategy> sampleStrategySetter) {
        if (this.sampleStrategy == null) {
            this.sampleStrategy = new OpsSampleStrategy();
            sampleStrategySetter.accept(this.sampleStrategy);
        }

        return this;
    }

    /**
     * Get sampleStrategy
     * @return sampleStrategy
     */
    public OpsSampleStrategy getSampleStrategy() {
        return sampleStrategy;
    }

    public void setSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
    }

    public CreateOpsAgentTuningTaskRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，赋予服务访问用户资源的权限。  **约束限制：** 必须是IAM中已创建的有效委托。  **取值范围：** 合法的委托名称字符串。  **默认取值：** 无
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateOpsAgentTuningTaskRequestBody withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public CreateOpsAgentTuningTaskRequestBody addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateOpsAgentTuningTaskRequestBody withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表，用于资源分类。  **约束限制：** 不涉及  **取值范围：** 数组长度0-20。  **默认取值：** 空数组
     * @return tags
     */
    public List<OpsTasksTagForTMS> getTags() {
        return tags;
    }

    public void setTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsAgentTuningTaskRequestBody that = (CreateOpsAgentTuningTaskRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.agent, that.agent)
            && Objects.equals(this.tuningTarget, that.tuningTarget)
            && Objects.equals(this.sampleDuration, that.sampleDuration)
            && Objects.equals(this.sampleStrategy, that.sampleStrategy)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, type, agent, tuningTarget, sampleDuration, sampleStrategy, agencyName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsAgentTuningTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    tuningTarget: ").append(toIndentedString(tuningTarget)).append("\n");
        sb.append("    sampleDuration: ").append(toIndentedString(sampleDuration)).append("\n");
        sb.append("    sampleStrategy: ").append(toIndentedString(sampleStrategy)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
