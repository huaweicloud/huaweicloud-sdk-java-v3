package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络资源metadata信息中的annotations字段信息。
 */
public class NetworkMetadataAnnotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/description")

    private String osModelartsDescription;

    public NetworkMetadataAnnotations withOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
        return this;
    }

    /**
     * **参数解释**：网络的描述信息。 **取值范围**：不能包含字符!<>=&\"'。
     * @return osModelartsDescription
     */
    public String getOsModelartsDescription() {
        return osModelartsDescription;
    }

    public void setOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkMetadataAnnotations that = (NetworkMetadataAnnotations) obj;
        return Objects.equals(this.osModelartsDescription, that.osModelartsDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkMetadataAnnotations {\n");
        sb.append("    osModelartsDescription: ").append(toIndentedString(osModelartsDescription)).append("\n");
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
