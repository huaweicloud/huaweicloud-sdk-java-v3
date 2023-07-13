package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BrokenList
 */
public class BrokenList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand_brokens")

    private BrandBrokens brandBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commonTimestamps")

    private List<String> commonTimestamps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance_load")

    private Object performanceLoad;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "respcode_brokens")

    private RespcodeBrokens respcodeBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmp_brokens")

    private RtmpBrokens rtmpBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_error_brokens")

    private StreamingErrorBrokens streamingErrorBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps_brokens")

    private TpsBrokens tpsBrokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vusers_brokens")

    private VusersBrokens vusersBrokens;

    public BrokenList withBrandBrokens(BrandBrokens brandBrokens) {
        this.brandBrokens = brandBrokens;
        return this;
    }

    public BrokenList withBrandBrokens(Consumer<BrandBrokens> brandBrokensSetter) {
        if (this.brandBrokens == null) {
            this.brandBrokens = new BrandBrokens();
            brandBrokensSetter.accept(this.brandBrokens);
        }

        return this;
    }

    /**
     * Get brandBrokens
     * @return brandBrokens
     */
    public BrandBrokens getBrandBrokens() {
        return brandBrokens;
    }

    public void setBrandBrokens(BrandBrokens brandBrokens) {
        this.brandBrokens = brandBrokens;
    }

    public BrokenList withCommonTimestamps(List<String> commonTimestamps) {
        this.commonTimestamps = commonTimestamps;
        return this;
    }

    public BrokenList addCommonTimestampsItem(String commonTimestampsItem) {
        if (this.commonTimestamps == null) {
            this.commonTimestamps = new ArrayList<>();
        }
        this.commonTimestamps.add(commonTimestampsItem);
        return this;
    }

    public BrokenList withCommonTimestamps(Consumer<List<String>> commonTimestampsSetter) {
        if (this.commonTimestamps == null) {
            this.commonTimestamps = new ArrayList<>();
        }
        commonTimestampsSetter.accept(this.commonTimestamps);
        return this;
    }

    /**
     * 时间戳
     * @return commonTimestamps
     */
    public List<String> getCommonTimestamps() {
        return commonTimestamps;
    }

    public void setCommonTimestamps(List<String> commonTimestamps) {
        this.commonTimestamps = commonTimestamps;
    }

    public BrokenList withPerformanceLoad(Object performanceLoad) {
        this.performanceLoad = performanceLoad;
        return this;
    }

    /**
     * 摸高数据
     * @return performanceLoad
     */
    public Object getPerformanceLoad() {
        return performanceLoad;
    }

    public void setPerformanceLoad(Object performanceLoad) {
        this.performanceLoad = performanceLoad;
    }

    public BrokenList withRespcodeBrokens(RespcodeBrokens respcodeBrokens) {
        this.respcodeBrokens = respcodeBrokens;
        return this;
    }

    public BrokenList withRespcodeBrokens(Consumer<RespcodeBrokens> respcodeBrokensSetter) {
        if (this.respcodeBrokens == null) {
            this.respcodeBrokens = new RespcodeBrokens();
            respcodeBrokensSetter.accept(this.respcodeBrokens);
        }

        return this;
    }

    /**
     * Get respcodeBrokens
     * @return respcodeBrokens
     */
    public RespcodeBrokens getRespcodeBrokens() {
        return respcodeBrokens;
    }

    public void setRespcodeBrokens(RespcodeBrokens respcodeBrokens) {
        this.respcodeBrokens = respcodeBrokens;
    }

    public BrokenList withRtmpBrokens(RtmpBrokens rtmpBrokens) {
        this.rtmpBrokens = rtmpBrokens;
        return this;
    }

    public BrokenList withRtmpBrokens(Consumer<RtmpBrokens> rtmpBrokensSetter) {
        if (this.rtmpBrokens == null) {
            this.rtmpBrokens = new RtmpBrokens();
            rtmpBrokensSetter.accept(this.rtmpBrokens);
        }

        return this;
    }

    /**
     * Get rtmpBrokens
     * @return rtmpBrokens
     */
    public RtmpBrokens getRtmpBrokens() {
        return rtmpBrokens;
    }

    public void setRtmpBrokens(RtmpBrokens rtmpBrokens) {
        this.rtmpBrokens = rtmpBrokens;
    }

    public BrokenList withStreamingErrorBrokens(StreamingErrorBrokens streamingErrorBrokens) {
        this.streamingErrorBrokens = streamingErrorBrokens;
        return this;
    }

    public BrokenList withStreamingErrorBrokens(Consumer<StreamingErrorBrokens> streamingErrorBrokensSetter) {
        if (this.streamingErrorBrokens == null) {
            this.streamingErrorBrokens = new StreamingErrorBrokens();
            streamingErrorBrokensSetter.accept(this.streamingErrorBrokens);
        }

        return this;
    }

    /**
     * Get streamingErrorBrokens
     * @return streamingErrorBrokens
     */
    public StreamingErrorBrokens getStreamingErrorBrokens() {
        return streamingErrorBrokens;
    }

    public void setStreamingErrorBrokens(StreamingErrorBrokens streamingErrorBrokens) {
        this.streamingErrorBrokens = streamingErrorBrokens;
    }

    public BrokenList withTpsBrokens(TpsBrokens tpsBrokens) {
        this.tpsBrokens = tpsBrokens;
        return this;
    }

    public BrokenList withTpsBrokens(Consumer<TpsBrokens> tpsBrokensSetter) {
        if (this.tpsBrokens == null) {
            this.tpsBrokens = new TpsBrokens();
            tpsBrokensSetter.accept(this.tpsBrokens);
        }

        return this;
    }

    /**
     * Get tpsBrokens
     * @return tpsBrokens
     */
    public TpsBrokens getTpsBrokens() {
        return tpsBrokens;
    }

    public void setTpsBrokens(TpsBrokens tpsBrokens) {
        this.tpsBrokens = tpsBrokens;
    }

    public BrokenList withVusersBrokens(VusersBrokens vusersBrokens) {
        this.vusersBrokens = vusersBrokens;
        return this;
    }

    public BrokenList withVusersBrokens(Consumer<VusersBrokens> vusersBrokensSetter) {
        if (this.vusersBrokens == null) {
            this.vusersBrokens = new VusersBrokens();
            vusersBrokensSetter.accept(this.vusersBrokens);
        }

        return this;
    }

    /**
     * Get vusersBrokens
     * @return vusersBrokens
     */
    public VusersBrokens getVusersBrokens() {
        return vusersBrokens;
    }

    public void setVusersBrokens(VusersBrokens vusersBrokens) {
        this.vusersBrokens = vusersBrokens;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BrokenList that = (BrokenList) obj;
        return Objects.equals(this.brandBrokens, that.brandBrokens)
            && Objects.equals(this.commonTimestamps, that.commonTimestamps)
            && Objects.equals(this.performanceLoad, that.performanceLoad)
            && Objects.equals(this.respcodeBrokens, that.respcodeBrokens)
            && Objects.equals(this.rtmpBrokens, that.rtmpBrokens)
            && Objects.equals(this.streamingErrorBrokens, that.streamingErrorBrokens)
            && Objects.equals(this.tpsBrokens, that.tpsBrokens)
            && Objects.equals(this.vusersBrokens, that.vusersBrokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandBrokens,
            commonTimestamps,
            performanceLoad,
            respcodeBrokens,
            rtmpBrokens,
            streamingErrorBrokens,
            tpsBrokens,
            vusersBrokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrokenList {\n");
        sb.append("    brandBrokens: ").append(toIndentedString(brandBrokens)).append("\n");
        sb.append("    commonTimestamps: ").append(toIndentedString(commonTimestamps)).append("\n");
        sb.append("    performanceLoad: ").append(toIndentedString(performanceLoad)).append("\n");
        sb.append("    respcodeBrokens: ").append(toIndentedString(respcodeBrokens)).append("\n");
        sb.append("    rtmpBrokens: ").append(toIndentedString(rtmpBrokens)).append("\n");
        sb.append("    streamingErrorBrokens: ").append(toIndentedString(streamingErrorBrokens)).append("\n");
        sb.append("    tpsBrokens: ").append(toIndentedString(tpsBrokens)).append("\n");
        sb.append("    vusersBrokens: ").append(toIndentedString(vusersBrokens)).append("\n");
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
