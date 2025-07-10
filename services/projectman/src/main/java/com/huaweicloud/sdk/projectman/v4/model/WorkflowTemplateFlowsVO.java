package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 状态流中流转线信息
 */
public class WorkflowTemplateFlowsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_rule_validator")

    private List<WorkflowTemplateConfigsVO> beforeRuleValidator = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_rule_configs")

    private List<WorkflowTemplateConfigsVO> beforeRuleConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_code")

    private String fromCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_code")

    private String toCode;

    public WorkflowTemplateFlowsVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 流转线编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WorkflowTemplateFlowsVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流转线名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowTemplateFlowsVO withBeforeRuleValidator(List<WorkflowTemplateConfigsVO> beforeRuleValidator) {
        this.beforeRuleValidator = beforeRuleValidator;
        return this;
    }

    public WorkflowTemplateFlowsVO addBeforeRuleValidatorItem(WorkflowTemplateConfigsVO beforeRuleValidatorItem) {
        if (this.beforeRuleValidator == null) {
            this.beforeRuleValidator = new ArrayList<>();
        }
        this.beforeRuleValidator.add(beforeRuleValidatorItem);
        return this;
    }

    public WorkflowTemplateFlowsVO withBeforeRuleValidator(
        Consumer<List<WorkflowTemplateConfigsVO>> beforeRuleValidatorSetter) {
        if (this.beforeRuleValidator == null) {
            this.beforeRuleValidator = new ArrayList<>();
        }
        beforeRuleValidatorSetter.accept(this.beforeRuleValidator);
        return this;
    }

    /**
     * 流转前校验配置
     * @return beforeRuleValidator
     */
    public List<WorkflowTemplateConfigsVO> getBeforeRuleValidator() {
        return beforeRuleValidator;
    }

    public void setBeforeRuleValidator(List<WorkflowTemplateConfigsVO> beforeRuleValidator) {
        this.beforeRuleValidator = beforeRuleValidator;
    }

    public WorkflowTemplateFlowsVO withBeforeRuleConfigs(List<WorkflowTemplateConfigsVO> beforeRuleConfigs) {
        this.beforeRuleConfigs = beforeRuleConfigs;
        return this;
    }

    public WorkflowTemplateFlowsVO addBeforeRuleConfigsItem(WorkflowTemplateConfigsVO beforeRuleConfigsItem) {
        if (this.beforeRuleConfigs == null) {
            this.beforeRuleConfigs = new ArrayList<>();
        }
        this.beforeRuleConfigs.add(beforeRuleConfigsItem);
        return this;
    }

    public WorkflowTemplateFlowsVO withBeforeRuleConfigs(
        Consumer<List<WorkflowTemplateConfigsVO>> beforeRuleConfigsSetter) {
        if (this.beforeRuleConfigs == null) {
            this.beforeRuleConfigs = new ArrayList<>();
        }
        beforeRuleConfigsSetter.accept(this.beforeRuleConfigs);
        return this;
    }

    /**
     * 流转中界面配置
     * @return beforeRuleConfigs
     */
    public List<WorkflowTemplateConfigsVO> getBeforeRuleConfigs() {
        return beforeRuleConfigs;
    }

    public void setBeforeRuleConfigs(List<WorkflowTemplateConfigsVO> beforeRuleConfigs) {
        this.beforeRuleConfigs = beforeRuleConfigs;
    }

    public WorkflowTemplateFlowsVO withFromCode(String fromCode) {
        this.fromCode = fromCode;
        return this;
    }

    /**
     * 流转线的入口状态
     * @return fromCode
     */
    public String getFromCode() {
        return fromCode;
    }

    public void setFromCode(String fromCode) {
        this.fromCode = fromCode;
    }

    public WorkflowTemplateFlowsVO withToCode(String toCode) {
        this.toCode = toCode;
        return this;
    }

    /**
     * 流转线的出口状态
     * @return toCode
     */
    public String getToCode() {
        return toCode;
    }

    public void setToCode(String toCode) {
        this.toCode = toCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowTemplateFlowsVO that = (WorkflowTemplateFlowsVO) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.name, that.name)
            && Objects.equals(this.beforeRuleValidator, that.beforeRuleValidator)
            && Objects.equals(this.beforeRuleConfigs, that.beforeRuleConfigs)
            && Objects.equals(this.fromCode, that.fromCode) && Objects.equals(this.toCode, that.toCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, beforeRuleValidator, beforeRuleConfigs, fromCode, toCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTemplateFlowsVO {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    beforeRuleValidator: ").append(toIndentedString(beforeRuleValidator)).append("\n");
        sb.append("    beforeRuleConfigs: ").append(toIndentedString(beforeRuleConfigs)).append("\n");
        sb.append("    fromCode: ").append(toIndentedString(fromCode)).append("\n");
        sb.append("    toCode: ").append(toIndentedString(toCode)).append("\n");
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
