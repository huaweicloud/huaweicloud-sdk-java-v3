package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowReplayResultsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_statics")

    private List<ReplayShardStaticsResp> shardStatics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sqls")

    private List<ReplaySlowSqlResp> slowSqls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_templates")

    private List<ReplaySlowSqlTemplateResp> slowSqlTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_sqls")

    private List<ReplayErrorSqlResp> errorSqls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_sql_templates")

    private List<ReplayErrorSqlTemplateResp> errorSqlTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replaying_sqls")

    private List<ReplayingSqlResp> replayingSqls = null;

    public ShowReplayResultsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据总量
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowReplayResultsResponse withShardStatics(List<ReplayShardStaticsResp> shardStatics) {
        this.shardStatics = shardStatics;
        return this;
    }

    public ShowReplayResultsResponse addShardStaticsItem(ReplayShardStaticsResp shardStaticsItem) {
        if (this.shardStatics == null) {
            this.shardStatics = new ArrayList<>();
        }
        this.shardStatics.add(shardStaticsItem);
        return this;
    }

    public ShowReplayResultsResponse withShardStatics(Consumer<List<ReplayShardStaticsResp>> shardStaticsSetter) {
        if (this.shardStatics == null) {
            this.shardStatics = new ArrayList<>();
        }
        shardStaticsSetter.accept(this.shardStatics);
        return this;
    }

    /**
     * 回放基于时间统计详细信息列表，在type为shard_statistics时返回
     * @return shardStatics
     */
    public List<ReplayShardStaticsResp> getShardStatics() {
        return shardStatics;
    }

    public void setShardStatics(List<ReplayShardStaticsResp> shardStatics) {
        this.shardStatics = shardStatics;
    }

    public ShowReplayResultsResponse withSlowSqls(List<ReplaySlowSqlResp> slowSqls) {
        this.slowSqls = slowSqls;
        return this;
    }

    public ShowReplayResultsResponse addSlowSqlsItem(ReplaySlowSqlResp slowSqlsItem) {
        if (this.slowSqls == null) {
            this.slowSqls = new ArrayList<>();
        }
        this.slowSqls.add(slowSqlsItem);
        return this;
    }

    public ShowReplayResultsResponse withSlowSqls(Consumer<List<ReplaySlowSqlResp>> slowSqlsSetter) {
        if (this.slowSqls == null) {
            this.slowSqls = new ArrayList<>();
        }
        slowSqlsSetter.accept(this.slowSqls);
        return this;
    }

    /**
     * 慢SQL信息列表，在type为slow_sql时返回
     * @return slowSqls
     */
    public List<ReplaySlowSqlResp> getSlowSqls() {
        return slowSqls;
    }

    public void setSlowSqls(List<ReplaySlowSqlResp> slowSqls) {
        this.slowSqls = slowSqls;
    }

    public ShowReplayResultsResponse withSlowSqlTemplates(List<ReplaySlowSqlTemplateResp> slowSqlTemplates) {
        this.slowSqlTemplates = slowSqlTemplates;
        return this;
    }

    public ShowReplayResultsResponse addSlowSqlTemplatesItem(ReplaySlowSqlTemplateResp slowSqlTemplatesItem) {
        if (this.slowSqlTemplates == null) {
            this.slowSqlTemplates = new ArrayList<>();
        }
        this.slowSqlTemplates.add(slowSqlTemplatesItem);
        return this;
    }

    public ShowReplayResultsResponse withSlowSqlTemplates(
        Consumer<List<ReplaySlowSqlTemplateResp>> slowSqlTemplatesSetter) {
        if (this.slowSqlTemplates == null) {
            this.slowSqlTemplates = new ArrayList<>();
        }
        slowSqlTemplatesSetter.accept(this.slowSqlTemplates);
        return this;
    }

    /**
     * 慢SQL统计信息列表，在type为slow_sql_template时返回
     * @return slowSqlTemplates
     */
    public List<ReplaySlowSqlTemplateResp> getSlowSqlTemplates() {
        return slowSqlTemplates;
    }

    public void setSlowSqlTemplates(List<ReplaySlowSqlTemplateResp> slowSqlTemplates) {
        this.slowSqlTemplates = slowSqlTemplates;
    }

    public ShowReplayResultsResponse withErrorSqls(List<ReplayErrorSqlResp> errorSqls) {
        this.errorSqls = errorSqls;
        return this;
    }

    public ShowReplayResultsResponse addErrorSqlsItem(ReplayErrorSqlResp errorSqlsItem) {
        if (this.errorSqls == null) {
            this.errorSqls = new ArrayList<>();
        }
        this.errorSqls.add(errorSqlsItem);
        return this;
    }

    public ShowReplayResultsResponse withErrorSqls(Consumer<List<ReplayErrorSqlResp>> errorSqlsSetter) {
        if (this.errorSqls == null) {
            this.errorSqls = new ArrayList<>();
        }
        errorSqlsSetter.accept(this.errorSqls);
        return this;
    }

    /**
     * 异常SQL信息列表，在type为error_sql时返回
     * @return errorSqls
     */
    public List<ReplayErrorSqlResp> getErrorSqls() {
        return errorSqls;
    }

    public void setErrorSqls(List<ReplayErrorSqlResp> errorSqls) {
        this.errorSqls = errorSqls;
    }

    public ShowReplayResultsResponse withErrorSqlTemplates(List<ReplayErrorSqlTemplateResp> errorSqlTemplates) {
        this.errorSqlTemplates = errorSqlTemplates;
        return this;
    }

    public ShowReplayResultsResponse addErrorSqlTemplatesItem(ReplayErrorSqlTemplateResp errorSqlTemplatesItem) {
        if (this.errorSqlTemplates == null) {
            this.errorSqlTemplates = new ArrayList<>();
        }
        this.errorSqlTemplates.add(errorSqlTemplatesItem);
        return this;
    }

    public ShowReplayResultsResponse withErrorSqlTemplates(
        Consumer<List<ReplayErrorSqlTemplateResp>> errorSqlTemplatesSetter) {
        if (this.errorSqlTemplates == null) {
            this.errorSqlTemplates = new ArrayList<>();
        }
        errorSqlTemplatesSetter.accept(this.errorSqlTemplates);
        return this;
    }

    /**
     * 异常SQL统计信息列表，在type为error_sql_template时返回
     * @return errorSqlTemplates
     */
    public List<ReplayErrorSqlTemplateResp> getErrorSqlTemplates() {
        return errorSqlTemplates;
    }

    public void setErrorSqlTemplates(List<ReplayErrorSqlTemplateResp> errorSqlTemplates) {
        this.errorSqlTemplates = errorSqlTemplates;
    }

    public ShowReplayResultsResponse withReplayingSqls(List<ReplayingSqlResp> replayingSqls) {
        this.replayingSqls = replayingSqls;
        return this;
    }

    public ShowReplayResultsResponse addReplayingSqlsItem(ReplayingSqlResp replayingSqlsItem) {
        if (this.replayingSqls == null) {
            this.replayingSqls = new ArrayList<>();
        }
        this.replayingSqls.add(replayingSqlsItem);
        return this;
    }

    public ShowReplayResultsResponse withReplayingSqls(Consumer<List<ReplayingSqlResp>> replayingSqlsSetter) {
        if (this.replayingSqls == null) {
            this.replayingSqls = new ArrayList<>();
        }
        replayingSqlsSetter.accept(this.replayingSqls);
        return this;
    }

    /**
     * 正在回放SQL信息列表，在type为replaying_sql时返回
     * @return replayingSqls
     */
    public List<ReplayingSqlResp> getReplayingSqls() {
        return replayingSqls;
    }

    public void setReplayingSqls(List<ReplayingSqlResp> replayingSqls) {
        this.replayingSqls = replayingSqls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReplayResultsResponse that = (ShowReplayResultsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.shardStatics, that.shardStatics)
            && Objects.equals(this.slowSqls, that.slowSqls)
            && Objects.equals(this.slowSqlTemplates, that.slowSqlTemplates)
            && Objects.equals(this.errorSqls, that.errorSqls)
            && Objects.equals(this.errorSqlTemplates, that.errorSqlTemplates)
            && Objects.equals(this.replayingSqls, that.replayingSqls);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(totalCount, shardStatics, slowSqls, slowSqlTemplates, errorSqls, errorSqlTemplates, replayingSqls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplayResultsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    shardStatics: ").append(toIndentedString(shardStatics)).append("\n");
        sb.append("    slowSqls: ").append(toIndentedString(slowSqls)).append("\n");
        sb.append("    slowSqlTemplates: ").append(toIndentedString(slowSqlTemplates)).append("\n");
        sb.append("    errorSqls: ").append(toIndentedString(errorSqls)).append("\n");
        sb.append("    errorSqlTemplates: ").append(toIndentedString(errorSqlTemplates)).append("\n");
        sb.append("    replayingSqls: ").append(toIndentedString(replayingSqls)).append("\n");
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
