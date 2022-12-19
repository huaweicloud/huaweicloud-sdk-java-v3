package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * statistics of playbook
 */
public class PlaybookStatisticDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unapproved_num")

    private Integer unapprovedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_num")

    private Integer disabledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_num")

    private Integer enabledNum;

    public PlaybookStatisticDetail withUnapprovedNum(Integer unapprovedNum) {
        this.unapprovedNum = unapprovedNum;
        return this;
    }

    /**
     * 未审核剧本数量
     * minimum: 0
     * maximum: 99999999
     * @return unapprovedNum
     */
    public Integer getUnapprovedNum() {
        return unapprovedNum;
    }

    public void setUnapprovedNum(Integer unapprovedNum) {
        this.unapprovedNum = unapprovedNum;
    }

    public PlaybookStatisticDetail withDisabledNum(Integer disabledNum) {
        this.disabledNum = disabledNum;
        return this;
    }

    /**
     * 未启用剧本数量
     * minimum: 0
     * maximum: 99999999
     * @return disabledNum
     */
    public Integer getDisabledNum() {
        return disabledNum;
    }

    public void setDisabledNum(Integer disabledNum) {
        this.disabledNum = disabledNum;
    }

    public PlaybookStatisticDetail withEnabledNum(Integer enabledNum) {
        this.enabledNum = enabledNum;
        return this;
    }

    /**
     * 已启用剧本数量
     * minimum: 0
     * maximum: 99999999
     * @return enabledNum
     */
    public Integer getEnabledNum() {
        return enabledNum;
    }

    public void setEnabledNum(Integer enabledNum) {
        this.enabledNum = enabledNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaybookStatisticDetail playbookStatisticDetail = (PlaybookStatisticDetail) o;
        return Objects.equals(this.unapprovedNum, playbookStatisticDetail.unapprovedNum)
            && Objects.equals(this.disabledNum, playbookStatisticDetail.disabledNum)
            && Objects.equals(this.enabledNum, playbookStatisticDetail.enabledNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unapprovedNum, disabledNum, enabledNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaybookStatisticDetail {\n");
        sb.append("    unapprovedNum: ").append(toIndentedString(unapprovedNum)).append("\n");
        sb.append("    disabledNum: ").append(toIndentedString(disabledNum)).append("\n");
        sb.append("    enabledNum: ").append(toIndentedString(enabledNum)).append("\n");
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
