package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    @JacksonXmlProperty(localName = "agency_id")

    private String agencyId;

    public ShowAgencyRequest withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 待查询的委托ID，获取方式请参见：[获取委托名、委托ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAgencyRequest showAgencyRequest = (ShowAgencyRequest) o;
        return Objects.equals(this.agencyId, showAgencyRequest.agencyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyRequest {\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
