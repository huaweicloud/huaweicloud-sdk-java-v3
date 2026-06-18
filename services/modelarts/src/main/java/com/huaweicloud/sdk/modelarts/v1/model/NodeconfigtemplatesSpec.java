package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：节点配置模板规格。
 */
public class NodeconfigtemplatesSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<NodeconfigTemplateItem> templates = null;

    public NodeconfigtemplatesSpec withTemplates(List<NodeconfigTemplateItem> templates) {
        this.templates = templates;
        return this;
    }

    public NodeconfigtemplatesSpec addTemplatesItem(NodeconfigTemplateItem templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public NodeconfigtemplatesSpec withTemplates(Consumer<List<NodeconfigTemplateItem>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * **参数解释**：节点配置模板列表。
     * @return templates
     */
    public List<NodeconfigTemplateItem> getTemplates() {
        return templates;
    }

    public void setTemplates(List<NodeconfigTemplateItem> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigtemplatesSpec that = (NodeconfigtemplatesSpec) obj;
        return Objects.equals(this.templates, that.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigtemplatesSpec {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
