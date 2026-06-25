package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源规格的标签信息。
 */
public class ResourceFlavorLabel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/scope")

    private String osModelartsScope;

    public ResourceFlavorLabel withOsModelartsScope(String osModelartsScope) {
        this.osModelartsScope = osModelartsScope;
        return this;
    }

    /**
     * **参数解释**：资源规格支持作业类型，以“.”分割。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsScope
     */
    public String getOsModelartsScope() {
        return osModelartsScope;
    }

    public void setOsModelartsScope(String osModelartsScope) {
        this.osModelartsScope = osModelartsScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceFlavorLabel that = (ResourceFlavorLabel) obj;
        return Objects.equals(this.osModelartsScope, that.osModelartsScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorLabel {\n");
        sb.append("    osModelartsScope: ").append(toIndentedString(osModelartsScope)).append("\n");
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
