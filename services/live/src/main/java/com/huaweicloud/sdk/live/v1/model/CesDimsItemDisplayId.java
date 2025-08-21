package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询ID
 */
public class CesDimsItemDisplayId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh-cn")

    private String zhCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en-us")

    private String enUs;

    public CesDimsItemDisplayId withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 中文名称
     * @return zhCn
     */
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public CesDimsItemDisplayId withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 英文名称
     * @return enUs
     */
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CesDimsItemDisplayId that = (CesDimsItemDisplayId) obj;
        return Objects.equals(this.zhCn, that.zhCn) && Objects.equals(this.enUs, that.enUs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhCn, enUs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CesDimsItemDisplayId {\n");
        sb.append("    zhCn: ").append(toIndentedString(zhCn)).append("\n");
        sb.append("    enUs: ").append(toIndentedString(enUs)).append("\n");
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
