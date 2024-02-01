package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GcbFrozen
 */
public class GcbFrozen {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen")

    private Boolean frozen;

    public GcbFrozen withFrozen(Boolean frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * 功能说明: 全域互联带宽是否冻结。 取值范围：     true-冻结     false-非冻结
     * @return frozen
     */
    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcbFrozen that = (GcbFrozen) obj;
        return Objects.equals(this.frozen, that.frozen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frozen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcbFrozen {\n");
        sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
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
