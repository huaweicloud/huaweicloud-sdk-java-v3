package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 是否具有创建应用的权限结果
 */
public class CheckCanCreateResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatable")

    private Boolean creatable;

    public CheckCanCreateResponseBodyResult withCreatable(Boolean creatable) {
        this.creatable = creatable;
        return this;
    }

    /**
     * 是否具有创建应用的权限
     * @return creatable
     */
    public Boolean getCreatable() {
        return creatable;
    }

    public void setCreatable(Boolean creatable) {
        this.creatable = creatable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckCanCreateResponseBodyResult that = (CheckCanCreateResponseBodyResult) obj;
        return Objects.equals(this.creatable, that.creatable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCanCreateResponseBodyResult {\n");
        sb.append("    creatable: ").append(toIndentedString(creatable)).append("\n");
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
