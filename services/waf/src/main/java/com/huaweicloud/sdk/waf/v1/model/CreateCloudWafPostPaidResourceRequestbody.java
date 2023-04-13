package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开通云模式按需请求体
 */
public class CreateCloudWafPostPaidResourceRequestbody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_area")

    private String consoleArea;

    public CreateCloudWafPostPaidResourceRequestbody withConsoleArea(String consoleArea) {
        this.consoleArea = consoleArea;
        return this;
    }

    /**
     * 租户所在的站点，hec-hk：华为云国际站
     * @return consoleArea
     */
    public String getConsoleArea() {
        return consoleArea;
    }

    public void setConsoleArea(String consoleArea) {
        this.consoleArea = consoleArea;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudWafPostPaidResourceRequestbody createCloudWafPostPaidResourceRequestbody =
            (CreateCloudWafPostPaidResourceRequestbody) o;
        return Objects.equals(this.consoleArea, createCloudWafPostPaidResourceRequestbody.consoleArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consoleArea);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudWafPostPaidResourceRequestbody {\n");
        sb.append("    consoleArea: ").append(toIndentedString(consoleArea)).append("\n");
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
