package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EnableDeletionProtectionPrimitiveTypeHolder
 */
public class EnableDeletionProtectionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_deletion_protection")

    private Boolean enableDeletionProtection;

    public EnableDeletionProtectionPrimitiveTypeHolder withEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
        return this;
    }

    /**
     * 删除保护的标识位，如果不传默认为false，即默认不开启资源栈删除保护（删除保护开启后资源栈不允许被删除）  *在UpdateStack API中，如果该参数未在RequestBody中给予，则不会对资源栈的删除保护属性进行更新*
     * @return enableDeletionProtection
     */
    public Boolean getEnableDeletionProtection() {
        return enableDeletionProtection;
    }

    public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableDeletionProtectionPrimitiveTypeHolder that = (EnableDeletionProtectionPrimitiveTypeHolder) obj;
        return Objects.equals(this.enableDeletionProtection, that.enableDeletionProtection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableDeletionProtection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableDeletionProtectionPrimitiveTypeHolder {\n");
        sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
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
