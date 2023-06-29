package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobReportPartnerVo
 */
public class JobReportPartnerVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_output_cnt")

    private Long dataOutputCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_alias")

    private String partnerDomainAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_name")

    private String partnerDomainName;

    public JobReportPartnerVo withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 数据集所在代理
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public JobReportPartnerVo withDataOutputCnt(Long dataOutputCnt) {
        this.dataOutputCnt = dataOutputCnt;
        return this;
    }

    /**
     * 代理输出数据总量
     * minimum: 0
     * maximum: 2147483647
     * @return dataOutputCnt
     */
    public Long getDataOutputCnt() {
        return dataOutputCnt;
    }

    public void setDataOutputCnt(Long dataOutputCnt) {
        this.dataOutputCnt = dataOutputCnt;
    }

    public JobReportPartnerVo withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * 数据集名
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public JobReportPartnerVo withPartnerDomainAlias(String partnerDomainAlias) {
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

    public JobReportPartnerVo withPartnerDomainName(String partnerDomainName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobReportPartnerVo that = (JobReportPartnerVo) obj;
        return Objects.equals(this.agentName, that.agentName) && Objects.equals(this.dataOutputCnt, that.dataOutputCnt)
            && Objects.equals(this.datasetName, that.datasetName)
            && Objects.equals(this.partnerDomainAlias, that.partnerDomainAlias)
            && Objects.equals(this.partnerDomainName, that.partnerDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentName, dataOutputCnt, datasetName, partnerDomainAlias, partnerDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobReportPartnerVo {\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    dataOutputCnt: ").append(toIndentedString(dataOutputCnt)).append("\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    partnerDomainAlias: ").append(toIndentedString(partnerDomainAlias)).append("\n");
        sb.append("    partnerDomainName: ").append(toIndentedString(partnerDomainName)).append("\n");
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
