package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 报表数据
 */
public class ReportChartDataVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyze_dim")

    private ReportDimVo analyzeDim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_dim")

    private List<ReportDimVo> compareDim = null;

    public ReportChartDataVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报表id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReportChartDataVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 报表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReportChartDataVo withAnalyzeDim(ReportDimVo analyzeDim) {
        this.analyzeDim = analyzeDim;
        return this;
    }

    public ReportChartDataVo withAnalyzeDim(Consumer<ReportDimVo> analyzeDimSetter) {
        if (this.analyzeDim == null) {
            this.analyzeDim = new ReportDimVo();
            analyzeDimSetter.accept(this.analyzeDim);
        }

        return this;
    }

    /**
     * Get analyzeDim
     * @return analyzeDim
     */
    public ReportDimVo getAnalyzeDim() {
        return analyzeDim;
    }

    public void setAnalyzeDim(ReportDimVo analyzeDim) {
        this.analyzeDim = analyzeDim;
    }

    public ReportChartDataVo withCompareDim(List<ReportDimVo> compareDim) {
        this.compareDim = compareDim;
        return this;
    }

    public ReportChartDataVo addCompareDimItem(ReportDimVo compareDimItem) {
        if (this.compareDim == null) {
            this.compareDim = new ArrayList<>();
        }
        this.compareDim.add(compareDimItem);
        return this;
    }

    public ReportChartDataVo withCompareDim(Consumer<List<ReportDimVo>> compareDimSetter) {
        if (this.compareDim == null) {
            this.compareDim = new ArrayList<>();
        }
        compareDimSetter.accept(this.compareDim);
        return this;
    }

    /**
     * 对比维度数据
     * @return compareDim
     */
    public List<ReportDimVo> getCompareDim() {
        return compareDim;
    }

    public void setCompareDim(List<ReportDimVo> compareDim) {
        this.compareDim = compareDim;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportChartDataVo that = (ReportChartDataVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.analyzeDim, that.analyzeDim) && Objects.equals(this.compareDim, that.compareDim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, analyzeDim, compareDim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportChartDataVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    analyzeDim: ").append(toIndentedString(analyzeDim)).append("\n");
        sb.append("    compareDim: ").append(toIndentedString(compareDim)).append("\n");
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
