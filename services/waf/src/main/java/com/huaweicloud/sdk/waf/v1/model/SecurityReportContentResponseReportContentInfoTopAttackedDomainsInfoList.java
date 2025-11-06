package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList
 */
public class SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_tag")

    private String webTag;

    public SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 域名标识，包含域名及端口（如*:80表示所有域名的80端口）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该域名被攻击的总次数。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList withWebTag(String webTag) {
        this.webTag = webTag;
        return this;
    }

    /**
     * **参数解释：** 域名的Web标签，用于标识域名所属业务类型。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
        SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList that =
            (SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num)
            && Objects.equals(this.webTag, that.webTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num, webTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoTopAttackedDomainsInfoList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
