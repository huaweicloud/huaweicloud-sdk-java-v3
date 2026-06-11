package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowAutoSearchYamlTemplatesInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yaml_templates")

    private List<YamlTemplate> yamlTemplates = null;

    public ShowAutoSearchYamlTemplatesInfoResponse withYamlTemplates(List<YamlTemplate> yamlTemplates) {
        this.yamlTemplates = yamlTemplates;
        return this;
    }

    public ShowAutoSearchYamlTemplatesInfoResponse addYamlTemplatesItem(YamlTemplate yamlTemplatesItem) {
        if (this.yamlTemplates == null) {
            this.yamlTemplates = new ArrayList<>();
        }
        this.yamlTemplates.add(yamlTemplatesItem);
        return this;
    }

    public ShowAutoSearchYamlTemplatesInfoResponse withYamlTemplates(Consumer<List<YamlTemplate>> yamlTemplatesSetter) {
        if (this.yamlTemplates == null) {
            this.yamlTemplates = new ArrayList<>();
        }
        yamlTemplatesSetter.accept(this.yamlTemplates);
        return this;
    }

    /**
     * 所有yaml文件的目录和文件名信息。
     * @return yamlTemplates
     */
    public List<YamlTemplate> getYamlTemplates() {
        return yamlTemplates;
    }

    public void setYamlTemplates(List<YamlTemplate> yamlTemplates) {
        this.yamlTemplates = yamlTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoSearchYamlTemplatesInfoResponse that = (ShowAutoSearchYamlTemplatesInfoResponse) obj;
        return Objects.equals(this.yamlTemplates, that.yamlTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yamlTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoSearchYamlTemplatesInfoResponse {\n");
        sb.append("    yamlTemplates: ").append(toIndentedString(yamlTemplates)).append("\n");
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
