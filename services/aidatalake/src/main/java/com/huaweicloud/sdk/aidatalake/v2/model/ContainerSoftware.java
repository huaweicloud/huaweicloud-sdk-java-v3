package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：镜像包包含的软件信息，帮助用户参考使用。 
 */
public class ContainerSoftware {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ContainerSoftware withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：软件名称。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、小数点、下划线和连字符，2~32个字符。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContainerSoftware withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：软件版本。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、小数点、下划线和连字符，2~32个字符。 **默认取值**：不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerSoftware that = (ContainerSoftware) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSoftware {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
