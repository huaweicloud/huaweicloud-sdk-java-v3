package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VideoCoverAnalysisinference
 */
public class VideoCoverAnalysisinference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gif_ratenum")

    private Integer gifRatenum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gif_rateden")

    private Integer gifRateden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gif_long_side")

    private Integer gifLongSide;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gif_short_side")

    private Integer gifShortSide;

    public VideoCoverAnalysisinference withGifRatenum(Integer gifRatenum) {
        this.gifRatenum = gifRatenum;
        return this;
    }

    /**
     * 动态封面帧率分子
     * minimum: 1
     * maximum: 30
     * @return gifRatenum
     */
    public Integer getGifRatenum() {
        return gifRatenum;
    }

    public void setGifRatenum(Integer gifRatenum) {
        this.gifRatenum = gifRatenum;
    }

    public VideoCoverAnalysisinference withGifRateden(Integer gifRateden) {
        this.gifRateden = gifRateden;
        return this;
    }

    /**
     * 动态封面帧率分母
     * minimum: 1
     * maximum: 30
     * @return gifRateden
     */
    public Integer getGifRateden() {
        return gifRateden;
    }

    public void setGifRateden(Integer gifRateden) {
        this.gifRateden = gifRateden;
    }

    public VideoCoverAnalysisinference withGifLongSide(Integer gifLongSide) {
        this.gifLongSide = gifLongSide;
        return this;
    }

    /**
     * 动态封面长边长度
     * minimum: 1
     * maximum: 1920
     * @return gifLongSide
     */
    public Integer getGifLongSide() {
        return gifLongSide;
    }

    public void setGifLongSide(Integer gifLongSide) {
        this.gifLongSide = gifLongSide;
    }

    public VideoCoverAnalysisinference withGifShortSide(Integer gifShortSide) {
        this.gifShortSide = gifShortSide;
        return this;
    }

    /**
     * 动态封面短边长度
     * minimum: 1
     * maximum: 1080
     * @return gifShortSide
     */
    public Integer getGifShortSide() {
        return gifShortSide;
    }

    public void setGifShortSide(Integer gifShortSide) {
        this.gifShortSide = gifShortSide;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCoverAnalysisinference videoCoverAnalysisinference = (VideoCoverAnalysisinference) o;
        return Objects.equals(this.gifRatenum, videoCoverAnalysisinference.gifRatenum)
            && Objects.equals(this.gifRateden, videoCoverAnalysisinference.gifRateden)
            && Objects.equals(this.gifLongSide, videoCoverAnalysisinference.gifLongSide)
            && Objects.equals(this.gifShortSide, videoCoverAnalysisinference.gifShortSide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gifRatenum, gifRateden, gifLongSide, gifShortSide);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCoverAnalysisinference {\n");
        sb.append("    gifRatenum: ").append(toIndentedString(gifRatenum)).append("\n");
        sb.append("    gifRateden: ").append(toIndentedString(gifRateden)).append("\n");
        sb.append("    gifLongSide: ").append(toIndentedString(gifLongSide)).append("\n");
        sb.append("    gifShortSide: ").append(toIndentedString(gifShortSide)).append("\n");
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
