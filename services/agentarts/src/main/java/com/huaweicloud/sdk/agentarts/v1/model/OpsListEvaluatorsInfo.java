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
 * OpsListEvaluatorsInfo
 */
public class OpsListEvaluatorsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private OpsEvaluatorBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    /**
     * **参数解释：** 评估器的对话轮次类型。 **约束限制：** 不涉及。 **取值范围：** - single：单轮 - multi：多轮 
     */
    public static final class TurnTypeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final TurnTypeEnum SINGLE = new TurnTypeEnum("single");

        /**
         * Enum MULTI for value: "multi"
         */
        public static final TurnTypeEnum MULTI = new TurnTypeEnum("multi");

        private static final Map<String, TurnTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TurnTypeEnum> createStaticFields() {
            Map<String, TurnTypeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("multi", MULTI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TurnTypeEnum(String value) {
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
        public static TurnTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TurnTypeEnum(value));
        }

        public static TurnTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TurnTypeEnum) {
                return this.value.equals(((TurnTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turn_type")

    private TurnTypeEnum turnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private EvaluationOpsCurrentVersion currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version_id")

    private String currentVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_count")

    private Long referenceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTag> tags = null;

    public OpsListEvaluatorsInfo withBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public OpsListEvaluatorsInfo withBaseInfo(Consumer<OpsEvaluatorBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new OpsEvaluatorBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public OpsEvaluatorBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(OpsEvaluatorBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public OpsListEvaluatorsInfo withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public OpsListEvaluatorsInfo withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * **参数解释：** 评估器所属的租户账号ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OpsListEvaluatorsInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估器的名称，用于界面展示和检索。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsListEvaluatorsInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 评估器的功能描述或业务用途说明。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpsListEvaluatorsInfo withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释：** 评估器的类型编码，用于区分不同的逻辑实现（如自定义评估器或系统评估器）。 **约束限制：** 不涉及。 **取值范围：** - 1：模型评估器 - 2：代码评估器 - 3：自适应评估器（自适应评估模式，可根据上下文与历史结果动态调整评判规则） 
     * minimum: 0
     * maximum: 2147483647
     * @return evaluatorType
     */
    public Integer getEvaluatorType() {
        return evaluatorType;
    }

    public void setEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
    }

    public OpsListEvaluatorsInfo withTurnType(TurnTypeEnum turnType) {
        this.turnType = turnType;
        return this;
    }

    /**
     * **参数解释：** 评估器的对话轮次类型。 **约束限制：** 不涉及。 **取值范围：** - single：单轮 - multi：多轮 
     * @return turnType
     */
    public TurnTypeEnum getTurnType() {
        return turnType;
    }

    public void setTurnType(TurnTypeEnum turnType) {
        this.turnType = turnType;
    }

    public OpsListEvaluatorsInfo withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释：** 评估器的最新发布的版本号。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public OpsListEvaluatorsInfo withCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public OpsListEvaluatorsInfo withCurrentVersion(Consumer<EvaluationOpsCurrentVersion> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new EvaluationOpsCurrentVersion();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public EvaluationOpsCurrentVersion getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    public OpsListEvaluatorsInfo withCurrentVersionId(String currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }

    /**
     * **参数解释：** 评估器当前生效版本的唯一标识符。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return currentVersionId
     */
    public String getCurrentVersionId() {
        return currentVersionId;
    }

    public void setCurrentVersionId(String currentVersionId) {
        this.currentVersionId = currentVersionId;
    }

    public OpsListEvaluatorsInfo withReferenceCount(Long referenceCount) {
        this.referenceCount = referenceCount;
        return this;
    }

    /**
     * **参数解释：** 该评估器被评估任务引用的次数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。 
     * @return referenceCount
     */
    public Long getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(Long referenceCount) {
        this.referenceCount = referenceCount;
    }

    public OpsListEvaluatorsInfo withTags(List<OpsTmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public OpsListEvaluatorsInfo addTagsItem(OpsTmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpsListEvaluatorsInfo withTags(Consumer<List<OpsTmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 评估器绑定的TMS标签列表。数组元素引用OpsTmsTag对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 
     * @return tags
     */
    public List<OpsTmsTag> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTag> tags) {
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
        OpsListEvaluatorsInfo that = (OpsListEvaluatorsInfo) obj;
        return Objects.equals(this.baseInfo, that.baseInfo) && Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.evaluatorType, that.evaluatorType) && Objects.equals(this.turnType, that.turnType)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.currentVersionId, that.currentVersionId)
            && Objects.equals(this.referenceCount, that.referenceCount) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseInfo,
            evaluatorId,
            accountId,
            name,
            description,
            evaluatorType,
            turnType,
            latestVersion,
            currentVersion,
            currentVersionId,
            referenceCount,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsListEvaluatorsInfo {\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    turnType: ").append(toIndentedString(turnType)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    currentVersionId: ").append(toIndentedString(currentVersionId)).append("\n");
        sb.append("    referenceCount: ").append(toIndentedString(referenceCount)).append("\n");
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
