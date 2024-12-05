package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StatisticStandardCoverageVO
 */
public class StatisticStandardCoverageVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_col_num")

    private String allColNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "col_num")

    private String colNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage")

    private Double coverage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<AllTableVO> details = null;

    public StatisticStandardCoverageVO withAllColNum(String allColNum) {
        this.allColNum = allColNum;
        return this;
    }

    /**
     * 字段总数，ID字符串。
     * @return allColNum
     */
    public String getAllColNum() {
        return allColNum;
    }

    public void setAllColNum(String allColNum) {
        this.allColNum = allColNum;
    }

    public StatisticStandardCoverageVO withColNum(String colNum) {
        this.colNum = colNum;
        return this;
    }

    /**
     * 关联标准字段数，ID字符串。
     * @return colNum
     */
    public String getColNum() {
        return colNum;
    }

    public void setColNum(String colNum) {
        this.colNum = colNum;
    }

    public StatisticStandardCoverageVO withCoverage(Double coverage) {
        this.coverage = coverage;
        return this;
    }

    /**
     * 标准覆盖率。
     * @return coverage
     */
    public Double getCoverage() {
        return coverage;
    }

    public void setCoverage(Double coverage) {
        this.coverage = coverage;
    }

    public StatisticStandardCoverageVO withDetails(List<AllTableVO> details) {
        this.details = details;
        return this;
    }

    public StatisticStandardCoverageVO addDetailsItem(AllTableVO detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public StatisticStandardCoverageVO withDetails(Consumer<List<AllTableVO>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 引用表数组。
     * @return details
     */
    public List<AllTableVO> getDetails() {
        return details;
    }

    public void setDetails(List<AllTableVO> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticStandardCoverageVO that = (StatisticStandardCoverageVO) obj;
        return Objects.equals(this.allColNum, that.allColNum) && Objects.equals(this.colNum, that.colNum)
            && Objects.equals(this.coverage, that.coverage) && Objects.equals(this.details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allColNum, colNum, coverage, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticStandardCoverageVO {\n");
        sb.append("    allColNum: ").append(toIndentedString(allColNum)).append("\n");
        sb.append("    colNum: ").append(toIndentedString(colNum)).append("\n");
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
