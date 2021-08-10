package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 地理位置封禁body */
public class UpdateGeoipRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geoip")

    private String geoip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    public UpdateGeoipRuleRequestBody withGeoip(String geoip) {
        this.geoip = geoip;
        return this;
    }

    /** 地理位置
     * 
     * @return geoip */
    public String getGeoip() {
        return geoip;
    }

    public void setGeoip(String geoip) {
        this.geoip = geoip;
    }

    public UpdateGeoipRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /** 放行或者拦截(0拦截,1放行)
     * 
     * @return white */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateGeoipRuleRequestBody updateGeoipRuleRequestBody = (UpdateGeoipRuleRequestBody) o;
        return Objects.equals(this.geoip, updateGeoipRuleRequestBody.geoip)
            && Objects.equals(this.white, updateGeoipRuleRequestBody.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geoip, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGeoipRuleRequestBody {\n");
        sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
