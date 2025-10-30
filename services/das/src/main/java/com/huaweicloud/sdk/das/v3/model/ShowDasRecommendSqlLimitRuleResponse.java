package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDasRecommendSqlLimitRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_limit_infos")

    private List<RecommendSqlLimitRuleRespSqlLimitInfos> sqlLimitInfos = null;

    public ShowDasRecommendSqlLimitRuleResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowDasRecommendSqlLimitRuleResponse withSqlLimitInfos(
        List<RecommendSqlLimitRuleRespSqlLimitInfos> sqlLimitInfos) {
        this.sqlLimitInfos = sqlLimitInfos;
        return this;
    }

    public ShowDasRecommendSqlLimitRuleResponse addSqlLimitInfosItem(
        RecommendSqlLimitRuleRespSqlLimitInfos sqlLimitInfosItem) {
        if (this.sqlLimitInfos == null) {
            this.sqlLimitInfos = new ArrayList<>();
        }
        this.sqlLimitInfos.add(sqlLimitInfosItem);
        return this;
    }

    public ShowDasRecommendSqlLimitRuleResponse withSqlLimitInfos(
        Consumer<List<RecommendSqlLimitRuleRespSqlLimitInfos>> sqlLimitInfosSetter) {
        if (this.sqlLimitInfos == null) {
            this.sqlLimitInfos = new ArrayList<>();
        }
        sqlLimitInfosSetter.accept(this.sqlLimitInfos);
        return this;
    }

    /**
     * sql的限流信息
     * @return sqlLimitInfos
     */
    public List<RecommendSqlLimitRuleRespSqlLimitInfos> getSqlLimitInfos() {
        return sqlLimitInfos;
    }

    public void setSqlLimitInfos(List<RecommendSqlLimitRuleRespSqlLimitInfos> sqlLimitInfos) {
        this.sqlLimitInfos = sqlLimitInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDasRecommendSqlLimitRuleResponse that = (ShowDasRecommendSqlLimitRuleResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.sqlLimitInfos, that.sqlLimitInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, sqlLimitInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDasRecommendSqlLimitRuleResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    sqlLimitInfos: ").append(toIndentedString(sqlLimitInfos)).append("\n");
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
