package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 区域名称
 */
public class ShowAvailableAzResponsebodyLocales {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en-us")

    private String enUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh-cn")

    private String zhCn;

    public ShowAvailableAzResponsebodyLocales withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 英文
     * @return enUs
     */
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public ShowAvailableAzResponsebodyLocales withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 中文
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
        ShowAvailableAzResponsebodyLocales that = (ShowAvailableAzResponsebodyLocales) obj;
        return Objects.equals(this.enUs, that.enUs) && Objects.equals(this.zhCn, that.zhCn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enUs, zhCn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableAzResponsebodyLocales {\n");
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
