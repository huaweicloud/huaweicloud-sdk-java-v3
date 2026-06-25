package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件实例的模板信息。
 */
public class Template {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Map<String, Object> inputs = null;

    public Template withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：待安装插件模板名称，如log-agent。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Template withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：待安装、升级插件的版本号。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Template withInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
        return this;
    }

    public Template putInputsItem(String key, Object inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    public Template withInputs(Consumer<Map<String, Object>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**：插件模板安装参数（各插件不同），升级插件时需要填写全量安装参数，未填写参数将使用插件模板中的默认值，当前插件安装参数可通过查询插件实例接口获取。 **约束限制**：不涉及。
     * @return inputs
     */
    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Template that = (Template) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.inputs, that.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, inputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
