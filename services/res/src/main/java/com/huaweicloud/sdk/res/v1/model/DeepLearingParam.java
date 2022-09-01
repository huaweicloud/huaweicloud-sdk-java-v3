package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 深度学习作业通用参数
 */
public class DeepLearingParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_parameters")

    @JacksonXmlProperty(localName = "initial_parameters")

    private Initial initialParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimize_parameters")

    @JacksonXmlProperty(localName = "optimize_parameters")

    private Optimizer optimizeParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regular_parameters")

    @JacksonXmlProperty(localName = "regular_parameters")

    private Regular regularParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iterations")

    @JacksonXmlProperty(localName = "max_iterations")

    private Integer maxIterations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "early_stop_iterations")

    @JacksonXmlProperty(localName = "early_stop_iterations")

    private Integer earlyStopIterations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_size")

    @JacksonXmlProperty(localName = "batch_size")

    private Integer batchSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_split_parts")

    @JacksonXmlProperty(localName = "dataset_split_parts")

    private Integer datasetSplitParts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_train")

    @JacksonXmlProperty(localName = "restart_train")

    private Boolean restartTrain;

    public DeepLearingParam withInitialParameters(Initial initialParameters) {
        this.initialParameters = initialParameters;
        return this;
    }

    public DeepLearingParam withInitialParameters(Consumer<Initial> initialParametersSetter) {
        if (this.initialParameters == null) {
            this.initialParameters = new Initial();
            initialParametersSetter.accept(this.initialParameters);
        }

        return this;
    }

    /**
     * Get initialParameters
     * @return initialParameters
     */
    public Initial getInitialParameters() {
        return initialParameters;
    }

    public void setInitialParameters(Initial initialParameters) {
        this.initialParameters = initialParameters;
    }

    public DeepLearingParam withOptimizeParameters(Optimizer optimizeParameters) {
        this.optimizeParameters = optimizeParameters;
        return this;
    }

    public DeepLearingParam withOptimizeParameters(Consumer<Optimizer> optimizeParametersSetter) {
        if (this.optimizeParameters == null) {
            this.optimizeParameters = new Optimizer();
            optimizeParametersSetter.accept(this.optimizeParameters);
        }

        return this;
    }

    /**
     * Get optimizeParameters
     * @return optimizeParameters
     */
    public Optimizer getOptimizeParameters() {
        return optimizeParameters;
    }

    public void setOptimizeParameters(Optimizer optimizeParameters) {
        this.optimizeParameters = optimizeParameters;
    }

    public DeepLearingParam withRegularParameters(Regular regularParameters) {
        this.regularParameters = regularParameters;
        return this;
    }

    public DeepLearingParam withRegularParameters(Consumer<Regular> regularParametersSetter) {
        if (this.regularParameters == null) {
            this.regularParameters = new Regular();
            regularParametersSetter.accept(this.regularParameters);
        }

        return this;
    }

    /**
     * Get regularParameters
     * @return regularParameters
     */
    public Regular getRegularParameters() {
        return regularParameters;
    }

    public void setRegularParameters(Regular regularParameters) {
        this.regularParameters = regularParameters;
    }

    public DeepLearingParam withMaxIterations(Integer maxIterations) {
        this.maxIterations = maxIterations;
        return this;
    }

    /**
     * 最大迭代轮数。
     * minimum: 1
     * maximum: 1000
     * @return maxIterations
     */
    public Integer getMaxIterations() {
        return maxIterations;
    }

    public void setMaxIterations(Integer maxIterations) {
        this.maxIterations = maxIterations;
    }

    public DeepLearingParam withEarlyStopIterations(Integer earlyStopIterations) {
        this.earlyStopIterations = earlyStopIterations;
        return this;
    }

    /**
     * 提前终止训练轮数。
     * minimum: 1
     * maximum: 1000
     * @return earlyStopIterations
     */
    public Integer getEarlyStopIterations() {
        return earlyStopIterations;
    }

    public void setEarlyStopIterations(Integer earlyStopIterations) {
        this.earlyStopIterations = earlyStopIterations;
    }

    public DeepLearingParam withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * 批量大小。
     * minimum: 1
     * @return batchSize
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public DeepLearingParam withDatasetSplitParts(Integer datasetSplitParts) {
        this.datasetSplitParts = datasetSplitParts;
        return this;
    }

    /**
     * 训练数据集切分数量。
     * minimum: 1
     * maximum: 10
     * @return datasetSplitParts
     */
    public Integer getDatasetSplitParts() {
        return datasetSplitParts;
    }

    public void setDatasetSplitParts(Integer datasetSplitParts) {
        this.datasetSplitParts = datasetSplitParts;
    }

    public DeepLearingParam withRestartTrain(Boolean restartTrain) {
        this.restartTrain = restartTrain;
        return this;
    }

    /**
     * 重新训练。
     * @return restartTrain
     */
    public Boolean getRestartTrain() {
        return restartTrain;
    }

    public void setRestartTrain(Boolean restartTrain) {
        this.restartTrain = restartTrain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeepLearingParam deepLearingParam = (DeepLearingParam) o;
        return Objects.equals(this.initialParameters, deepLearingParam.initialParameters)
            && Objects.equals(this.optimizeParameters, deepLearingParam.optimizeParameters)
            && Objects.equals(this.regularParameters, deepLearingParam.regularParameters)
            && Objects.equals(this.maxIterations, deepLearingParam.maxIterations)
            && Objects.equals(this.earlyStopIterations, deepLearingParam.earlyStopIterations)
            && Objects.equals(this.batchSize, deepLearingParam.batchSize)
            && Objects.equals(this.datasetSplitParts, deepLearingParam.datasetSplitParts)
            && Objects.equals(this.restartTrain, deepLearingParam.restartTrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialParameters,
            optimizeParameters,
            regularParameters,
            maxIterations,
            earlyStopIterations,
            batchSize,
            datasetSplitParts,
            restartTrain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeepLearingParam {\n");
        sb.append("    initialParameters: ").append(toIndentedString(initialParameters)).append("\n");
        sb.append("    optimizeParameters: ").append(toIndentedString(optimizeParameters)).append("\n");
        sb.append("    regularParameters: ").append(toIndentedString(regularParameters)).append("\n");
        sb.append("    maxIterations: ").append(toIndentedString(maxIterations)).append("\n");
        sb.append("    earlyStopIterations: ").append(toIndentedString(earlyStopIterations)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    datasetSplitParts: ").append(toIndentedString(datasetSplitParts)).append("\n");
        sb.append("    restartTrain: ").append(toIndentedString(restartTrain)).append("\n");
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
