package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPluginTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateName")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolName")

    private String poolName;

    public ListPluginTemplatesRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释**：指定的插件名称，填写则查询指定名称的插件。 **约束限制**：不涉及 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ListPluginTemplatesRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：指定的资源池名称，填写则查询符合资源池安装条件的插件列表。 **约束限制**：不涉及 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginTemplatesRequest that = (ListPluginTemplatesRequest) obj;
        return Objects.equals(this.templateName, that.templateName) && Objects.equals(this.poolName, that.poolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, poolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginTemplatesRequest {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
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
