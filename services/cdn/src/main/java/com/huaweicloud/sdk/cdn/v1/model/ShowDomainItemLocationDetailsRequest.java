package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ShowDomainItemLocationDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /** 指标类型列表 网络资源消耗：bw（带宽），flux（流量） 访问情况：req_num（请求总数） */
    public static final class StatTypeEnum {

        /** Enum BW for value: "bw" */
        public static final StatTypeEnum BW = new StatTypeEnum("bw");

        /** Enum FLUX for value: "flux" */
        public static final StatTypeEnum FLUX = new StatTypeEnum("flux");

        /** Enum REQ_NUM for value: "req_num" */
        public static final StatTypeEnum REQ_NUM = new StatTypeEnum("req_num");

        private static final Map<String, StatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatTypeEnum> createStaticFields() {
            Map<String, StatTypeEnum> map = new HashMap<>();
            map.put("bw", BW);
            map.put("flux", FLUX);
            map.put("req_num", REQ_NUM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatTypeEnum(value);
            }
            return result;
        }

        public static StatTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatTypeEnum) {
                return this.value.equals(((StatTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private StatTypeEnum statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    public ShowDomainItemLocationDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 当用户开启企业项目功能时，该参数生效，表示资源所属企业项目，不传表示默认项目。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowDomainItemLocationDetailsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 查询开始时间戳，必须设为5分钟整时刻点
     * 
     * @return startTime */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainItemLocationDetailsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 查询结束时间戳，必须设为5分钟整时刻点，与开始时间戳时间差不可以超过一天
     * 
     * @return endTime */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainItemLocationDetailsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 域名列表，多个域名以逗号（半角）分隔，如：www.test1.com,www.test2.com，all表示查询名下全部域名
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainItemLocationDetailsRequest withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    /** 指标类型列表 网络资源消耗：bw（带宽），flux（流量） 访问情况：req_num（请求总数）
     * 
     * @return statType */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    public ShowDomainItemLocationDetailsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 区域列表，以逗号分隔，all表示查询全部区域
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowDomainItemLocationDetailsRequest withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /** 运营商列表，以逗号分隔，all表示查询全部运营商
     * 
     * @return isp */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainItemLocationDetailsRequest showDomainItemLocationDetailsRequest =
            (ShowDomainItemLocationDetailsRequest) o;
        return Objects.equals(this.enterpriseProjectId, showDomainItemLocationDetailsRequest.enterpriseProjectId)
            && Objects.equals(this.startTime, showDomainItemLocationDetailsRequest.startTime)
            && Objects.equals(this.endTime, showDomainItemLocationDetailsRequest.endTime)
            && Objects.equals(this.domainName, showDomainItemLocationDetailsRequest.domainName)
            && Objects.equals(this.statType, showDomainItemLocationDetailsRequest.statType)
            && Objects.equals(this.region, showDomainItemLocationDetailsRequest.region)
            && Objects.equals(this.isp, showDomainItemLocationDetailsRequest.isp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, startTime, endTime, domainName, statType, region, isp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemLocationDetailsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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
