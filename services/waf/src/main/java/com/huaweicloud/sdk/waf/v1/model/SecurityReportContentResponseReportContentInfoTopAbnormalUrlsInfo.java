package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** TOP异常URL信息，包含返回502、500、404等错误的URL列表。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_502_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal502InfoList> abnormal502InfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_500_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal500InfoList> abnormal500InfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_404_info_list")

    private List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal404InfoList> abnormal404InfoList =
        null;

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo withAbnormal502InfoList(
        List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal502InfoList> abnormal502InfoList) {
        this.abnormal502InfoList = abnormal502InfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo addAbnormal502InfoListItem(
        SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal502InfoList abnormal502InfoListItem) {
        if (this.abnormal502InfoList == null) {
            this.abnormal502InfoList = new ArrayList<>();
        }
        this.abnormal502InfoList.add(abnormal502InfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo withAbnormal502InfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal502InfoList>> abnormal502InfoListSetter) {
        if (this.abnormal502InfoList == null) {
            this.abnormal502InfoList = new ArrayList<>();
        }
        abnormal502InfoListSetter.accept(this.abnormal502InfoList);
        return this;
    }

    /**
     * **参数解释：** TOP返回502错误的URL列表，按错误次数排序。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return abnormal502InfoList
     */
    public List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal502InfoList> getAbnormal502InfoList() {
        return abnormal502InfoList;
    }

    public void setAbnormal502InfoList(
        List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal502InfoList> abnormal502InfoList) {
        this.abnormal502InfoList = abnormal502InfoList;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo withAbnormal500InfoList(
        List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal500InfoList> abnormal500InfoList) {
        this.abnormal500InfoList = abnormal500InfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo addAbnormal500InfoListItem(
        SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal500InfoList abnormal500InfoListItem) {
        if (this.abnormal500InfoList == null) {
            this.abnormal500InfoList = new ArrayList<>();
        }
        this.abnormal500InfoList.add(abnormal500InfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo withAbnormal500InfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal500InfoList>> abnormal500InfoListSetter) {
        if (this.abnormal500InfoList == null) {
            this.abnormal500InfoList = new ArrayList<>();
        }
        abnormal500InfoListSetter.accept(this.abnormal500InfoList);
        return this;
    }

    /**
     * **参数解释：** TOP返回500错误的URL列表，按错误次数排序。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return abnormal500InfoList
     */
    public List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal500InfoList> getAbnormal500InfoList() {
        return abnormal500InfoList;
    }

    public void setAbnormal500InfoList(
        List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal500InfoList> abnormal500InfoList) {
        this.abnormal500InfoList = abnormal500InfoList;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo withAbnormal404InfoList(
        List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal404InfoList> abnormal404InfoList) {
        this.abnormal404InfoList = abnormal404InfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo addAbnormal404InfoListItem(
        SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal404InfoList abnormal404InfoListItem) {
        if (this.abnormal404InfoList == null) {
            this.abnormal404InfoList = new ArrayList<>();
        }
        this.abnormal404InfoList.add(abnormal404InfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo withAbnormal404InfoList(
        Consumer<List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal404InfoList>> abnormal404InfoListSetter) {
        if (this.abnormal404InfoList == null) {
            this.abnormal404InfoList = new ArrayList<>();
        }
        abnormal404InfoListSetter.accept(this.abnormal404InfoList);
        return this;
    }

    /**
     * **参数解释：** TOP返回404错误的URL列表，按错误次数排序。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return abnormal404InfoList
     */
    public List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal404InfoList> getAbnormal404InfoList() {
        return abnormal404InfoList;
    }

    public void setAbnormal404InfoList(
        List<SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfoAbnormal404InfoList> abnormal404InfoList) {
        this.abnormal404InfoList = abnormal404InfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo that =
            (SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo) obj;
        return Objects.equals(this.abnormal502InfoList, that.abnormal502InfoList)
            && Objects.equals(this.abnormal500InfoList, that.abnormal500InfoList)
            && Objects.equals(this.abnormal404InfoList, that.abnormal404InfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormal502InfoList, abnormal500InfoList, abnormal404InfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentInfoTopAbnormalUrlsInfo {\n");
        sb.append("    abnormal502InfoList: ").append(toIndentedString(abnormal502InfoList)).append("\n");
        sb.append("    abnormal500InfoList: ").append(toIndentedString(abnormal500InfoList)).append("\n");
        sb.append("    abnormal404InfoList: ").append(toIndentedString(abnormal404InfoList)).append("\n");
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
