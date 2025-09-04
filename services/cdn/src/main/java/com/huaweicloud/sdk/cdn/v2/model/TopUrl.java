package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * top_url配置
 */
public class TopUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by_code")

    private Boolean sortByCode;

    public TopUrl withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 配置开关
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public TopUrl withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 热点统计配置指标的上报数量。如top_url 100、top_url 1000
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public TopUrl withSortByCode(Boolean sortByCode) {
        this.sortByCode = sortByCode;
        return this;
    }

    /**
     * 热点统计类指标是否支持按状态码上报
     * @return sortByCode
     */
    public Boolean getSortByCode() {
        return sortByCode;
    }

    public void setSortByCode(Boolean sortByCode) {
        this.sortByCode = sortByCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopUrl that = (TopUrl) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortByCode, that.sortByCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, limit, sortByCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopUrl {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortByCode: ").append(toIndentedString(sortByCode)).append("\n");
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
