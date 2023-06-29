package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSendCountryDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_name_en")

    private String countryNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_name_zh")

    private String countryNameZh;

    public ListSendCountryDetailsRequest withCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
        return this;
    }

    /**
     * 国家(英文)
     * @return countryNameEn
     */
    public String getCountryNameEn() {
        return countryNameEn;
    }

    public void setCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
    }

    public ListSendCountryDetailsRequest withCountryNameZh(String countryNameZh) {
        this.countryNameZh = countryNameZh;
        return this;
    }

    /**
     * 国家(中文)
     * @return countryNameZh
     */
    public String getCountryNameZh() {
        return countryNameZh;
    }

    public void setCountryNameZh(String countryNameZh) {
        this.countryNameZh = countryNameZh;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSendCountryDetailsRequest that = (ListSendCountryDetailsRequest) obj;
        return Objects.equals(this.countryNameEn, that.countryNameEn)
            && Objects.equals(this.countryNameZh, that.countryNameZh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryNameEn, countryNameZh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSendCountryDetailsRequest {\n");
        sb.append("    countryNameEn: ").append(toIndentedString(countryNameEn)).append("\n");
        sb.append("    countryNameZh: ").append(toIndentedString(countryNameZh)).append("\n");
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
