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
 * 奖励规则。
 */
public class OpsTuningRewardSetting {

    /**
     * **参数解释：** 奖励类型，决定采用何种方式评估模型输出质量。  **约束限制：** 不涉及  **取值范围：** rule：规则奖励，基于预定义规则进行评分；generative：生成式奖励，使用判别模型进行评分；code：基于代码进行评分。  **默认取值：** 无
     */
    public static final class RewardTypeEnum {

        /**
         * Enum RULE for value: "rule"
         */
        public static final RewardTypeEnum RULE = new RewardTypeEnum("rule");

        /**
         * Enum GENERATIVE for value: "generative"
         */
        public static final RewardTypeEnum GENERATIVE = new RewardTypeEnum("generative");

        /**
         * Enum CODE for value: "code"
         */
        public static final RewardTypeEnum CODE = new RewardTypeEnum("code");

        private static final Map<String, RewardTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RewardTypeEnum> createStaticFields() {
            Map<String, RewardTypeEnum> map = new HashMap<>();
            map.put("rule", RULE);
            map.put("generative", GENERATIVE);
            map.put("code", CODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RewardTypeEnum(String value) {
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
        public static RewardTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RewardTypeEnum(value));
        }

        public static RewardTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RewardTypeEnum) {
                return this.value.equals(((RewardTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reward_type")

    private RewardTypeEnum rewardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apikey_credential_provider")

    private String apikeyCredentialProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rubric")

    private String rubric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<OpsTuningRewardRule> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_interpreter_id")

    private String codeInterpreterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public OpsTuningRewardSetting withRewardType(RewardTypeEnum rewardType) {
        this.rewardType = rewardType;
        return this;
    }

    /**
     * **参数解释：** 奖励类型，决定采用何种方式评估模型输出质量。  **约束限制：** 不涉及  **取值范围：** rule：规则奖励，基于预定义规则进行评分；generative：生成式奖励，使用判别模型进行评分；code：基于代码进行评分。  **默认取值：** 无
     * @return rewardType
     */
    public RewardTypeEnum getRewardType() {
        return rewardType;
    }

    public void setRewardType(RewardTypeEnum rewardType) {
        this.rewardType = rewardType;
    }

    public OpsTuningRewardSetting withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 模型名称，用于生成式奖励打分的裁判模型。  **约束限制：** generative类型必填。  **取值范围：** 支持的判别模型名称字符串。  **默认取值：** 无
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public OpsTuningRewardSetting withApikeyCredentialProvider(String apikeyCredentialProvider) {
        this.apikeyCredentialProvider = apikeyCredentialProvider;
        return this;
    }

    /**
     * **参数解释：** API密钥凭证提供者，用于访问判别模型的认证信息。  **约束限制：** generative类型必填。  **取值范围：** 平台中配置的凭证名称。  **默认取值：** 无
     * @return apikeyCredentialProvider
     */
    public String getApikeyCredentialProvider() {
        return apikeyCredentialProvider;
    }

    public void setApikeyCredentialProvider(String apikeyCredentialProvider) {
        this.apikeyCredentialProvider = apikeyCredentialProvider;
    }

    public OpsTuningRewardSetting withRubric(String rubric) {
        this.rubric = rubric;
        return this;
    }

    /**
     * **参数解释：** 评分标准，指导判别模型进行评分的提示词内容。  **约束限制：** generative类型必填。  **取值范围：** 长度0-4096个字符的提示词。  **默认取值：** 无
     * @return rubric
     */
    public String getRubric() {
        return rubric;
    }

    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    public OpsTuningRewardSetting withRules(List<OpsTuningRewardRule> rules) {
        this.rules = rules;
        return this;
    }

    public OpsTuningRewardSetting addRulesItem(OpsTuningRewardRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public OpsTuningRewardSetting withRules(Consumer<List<OpsTuningRewardRule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * **参数解释：** 规则列表，定义具体的规则奖励函数。  **约束限制：** rule类型必填。  **取值范围：** 数组长度1-10。  **默认取值：** 无
     * @return rules
     */
    public List<OpsTuningRewardRule> getRules() {
        return rules;
    }

    public void setRules(List<OpsTuningRewardRule> rules) {
        this.rules = rules;
    }

    public OpsTuningRewardSetting withCodeInterpreterId(String codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
        return this;
    }

    /**
     * **参数解释：** 代码解释器ID，可通过[查询代码解释器列表](https://support.huaweicloud.com/api-agentarts/ListCoreCodeInterpreters.html)接口获取。  **约束限制：** code类型必填。  **取值范围：** 符合UUID正则^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$的36位字符串。  **默认取值：** 不涉及。
     * @return codeInterpreterId
     */
    public String getCodeInterpreterId() {
        return codeInterpreterId;
    }

    public void setCodeInterpreterId(String codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
    }

    public OpsTuningRewardSetting withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 计算奖励的代码片段。  **约束限制：** code类型必填。  **取值范围：** 最大长度4000。  **默认取值：** 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningRewardSetting that = (OpsTuningRewardSetting) obj;
        return Objects.equals(this.rewardType, that.rewardType) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.apikeyCredentialProvider, that.apikeyCredentialProvider)
            && Objects.equals(this.rubric, that.rubric) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.codeInterpreterId, that.codeInterpreterId) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewardType, modelName, apikeyCredentialProvider, rubric, rules, codeInterpreterId, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningRewardSetting {\n");
        sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    apikeyCredentialProvider: ").append(toIndentedString(apikeyCredentialProvider)).append("\n");
        sb.append("    rubric: ").append(toIndentedString(rubric)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    codeInterpreterId: ").append(toIndentedString(codeInterpreterId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
