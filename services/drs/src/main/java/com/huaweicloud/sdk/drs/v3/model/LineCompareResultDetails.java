package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class LineCompareResultDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LineCompareDetail")

    private List<LineCompareDetail> lineCompareDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_detail_count")

    private Integer lineCompareDetailCount;

    public LineCompareResultDetails withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public LineCompareResultDetails withLineCompareDetail(List<LineCompareDetail> lineCompareDetail) {
        this.lineCompareDetail = lineCompareDetail;
        return this;
    }

    public LineCompareResultDetails addLineCompareDetailItem(LineCompareDetail lineCompareDetailItem) {
        if (this.lineCompareDetail == null) {
            this.lineCompareDetail = new ArrayList<>();
        }
        this.lineCompareDetail.add(lineCompareDetailItem);
        return this;
    }

    public LineCompareResultDetails withLineCompareDetail(Consumer<List<LineCompareDetail>> lineCompareDetailSetter) {
        if (this.lineCompareDetail == null) {
            this.lineCompareDetail = new ArrayList<>();
        }
        lineCompareDetailSetter.accept(this.lineCompareDetail);
        return this;
    }

    /**
     * 该库的表的行对比详情。
     * @return lineCompareDetail
     */
    public List<LineCompareDetail> getLineCompareDetail() {
        return lineCompareDetail;
    }

    public void setLineCompareDetail(List<LineCompareDetail> lineCompareDetail) {
        this.lineCompareDetail = lineCompareDetail;
    }

    public LineCompareResultDetails withLineCompareDetailCount(Integer lineCompareDetailCount) {
        this.lineCompareDetailCount = lineCompareDetailCount;
        return this;
    }

    /**
     * 该库的行对比结果详情总数。
     * @return lineCompareDetailCount
     */
    public Integer getLineCompareDetailCount() {
        return lineCompareDetailCount;
    }

    public void setLineCompareDetailCount(Integer lineCompareDetailCount) {
        this.lineCompareDetailCount = lineCompareDetailCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LineCompareResultDetails lineCompareResultDetails = (LineCompareResultDetails) o;
        return Objects.equals(this.sourceDbName, lineCompareResultDetails.sourceDbName)
            && Objects.equals(this.lineCompareDetail, lineCompareResultDetails.lineCompareDetail)
            && Objects.equals(this.lineCompareDetailCount, lineCompareResultDetails.lineCompareDetailCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, lineCompareDetail, lineCompareDetailCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineCompareResultDetails {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    lineCompareDetail: ").append(toIndentedString(lineCompareDetail)).append("\n");
        sb.append("    lineCompareDetailCount: ").append(toIndentedString(lineCompareDetailCount)).append("\n");
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
