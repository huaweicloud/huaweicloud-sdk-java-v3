package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProPricePlansRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_search_key")

    @JacksonXmlProperty(localName = "main_search_key")

    private String mainSearchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_total")

    @JacksonXmlProperty(localName = "flow_total")

    private Long flowTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    @JacksonXmlProperty(localName = "network_type")

    private Long networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_type")

    @JacksonXmlProperty(localName = "location_type")

    private Long locationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carrier_type")

    @JacksonXmlProperty(localName = "carrier_type")

    private Integer carrierType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_type")

    @JacksonXmlProperty(localName = "country_type")

    private Long countryType;

    public ListProPricePlansRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListProPricePlansRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListProPricePlansRequest withMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
        return this;
    }

    /**
     * 查询关键标识类型：套餐名称 例如中国香港每月10M联接服务
     * @return mainSearchKey
     */
    public String getMainSearchKey() {
        return mainSearchKey;
    }

    public void setMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
    }

    public ListProPricePlansRequest withFlowTotal(Long flowTotal) {
        this.flowTotal = flowTotal;
        return this;
    }

    /**
     * 流量总量(MB)
     * minimum: 0
     * @return flowTotal
     */
    public Long getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(Long flowTotal) {
        this.flowTotal = flowTotal;
    }

    public ListProPricePlansRequest withNetworkType(Long networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 网络制式 1.2g,3g,4g 2.NB
     * minimum: 0
     * @return networkType
     */
    public Long getNetworkType() {
        return networkType;
    }

    public void setNetworkType(Long networkType) {
        this.networkType = networkType;
    }

    public ListProPricePlansRequest withLocationType(Long locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * 覆盖区域:1.  中国 2.  欧洲 3.  大洋洲 4.  非洲 5.  亚太
     * minimum: 0
     * @return locationType
     */
    public Long getLocationType() {
        return locationType;
    }

    public void setLocationType(Long locationType) {
        this.locationType = locationType;
    }

    public ListProPricePlansRequest withCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
        return this;
    }

    /**
     * 运营商 101/1 中国移动/中国移动（实体卡） 102/2中国电信/中国电信（实体卡） 3中国联通（实体卡） 201.欧洲 501.中国香港 502.中国澳门 503.泰国 504.日本 505.柬埔寨 506.印度尼西亚 507.马来西亚 508.新加坡 509.斯里兰卡 510.中国台湾 511.孟加拉 
     * minimum: 0
     * @return carrierType
     */
    public Integer getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
    }

    public ListProPricePlansRequest withCountryType(Long countryType) {
        this.countryType = countryType;
        return this;
    }

    /**
     * 国家/地区 1中国香港，2中国澳门，3泰国，4日本，5，柬埔寨，6印尼，7马来西亚，8新加坡，9斯里兰卡，10中国台湾，11孟加拉
     * minimum: 0
     * @return countryType
     */
    public Long getCountryType() {
        return countryType;
    }

    public void setCountryType(Long countryType) {
        this.countryType = countryType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProPricePlansRequest listProPricePlansRequest = (ListProPricePlansRequest) o;
        return Objects.equals(this.limit, listProPricePlansRequest.limit)
            && Objects.equals(this.offset, listProPricePlansRequest.offset)
            && Objects.equals(this.mainSearchKey, listProPricePlansRequest.mainSearchKey)
            && Objects.equals(this.flowTotal, listProPricePlansRequest.flowTotal)
            && Objects.equals(this.networkType, listProPricePlansRequest.networkType)
            && Objects.equals(this.locationType, listProPricePlansRequest.locationType)
            && Objects.equals(this.carrierType, listProPricePlansRequest.carrierType)
            && Objects.equals(this.countryType, listProPricePlansRequest.countryType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(limit, offset, mainSearchKey, flowTotal, networkType, locationType, carrierType, countryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProPricePlansRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    mainSearchKey: ").append(toIndentedString(mainSearchKey)).append("\n");
        sb.append("    flowTotal: ").append(toIndentedString(flowTotal)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
        sb.append("    carrierType: ").append(toIndentedString(carrierType)).append("\n");
        sb.append("    countryType: ").append(toIndentedString(countryType)).append("\n");
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
