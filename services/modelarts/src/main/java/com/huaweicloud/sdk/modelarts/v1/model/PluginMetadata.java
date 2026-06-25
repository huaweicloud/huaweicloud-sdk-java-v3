package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件实例的metadata信息。
 */
public class PluginMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    public PluginMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 插件实例的名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginMetadata that = (PluginMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.creationTimestamp, that.creationTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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
