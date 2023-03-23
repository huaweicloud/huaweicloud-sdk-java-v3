package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateAnticrawlerRuleTypeRequestbody
 */
public class UpdateAnticrawlerRuleTypeRequestbody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anticrawler_type")

    private String anticrawlerType;

    public UpdateAnticrawlerRuleTypeRequestbody withAnticrawlerType(String anticrawlerType) {
        this.anticrawlerType = anticrawlerType;
        return this;
    }

    /**
     * JS脚本反爬虫规则类型，指定防护路径：anticrawler_specific_url 排除防护路径：anticrawler_except_url
     * @return anticrawlerType
     */
    public String getAnticrawlerType() {
        return anticrawlerType;
    }

    public void setAnticrawlerType(String anticrawlerType) {
        this.anticrawlerType = anticrawlerType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAnticrawlerRuleTypeRequestbody updateAnticrawlerRuleTypeRequestbody =
            (UpdateAnticrawlerRuleTypeRequestbody) o;
        return Objects.equals(this.anticrawlerType, updateAnticrawlerRuleTypeRequestbody.anticrawlerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anticrawlerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAnticrawlerRuleTypeRequestbody {\n");
        sb.append("    anticrawlerType: ").append(toIndentedString(anticrawlerType)).append("\n");
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
