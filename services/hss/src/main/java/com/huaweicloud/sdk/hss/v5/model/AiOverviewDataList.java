package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AI Defender概览数据项（按产品类型分组）
 */
public class AiOverviewDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_stats")

    private List<AiOverviewDimensionStats> dimensionStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_info")

    private AiOverviewSourceInfo sourceInfo;

    public AiOverviewDataList withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 产品类型 **取值范围**： - AgentArts - OfficeAce - OpenClaw 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public AiOverviewDataList withDimensionStats(List<AiOverviewDimensionStats> dimensionStats) {
        this.dimensionStats = dimensionStats;
        return this;
    }

    public AiOverviewDataList addDimensionStatsItem(AiOverviewDimensionStats dimensionStatsItem) {
        if (this.dimensionStats == null) {
            this.dimensionStats = new ArrayList<>();
        }
        this.dimensionStats.add(dimensionStatsItem);
        return this;
    }

    public AiOverviewDataList withDimensionStats(Consumer<List<AiOverviewDimensionStats>> dimensionStatsSetter) {
        if (this.dimensionStats == null) {
            this.dimensionStats = new ArrayList<>();
        }
        dimensionStatsSetter.accept(this.dimensionStats);
        return this;
    }

    /**
     * **参数解释**: 维度统计列表（type=alarm/risk时返回） **取值范围**: 不涉及 
     * @return dimensionStats
     */
    public List<AiOverviewDimensionStats> getDimensionStats() {
        return dimensionStats;
    }

    public void setDimensionStats(List<AiOverviewDimensionStats> dimensionStats) {
        this.dimensionStats = dimensionStats;
    }

    public AiOverviewDataList withSourceInfo(AiOverviewSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    public AiOverviewDataList withSourceInfo(Consumer<AiOverviewSourceInfo> sourceInfoSetter) {
        if (this.sourceInfo == null) {
            this.sourceInfo = new AiOverviewSourceInfo();
            sourceInfoSetter.accept(this.sourceInfo);
        }

        return this;
    }

    /**
     * Get sourceInfo
     * @return sourceInfo
     */
    public AiOverviewSourceInfo getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(AiOverviewSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiOverviewDataList that = (AiOverviewDataList) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.dimensionStats, that.dimensionStats)
            && Objects.equals(this.sourceInfo, that.sourceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, dimensionStats, sourceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiOverviewDataList {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    dimensionStats: ").append(toIndentedString(dimensionStats)).append("\n");
        sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
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
