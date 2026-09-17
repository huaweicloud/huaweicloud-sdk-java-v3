package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项流转规则配置
 */
public class WorkItemFlowRuleConfigVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open")

    private Boolean open;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private List<WorkItemFlowFieldConfigVO> configValue = null;

    public WorkItemFlowRuleConfigVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 规则编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WorkItemFlowRuleConfigVO withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * 规则开关
     * @return open
     */
    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public WorkItemFlowRuleConfigVO withConfigValue(List<WorkItemFlowFieldConfigVO> configValue) {
        this.configValue = configValue;
        return this;
    }

    public WorkItemFlowRuleConfigVO addConfigValueItem(WorkItemFlowFieldConfigVO configValueItem) {
        if (this.configValue == null) {
            this.configValue = new ArrayList<>();
        }
        this.configValue.add(configValueItem);
        return this;
    }

    public WorkItemFlowRuleConfigVO withConfigValue(Consumer<List<WorkItemFlowFieldConfigVO>> configValueSetter) {
        if (this.configValue == null) {
            this.configValue = new ArrayList<>();
        }
        configValueSetter.accept(this.configValue);
        return this;
    }

    /**
     * 字段配置值列表
     * @return configValue
     */
    public List<WorkItemFlowFieldConfigVO> getConfigValue() {
        return configValue;
    }

    public void setConfigValue(List<WorkItemFlowFieldConfigVO> configValue) {
        this.configValue = configValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowRuleConfigVO that = (WorkItemFlowRuleConfigVO) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.open, that.open)
            && Objects.equals(this.configValue, that.configValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, open, configValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowRuleConfigVO {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
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
