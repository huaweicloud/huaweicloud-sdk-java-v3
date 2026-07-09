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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postpaid_name")

    private String postpaidName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private Object extendParams;

    public CreateCloudWafPostPaidResourceRequestbody withConsoleArea(String consoleArea) {
        this.consoleArea = consoleArea;
        return this;
    }

    /**
     * 租户所在的站点 - hec-hk：华为云国际站 - hws：华为云大陆站
     * @return consoleArea
     */
    public String getConsoleArea() {
        return consoleArea;
    }

    public void setConsoleArea(String consoleArea) {
        this.consoleArea = consoleArea;
    }

    public CreateCloudWafPostPaidResourceRequestbody withPostpaidName(String postpaidName) {
        this.postpaidName = postpaidName;
        return this;
    }

    /**
     * **参数解释：** 按需功能名称 **取值范围：**  - CLOUD_WAF：按需云模式  - LARGE_MODEL_FIREWALL_AI_GUARD_DETECT: AI安全护栏
     * @return postpaidName
     */
    public String getPostpaidName() {
        return postpaidName;
    }

    public void setPostpaidName(String postpaidName) {
        this.postpaidName = postpaidName;
    }

    public CreateCloudWafPostPaidResourceRequestbody withExtendParams(Object extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * **参数解释：** 扩展参数 **取值范围：** 不涉及
     * @return extendParams
     */
    public Object getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(Object extendParams) {
        this.extendParams = extendParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudWafPostPaidResourceRequestbody that = (CreateCloudWafPostPaidResourceRequestbody) obj;
        return Objects.equals(this.consoleArea, that.consoleArea)
            && Objects.equals(this.postpaidName, that.postpaidName)
            && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consoleArea, postpaidName, extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudWafPostPaidResourceRequestbody {\n");
        sb.append("    consoleArea: ").append(toIndentedString(consoleArea)).append("\n");
        sb.append("    postpaidName: ").append(toIndentedString(postpaidName)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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
