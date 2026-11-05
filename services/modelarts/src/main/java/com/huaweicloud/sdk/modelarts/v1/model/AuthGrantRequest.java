package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuthGrantRequest
 */
public class AuthGrantRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reset")

    private Boolean isReset;

    public AuthGrantRequest withIsReset(Boolean isReset) {
        this.isReset = isReset;
        return this;
    }

    /**
     * **参数解释**：是否重置授权。 **约束限制**：不涉及。 **取值范围**： - true：重置已有委托（先删除再创建）。 - false：普通授权。 **默认取值**：false。
     * @return isReset
     */
    public Boolean getIsReset() {
        return isReset;
    }

    public void setIsReset(Boolean isReset) {
        this.isReset = isReset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthGrantRequest that = (AuthGrantRequest) obj;
        return Objects.equals(this.isReset, that.isReset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isReset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthGrantRequest {\n");
        sb.append("    isReset: ").append(toIndentedString(isReset)).append("\n");
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
