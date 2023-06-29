package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LeagueDatasetStatisticsVo
 */
public class LeagueDatasetStatisticsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_domain_alias")

    private String datasetDomainAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_domain_name")

    private String datasetDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_intercept_cnt")

    private Long datasetInterceptCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_use_cnt")

    private Long datasetUseCnt;

    public LeagueDatasetStatisticsVo withDatasetDomainAlias(String datasetDomainAlias) {
        this.datasetDomainAlias = datasetDomainAlias;
        return this;
    }

    /**
     * 参与方别名
     * @return datasetDomainAlias
     */
    public String getDatasetDomainAlias() {
        return datasetDomainAlias;
    }

    public void setDatasetDomainAlias(String datasetDomainAlias) {
        this.datasetDomainAlias = datasetDomainAlias;
    }

    public LeagueDatasetStatisticsVo withDatasetDomainName(String datasetDomainName) {
        this.datasetDomainName = datasetDomainName;
        return this;
    }

    /**
     * 参与方租户名称
     * @return datasetDomainName
     */
    public String getDatasetDomainName() {
        return datasetDomainName;
    }

    public void setDatasetDomainName(String datasetDomainName) {
        this.datasetDomainName = datasetDomainName;
    }

    public LeagueDatasetStatisticsVo withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * 数据集id
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public LeagueDatasetStatisticsVo withDatasetInterceptCnt(Long datasetInterceptCnt) {
        this.datasetInterceptCnt = datasetInterceptCnt;
        return this;
    }

    /**
     * 数据集拦截次数
     * @return datasetInterceptCnt
     */
    public Long getDatasetInterceptCnt() {
        return datasetInterceptCnt;
    }

    public void setDatasetInterceptCnt(Long datasetInterceptCnt) {
        this.datasetInterceptCnt = datasetInterceptCnt;
    }

    public LeagueDatasetStatisticsVo withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * 数据集名称
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public LeagueDatasetStatisticsVo withDatasetUseCnt(Long datasetUseCnt) {
        this.datasetUseCnt = datasetUseCnt;
        return this;
    }

    /**
     * 数据集使用次数
     * @return datasetUseCnt
     */
    public Long getDatasetUseCnt() {
        return datasetUseCnt;
    }

    public void setDatasetUseCnt(Long datasetUseCnt) {
        this.datasetUseCnt = datasetUseCnt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LeagueDatasetStatisticsVo that = (LeagueDatasetStatisticsVo) obj;
        return Objects.equals(this.datasetDomainAlias, that.datasetDomainAlias)
            && Objects.equals(this.datasetDomainName, that.datasetDomainName)
            && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.datasetInterceptCnt, that.datasetInterceptCnt)
            && Objects.equals(this.datasetName, that.datasetName)
            && Objects.equals(this.datasetUseCnt, that.datasetUseCnt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(datasetDomainAlias, datasetDomainName, datasetId, datasetInterceptCnt, datasetName, datasetUseCnt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeagueDatasetStatisticsVo {\n");
        sb.append("    datasetDomainAlias: ").append(toIndentedString(datasetDomainAlias)).append("\n");
        sb.append("    datasetDomainName: ").append(toIndentedString(datasetDomainName)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    datasetInterceptCnt: ").append(toIndentedString(datasetInterceptCnt)).append("\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    datasetUseCnt: ").append(toIndentedString(datasetUseCnt)).append("\n");
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
