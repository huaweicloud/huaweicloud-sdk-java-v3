package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LeaguePartnerStatisticsVo
 */
public class LeaguePartnerStatisticsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_access_cnt")

    private Long partnerAccessCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_alias")

    private String partnerDomainAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_name")

    private String partnerDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_job_cnt")

    private Long partnerJobCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_job_ins_cnt")

    private Long partnerJobInsCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_job_ins_fail_cnt")

    private Long partnerJobInsFailCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_job_ins_intercept_cnt")

    private Long partnerJobInsInterceptCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_job_ins_success_cnt")

    private Long partnerJobInsSuccessCnt;

    public LeaguePartnerStatisticsVo withPartnerAccessCnt(Long partnerAccessCnt) {
        this.partnerAccessCnt = partnerAccessCnt;
        return this;
    }

    /**
     * 合作方访问次数
     * @return partnerAccessCnt
     */
    public Long getPartnerAccessCnt() {
        return partnerAccessCnt;
    }

    public void setPartnerAccessCnt(Long partnerAccessCnt) {
        this.partnerAccessCnt = partnerAccessCnt;
    }

    public LeaguePartnerStatisticsVo withPartnerDomainAlias(String partnerDomainAlias) {
        this.partnerDomainAlias = partnerDomainAlias;
        return this;
    }

    /**
     * 租户别名
     * @return partnerDomainAlias
     */
    public String getPartnerDomainAlias() {
        return partnerDomainAlias;
    }

    public void setPartnerDomainAlias(String partnerDomainAlias) {
        this.partnerDomainAlias = partnerDomainAlias;
    }

    public LeaguePartnerStatisticsVo withPartnerDomainName(String partnerDomainName) {
        this.partnerDomainName = partnerDomainName;
        return this;
    }

    /**
     * 租户名
     * @return partnerDomainName
     */
    public String getPartnerDomainName() {
        return partnerDomainName;
    }

    public void setPartnerDomainName(String partnerDomainName) {
        this.partnerDomainName = partnerDomainName;
    }

    public LeaguePartnerStatisticsVo withPartnerJobCnt(Long partnerJobCnt) {
        this.partnerJobCnt = partnerJobCnt;
        return this;
    }

    /**
     * 作业总数
     * @return partnerJobCnt
     */
    public Long getPartnerJobCnt() {
        return partnerJobCnt;
    }

    public void setPartnerJobCnt(Long partnerJobCnt) {
        this.partnerJobCnt = partnerJobCnt;
    }

    public LeaguePartnerStatisticsVo withPartnerJobInsCnt(Long partnerJobInsCnt) {
        this.partnerJobInsCnt = partnerJobInsCnt;
        return this;
    }

    /**
     * 实例总数
     * @return partnerJobInsCnt
     */
    public Long getPartnerJobInsCnt() {
        return partnerJobInsCnt;
    }

    public void setPartnerJobInsCnt(Long partnerJobInsCnt) {
        this.partnerJobInsCnt = partnerJobInsCnt;
    }

    public LeaguePartnerStatisticsVo withPartnerJobInsFailCnt(Long partnerJobInsFailCnt) {
        this.partnerJobInsFailCnt = partnerJobInsFailCnt;
        return this;
    }

    /**
     * 实例失败数
     * @return partnerJobInsFailCnt
     */
    public Long getPartnerJobInsFailCnt() {
        return partnerJobInsFailCnt;
    }

    public void setPartnerJobInsFailCnt(Long partnerJobInsFailCnt) {
        this.partnerJobInsFailCnt = partnerJobInsFailCnt;
    }

    public LeaguePartnerStatisticsVo withPartnerJobInsInterceptCnt(Long partnerJobInsInterceptCnt) {
        this.partnerJobInsInterceptCnt = partnerJobInsInterceptCnt;
        return this;
    }

    /**
     * 实例拦截数
     * @return partnerJobInsInterceptCnt
     */
    public Long getPartnerJobInsInterceptCnt() {
        return partnerJobInsInterceptCnt;
    }

    public void setPartnerJobInsInterceptCnt(Long partnerJobInsInterceptCnt) {
        this.partnerJobInsInterceptCnt = partnerJobInsInterceptCnt;
    }

    public LeaguePartnerStatisticsVo withPartnerJobInsSuccessCnt(Long partnerJobInsSuccessCnt) {
        this.partnerJobInsSuccessCnt = partnerJobInsSuccessCnt;
        return this;
    }

    /**
     * 实例成功数
     * @return partnerJobInsSuccessCnt
     */
    public Long getPartnerJobInsSuccessCnt() {
        return partnerJobInsSuccessCnt;
    }

    public void setPartnerJobInsSuccessCnt(Long partnerJobInsSuccessCnt) {
        this.partnerJobInsSuccessCnt = partnerJobInsSuccessCnt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LeaguePartnerStatisticsVo that = (LeaguePartnerStatisticsVo) obj;
        return Objects.equals(this.partnerAccessCnt, that.partnerAccessCnt)
            && Objects.equals(this.partnerDomainAlias, that.partnerDomainAlias)
            && Objects.equals(this.partnerDomainName, that.partnerDomainName)
            && Objects.equals(this.partnerJobCnt, that.partnerJobCnt)
            && Objects.equals(this.partnerJobInsCnt, that.partnerJobInsCnt)
            && Objects.equals(this.partnerJobInsFailCnt, that.partnerJobInsFailCnt)
            && Objects.equals(this.partnerJobInsInterceptCnt, that.partnerJobInsInterceptCnt)
            && Objects.equals(this.partnerJobInsSuccessCnt, that.partnerJobInsSuccessCnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partnerAccessCnt,
            partnerDomainAlias,
            partnerDomainName,
            partnerJobCnt,
            partnerJobInsCnt,
            partnerJobInsFailCnt,
            partnerJobInsInterceptCnt,
            partnerJobInsSuccessCnt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeaguePartnerStatisticsVo {\n");
        sb.append("    partnerAccessCnt: ").append(toIndentedString(partnerAccessCnt)).append("\n");
        sb.append("    partnerDomainAlias: ").append(toIndentedString(partnerDomainAlias)).append("\n");
        sb.append("    partnerDomainName: ").append(toIndentedString(partnerDomainName)).append("\n");
        sb.append("    partnerJobCnt: ").append(toIndentedString(partnerJobCnt)).append("\n");
        sb.append("    partnerJobInsCnt: ").append(toIndentedString(partnerJobInsCnt)).append("\n");
        sb.append("    partnerJobInsFailCnt: ").append(toIndentedString(partnerJobInsFailCnt)).append("\n");
        sb.append("    partnerJobInsInterceptCnt: ").append(toIndentedString(partnerJobInsInterceptCnt)).append("\n");
        sb.append("    partnerJobInsSuccessCnt: ").append(toIndentedString(partnerJobInsSuccessCnt)).append("\n");
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
