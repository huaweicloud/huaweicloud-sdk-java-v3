package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 整体缺陷信息
 */
public class DefectVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_solved")

    private Integer notSolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_number_list")

    private List<NameAndValueVo> severityNumberList = null;

    public DefectVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 缺陷数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public DefectVo withNotSolved(Integer notSolved) {
        this.notSolved = notSolved;
        return this;
    }

    /**
     * 未关闭缺陷数
     * @return notSolved
     */
    public Integer getNotSolved() {
        return notSolved;
    }

    public void setNotSolved(Integer notSolved) {
        this.notSolved = notSolved;
    }

    public DefectVo withSeverityNumberList(List<NameAndValueVo> severityNumberList) {
        this.severityNumberList = severityNumberList;
        return this;
    }

    public DefectVo addSeverityNumberListItem(NameAndValueVo severityNumberListItem) {
        if (this.severityNumberList == null) {
            this.severityNumberList = new ArrayList<>();
        }
        this.severityNumberList.add(severityNumberListItem);
        return this;
    }

    public DefectVo withSeverityNumberList(Consumer<List<NameAndValueVo>> severityNumberListSetter) {
        if (this.severityNumberList == null) {
            this.severityNumberList = new ArrayList<>();
        }
        severityNumberListSetter.accept(this.severityNumberList);
        return this;
    }

    /**
     * 组装缺陷每种重要程度的名称和对应的数目
     * @return severityNumberList
     */
    public List<NameAndValueVo> getSeverityNumberList() {
        return severityNumberList;
    }

    public void setSeverityNumberList(List<NameAndValueVo> severityNumberList) {
        this.severityNumberList = severityNumberList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefectVo that = (DefectVo) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.notSolved, that.notSolved)
            && Objects.equals(this.severityNumberList, that.severityNumberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, notSolved, severityNumberList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefectVo {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    notSolved: ").append(toIndentedString(notSolved)).append("\n");
        sb.append("    severityNumberList: ").append(toIndentedString(severityNumberList)).append("\n");
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
