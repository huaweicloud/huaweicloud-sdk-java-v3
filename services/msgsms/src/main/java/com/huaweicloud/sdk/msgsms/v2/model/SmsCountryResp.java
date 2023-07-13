package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsCountryResp
 */
public class SmsCountryResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_id")

    private Integer countryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_name_en")

    private String countryNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_name_zh")

    private String countryNameZh;

    public SmsCountryResp withCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }

    /**
     * 国家id
     * minimum: 1
     * maximum: 2147483647
     * @return countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public SmsCountryResp withCountryNameEn(String countryNameEn) {
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

    public SmsCountryResp withCountryNameZh(String countryNameZh) {
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
        SmsCountryResp that = (SmsCountryResp) obj;
        return Objects.equals(this.countryId, that.countryId) && Objects.equals(this.countryNameEn, that.countryNameEn)
            && Objects.equals(this.countryNameZh, that.countryNameZh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, countryNameEn, countryNameZh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsCountryResp {\n");
        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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
