package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规格变更请求体
 */
public class ChangeFlavorReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_type")

    private String specType;

    public ChangeFlavorReq withSpecType(String specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 目标规格类型。 取值： - micro：极小规格。 - small：小规格。 - medium：中规格。 - high：大规格。 - xlarge：超大规格。 - 2xlarge：极大规格。
     * @return specType
     */
    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeFlavorReq that = (ChangeFlavorReq) obj;
        return Objects.equals(this.specType, that.specType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeFlavorReq {\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
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
