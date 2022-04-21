package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NearLineRecallParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_limit")

    private Boolean timeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeFeature")

    private String timeFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retainDays")

    private Integer retainDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recall_fileds")

    private List<RecallFiled> recallFileds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "itemCF_job_name")

    private String itemCFJobName;

    public NearLineRecallParam withTimeLimit(Boolean timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    /**
     * 时间过滤。
     * @return timeLimit
     */
    public Boolean getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Boolean timeLimit) {
        this.timeLimit = timeLimit;
    }

    public NearLineRecallParam withTimeFeature(String timeFeature) {
        this.timeFeature = timeFeature;
        return this;
    }

    /**
     * 时间特征。
     * @return timeFeature
     */
    public String getTimeFeature() {
        return timeFeature;
    }

    public void setTimeFeature(String timeFeature) {
        this.timeFeature = timeFeature;
    }

    public NearLineRecallParam withRetainDays(Integer retainDays) {
        this.retainDays = retainDays;
        return this;
    }

    /**
     * 保留期(天)。
     * @return retainDays
     */
    public Integer getRetainDays() {
        return retainDays;
    }

    public void setRetainDays(Integer retainDays) {
        this.retainDays = retainDays;
    }

    public NearLineRecallParam withRecallFileds(List<RecallFiled> recallFileds) {
        this.recallFileds = recallFileds;
        return this;
    }

    public NearLineRecallParam addRecallFiledsItem(RecallFiled recallFiledsItem) {
        if (this.recallFileds == null) {
            this.recallFileds = new ArrayList<>();
        }
        this.recallFileds.add(recallFiledsItem);
        return this;
    }

    public NearLineRecallParam withRecallFileds(Consumer<List<RecallFiled>> recallFiledsSetter) {
        if (this.recallFileds == null) {
            this.recallFileds = new ArrayList<>();
        }
        recallFiledsSetter.accept(this.recallFileds);
        return this;
    }

    /**
     * 召回字段。
     * @return recallFileds
     */
    public List<RecallFiled> getRecallFileds() {
        return recallFileds;
    }

    public void setRecallFileds(List<RecallFiled> recallFileds) {
        this.recallFileds = recallFileds;
    }

    public NearLineRecallParam withItemCFJobName(String itemCFJobName) {
        this.itemCFJobName = itemCFJobName;
        return this;
    }

    /**
     * 物品协同过滤作业名称。
     * @return itemCFJobName
     */
    public String getItemCFJobName() {
        return itemCFJobName;
    }

    public void setItemCFJobName(String itemCFJobName) {
        this.itemCFJobName = itemCFJobName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NearLineRecallParam nearLineRecallParam = (NearLineRecallParam) o;
        return Objects.equals(this.timeLimit, nearLineRecallParam.timeLimit)
            && Objects.equals(this.timeFeature, nearLineRecallParam.timeFeature)
            && Objects.equals(this.retainDays, nearLineRecallParam.retainDays)
            && Objects.equals(this.recallFileds, nearLineRecallParam.recallFileds)
            && Objects.equals(this.itemCFJobName, nearLineRecallParam.itemCFJobName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeLimit, timeFeature, retainDays, recallFileds, itemCFJobName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NearLineRecallParam {\n");
        sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
        sb.append("    timeFeature: ").append(toIndentedString(timeFeature)).append("\n");
        sb.append("    retainDays: ").append(toIndentedString(retainDays)).append("\n");
        sb.append("    recallFileds: ").append(toIndentedString(recallFileds)).append("\n");
        sb.append("    itemCFJobName: ").append(toIndentedString(itemCFJobName)).append("\n");
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
