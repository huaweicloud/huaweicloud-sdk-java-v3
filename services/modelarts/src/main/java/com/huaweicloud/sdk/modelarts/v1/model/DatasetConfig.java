package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatasetConfig
 */
public class DatasetConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_source")

    private String datasetSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "split_ratio")

    private Integer splitRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_step")

    private String usedStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_proportion")

    private Integer datasetProportion;

    public DatasetConfig withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * 训练数据集名称，取自数据集列表接口响应体name。
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public DatasetConfig withDatasetSource(String datasetSource) {
        this.datasetSource = datasetSource;
        return this;
    }

    /**
     * 所使用的数据集来源，取值datamng|OBS|DB,分别表示来自于数据工程|OBS|数据库
     * @return datasetSource
     */
    public String getDatasetSource() {
        return datasetSource;
    }

    public void setDatasetSource(String datasetSource) {
        this.datasetSource = datasetSource;
    }

    public DatasetConfig withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * 训练数据集id，取自数据集列表接口响应体dataset_id。
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public DatasetConfig withSplitRatio(Integer splitRatio) {
        this.splitRatio = splitRatio;
        return this;
    }

    /**
     * 训练、验证数据集分割比率，当该模型支持验证集且验证集来自选择的训练集时使用，取值大于等于1，小于等于50。
     * minimum: 1
     * maximum: 50
     * @return splitRatio
     */
    public Integer getSplitRatio() {
        return splitRatio;
    }

    public void setSplitRatio(Integer splitRatio) {
        this.splitRatio = splitRatio;
    }

    public DatasetConfig withUsedStep(String usedStep) {
        this.usedStep = usedStep;
        return this;
    }

    /**
     * 数据集使用的阶段，取值为train|eval|test，分别表示该数据集用于训练|验证|测试。
     * @return usedStep
     */
    public String getUsedStep() {
        return usedStep;
    }

    public void setUsedStep(String usedStep) {
        this.usedStep = usedStep;
    }

    public DatasetConfig withDatasetProportion(Integer datasetProportion) {
        this.datasetProportion = datasetProportion;
        return this;
    }

    /**
     * 数据集配比比率，表示使用多少比率的该数据集进行训练。
     * minimum: 0
     * maximum: 100
     * @return datasetProportion
     */
    public Integer getDatasetProportion() {
        return datasetProportion;
    }

    public void setDatasetProportion(Integer datasetProportion) {
        this.datasetProportion = datasetProportion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatasetConfig that = (DatasetConfig) obj;
        return Objects.equals(this.datasetName, that.datasetName)
            && Objects.equals(this.datasetSource, that.datasetSource) && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.splitRatio, that.splitRatio) && Objects.equals(this.usedStep, that.usedStep)
            && Objects.equals(this.datasetProportion, that.datasetProportion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetName, datasetSource, datasetId, splitRatio, usedStep, datasetProportion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetConfig {\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    datasetSource: ").append(toIndentedString(datasetSource)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    splitRatio: ").append(toIndentedString(splitRatio)).append("\n");
        sb.append("    usedStep: ").append(toIndentedString(usedStep)).append("\n");
        sb.append("    datasetProportion: ").append(toIndentedString(datasetProportion)).append("\n");
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
