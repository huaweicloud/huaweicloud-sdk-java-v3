package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：删除在SWR的镜像内容，仅对于个人私有镜像有效。 **约束限制**：不涉及。
 */
public class DeleteImageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force")

    private Boolean isForce;

    public DeleteImageRequestBody withIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }

    /**
     * **参数解释**：删除在SWR的镜像内容，仅对于个人私有镜像有效。 **约束限制**：不涉及。 **取值范围**：布尔类型： - true：删除镜像内容。 - false：不删除镜像内容。  **默认取值**：false。
     * @return isForce
     */
    public Boolean getIsForce() {
        return isForce;
    }

    public void setIsForce(Boolean isForce) {
        this.isForce = isForce;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteImageRequestBody that = (DeleteImageRequestBody) obj;
        return Objects.equals(this.isForce, that.isForce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isForce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteImageRequestBody {\n");
        sb.append("    isForce: ").append(toIndentedString(isForce)).append("\n");
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
