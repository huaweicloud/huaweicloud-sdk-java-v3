package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 当前租户CBH的配额信息
 */
public class QuotaDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_cn")

    @JacksonXmlProperty(localName = "zh_cn")

    private String zhCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_us")

    @JacksonXmlProperty(localName = "en_us")

    private String enUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining")

    @JacksonXmlProperty(localName = "remaining")

    private Integer remaining;

    public QuotaDetail withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 中文配额描述
     * @return zhCn
     */
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public QuotaDetail withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 英文配额描述
     * @return enUs
     */
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public QuotaDetail withRemaining(Integer remaining) {
        this.remaining = remaining;
        return this;
    }

    /**
     * 租户剩余配额数量
     * minimum: 0
     * maximum: 100
     * @return remaining
     */
    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaDetail quotaDetail = (QuotaDetail) o;
        return Objects.equals(this.zhCn, quotaDetail.zhCn) && Objects.equals(this.enUs, quotaDetail.enUs)
            && Objects.equals(this.remaining, quotaDetail.remaining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhCn, enUs, remaining);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaDetail {\n");
        sb.append("    zhCn: ").append(toIndentedString(zhCn)).append("\n");
        sb.append("    enUs: ").append(toIndentedString(enUs)).append("\n");
        sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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
