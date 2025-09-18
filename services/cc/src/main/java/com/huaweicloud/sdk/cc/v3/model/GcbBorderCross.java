package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全域互联带宽跨境属性。
 */
public class GcbBorderCross {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bordercross")

    private Boolean bordercross;

    public GcbBorderCross withBordercross(Boolean bordercross) {
        this.bordercross = bordercross;
        return this;
    }

    /**
     * 全域互联带宽跨境属性。
     * @return bordercross
     */
    public Boolean getBordercross() {
        return bordercross;
    }

    public void setBordercross(Boolean bordercross) {
        this.bordercross = bordercross;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcbBorderCross that = (GcbBorderCross) obj;
        return Objects.equals(this.bordercross, that.bordercross);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bordercross);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcbBorderCross {\n");
        sb.append("    bordercross: ").append(toIndentedString(bordercross)).append("\n");
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
