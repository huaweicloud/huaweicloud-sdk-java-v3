package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * top origin url 详情数据
 */
public class TopOriginUrlSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_url")

    private String originUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private Double ratio;

    public TopOriginUrlSummary withOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }

    /**
     * 回源url名称
     * @return originUrl
     */
    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public TopOriginUrlSummary withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 对应查询类型的值。（流量单位：Byte）
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public TopOriginUrlSummary withRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 该origin url的流量(或请求数)占当前查询条件下总流量(或请求数)的比例。保留4位小数
     * @return ratio
     */
    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopOriginUrlSummary that = (TopOriginUrlSummary) obj;
        return Objects.equals(this.originUrl, that.originUrl) && Objects.equals(this.value, that.value)
            && Objects.equals(this.ratio, that.ratio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originUrl, value, ratio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopOriginUrlSummary {\n");
        sb.append("    originUrl: ").append(toIndentedString(originUrl)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
