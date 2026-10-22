package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityReportContentResponseReportContentInfoTopDomains
 */
public class SecurityReportContentResponseReportContentInfoTopDomains {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_num")

    private Long blockNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_log_num")

    private Long onlyLogNum;

    public SecurityReportContentResponseReportContentInfoTopDomains withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 域名标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentInfoTopDomains withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 该域名在对应统计维度下的数量。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public SecurityReportContentResponseReportContentInfoTopDomains withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释：** 域名标识，包含域名及关联标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SecurityReportContentResponseReportContentInfoTopDomains withWebTag(String webTag) {
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

    public SecurityReportContentResponseReportContentInfoTopDomains withBlockNum(Long blockNum) {
        this.blockNum = blockNum;
        return this;
    }

    /**
     * **参数解释：** 该域名拦截数量。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 不涉及
     * @return blockNum
     */
    public Long getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Long blockNum) {
        this.blockNum = blockNum;
    }

    public SecurityReportContentResponseReportContentInfoTopDomains withOnlyLogNum(Long onlyLogNum) {
        this.onlyLogNum = onlyLogNum;
        return this;
    }

    /**
     * **参数解释：** 该域名仅记录数量。 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 不涉及
     * @return onlyLogNum
     */
    public Long getOnlyLogNum() {
        return onlyLogNum;
    }

    public void setOnlyLogNum(Long onlyLogNum) {
        this.onlyLogNum = onlyLogNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoTopDomains that =
            (SecurityReportContentResponseReportContentInfoTopDomains) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num)
            && Objects.equals(this.host, that.host) && Objects.equals(this.webTag, that.webTag)
            && Objects.equals(this.blockNum, that.blockNum) && Objects.equals(this.onlyLogNum, that.onlyLogNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num, host, webTag, blockNum, onlyLogNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoTopDomains {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    webTag: ").append(toIndentedString(webTag)).append("\n");
        sb.append("    blockNum: ").append(toIndentedString(blockNum)).append("\n");
        sb.append("    onlyLogNum: ").append(toIndentedString(onlyLogNum)).append("\n");
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
