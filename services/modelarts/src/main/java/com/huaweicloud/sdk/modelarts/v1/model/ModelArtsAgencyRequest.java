package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModelArtsAgencyRequest
 */
public class ModelArtsAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name_suffix")

    private String agencyNameSuffix;

    public ModelArtsAgencyRequest withAgencyNameSuffix(String agencyNameSuffix) {
        this.agencyNameSuffix = agencyNameSuffix;
        return this;
    }

    /**
     * 委托名称后缀。  长度不大于50位。  委托名称前缀固定为ma_agency。  如该字段为iam-user01，则创建出来的委托名称为ma_agency_iam-user01。  默认为空，表示创建名称为modelarts_agency的委托。
     * @return agencyNameSuffix
     */
    public String getAgencyNameSuffix() {
        return agencyNameSuffix;
    }

    public void setAgencyNameSuffix(String agencyNameSuffix) {
        this.agencyNameSuffix = agencyNameSuffix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelArtsAgencyRequest that = (ModelArtsAgencyRequest) obj;
        return Objects.equals(this.agencyNameSuffix, that.agencyNameSuffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyNameSuffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelArtsAgencyRequest {\n");
        sb.append("    agencyNameSuffix: ").append(toIndentedString(agencyNameSuffix)).append("\n");
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
