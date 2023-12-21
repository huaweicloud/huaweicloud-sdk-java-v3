package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Locale地址描述信息。
 */
public class LocalesBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_us")

    private String enUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_cn")

    private String zhCn;

    public LocalesBody withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 区域英文名称。
     * @return enUs
     */
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public LocalesBody withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 区域中文名称。
     * @return zhCn
     */
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalesBody that = (LocalesBody) obj;
        return Objects.equals(this.enUs, that.enUs) && Objects.equals(this.zhCn, that.zhCn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enUs, zhCn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalesBody {\n");
        sb.append("    enUs: ").append(toIndentedString(enUs)).append("\n");
        sb.append("    zhCn: ").append(toIndentedString(zhCn)).append("\n");
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
