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
public class ListEnhanceFullSqlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sqls")

    private List<FullSqlResult> fullSqls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_count")

    private Long limitCount;

    public ListEnhanceFullSqlsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总记录数量。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListEnhanceFullSqlsResponse withFullSqls(List<FullSqlResult> fullSqls) {
        this.fullSqls = fullSqls;
        return this;
    }

    public ListEnhanceFullSqlsResponse addFullSqlsItem(FullSqlResult fullSqlsItem) {
        if (this.fullSqls == null) {
            this.fullSqls = new ArrayList<>();
        }
        this.fullSqls.add(fullSqlsItem);
        return this;
    }

    public ListEnhanceFullSqlsResponse withFullSqls(Consumer<List<FullSqlResult>> fullSqlsSetter) {
        if (this.fullSqls == null) {
            this.fullSqls = new ArrayList<>();
        }
        fullSqlsSetter.accept(this.fullSqls);
        return this;
    }

    /**
     * **参数解释**: 全量SQL列表。
     * @return fullSqls
     */
    public List<FullSqlResult> getFullSqls() {
        return fullSqls;
    }

    public void setFullSqls(List<FullSqlResult> fullSqls) {
        this.fullSqls = fullSqls;
    }

    public ListEnhanceFullSqlsResponse withLimitCount(Long limitCount) {
        this.limitCount = limitCount;
        return this;
    }

    /**
     * **参数解释**: 最大查询记录数量。主要供前端交互控制使用。 **取值范围**: 不涉及。
     * @return limitCount
     */
    public Long getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Long limitCount) {
        this.limitCount = limitCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnhanceFullSqlsResponse that = (ListEnhanceFullSqlsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.fullSqls, that.fullSqls)
            && Objects.equals(this.limitCount, that.limitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, fullSqls, limitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnhanceFullSqlsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    fullSqls: ").append(toIndentedString(fullSqls)).append("\n");
        sb.append("    limitCount: ").append(toIndentedString(limitCount)).append("\n");
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
