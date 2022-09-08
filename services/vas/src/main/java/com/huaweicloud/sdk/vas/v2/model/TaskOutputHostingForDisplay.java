package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出为hosting类型时的配置和展示信息
 */
public class TaskOutputHostingForDisplay {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private List<TaskOutputHostingForDisplayObs> obs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_json_overdue_at")

    private Long resultJsonOverdueAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    private List<String> dataCategory = null;

    public TaskOutputHostingForDisplay withObs(List<TaskOutputHostingForDisplayObs> obs) {
        this.obs = obs;
        return this;
    }

    public TaskOutputHostingForDisplay addObsItem(TaskOutputHostingForDisplayObs obsItem) {
        if (this.obs == null) {
            this.obs = new ArrayList<>();
        }
        this.obs.add(obsItem);
        return this;
    }

    public TaskOutputHostingForDisplay withObs(Consumer<List<TaskOutputHostingForDisplayObs>> obsSetter) {
        if (this.obs == null) {
            this.obs = new ArrayList<>();
        }
        obsSetter.accept(this.obs);
        return this;
    }

    /**
     * 作业所有结果文件所在的OBS桶和路径
     * @return obs
     */
    public List<TaskOutputHostingForDisplayObs> getObs() {
        return obs;
    }

    public void setObs(List<TaskOutputHostingForDisplayObs> obs) {
        this.obs = obs;
    }

    public TaskOutputHostingForDisplay withResultJsonOverdueAt(Long resultJsonOverdueAt) {
        this.resultJsonOverdueAt = resultJsonOverdueAt;
        return this;
    }

    /**
     * 作业结果文件的过期时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return resultJsonOverdueAt
     */
    public Long getResultJsonOverdueAt() {
        return resultJsonOverdueAt;
    }

    public void setResultJsonOverdueAt(Long resultJsonOverdueAt) {
        this.resultJsonOverdueAt = resultJsonOverdueAt;
    }

    public TaskOutputHostingForDisplay withDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    public TaskOutputHostingForDisplay addDataCategoryItem(String dataCategoryItem) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        this.dataCategory.add(dataCategoryItem);
        return this;
    }

    public TaskOutputHostingForDisplay withDataCategory(Consumer<List<String>> dataCategorySetter) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        dataCategorySetter.accept(this.dataCategory);
        return this;
    }

    /**
     * 作业输出数据类别的列表，当输出类型下有这个列表时，表示希望这个输出类型下存放dataCategory列表内的数据，部分服务需要
     * @return dataCategory
     */
    public List<String> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskOutputHostingForDisplay taskOutputHostingForDisplay = (TaskOutputHostingForDisplay) o;
        return Objects.equals(this.obs, taskOutputHostingForDisplay.obs)
            && Objects.equals(this.resultJsonOverdueAt, taskOutputHostingForDisplay.resultJsonOverdueAt)
            && Objects.equals(this.dataCategory, taskOutputHostingForDisplay.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, resultJsonOverdueAt, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputHostingForDisplay {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    resultJsonOverdueAt: ").append(toIndentedString(resultJsonOverdueAt)).append("\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
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
