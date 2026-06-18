package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：节点自定义配置模板
 */
public class NodeconfigTemplateItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private Object configs;

    public NodeconfigTemplateItem withConfigs(Object configs) {
        this.configs = configs;
        return this;
    }

    /**
     * **参数解释**：支持的配置项列表和默认值。
     * @return configs
     */
    public Object getConfigs() {
        return configs;
    }

    public void setConfigs(Object configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigTemplateItem that = (NodeconfigTemplateItem) obj;
        return Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigTemplateItem {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
