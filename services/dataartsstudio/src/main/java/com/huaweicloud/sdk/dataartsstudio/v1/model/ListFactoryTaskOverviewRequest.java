package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFactoryTaskOverviewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_own")

    private String isOwn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_days")

    private String queryDays;

    public ListFactoryTaskOverviewRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListFactoryTaskOverviewRequest withIsOwn(String isOwn) {
        this.isOwn = isOwn;
        return this;
    }

    /**
     * 是否查询当前用户的实例，默认为false，表示查询全部用户实例，为true时，表示查询当前用户的实例。
     * @return isOwn
     */
    public String getIsOwn() {
        return isOwn;
    }

    public void setIsOwn(String isOwn) {
        this.isOwn = isOwn;
    }

    public ListFactoryTaskOverviewRequest withQueryDays(String queryDays) {
        this.queryDays = queryDays;
        return this;
    }

    /**
     * 查询的天数，取值范围为：today、yesterday、before_yesterday、all，默认为today，表示查询今天的数据，支持查询近7天的数据。 today：查询当天的实例状态数量， yesterday：查询昨天的实例状态数量， before_yesterday：查询前天的实例状态数量， all：查询7天前到当天的实例状态总量。
     * @return queryDays
     */
    public String getQueryDays() {
        return queryDays;
    }

    public void setQueryDays(String queryDays) {
        this.queryDays = queryDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryTaskOverviewRequest that = (ListFactoryTaskOverviewRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.isOwn, that.isOwn)
            && Objects.equals(this.queryDays, that.queryDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, isOwn, queryDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryTaskOverviewRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    isOwn: ").append(toIndentedString(isOwn)).append("\n");
        sb.append("    queryDays: ").append(toIndentedString(queryDays)).append("\n");
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
