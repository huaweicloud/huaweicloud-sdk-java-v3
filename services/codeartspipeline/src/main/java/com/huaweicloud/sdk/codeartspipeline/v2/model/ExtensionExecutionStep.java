package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行步骤
 */
public class ExtensionExecutionStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dslMethod")

    private String dslMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executionMode")

    private String executionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    public ExtensionExecutionStep withDslMethod(String dslMethod) {
        this.dslMethod = dslMethod;
        return this;
    }

    /**
     * DSL方法名，如 preOperationsNpm/sh/releasemanArtifactsUploader
     * @return dslMethod
     */
    public String getDslMethod() {
        return dslMethod;
    }

    public void setDslMethod(String dslMethod) {
        this.dslMethod = dslMethod;
    }

    public ExtensionExecutionStep withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 步骤显示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ExtensionExecutionStep withExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * 执行模式，如 serial
     * @return executionMode
     */
    public String getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    public ExtensionExecutionStep withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ExtensionExecutionStep putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ExtensionExecutionStep withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 步骤参数，键值对，值多为 $${...} 变量引用语法。
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionExecutionStep that = (ExtensionExecutionStep) obj;
        return Objects.equals(this.dslMethod, that.dslMethod) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.executionMode, that.executionMode)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dslMethod, displayName, executionMode, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionExecutionStep {\n");
        sb.append("    dslMethod: ").append(toIndentedString(dslMethod)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
