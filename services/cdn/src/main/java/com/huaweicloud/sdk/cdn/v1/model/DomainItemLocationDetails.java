package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainItemLocationDetails
 */
public class DomainItemLocationDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<DomainRegion> domains = null;

    public DomainItemLocationDetails withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 数据起始时间戳，可能与请求时间不一致
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DomainItemLocationDetails withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数据结束时间戳，可能与请求时间不一致
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public DomainItemLocationDetails withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 指标类型
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public DomainItemLocationDetails withDomains(List<DomainRegion> domains) {
        this.domains = domains;
        return this;
    }

    public DomainItemLocationDetails addDomainsItem(DomainRegion domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public DomainItemLocationDetails withDomains(Consumer<List<DomainRegion>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 域名详情数据列表
     * @return domains
     */
    public List<DomainRegion> getDomains() {
        return domains;
    }

    public void setDomains(List<DomainRegion> domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainItemLocationDetails domainItemLocationDetails = (DomainItemLocationDetails) o;
        return Objects.equals(this.startTime, domainItemLocationDetails.startTime)
            && Objects.equals(this.endTime, domainItemLocationDetails.endTime)
            && Objects.equals(this.statType, domainItemLocationDetails.statType)
            && Objects.equals(this.domains, domainItemLocationDetails.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, statType, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainItemLocationDetails {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
