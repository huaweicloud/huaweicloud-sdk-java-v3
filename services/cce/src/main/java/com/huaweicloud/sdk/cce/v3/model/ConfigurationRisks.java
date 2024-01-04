package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置风险项来源
 */
public class ConfigurationRisks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private String _package;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceFile")

    private String sourceFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeMsg")

    private String nodeMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "originalValue")

    private String originalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ConfigurationRisks withPackage(String _package) {
        this._package = _package;
        return this;
    }

    /**
     * 组件名称
     * @return _package
     */
    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public ConfigurationRisks withSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
        return this;
    }

    /**
     * 涉及文件路径
     * @return sourceFile
     */
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public ConfigurationRisks withNodeMsg(String nodeMsg) {
        this.nodeMsg = nodeMsg;
        return this;
    }

    /**
     * 节点信息
     * @return nodeMsg
     */
    public String getNodeMsg() {
        return nodeMsg;
    }

    public void setNodeMsg(String nodeMsg) {
        this.nodeMsg = nodeMsg;
    }

    public ConfigurationRisks withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 参数值
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ConfigurationRisks withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 修改操作类型
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ConfigurationRisks withOriginalValue(String originalValue) {
        this.originalValue = originalValue;
        return this;
    }

    /**
     * 原始值
     * @return originalValue
     */
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public ConfigurationRisks withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 当前值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationRisks that = (ConfigurationRisks) obj;
        return Objects.equals(this._package, that._package) && Objects.equals(this.sourceFile, that.sourceFile)
            && Objects.equals(this.nodeMsg, that.nodeMsg) && Objects.equals(this.field, that.field)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.originalValue, that.originalValue)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_package, sourceFile, nodeMsg, field, operation, originalValue, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationRisks {\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
        sb.append("    nodeMsg: ").append(toIndentedString(nodeMsg)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
