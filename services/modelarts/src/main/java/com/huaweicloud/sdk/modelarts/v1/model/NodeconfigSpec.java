package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeconfigSpec
 */
public class NodeconfigSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private Object configs;

    public NodeconfigSpec withConfigs(Object configs) {
        this.configs = configs;
        return this;
    }

    /**
     * **参数解释**： 节点自定义配置；当前支持节点绑核、是否启用缓存清理、是否启用透明大页。 \"configs\": {    \"cpu_manager\": {     \"mode\": \"static/none\" //static为启用绑核, none为不启用绑核    },    \"drop_cache\": {     \"mode\": \"enable/disable\" // enable启用缓存清理    },    \"transparent_hugepage\": {     \"mode\": \"always/madvise/never\" // always为启用透明大页，never为关闭透明大页，madvice交给系统选择。    } }
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
        NodeconfigSpec that = (NodeconfigSpec) obj;
        return Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigSpec {\n");
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
