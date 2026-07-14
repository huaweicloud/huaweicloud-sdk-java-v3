package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 删除镜像组请求体，支持is_force字段删除关联swr镜像，默认为false
 */
public class DeleteImageGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force")

    private Boolean isForce;

    public DeleteImageGroupRequestBody withIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }

    /**
     * 是否删除关联的swr镜像，默认为false  **参数解释**：是否删除关联的swr镜像。 **约束限制**：true或false。 **取值范围**：布尔类型。 **默认取值**：false。
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
        DeleteImageGroupRequestBody that = (DeleteImageGroupRequestBody) obj;
        return Objects.equals(this.isForce, that.isForce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isForce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteImageGroupRequestBody {\n");
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
