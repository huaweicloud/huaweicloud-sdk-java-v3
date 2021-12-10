package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 数据探索报告 */
public class FinalReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generated_time")

    private String generatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wide_table_num")

    private Long wideTableNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_complete_degree")

    private Double userCompleteDegree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_complete_degree")

    private Double itemCompleteDegree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bhv_count")

    private Map<String, Long> bhvCount = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_long_feature_report")

    private List<NumFeatureReport> userLongFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_float_feature_report")

    private List<NumFeatureReport> userFloatFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_str_feature_report")

    private List<StrFeatureReport> userStrFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_strArray_feature_report")

    private List<StrFeatureReport> userStrArrayFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_long_feature_report")

    private List<NumFeatureReport> itemLongFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_float_feature_report")

    private List<NumFeatureReport> itemFloatFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_str_feature_report")

    private List<StrFeatureReport> itemStrFeatureReport = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_strArray_feature_report")

    private List<StrFeatureReport> itemStrArrayFeatureReport = null;

    public FinalReport withGeneratedTime(String generatedTime) {
        this.generatedTime = generatedTime;
        return this;
    }

    /** 报告生成时间。
     * 
     * @return generatedTime */
    public String getGeneratedTime() {
        return generatedTime;
    }

    public void setGeneratedTime(String generatedTime) {
        this.generatedTime = generatedTime;
    }

    public FinalReport withWideTableNum(Long wideTableNum) {
        this.wideTableNum = wideTableNum;
        return this;
    }

    /** 宽表条目数，行为数据去重以后的数目。
     * 
     * @return wideTableNum */
    public Long getWideTableNum() {
        return wideTableNum;
    }

    public void setWideTableNum(Long wideTableNum) {
        this.wideTableNum = wideTableNum;
    }

    public FinalReport withUserCompleteDegree(Double userCompleteDegree) {
        this.userCompleteDegree = userCompleteDegree;
        return this;
    }

    /** 用户齐全度，一条行为中的用户是否在产生这条行为的时候拥有画像。
     * 
     * @return userCompleteDegree */
    public Double getUserCompleteDegree() {
        return userCompleteDegree;
    }

    public void setUserCompleteDegree(Double userCompleteDegree) {
        this.userCompleteDegree = userCompleteDegree;
    }

    public FinalReport withItemCompleteDegree(Double itemCompleteDegree) {
        this.itemCompleteDegree = itemCompleteDegree;
        return this;
    }

    /** 物品齐全度，一条行为中的物品是否在这条行为产生的时候拥有画像。
     * 
     * @return itemCompleteDegree */
    public Double getItemCompleteDegree() {
        return itemCompleteDegree;
    }

    public void setItemCompleteDegree(Double itemCompleteDegree) {
        this.itemCompleteDegree = itemCompleteDegree;
    }

    public FinalReport withBhvCount(Map<String, Long> bhvCount) {
        this.bhvCount = bhvCount;
        return this;
    }

    public FinalReport putBhvCountItem(String key, Long bhvCountItem) {
        if (this.bhvCount == null) {
            this.bhvCount = new HashMap<>();
        }
        this.bhvCount.put(key, bhvCountItem);
        return this;
    }

    public FinalReport withBhvCount(Consumer<Map<String, Long>> bhvCountSetter) {
        if (this.bhvCount == null) {
            this.bhvCount = new HashMap<>();
        }
        bhvCountSetter.accept(this.bhvCount);
        return this;
    }

    /** 行为次数统计。
     * 
     * @return bhvCount */
    public Map<String, Long> getBhvCount() {
        return bhvCount;
    }

    public void setBhvCount(Map<String, Long> bhvCount) {
        this.bhvCount = bhvCount;
    }

    public FinalReport withUserLongFeatureReport(List<NumFeatureReport> userLongFeatureReport) {
        this.userLongFeatureReport = userLongFeatureReport;
        return this;
    }

    public FinalReport addUserLongFeatureReportItem(NumFeatureReport userLongFeatureReportItem) {
        if (this.userLongFeatureReport == null) {
            this.userLongFeatureReport = new ArrayList<>();
        }
        this.userLongFeatureReport.add(userLongFeatureReportItem);
        return this;
    }

    public FinalReport withUserLongFeatureReport(Consumer<List<NumFeatureReport>> userLongFeatureReportSetter) {
        if (this.userLongFeatureReport == null) {
            this.userLongFeatureReport = new ArrayList<>();
        }
        userLongFeatureReportSetter.accept(this.userLongFeatureReport);
        return this;
    }

    /** 用户数字类型特征统计。
     * 
     * @return userLongFeatureReport */
    public List<NumFeatureReport> getUserLongFeatureReport() {
        return userLongFeatureReport;
    }

    public void setUserLongFeatureReport(List<NumFeatureReport> userLongFeatureReport) {
        this.userLongFeatureReport = userLongFeatureReport;
    }

    public FinalReport withUserFloatFeatureReport(List<NumFeatureReport> userFloatFeatureReport) {
        this.userFloatFeatureReport = userFloatFeatureReport;
        return this;
    }

    public FinalReport addUserFloatFeatureReportItem(NumFeatureReport userFloatFeatureReportItem) {
        if (this.userFloatFeatureReport == null) {
            this.userFloatFeatureReport = new ArrayList<>();
        }
        this.userFloatFeatureReport.add(userFloatFeatureReportItem);
        return this;
    }

    public FinalReport withUserFloatFeatureReport(Consumer<List<NumFeatureReport>> userFloatFeatureReportSetter) {
        if (this.userFloatFeatureReport == null) {
            this.userFloatFeatureReport = new ArrayList<>();
        }
        userFloatFeatureReportSetter.accept(this.userFloatFeatureReport);
        return this;
    }

    /** 用户连续类型特征统计。
     * 
     * @return userFloatFeatureReport */
    public List<NumFeatureReport> getUserFloatFeatureReport() {
        return userFloatFeatureReport;
    }

    public void setUserFloatFeatureReport(List<NumFeatureReport> userFloatFeatureReport) {
        this.userFloatFeatureReport = userFloatFeatureReport;
    }

    public FinalReport withUserStrFeatureReport(List<StrFeatureReport> userStrFeatureReport) {
        this.userStrFeatureReport = userStrFeatureReport;
        return this;
    }

    public FinalReport addUserStrFeatureReportItem(StrFeatureReport userStrFeatureReportItem) {
        if (this.userStrFeatureReport == null) {
            this.userStrFeatureReport = new ArrayList<>();
        }
        this.userStrFeatureReport.add(userStrFeatureReportItem);
        return this;
    }

    public FinalReport withUserStrFeatureReport(Consumer<List<StrFeatureReport>> userStrFeatureReportSetter) {
        if (this.userStrFeatureReport == null) {
            this.userStrFeatureReport = new ArrayList<>();
        }
        userStrFeatureReportSetter.accept(this.userStrFeatureReport);
        return this;
    }

    /** 用户单值离散值类型特征统计。
     * 
     * @return userStrFeatureReport */
    public List<StrFeatureReport> getUserStrFeatureReport() {
        return userStrFeatureReport;
    }

    public void setUserStrFeatureReport(List<StrFeatureReport> userStrFeatureReport) {
        this.userStrFeatureReport = userStrFeatureReport;
    }

    public FinalReport withUserStrArrayFeatureReport(List<StrFeatureReport> userStrArrayFeatureReport) {
        this.userStrArrayFeatureReport = userStrArrayFeatureReport;
        return this;
    }

    public FinalReport addUserStrArrayFeatureReportItem(StrFeatureReport userStrArrayFeatureReportItem) {
        if (this.userStrArrayFeatureReport == null) {
            this.userStrArrayFeatureReport = new ArrayList<>();
        }
        this.userStrArrayFeatureReport.add(userStrArrayFeatureReportItem);
        return this;
    }

    public FinalReport withUserStrArrayFeatureReport(Consumer<List<StrFeatureReport>> userStrArrayFeatureReportSetter) {
        if (this.userStrArrayFeatureReport == null) {
            this.userStrArrayFeatureReport = new ArrayList<>();
        }
        userStrArrayFeatureReportSetter.accept(this.userStrArrayFeatureReport);
        return this;
    }

    /** 用户多值离散值类型特征统计。
     * 
     * @return userStrArrayFeatureReport */
    public List<StrFeatureReport> getUserStrArrayFeatureReport() {
        return userStrArrayFeatureReport;
    }

    public void setUserStrArrayFeatureReport(List<StrFeatureReport> userStrArrayFeatureReport) {
        this.userStrArrayFeatureReport = userStrArrayFeatureReport;
    }

    public FinalReport withItemLongFeatureReport(List<NumFeatureReport> itemLongFeatureReport) {
        this.itemLongFeatureReport = itemLongFeatureReport;
        return this;
    }

    public FinalReport addItemLongFeatureReportItem(NumFeatureReport itemLongFeatureReportItem) {
        if (this.itemLongFeatureReport == null) {
            this.itemLongFeatureReport = new ArrayList<>();
        }
        this.itemLongFeatureReport.add(itemLongFeatureReportItem);
        return this;
    }

    public FinalReport withItemLongFeatureReport(Consumer<List<NumFeatureReport>> itemLongFeatureReportSetter) {
        if (this.itemLongFeatureReport == null) {
            this.itemLongFeatureReport = new ArrayList<>();
        }
        itemLongFeatureReportSetter.accept(this.itemLongFeatureReport);
        return this;
    }

    /** 物品数字类型特征统计。
     * 
     * @return itemLongFeatureReport */
    public List<NumFeatureReport> getItemLongFeatureReport() {
        return itemLongFeatureReport;
    }

    public void setItemLongFeatureReport(List<NumFeatureReport> itemLongFeatureReport) {
        this.itemLongFeatureReport = itemLongFeatureReport;
    }

    public FinalReport withItemFloatFeatureReport(List<NumFeatureReport> itemFloatFeatureReport) {
        this.itemFloatFeatureReport = itemFloatFeatureReport;
        return this;
    }

    public FinalReport addItemFloatFeatureReportItem(NumFeatureReport itemFloatFeatureReportItem) {
        if (this.itemFloatFeatureReport == null) {
            this.itemFloatFeatureReport = new ArrayList<>();
        }
        this.itemFloatFeatureReport.add(itemFloatFeatureReportItem);
        return this;
    }

    public FinalReport withItemFloatFeatureReport(Consumer<List<NumFeatureReport>> itemFloatFeatureReportSetter) {
        if (this.itemFloatFeatureReport == null) {
            this.itemFloatFeatureReport = new ArrayList<>();
        }
        itemFloatFeatureReportSetter.accept(this.itemFloatFeatureReport);
        return this;
    }

    /** 物品连续类型特征统计。
     * 
     * @return itemFloatFeatureReport */
    public List<NumFeatureReport> getItemFloatFeatureReport() {
        return itemFloatFeatureReport;
    }

    public void setItemFloatFeatureReport(List<NumFeatureReport> itemFloatFeatureReport) {
        this.itemFloatFeatureReport = itemFloatFeatureReport;
    }

    public FinalReport withItemStrFeatureReport(List<StrFeatureReport> itemStrFeatureReport) {
        this.itemStrFeatureReport = itemStrFeatureReport;
        return this;
    }

    public FinalReport addItemStrFeatureReportItem(StrFeatureReport itemStrFeatureReportItem) {
        if (this.itemStrFeatureReport == null) {
            this.itemStrFeatureReport = new ArrayList<>();
        }
        this.itemStrFeatureReport.add(itemStrFeatureReportItem);
        return this;
    }

    public FinalReport withItemStrFeatureReport(Consumer<List<StrFeatureReport>> itemStrFeatureReportSetter) {
        if (this.itemStrFeatureReport == null) {
            this.itemStrFeatureReport = new ArrayList<>();
        }
        itemStrFeatureReportSetter.accept(this.itemStrFeatureReport);
        return this;
    }

    /** 物品单值离散值类型特征统计。
     * 
     * @return itemStrFeatureReport */
    public List<StrFeatureReport> getItemStrFeatureReport() {
        return itemStrFeatureReport;
    }

    public void setItemStrFeatureReport(List<StrFeatureReport> itemStrFeatureReport) {
        this.itemStrFeatureReport = itemStrFeatureReport;
    }

    public FinalReport withItemStrArrayFeatureReport(List<StrFeatureReport> itemStrArrayFeatureReport) {
        this.itemStrArrayFeatureReport = itemStrArrayFeatureReport;
        return this;
    }

    public FinalReport addItemStrArrayFeatureReportItem(StrFeatureReport itemStrArrayFeatureReportItem) {
        if (this.itemStrArrayFeatureReport == null) {
            this.itemStrArrayFeatureReport = new ArrayList<>();
        }
        this.itemStrArrayFeatureReport.add(itemStrArrayFeatureReportItem);
        return this;
    }

    public FinalReport withItemStrArrayFeatureReport(Consumer<List<StrFeatureReport>> itemStrArrayFeatureReportSetter) {
        if (this.itemStrArrayFeatureReport == null) {
            this.itemStrArrayFeatureReport = new ArrayList<>();
        }
        itemStrArrayFeatureReportSetter.accept(this.itemStrArrayFeatureReport);
        return this;
    }

    /** 物品多值离散值类型特征统计。
     * 
     * @return itemStrArrayFeatureReport */
    public List<StrFeatureReport> getItemStrArrayFeatureReport() {
        return itemStrArrayFeatureReport;
    }

    public void setItemStrArrayFeatureReport(List<StrFeatureReport> itemStrArrayFeatureReport) {
        this.itemStrArrayFeatureReport = itemStrArrayFeatureReport;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinalReport finalReport = (FinalReport) o;
        return Objects.equals(this.generatedTime, finalReport.generatedTime)
            && Objects.equals(this.wideTableNum, finalReport.wideTableNum)
            && Objects.equals(this.userCompleteDegree, finalReport.userCompleteDegree)
            && Objects.equals(this.itemCompleteDegree, finalReport.itemCompleteDegree)
            && Objects.equals(this.bhvCount, finalReport.bhvCount)
            && Objects.equals(this.userLongFeatureReport, finalReport.userLongFeatureReport)
            && Objects.equals(this.userFloatFeatureReport, finalReport.userFloatFeatureReport)
            && Objects.equals(this.userStrFeatureReport, finalReport.userStrFeatureReport)
            && Objects.equals(this.userStrArrayFeatureReport, finalReport.userStrArrayFeatureReport)
            && Objects.equals(this.itemLongFeatureReport, finalReport.itemLongFeatureReport)
            && Objects.equals(this.itemFloatFeatureReport, finalReport.itemFloatFeatureReport)
            && Objects.equals(this.itemStrFeatureReport, finalReport.itemStrFeatureReport)
            && Objects.equals(this.itemStrArrayFeatureReport, finalReport.itemStrArrayFeatureReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generatedTime,
            wideTableNum,
            userCompleteDegree,
            itemCompleteDegree,
            bhvCount,
            userLongFeatureReport,
            userFloatFeatureReport,
            userStrFeatureReport,
            userStrArrayFeatureReport,
            itemLongFeatureReport,
            itemFloatFeatureReport,
            itemStrFeatureReport,
            itemStrArrayFeatureReport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinalReport {\n");
        sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
        sb.append("    wideTableNum: ").append(toIndentedString(wideTableNum)).append("\n");
        sb.append("    userCompleteDegree: ").append(toIndentedString(userCompleteDegree)).append("\n");
        sb.append("    itemCompleteDegree: ").append(toIndentedString(itemCompleteDegree)).append("\n");
        sb.append("    bhvCount: ").append(toIndentedString(bhvCount)).append("\n");
        sb.append("    userLongFeatureReport: ").append(toIndentedString(userLongFeatureReport)).append("\n");
        sb.append("    userFloatFeatureReport: ").append(toIndentedString(userFloatFeatureReport)).append("\n");
        sb.append("    userStrFeatureReport: ").append(toIndentedString(userStrFeatureReport)).append("\n");
        sb.append("    userStrArrayFeatureReport: ").append(toIndentedString(userStrArrayFeatureReport)).append("\n");
        sb.append("    itemLongFeatureReport: ").append(toIndentedString(itemLongFeatureReport)).append("\n");
        sb.append("    itemFloatFeatureReport: ").append(toIndentedString(itemFloatFeatureReport)).append("\n");
        sb.append("    itemStrFeatureReport: ").append(toIndentedString(itemStrFeatureReport)).append("\n");
        sb.append("    itemStrArrayFeatureReport: ").append(toIndentedString(itemStrArrayFeatureReport)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
