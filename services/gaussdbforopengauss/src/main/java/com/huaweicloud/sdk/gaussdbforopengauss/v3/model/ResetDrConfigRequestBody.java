package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重置容灾配置request信息。
 */
public class ResetDrConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opposite_data_cidr")

    private String oppositeDataCidr;

    public ResetDrConfigRequestBody withOppositeDataCidr(String oppositeDataCidr) {
        this.oppositeDataCidr = oppositeDataCidr;
        return this;
    }

    /**
     * 对端子网IP网段或者IP，多个以英文逗号分割。
     * @return oppositeDataCidr
     */
    public String getOppositeDataCidr() {
        return oppositeDataCidr;
    }

    public void setOppositeDataCidr(String oppositeDataCidr) {
        this.oppositeDataCidr = oppositeDataCidr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetDrConfigRequestBody that = (ResetDrConfigRequestBody) obj;
        return Objects.equals(this.oppositeDataCidr, that.oppositeDataCidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oppositeDataCidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDrConfigRequestBody {\n");
        sb.append("    oppositeDataCidr: ").append(toIndentedString(oppositeDataCidr)).append("\n");
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
