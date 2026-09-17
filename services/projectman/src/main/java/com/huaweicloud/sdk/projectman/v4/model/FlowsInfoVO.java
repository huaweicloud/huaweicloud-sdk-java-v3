package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项流转线信息。
 */
public class FlowsInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_config")

    private List<Map<String, Object>> extraConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_code")

    private String fromCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_code")

    private String toCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_rule_configs")

    private List<WorkItemFlowRuleConfigVO> beforeRuleConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_rule_validator")

    private List<String> beforeRuleValidator = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_rule_configs")

    private List<WorkItemFlowRuleConfigVO> afterRuleConfigs = null;

    public FlowsInfoVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 流转线code。 **取值范围**： 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FlowsInfoVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 流转线名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowsInfoVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 流转线描述信息。 **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlowsInfoVO withExtraConfig(List<Map<String, Object>> extraConfig) {
        this.extraConfig = extraConfig;
        return this;
    }

    public FlowsInfoVO addExtraConfigItem(Map<String, Object> extraConfigItem) {
        if (this.extraConfig == null) {
            this.extraConfig = new ArrayList<>();
        }
        this.extraConfig.add(extraConfigItem);
        return this;
    }

    public FlowsInfoVO withExtraConfig(Consumer<List<Map<String, Object>>> extraConfigSetter) {
        if (this.extraConfig == null) {
            this.extraConfig = new ArrayList<>();
        }
        extraConfigSetter.accept(this.extraConfig);
        return this;
    }

    /**
     * **参数解释**： 流转线扩展配置。 **取值范围**： 不涉及。
     * @return extraConfig
     */
    public List<Map<String, Object>> getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(List<Map<String, Object>> extraConfig) {
        this.extraConfig = extraConfig;
    }

    public FlowsInfoVO withFromCode(String fromCode) {
        this.fromCode = fromCode;
        return this;
    }

    /**
     * **参数解释**： 当前工作流节点code。 **取值范围**： 不涉及。
     * @return fromCode
     */
    public String getFromCode() {
        return fromCode;
    }

    public void setFromCode(String fromCode) {
        this.fromCode = fromCode;
    }

    public FlowsInfoVO withToCode(String toCode) {
        this.toCode = toCode;
        return this;
    }

    /**
     * **参数解释**： 目标工作流节点code。 **取值范围**： 不涉及。
     * @return toCode
     */
    public String getToCode() {
        return toCode;
    }

    public void setToCode(String toCode) {
        this.toCode = toCode;
    }

    public FlowsInfoVO withBeforeRuleConfigs(List<WorkItemFlowRuleConfigVO> beforeRuleConfigs) {
        this.beforeRuleConfigs = beforeRuleConfigs;
        return this;
    }

    public FlowsInfoVO addBeforeRuleConfigsItem(WorkItemFlowRuleConfigVO beforeRuleConfigsItem) {
        if (this.beforeRuleConfigs == null) {
            this.beforeRuleConfigs = new ArrayList<>();
        }
        this.beforeRuleConfigs.add(beforeRuleConfigsItem);
        return this;
    }

    public FlowsInfoVO withBeforeRuleConfigs(Consumer<List<WorkItemFlowRuleConfigVO>> beforeRuleConfigsSetter) {
        if (this.beforeRuleConfigs == null) {
            this.beforeRuleConfigs = new ArrayList<>();
        }
        beforeRuleConfigsSetter.accept(this.beforeRuleConfigs);
        return this;
    }

    /**
     * **参数解释**： 流转前规则配置。 **取值范围**： 不涉及。
     * @return beforeRuleConfigs
     */
    public List<WorkItemFlowRuleConfigVO> getBeforeRuleConfigs() {
        return beforeRuleConfigs;
    }

    public void setBeforeRuleConfigs(List<WorkItemFlowRuleConfigVO> beforeRuleConfigs) {
        this.beforeRuleConfigs = beforeRuleConfigs;
    }

    public FlowsInfoVO withBeforeRuleValidator(List<String> beforeRuleValidator) {
        this.beforeRuleValidator = beforeRuleValidator;
        return this;
    }

    public FlowsInfoVO addBeforeRuleValidatorItem(String beforeRuleValidatorItem) {
        if (this.beforeRuleValidator == null) {
            this.beforeRuleValidator = new ArrayList<>();
        }
        this.beforeRuleValidator.add(beforeRuleValidatorItem);
        return this;
    }

    public FlowsInfoVO withBeforeRuleValidator(Consumer<List<String>> beforeRuleValidatorSetter) {
        if (this.beforeRuleValidator == null) {
            this.beforeRuleValidator = new ArrayList<>();
        }
        beforeRuleValidatorSetter.accept(this.beforeRuleValidator);
        return this;
    }

    /**
     * **参数解释**： 流转前校验规则。 **取值范围**： 不涉及。
     * @return beforeRuleValidator
     */
    public List<String> getBeforeRuleValidator() {
        return beforeRuleValidator;
    }

    public void setBeforeRuleValidator(List<String> beforeRuleValidator) {
        this.beforeRuleValidator = beforeRuleValidator;
    }

    public FlowsInfoVO withAfterRuleConfigs(List<WorkItemFlowRuleConfigVO> afterRuleConfigs) {
        this.afterRuleConfigs = afterRuleConfigs;
        return this;
    }

    public FlowsInfoVO addAfterRuleConfigsItem(WorkItemFlowRuleConfigVO afterRuleConfigsItem) {
        if (this.afterRuleConfigs == null) {
            this.afterRuleConfigs = new ArrayList<>();
        }
        this.afterRuleConfigs.add(afterRuleConfigsItem);
        return this;
    }

    public FlowsInfoVO withAfterRuleConfigs(Consumer<List<WorkItemFlowRuleConfigVO>> afterRuleConfigsSetter) {
        if (this.afterRuleConfigs == null) {
            this.afterRuleConfigs = new ArrayList<>();
        }
        afterRuleConfigsSetter.accept(this.afterRuleConfigs);
        return this;
    }

    /**
     * **参数解释**： 流转后规则配置。 **取值范围**： 不涉及。
     * @return afterRuleConfigs
     */
    public List<WorkItemFlowRuleConfigVO> getAfterRuleConfigs() {
        return afterRuleConfigs;
    }

    public void setAfterRuleConfigs(List<WorkItemFlowRuleConfigVO> afterRuleConfigs) {
        this.afterRuleConfigs = afterRuleConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowsInfoVO that = (FlowsInfoVO) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.extraConfig, that.extraConfig)
            && Objects.equals(this.fromCode, that.fromCode) && Objects.equals(this.toCode, that.toCode)
            && Objects.equals(this.beforeRuleConfigs, that.beforeRuleConfigs)
            && Objects.equals(this.beforeRuleValidator, that.beforeRuleValidator)
            && Objects.equals(this.afterRuleConfigs, that.afterRuleConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            name,
            description,
            extraConfig,
            fromCode,
            toCode,
            beforeRuleConfigs,
            beforeRuleValidator,
            afterRuleConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowsInfoVO {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    extraConfig: ").append(toIndentedString(extraConfig)).append("\n");
        sb.append("    fromCode: ").append(toIndentedString(fromCode)).append("\n");
        sb.append("    toCode: ").append(toIndentedString(toCode)).append("\n");
        sb.append("    beforeRuleConfigs: ").append(toIndentedString(beforeRuleConfigs)).append("\n");
        sb.append("    beforeRuleValidator: ").append(toIndentedString(beforeRuleValidator)).append("\n");
        sb.append("    afterRuleConfigs: ").append(toIndentedString(afterRuleConfigs)).append("\n");
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
