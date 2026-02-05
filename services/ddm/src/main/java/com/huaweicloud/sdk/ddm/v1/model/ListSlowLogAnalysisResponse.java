package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListSlowLogAnalysisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_list")

    private List<ESDBSlowSqlTemplateItem> slowLogList = null;

    public ListSlowLogAnalysisResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  分页参数: 每页记录数。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSlowLogAnalysisResponse withSlowLogList(List<ESDBSlowSqlTemplateItem> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    public ListSlowLogAnalysisResponse addSlowLogListItem(ESDBSlowSqlTemplateItem slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ListSlowLogAnalysisResponse withSlowLogList(Consumer<List<ESDBSlowSqlTemplateItem>> slowLogListSetter) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * **参数解释**：  慢日志列表。  **参数范围**：  不涉及。
     * @return slowLogList
     */
    public List<ESDBSlowSqlTemplateItem> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<ESDBSlowSqlTemplateItem> slowLogList) {
        this.slowLogList = slowLogList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSlowLogAnalysisResponse that = (ListSlowLogAnalysisResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.slowLogList, that.slowLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, slowLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowLogAnalysisResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
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
