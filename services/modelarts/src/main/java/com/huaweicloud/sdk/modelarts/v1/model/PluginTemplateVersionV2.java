package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件模板的版本信息。
 */
public class PluginTemplateVersionV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Object inputs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "translate")

    private Object translate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public PluginTemplateVersionV2 withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：插件模板的版本号。 **取值范围**：不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginTemplateVersionV2 withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**：创建时间。 **取值范围**：不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public PluginTemplateVersionV2 withInputs(Object inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * **参数解释**：插件安装参数。
     * @return inputs
     */
    public Object getInputs() {
        return inputs;
    }

    public void setInputs(Object inputs) {
        this.inputs = inputs;
    }

    public PluginTemplateVersionV2 withTranslate(Object translate) {
        this.translate = translate;
        return this;
    }

    /**
     * **参数解释**：供界面使用的翻译信息。
     * @return translate
     */
    public Object getTranslate() {
        return translate;
    }

    public void setTranslate(Object translate) {
        this.translate = translate;
    }

    public PluginTemplateVersionV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：版本描述信息。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginTemplateVersionV2 withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释**：版本描述信息。 **取值范围**：不涉及。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginTemplateVersionV2 that = (PluginTemplateVersionV2) obj;
        return Objects.equals(this.version, that.version)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.translate, that.translate)
            && Objects.equals(this.description, that.description) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, creationTimestamp, inputs, translate, description, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginTemplateVersionV2 {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    translate: ").append(toIndentedString(translate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
