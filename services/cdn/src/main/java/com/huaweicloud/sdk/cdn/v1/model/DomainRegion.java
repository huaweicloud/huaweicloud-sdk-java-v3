package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainRegion
 */
public class DomainRegion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_isp_details")

    private List<Map<String, Object>> regionIspDetails = null;

    public DomainRegion withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainRegion withRegionIspDetails(List<Map<String, Object>> regionIspDetails) {
        this.regionIspDetails = regionIspDetails;
        return this;
    }

    public DomainRegion addRegionIspDetailsItem(Map<String, Object> regionIspDetailsItem) {
        if (this.regionIspDetails == null) {
            this.regionIspDetails = new ArrayList<>();
        }
        this.regionIspDetails.add(regionIspDetailsItem);
        return this;
    }

    public DomainRegion withRegionIspDetails(Consumer<List<Map<String, Object>>> regionIspDetailsSetter) {
        if (this.regionIspDetails == null) {
            this.regionIspDetails = new ArrayList<>();
        }
        regionIspDetailsSetter.accept(this.regionIspDetails);
        return this;
    }

    /**
     * 指标统计数据列表，如果该时间段内无值，则为空数组[]
     * @return regionIspDetails
     */
    public List<Map<String, Object>> getRegionIspDetails() {
        return regionIspDetails;
    }

    public void setRegionIspDetails(List<Map<String, Object>> regionIspDetails) {
        this.regionIspDetails = regionIspDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainRegion domainRegion = (DomainRegion) o;
        return Objects.equals(this.domainName, domainRegion.domainName)
            && Objects.equals(this.regionIspDetails, domainRegion.regionIspDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, regionIspDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainRegion {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    regionIspDetails: ").append(toIndentedString(regionIspDetails)).append("\n");
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
