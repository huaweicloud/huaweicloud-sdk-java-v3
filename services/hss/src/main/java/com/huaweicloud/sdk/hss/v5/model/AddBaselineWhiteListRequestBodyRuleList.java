package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 待添加的白名单的检查项信息
 */
public class AddBaselineWhiteListRequestBodyRuleList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_version")

    private String indexVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    public AddBaselineWhiteListRequestBodyRuleList withIndexVersion(String indexVersion) {
        this.indexVersion = indexVersion;
        return this;
    }

    /**
     * 基线检查的检查项标识
     * @return indexVersion
     */
    public String getIndexVersion() {
        return indexVersion;
    }

    public void setIndexVersion(String indexVersion) {
        this.indexVersion = indexVersion;
    }

    public AddBaselineWhiteListRequestBodyRuleList withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * 基线检查的基线名称
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public AddBaselineWhiteListRequestBodyRuleList withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * 标准类型，包含如下:   - cn_standard : 等保合规标准   - hw_standard : 云安全实践标准   - cis_standard : 通用安全标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBaselineWhiteListRequestBodyRuleList that = (AddBaselineWhiteListRequestBodyRuleList) obj;
        return Objects.equals(this.indexVersion, that.indexVersion) && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.standard, that.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexVersion, checkType, standard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBaselineWhiteListRequestBodyRuleList {\n");
        sb.append("    indexVersion: ").append(toIndentedString(indexVersion)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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
