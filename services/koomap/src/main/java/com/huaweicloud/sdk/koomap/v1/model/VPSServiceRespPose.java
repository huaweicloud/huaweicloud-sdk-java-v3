package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 位姿信息。
 */
public class VPSServiceRespPose {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "r")

    private List<Float> r = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "t")

    private List<Float> t = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Double confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "K")

    private List<Float> k = null;

    public VPSServiceRespPose withR(List<Float> r) {
        this.r = r;
        return this;
    }

    public VPSServiceRespPose addRItem(Float rItem) {
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(rItem);
        return this;
    }

    public VPSServiceRespPose withR(Consumer<List<Float>> rSetter) {
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        rSetter.accept(this.r);
        return this;
    }

    /**
     * VPS姿态矩阵，按照左上到右下排列。
     * @return r
     */
    public List<Float> getR() {
        return r;
    }

    public void setR(List<Float> r) {
        this.r = r;
    }

    public VPSServiceRespPose withT(List<Float> t) {
        this.t = t;
        return this;
    }

    public VPSServiceRespPose addTItem(Float tItem) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(tItem);
        return this;
    }

    public VPSServiceRespPose withT(Consumer<List<Float>> tSetter) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        tSetter.accept(this.t);
        return this;
    }

    /**
     * VPS位置，分别为XYZ值。
     * @return t
     */
    public List<Float> getT() {
        return t;
    }

    public void setT(List<Float> t) {
        this.t = t;
    }

    public VPSServiceRespPose withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * VPS结果置信度。
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public VPSServiceRespPose withK(List<Float> k) {
        this.k = k;
        return this;
    }

    public VPSServiceRespPose addKItem(Float kItem) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(kItem);
        return this;
    }

    public VPSServiceRespPose withK(Consumer<List<Float>> kSetter) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        kSetter.accept(this.k);
        return this;
    }

    /**
     * 在线云标定默认内参。
     * @return k
     */
    public List<Float> getK() {
        return k;
    }

    public void setK(List<Float> k) {
        this.k = k;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VPSServiceRespPose that = (VPSServiceRespPose) obj;
        return Objects.equals(this.r, that.r) && Objects.equals(this.t, that.t)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.k, that.k);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, t, confidence, k);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VPSServiceRespPose {\n");
        sb.append("    r: ").append(toIndentedString(r)).append("\n");
        sb.append("    t: ").append(toIndentedString(t)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    k: ").append(toIndentedString(k)).append("\n");
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
