package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CES监控维护信息
 */
public class DimsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_k")

    private String dimK;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_v")

    private String dimV;

    public DimsInfo withDimK(String dimK) {
        this.dimK = dimK;
        return this;
    }

    /**
     * **参数解释**： CES监控维度路由。 **取值范围**： 不涉及。 
     * @return dimK
     */
    public String getDimK() {
        return dimK;
    }

    public void setDimK(String dimK) {
        this.dimK = dimK;
    }

    public DimsInfo withDimV(String dimV) {
        this.dimV = dimV;
        return this;
    }

    /**
     * **参数解释**： CES监控维度ID。 **取值范围**： 不涉及。 
     * @return dimV
     */
    public String getDimV() {
        return dimV;
    }

    public void setDimV(String dimV) {
        this.dimV = dimV;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimsInfo that = (DimsInfo) obj;
        return Objects.equals(this.dimK, that.dimK) && Objects.equals(this.dimV, that.dimV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimK, dimV);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimsInfo {\n");
        sb.append("    dimK: ").append(toIndentedString(dimK)).append("\n");
        sb.append("    dimV: ").append(toIndentedString(dimV)).append("\n");
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
