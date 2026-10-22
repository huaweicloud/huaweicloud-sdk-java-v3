package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList
 */
public class SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    public SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 返回500错误的URL路径。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该URL返回500错误的总次数。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释：** 该URL所属的域名。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList withWebTag(
        String webTag) {
        this.webTag = webTag;
        return this;
    }

    /**
     * **参数解释：** 域名的Web标签。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return webTag
     */
    public String getWebTag() {
        return webTag;
    }

    public void setWebTag(String webTag) {
        this.webTag = webTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList that =
            (SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num)
            && Objects.equals(this.host, that.host) && Objects.equals(this.webTag, that.webTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num, host, webTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoTopErrorPagesInfoAbnormal500InfoList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
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
