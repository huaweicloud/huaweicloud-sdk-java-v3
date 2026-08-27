package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置/解除只读。
 */
public class SetInstanceReadonlyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    private Boolean readonly;

    public SetInstanceReadonlyRequestBody withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * **参数解释**：  设置或者解除实例只读。  **约束限制**：  不涉及。  **取值范围**：  - true: 设置只读。 - false: 解除只读。 **默认取值**：  不涉及。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetInstanceReadonlyRequestBody that = (SetInstanceReadonlyRequestBody) obj;
        return Objects.equals(this.readonly, that.readonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetInstanceReadonlyRequestBody {\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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
