package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检测命中详情
 */
public class HitDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_type")

    private String riskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_risk_type")

    private List<String> subRiskType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prob")

    private Float prob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<SegmentInfo> segments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private Object extraInfo;

    public HitDetail withRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    /**
     * 威胁类型
     * @return riskType
     */
    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public HitDetail withSubRiskType(List<String> subRiskType) {
        this.subRiskType = subRiskType;
        return this;
    }

    public HitDetail addSubRiskTypeItem(String subRiskTypeItem) {
        if (this.subRiskType == null) {
            this.subRiskType = new ArrayList<>();
        }
        this.subRiskType.add(subRiskTypeItem);
        return this;
    }

    public HitDetail withSubRiskType(Consumer<List<String>> subRiskTypeSetter) {
        if (this.subRiskType == null) {
            this.subRiskType = new ArrayList<>();
        }
        subRiskTypeSetter.accept(this.subRiskType);
        return this;
    }

    /**
     * 子威胁类型
     * @return subRiskType
     */
    public List<String> getSubRiskType() {
        return subRiskType;
    }

    public void setSubRiskType(List<String> subRiskType) {
        this.subRiskType = subRiskType;
    }

    public HitDetail withProb(Float prob) {
        this.prob = prob;
        return this;
    }

    /**
     * 置信度分数
     * @return prob
     */
    public Float getProb() {
        return prob;
    }

    public void setProb(Float prob) {
        this.prob = prob;
    }

    public HitDetail withSegments(List<SegmentInfo> segments) {
        this.segments = segments;
        return this;
    }

    public HitDetail addSegmentsItem(SegmentInfo segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public HitDetail withSegments(Consumer<List<SegmentInfo>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /**
     * 命中规则的片段
     * @return segments
     */
    public List<SegmentInfo> getSegments() {
        return segments;
    }

    public void setSegments(List<SegmentInfo> segments) {
        this.segments = segments;
    }

    public HitDetail withExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * 额外检测信息，不同风险类型下字段不固定
     * @return extraInfo
     */
    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HitDetail that = (HitDetail) obj;
        return Objects.equals(this.riskType, that.riskType) && Objects.equals(this.subRiskType, that.subRiskType)
            && Objects.equals(this.prob, that.prob) && Objects.equals(this.segments, that.segments)
            && Objects.equals(this.extraInfo, that.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskType, subRiskType, prob, segments, extraInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HitDetail {\n");
        sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
        sb.append("    subRiskType: ").append(toIndentedString(subRiskType)).append("\n");
        sb.append("    prob: ").append(toIndentedString(prob)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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
