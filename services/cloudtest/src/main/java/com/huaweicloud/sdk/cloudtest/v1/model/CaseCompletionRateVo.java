package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 计算用例完成率
 */
public class CaseCompletionRateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completion_rate")

    private String completionRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_number_list")

    private List<NameAndValueVo> statusNumberList = null;

    public CaseCompletionRateVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总用例数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CaseCompletionRateVo withCompletionRate(String completionRate) {
        this.completionRate = completionRate;
        return this;
    }

    /**
     * 用例完成率
     * @return completionRate
     */
    public String getCompletionRate() {
        return completionRate;
    }

    public void setCompletionRate(String completionRate) {
        this.completionRate = completionRate;
    }

    public CaseCompletionRateVo withStatusNumberList(List<NameAndValueVo> statusNumberList) {
        this.statusNumberList = statusNumberList;
        return this;
    }

    public CaseCompletionRateVo addStatusNumberListItem(NameAndValueVo statusNumberListItem) {
        if (this.statusNumberList == null) {
            this.statusNumberList = new ArrayList<>();
        }
        this.statusNumberList.add(statusNumberListItem);
        return this;
    }

    public CaseCompletionRateVo withStatusNumberList(Consumer<List<NameAndValueVo>> statusNumberListSetter) {
        if (this.statusNumberList == null) {
            this.statusNumberList = new ArrayList<>();
        }
        statusNumberListSetter.accept(this.statusNumberList);
        return this;
    }

    /**
     * 用户自定义状态对应的用例数目
     * @return statusNumberList
     */
    public List<NameAndValueVo> getStatusNumberList() {
        return statusNumberList;
    }

    public void setStatusNumberList(List<NameAndValueVo> statusNumberList) {
        this.statusNumberList = statusNumberList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseCompletionRateVo that = (CaseCompletionRateVo) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.completionRate, that.completionRate)
            && Objects.equals(this.statusNumberList, that.statusNumberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, completionRate, statusNumberList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseCompletionRateVo {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    completionRate: ").append(toIndentedString(completionRate)).append("\n");
        sb.append("    statusNumberList: ").append(toIndentedString(statusNumberList)).append("\n");
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
