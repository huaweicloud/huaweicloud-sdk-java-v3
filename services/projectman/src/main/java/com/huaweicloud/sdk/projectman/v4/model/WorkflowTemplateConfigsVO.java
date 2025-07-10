package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 状态流流转线流转配置信息
 */
public class WorkflowTemplateConfigsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configValue")

    private List<Map<String, Object>> configValue = null;

    public WorkflowTemplateConfigsVO withConfigValue(List<Map<String, Object>> configValue) {
        this.configValue = configValue;
        return this;
    }

    public WorkflowTemplateConfigsVO addConfigValueItem(Map<String, Object> configValueItem) {
        if (this.configValue == null) {
            this.configValue = new ArrayList<>();
        }
        this.configValue.add(configValueItem);
        return this;
    }

    public WorkflowTemplateConfigsVO withConfigValue(Consumer<List<Map<String, Object>>> configValueSetter) {
        if (this.configValue == null) {
            this.configValue = new ArrayList<>();
        }
        configValueSetter.accept(this.configValue);
        return this;
    }

    /**
     * 操作项配置
     * @return configValue
     */
    public List<Map<String, Object>> getConfigValue() {
        return configValue;
    }

    public void setConfigValue(List<Map<String, Object>> configValue) {
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
        WorkflowTemplateConfigsVO that = (WorkflowTemplateConfigsVO) obj;
        return Objects.equals(this.configValue, that.configValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTemplateConfigsVO {\n");
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
