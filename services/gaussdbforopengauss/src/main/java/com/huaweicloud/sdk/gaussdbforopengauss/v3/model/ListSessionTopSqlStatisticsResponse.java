package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListSessionTopSqlStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_sql_info")

    private List<SessionTopSqlStatisticInfo> topSqlInfo = null;

    public ListSessionTopSqlStatisticsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 统计总条数。 **取值范围**: 不涉及。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSessionTopSqlStatisticsResponse withTopSqlInfo(List<SessionTopSqlStatisticInfo> topSqlInfo) {
        this.topSqlInfo = topSqlInfo;
        return this;
    }

    public ListSessionTopSqlStatisticsResponse addTopSqlInfoItem(SessionTopSqlStatisticInfo topSqlInfoItem) {
        if (this.topSqlInfo == null) {
            this.topSqlInfo = new ArrayList<>();
        }
        this.topSqlInfo.add(topSqlInfoItem);
        return this;
    }

    public ListSessionTopSqlStatisticsResponse withTopSqlInfo(
        Consumer<List<SessionTopSqlStatisticInfo>> topSqlInfoSetter) {
        if (this.topSqlInfo == null) {
            this.topSqlInfo = new ArrayList<>();
        }
        topSqlInfoSetter.accept(this.topSqlInfo);
        return this;
    }

    /**
     * **参数解释**: 统计数据。 
     * @return topSqlInfo
     */
    public List<SessionTopSqlStatisticInfo> getTopSqlInfo() {
        return topSqlInfo;
    }

    public void setTopSqlInfo(List<SessionTopSqlStatisticInfo> topSqlInfo) {
        this.topSqlInfo = topSqlInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionTopSqlStatisticsResponse that = (ListSessionTopSqlStatisticsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.topSqlInfo, that.topSqlInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, topSqlInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionTopSqlStatisticsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    topSqlInfo: ").append(toIndentedString(topSqlInfo)).append("\n");
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
