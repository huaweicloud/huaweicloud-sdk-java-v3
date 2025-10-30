package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowRecommendSqlLimitRuleRequestBody
 */
public class ShowRecommendSqlLimitRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_recommendation_type")

    private String rdsRecommendationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taurus_recommendation_type")

    private String taurusRecommendationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_count")

    private Long recommendCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public ShowRecommendSqlLimitRuleRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型，目前只支持mysql或者taurus
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ShowRecommendSqlLimitRuleRequestBody withRdsRecommendationType(String rdsRecommendationType) {
        this.rdsRecommendationType = rdsRecommendationType;
        return this;
    }

    /**
     * 如果是rds类型， 那么可以选择'count', 'average_time', 'max_time', 'all'这几种类型
     * @return rdsRecommendationType
     */
    public String getRdsRecommendationType() {
        return rdsRecommendationType;
    }

    public void setRdsRecommendationType(String rdsRecommendationType) {
        this.rdsRecommendationType = rdsRecommendationType;
    }

    public ShowRecommendSqlLimitRuleRequestBody withTaurusRecommendationType(String taurusRecommendationType) {
        this.taurusRecommendationType = taurusRecommendationType;
        return this;
    }

    /**
     * 如果选择了taurus类型，那么可以选择'count', 'avg_time'
     * @return taurusRecommendationType
     */
    public String getTaurusRecommendationType() {
        return taurusRecommendationType;
    }

    public void setTaurusRecommendationType(String taurusRecommendationType) {
        this.taurusRecommendationType = taurusRecommendationType;
    }

    public ShowRecommendSqlLimitRuleRequestBody withRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
        return this;
    }

    /**
     * 推荐数量
     * @return recommendCount
     */
    public Long getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
    }

    public ShowRecommendSqlLimitRuleRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 如果选择了taurus， 那么需要制定node id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRecommendSqlLimitRuleRequestBody that = (ShowRecommendSqlLimitRuleRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.rdsRecommendationType, that.rdsRecommendationType)
            && Objects.equals(this.taurusRecommendationType, that.taurusRecommendationType)
            && Objects.equals(this.recommendCount, that.recommendCount) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, rdsRecommendationType, taurusRecommendationType, recommendCount, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecommendSqlLimitRuleRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    rdsRecommendationType: ").append(toIndentedString(rdsRecommendationType)).append("\n");
        sb.append("    taurusRecommendationType: ").append(toIndentedString(taurusRecommendationType)).append("\n");
        sb.append("    recommendCount: ").append(toIndentedString(recommendCount)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
