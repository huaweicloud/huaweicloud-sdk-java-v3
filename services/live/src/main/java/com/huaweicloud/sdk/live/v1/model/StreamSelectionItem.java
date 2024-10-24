package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 从全量流中过滤出一个码率在[min, max]区间的流。如果不需要码率过滤可不选。
 */
public class StreamSelectionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth")

    private Integer maxBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_bandwidth")

    private Integer minBandwidth;

    public StreamSelectionItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 拉流URL中用于码率过滤的参数
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public StreamSelectionItem withMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * 最大码率，单位：bps  取值范围：0 - 104,857,600（100Mbps）
     * @return maxBandwidth
     */
    public Integer getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public StreamSelectionItem withMinBandwidth(Integer minBandwidth) {
        this.minBandwidth = minBandwidth;
        return this;
    }

    /**
     * 最小码率，单位：bps  取值范围：0 - 104,857,600（100Mbps）
     * @return minBandwidth
     */
    public Integer getMinBandwidth() {
        return minBandwidth;
    }

    public void setMinBandwidth(Integer minBandwidth) {
        this.minBandwidth = minBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamSelectionItem that = (StreamSelectionItem) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.maxBandwidth, that.maxBandwidth)
            && Objects.equals(this.minBandwidth, that.minBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, maxBandwidth, minBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamSelectionItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    minBandwidth: ").append(toIndentedString(minBandwidth)).append("\n");
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
