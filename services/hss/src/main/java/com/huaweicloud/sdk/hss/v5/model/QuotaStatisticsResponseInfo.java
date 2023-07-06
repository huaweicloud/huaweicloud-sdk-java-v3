package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuotaStatisticsResponseInfo
 */
public class QuotaStatisticsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public QuotaStatisticsResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 资源规格编码，包含如下:   - hss.version.basic : 基础版   - hss.version.advanced : 专业版   - hss.version.enterprise : 企业版   - hss.version.premium : 旗舰版   - hss.version.wtp : 网页防篡改版   - hss.version.container : 容器版
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public QuotaStatisticsResponseInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 10000000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaStatisticsResponseInfo that = (QuotaStatisticsResponseInfo) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaStatisticsResponseInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
