package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** DomainItemDetail */
public class DomainItemDetail {

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

    private List<Map<String, Object>> domains = null;

    public DomainItemDetail withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 数据起始时间戳，可能与请求时间不一致，可能不返回
     * 
     * @return startTime */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DomainItemDetail withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 数据结束时间戳，可能与请求时间不一致，可能不返回
     * 
     * @return endTime */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public DomainItemDetail withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /** 指标类型，可能不返回
     * 
     * @return statType */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public DomainItemDetail withDomains(List<Map<String, Object>> domains) {
        this.domains = domains;
        return this;
    }

    public DomainItemDetail addDomainsItem(Map<String, Object> domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public DomainItemDetail withDomains(Consumer<List<Map<String, Object>>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /** 数据结束时间戳，可能与请求时间不一致，可能不返回
     * 
     * @return domains */
    public List<Map<String, Object>> getDomains() {
        return domains;
    }

    public void setDomains(List<Map<String, Object>> domains) {
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
        DomainItemDetail domainItemDetail = (DomainItemDetail) o;
        return Objects.equals(this.startTime, domainItemDetail.startTime)
            && Objects.equals(this.endTime, domainItemDetail.endTime)
            && Objects.equals(this.statType, domainItemDetail.statType)
            && Objects.equals(this.domains, domainItemDetail.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, statType, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainItemDetail {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
