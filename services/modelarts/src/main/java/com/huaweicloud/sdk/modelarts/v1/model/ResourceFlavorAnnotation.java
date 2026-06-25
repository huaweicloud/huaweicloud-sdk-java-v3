package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源规格metadata的注释信息。
 */
public class ResourceFlavorAnnotation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.flavor/image.filter")

    private String osModelartsFlavorImageFilter;

    public ResourceFlavorAnnotation withOsModelartsFlavorImageFilter(String osModelartsFlavorImageFilter) {
        this.osModelartsFlavorImageFilter = osModelartsFlavorImageFilter;
        return this;
    }

    /**
     * **参数解释**：资源规格支持的私有镜像的过滤条件。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsFlavorImageFilter
     */
    public String getOsModelartsFlavorImageFilter() {
        return osModelartsFlavorImageFilter;
    }

    public void setOsModelartsFlavorImageFilter(String osModelartsFlavorImageFilter) {
        this.osModelartsFlavorImageFilter = osModelartsFlavorImageFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceFlavorAnnotation that = (ResourceFlavorAnnotation) obj;
        return Objects.equals(this.osModelartsFlavorImageFilter, that.osModelartsFlavorImageFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsFlavorImageFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorAnnotation {\n");
        sb.append("    osModelartsFlavorImageFilter: ")
            .append(toIndentedString(osModelartsFlavorImageFilter))
            .append("\n");
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
