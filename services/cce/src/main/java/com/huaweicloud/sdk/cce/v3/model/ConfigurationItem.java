package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigurationItem
 */
public class ConfigurationItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    public ConfigurationItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 组件配置参数名称。  [当前集群支持的可配置组件及其参数详见[修改CCE集群配置](https://support.huaweicloud.com/usermanual-cce/cce_10_0213.html)，当前节点池支持的可配置组件及其参数详见[修改节点池配置](https://support.huaweicloud.com/usermanual-cce/cce_10_0652.html)。](tag:hws) [当前集群支持的可配置组件及其参数详见[修改CCE集群配置](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0213.html)，当前节点池支持的可配置组件及其参数详见[修改节点池配置](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0652.html)。](tag:hws_hk) **约束限制：** 若指定了不支持的组件或组件不支持的参数，该配置项将被忽略。 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationItem withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 组件配置参数值。  [当前集群支持的可配置组件及其参数详见[修改CCE集群配置](https://support.huaweicloud.com/usermanual-cce/cce_10_0213.html)，当前节点池支持的可配置组件及其参数详见[修改节点池配置](https://support.huaweicloud.com/usermanual-cce/cce_10_0652.html)。](tag:hws) [当前集群支持的可配置组件及其参数详见[修改CCE集群配置](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0213.html)，当前节点池支持的可配置组件及其参数详见[修改节点池配置](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0652.html)。](tag:hws_hk) **约束限制：** 若指定了不支持的组件或组件不支持的参数，该配置项将被忽略。 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        ConfigurationItem that = (ConfigurationItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
