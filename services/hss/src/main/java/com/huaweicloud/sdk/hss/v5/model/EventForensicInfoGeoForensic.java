package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 地理位置取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoGeoForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_country")

    private String srcCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_city")

    private String srcCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_latitude")

    private Integer srcLatitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_longitude")

    private Integer srcLongitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_country")

    private String destCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_city")

    private String destCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_latitude")

    private Integer destLatitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_longitude")

    private Integer destLongitude;

    public EventForensicInfoGeoForensic withSrcCountry(String srcCountry) {
        this.srcCountry = srcCountry;
        return this;
    }

    /**
     * **参数解释**： 源国家 **取值范围**： 不涉及
     * @return srcCountry
     */
    public String getSrcCountry() {
        return srcCountry;
    }

    public void setSrcCountry(String srcCountry) {
        this.srcCountry = srcCountry;
    }

    public EventForensicInfoGeoForensic withSrcCity(String srcCity) {
        this.srcCity = srcCity;
        return this;
    }

    /**
     * **参数解释**： 源城市 **取值范围**： 不涉及
     * @return srcCity
     */
    public String getSrcCity() {
        return srcCity;
    }

    public void setSrcCity(String srcCity) {
        this.srcCity = srcCity;
    }

    public EventForensicInfoGeoForensic withSrcLatitude(Integer srcLatitude) {
        this.srcLatitude = srcLatitude;
        return this;
    }

    /**
     * **参数解释**： 源纬度 **取值范围**： 不涉及
     * @return srcLatitude
     */
    public Integer getSrcLatitude() {
        return srcLatitude;
    }

    public void setSrcLatitude(Integer srcLatitude) {
        this.srcLatitude = srcLatitude;
    }

    public EventForensicInfoGeoForensic withSrcLongitude(Integer srcLongitude) {
        this.srcLongitude = srcLongitude;
        return this;
    }

    /**
     * **参数解释**： 源经度 **取值范围**： 不涉及
     * @return srcLongitude
     */
    public Integer getSrcLongitude() {
        return srcLongitude;
    }

    public void setSrcLongitude(Integer srcLongitude) {
        this.srcLongitude = srcLongitude;
    }

    public EventForensicInfoGeoForensic withDestCountry(String destCountry) {
        this.destCountry = destCountry;
        return this;
    }

    /**
     * **参数解释**： 目的国家 **取值范围**： 不涉及
     * @return destCountry
     */
    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public EventForensicInfoGeoForensic withDestCity(String destCity) {
        this.destCity = destCity;
        return this;
    }

    /**
     * **参数解释**： 目的城市 **取值范围**： 不涉及
     * @return destCity
     */
    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public EventForensicInfoGeoForensic withDestLatitude(Integer destLatitude) {
        this.destLatitude = destLatitude;
        return this;
    }

    /**
     * **参数解释**： 目的纬度 **取值范围**： 不涉及
     * @return destLatitude
     */
    public Integer getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Integer destLatitude) {
        this.destLatitude = destLatitude;
    }

    public EventForensicInfoGeoForensic withDestLongitude(Integer destLongitude) {
        this.destLongitude = destLongitude;
        return this;
    }

    /**
     * **参数解释**： 目的经度 **取值范围**： 不涉及
     * @return destLongitude
     */
    public Integer getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Integer destLongitude) {
        this.destLongitude = destLongitude;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoGeoForensic that = (EventForensicInfoGeoForensic) obj;
        return Objects.equals(this.srcCountry, that.srcCountry) && Objects.equals(this.srcCity, that.srcCity)
            && Objects.equals(this.srcLatitude, that.srcLatitude)
            && Objects.equals(this.srcLongitude, that.srcLongitude)
            && Objects.equals(this.destCountry, that.destCountry) && Objects.equals(this.destCity, that.destCity)
            && Objects.equals(this.destLatitude, that.destLatitude)
            && Objects.equals(this.destLongitude, that.destLongitude);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(srcCountry, srcCity, srcLatitude, srcLongitude, destCountry, destCity, destLatitude, destLongitude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoGeoForensic {\n");
        sb.append("    srcCountry: ").append(toIndentedString(srcCountry)).append("\n");
        sb.append("    srcCity: ").append(toIndentedString(srcCity)).append("\n");
        sb.append("    srcLatitude: ").append(toIndentedString(srcLatitude)).append("\n");
        sb.append("    srcLongitude: ").append(toIndentedString(srcLongitude)).append("\n");
        sb.append("    destCountry: ").append(toIndentedString(destCountry)).append("\n");
        sb.append("    destCity: ").append(toIndentedString(destCity)).append("\n");
        sb.append("    destLatitude: ").append(toIndentedString(destLatitude)).append("\n");
        sb.append("    destLongitude: ").append(toIndentedString(destLongitude)).append("\n");
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
