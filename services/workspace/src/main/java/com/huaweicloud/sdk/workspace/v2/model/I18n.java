package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * I18n
 */
public class I18n {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_cn")

    private String zhCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_us")

    private String enUs;

    public I18n withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 可用分区中文名称。
     * @return zhCn
     */
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public I18n withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 可用分区英语名称。
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
        I18n that = (I18n) obj;
        return Objects.equals(this.zhCn, that.zhCn) && Objects.equals(this.enUs, that.enUs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhCn, enUs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class I18n {\n");
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
