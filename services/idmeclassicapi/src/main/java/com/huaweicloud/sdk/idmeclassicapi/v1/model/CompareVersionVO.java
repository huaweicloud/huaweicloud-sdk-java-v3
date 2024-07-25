package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompareVersionVO
 */
public class CompareVersionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicVersion")

    private String basicVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correlationVersion")

    private String correlationVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public CompareVersionVO withBasicVersion(String basicVersion) {
        this.basicVersion = basicVersion;
        return this;
    }

    /**
     * **参数解释：**  基础版本号。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return basicVersion
     */
    public String getBasicVersion() {
        return basicVersion;
    }

    public void setBasicVersion(String basicVersion) {
        this.basicVersion = basicVersion;
    }

    public CompareVersionVO withCorrelationVersion(String correlationVersion) {
        this.correlationVersion = correlationVersion;
        return this;
    }

    /**
     * **参数解释：**  对比版本号。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return correlationVersion
     */
    public String getCorrelationVersion() {
        return correlationVersion;
    }

    public void setCorrelationVersion(String correlationVersion) {
        this.correlationVersion = correlationVersion;
    }

    public CompareVersionVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  实例ID。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareVersionVO that = (CompareVersionVO) obj;
        return Objects.equals(this.basicVersion, that.basicVersion)
            && Objects.equals(this.correlationVersion, that.correlationVersion) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicVersion, correlationVersion, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareVersionVO {\n");
        sb.append("    basicVersion: ").append(toIndentedString(basicVersion)).append("\n");
        sb.append("    correlationVersion: ").append(toIndentedString(correlationVersion)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
