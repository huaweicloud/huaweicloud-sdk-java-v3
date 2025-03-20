package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 描述信息。
 */
public class Description {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_US")

    private String enUS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_CN")

    private String zhCN;

    public Description withEnUS(String enUS) {
        this.enUS = enUS;
        return this;
    }

    /**
     * 英文描述。
     * @return enUS
     */
    public String getEnUS() {
        return enUS;
    }

    public void setEnUS(String enUS) {
        this.enUS = enUS;
    }

    public Description withZhCN(String zhCN) {
        this.zhCN = zhCN;
        return this;
    }

    /**
     * 中文描述。
     * @return zhCN
     */
    public String getZhCN() {
        return zhCN;
    }

    public void setZhCN(String zhCN) {
        this.zhCN = zhCN;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Description that = (Description) obj;
        return Objects.equals(this.enUS, that.enUS) && Objects.equals(this.zhCN, that.zhCN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enUS, zhCN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Description {\n");
        sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
        sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
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
