package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBasicPluginResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "friendly_name")

    private String friendlyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<NewExtensionInputs> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_bindings")

    private List<NewExtensionDataSourceBindings> dataSourceBindings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<NewExtensionOutputs> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution")

    private NewExtensionExecution execution;

    public ShowBasicPluginResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 插件类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowBasicPluginResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 插件名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBasicPluginResponse withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * **参数解释**： 插件展示名。 **取值范围**： 不涉及。 
     * @return friendlyName
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public ShowBasicPluginResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 业务类型。 **取值范围**： 不涉及。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowBasicPluginResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 插件描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowBasicPluginResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 插件版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowBasicPluginResponse withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * **参数解释**： 插件版本说明。 **取值范围**： 不涉及。 
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public ShowBasicPluginResponse withInputs(List<NewExtensionInputs> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ShowBasicPluginResponse addInputsItem(NewExtensionInputs inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ShowBasicPluginResponse withInputs(Consumer<List<NewExtensionInputs>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**： 输入信息。 **取值范围**： 不涉及。 
     * @return inputs
     */
    public List<NewExtensionInputs> getInputs() {
        return inputs;
    }

    public void setInputs(List<NewExtensionInputs> inputs) {
        this.inputs = inputs;
    }

    public ShowBasicPluginResponse withDataSourceBindings(List<NewExtensionDataSourceBindings> dataSourceBindings) {
        this.dataSourceBindings = dataSourceBindings;
        return this;
    }

    public ShowBasicPluginResponse addDataSourceBindingsItem(NewExtensionDataSourceBindings dataSourceBindingsItem) {
        if (this.dataSourceBindings == null) {
            this.dataSourceBindings = new ArrayList<>();
        }
        this.dataSourceBindings.add(dataSourceBindingsItem);
        return this;
    }

    public ShowBasicPluginResponse withDataSourceBindings(
        Consumer<List<NewExtensionDataSourceBindings>> dataSourceBindingsSetter) {
        if (this.dataSourceBindings == null) {
            this.dataSourceBindings = new ArrayList<>();
        }
        dataSourceBindingsSetter.accept(this.dataSourceBindings);
        return this;
    }

    /**
     * **参数解释**： 数据源绑定信息。 **取值范围**： 不涉及。 
     * @return dataSourceBindings
     */
    public List<NewExtensionDataSourceBindings> getDataSourceBindings() {
        return dataSourceBindings;
    }

    public void setDataSourceBindings(List<NewExtensionDataSourceBindings> dataSourceBindings) {
        this.dataSourceBindings = dataSourceBindings;
    }

    public ShowBasicPluginResponse withOutputs(List<NewExtensionOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }

    public ShowBasicPluginResponse addOutputsItem(NewExtensionOutputs outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public ShowBasicPluginResponse withOutputs(Consumer<List<NewExtensionOutputs>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * **参数解释**： 输出信息。 **取值范围**： 不涉及。 
     * @return outputs
     */
    public List<NewExtensionOutputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<NewExtensionOutputs> outputs) {
        this.outputs = outputs;
    }

    public ShowBasicPluginResponse withExecution(NewExtensionExecution execution) {
        this.execution = execution;
        return this;
    }

    public ShowBasicPluginResponse withExecution(Consumer<NewExtensionExecution> executionSetter) {
        if (this.execution == null) {
            this.execution = new NewExtensionExecution();
            executionSetter.accept(this.execution);
        }

        return this;
    }

    /**
     * Get execution
     * @return execution
     */
    public NewExtensionExecution getExecution() {
        return execution;
    }

    public void setExecution(NewExtensionExecution execution) {
        this.execution = execution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBasicPluginResponse that = (ShowBasicPluginResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.friendlyName, that.friendlyName) && Objects.equals(this.category, that.category)
            && Objects.equals(this.description, that.description) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.dataSourceBindings, that.dataSourceBindings)
            && Objects.equals(this.outputs, that.outputs) && Objects.equals(this.execution, that.execution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            name,
            friendlyName,
            category,
            description,
            version,
            versionDescription,
            inputs,
            dataSourceBindings,
            outputs,
            execution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBasicPluginResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    dataSourceBindings: ").append(toIndentedString(dataSourceBindings)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
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
