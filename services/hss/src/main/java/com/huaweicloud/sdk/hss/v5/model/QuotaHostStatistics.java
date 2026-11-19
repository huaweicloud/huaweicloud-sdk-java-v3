package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额主机统计信息
 */
public class QuotaHostStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "about_to_expire_num")

    private Integer aboutToExpireNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_num")

    private Integer idleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    public QuotaHostStatistics withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 配额版本 **取值范围**: - hss.version.basic：基础版 - hss.version.advanced：高级版 - hss.version.enterprise：企业版 - hss.version.premium：旗舰版 - hss.version.container：容器版 - hss.version.wtp：网页防篡改版 - hss.version.container_wtp：容器网页防篡改版 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public QuotaHostStatistics withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 该版本配额总数 **取值范围**: 最小值0，最大值2147483647 
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public QuotaHostStatistics withAboutToExpireNum(Integer aboutToExpireNum) {
        this.aboutToExpireNum = aboutToExpireNum;
        return this;
    }

    /**
     * **参数解释**: 即将过期的配额数量 **取值范围**: 最小值0，最大值2147483647 
     * @return aboutToExpireNum
     */
    public Integer getAboutToExpireNum() {
        return aboutToExpireNum;
    }

    public void setAboutToExpireNum(Integer aboutToExpireNum) {
        this.aboutToExpireNum = aboutToExpireNum;
    }

    public QuotaHostStatistics withIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
        return this;
    }

    /**
     * **参数解释**: 空闲配额数量 **取值范围**: 最小值0，最大值2147483647 
     * @return idleNum
     */
    public Integer getIdleNum() {
        return idleNum;
    }

    public void setIdleNum(Integer idleNum) {
        this.idleNum = idleNum;
    }

    public QuotaHostStatistics withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 已使用该版本配额的主机数量 **取值范围**: 最小值0，最大值2147483647 
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaHostStatistics that = (QuotaHostStatistics) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.aboutToExpireNum, that.aboutToExpireNum)
            && Objects.equals(this.idleNum, that.idleNum) && Objects.equals(this.hostNum, that.hostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, totalNum, aboutToExpireNum, idleNum, hostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaHostStatistics {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    aboutToExpireNum: ").append(toIndentedString(aboutToExpireNum)).append("\n");
        sb.append("    idleNum: ").append(toIndentedString(idleNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
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
