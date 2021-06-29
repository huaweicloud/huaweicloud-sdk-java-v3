package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTopStatisticsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="date")
    
    private String date;

    public ListTopStatisticsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 查询域名，暂只支持查询单个或者全部域名。  取值如下： - 单个加速域名，格式：example.test1.com。 - ALL：表示查询名下全部域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ListTopStatisticsRequest withDate(String date) {
        this.date = date;
        return this;
    }

    


    /**
     * 查询日期，格式为yyyymmdd - date必须为昨天或之前的日期。 - 最多只能查最近一个月内的数据。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopStatisticsRequest listTopStatisticsRequest = (ListTopStatisticsRequest) o;
        return Objects.equals(this.domain, listTopStatisticsRequest.domain) &&
            Objects.equals(this.date, listTopStatisticsRequest.date);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, date);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopStatisticsRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

