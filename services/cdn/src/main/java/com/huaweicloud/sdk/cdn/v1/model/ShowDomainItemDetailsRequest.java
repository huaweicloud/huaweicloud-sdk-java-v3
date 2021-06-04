package com.huaweicloud.sdk.cdn.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainItemDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;
    /**
     * 网络资源消耗： - bw（带宽） - flux（流量） - bs_bw(回源带宽) - bs_flux（回源流量）  访问情况： - req_num（请求总数） - hit_num（请求命中次数） - bs_num(回源总数) - bs_fail_num(回源失败数) - hit_flux（命中流量）
     */
    public static final class StatTypeEnum {

        
        /**
         * Enum BW for value: "bw"
         */
        public static final StatTypeEnum BW = new StatTypeEnum("bw");
        
        /**
         * Enum FLUX for value: "flux"
         */
        public static final StatTypeEnum FLUX = new StatTypeEnum("flux");
        
        /**
         * Enum BS_BW for value: "bs_bw"
         */
        public static final StatTypeEnum BS_BW = new StatTypeEnum("bs_bw");
        
        /**
         * Enum BS_FLUX for value: "bs_flux"
         */
        public static final StatTypeEnum BS_FLUX = new StatTypeEnum("bs_flux");
        
        /**
         * Enum REQ_NUM for value: "req_num"
         */
        public static final StatTypeEnum REQ_NUM = new StatTypeEnum("req_num");
        
        /**
         * Enum HIT_NUM for value: "hit_num"
         */
        public static final StatTypeEnum HIT_NUM = new StatTypeEnum("hit_num");
        
        /**
         * Enum BS_NUM for value: "bs_num"
         */
        public static final StatTypeEnum BS_NUM = new StatTypeEnum("bs_num");
        
        /**
         * Enum BS_FAIL_NUM for value: "bs_fail_num"
         */
        public static final StatTypeEnum BS_FAIL_NUM = new StatTypeEnum("bs_fail_num");
        
        /**
         * Enum HIT_FLUX for value: "hit_flux"
         */
        public static final StatTypeEnum HIT_FLUX = new StatTypeEnum("hit_flux");
        

        private static final Map<String, StatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatTypeEnum> createStaticFields() {
            Map<String, StatTypeEnum> map = new HashMap<>();
            map.put("bw", BW);
            map.put("flux", FLUX);
            map.put("bs_bw", BS_BW);
            map.put("bs_flux", BS_FLUX);
            map.put("req_num", REQ_NUM);
            map.put("hit_num", HIT_NUM);
            map.put("bs_num", BS_NUM);
            map.put("bs_fail_num", BS_FAIL_NUM);
            map.put("hit_flux", HIT_FLUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatTypeEnum(value);
            }
            return result;
        }

        public static StatTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof StatTypeEnum) {
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
    @JsonProperty(value="stat_type")
    
    private StatTypeEnum statType;

    public ShowDomainItemDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 当用户开启企业项目功能时，该参数生效，表示资源所属企业项目，不传表示默认项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ShowDomainItemDetailsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 查询起始时间戳，必须设为5分钟整时刻点
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public ShowDomainItemDetailsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 查询结束时间戳，必须设为5分钟整时刻点，与开始时间戳时间差不可以超过一天
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public ShowDomainItemDetailsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 域名列表，多个域名以逗号（半角）分隔，如：www.test1.com,www.test2.com，all表示查询名下全部域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public ShowDomainItemDetailsRequest withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    


    /**
     * 网络资源消耗： - bw（带宽） - flux（流量） - bs_bw(回源带宽) - bs_flux（回源流量）  访问情况： - req_num（请求总数） - hit_num（请求命中次数） - bs_num(回源总数) - bs_fail_num(回源失败数) - hit_flux（命中流量）
     * @return statType
     */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainItemDetailsRequest showDomainItemDetailsRequest = (ShowDomainItemDetailsRequest) o;
        return Objects.equals(this.enterpriseProjectId, showDomainItemDetailsRequest.enterpriseProjectId) &&
            Objects.equals(this.startTime, showDomainItemDetailsRequest.startTime) &&
            Objects.equals(this.endTime, showDomainItemDetailsRequest.endTime) &&
            Objects.equals(this.domainName, showDomainItemDetailsRequest.domainName) &&
            Objects.equals(this.statType, showDomainItemDetailsRequest.statType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, startTime, endTime, domainName, statType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemDetailsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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

