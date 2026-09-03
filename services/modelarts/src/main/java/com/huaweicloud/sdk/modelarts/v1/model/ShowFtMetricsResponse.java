package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFtMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loss")

    private Object loss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eval_loss")

    private Object evalLoss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_info")

    private Object trainingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_process")

    private Double trainProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private FtMetricData data;

    public ShowFtMetricsResponse withLoss(Object loss) {
        this.loss = loss;
        return this;
    }

    /**
     * 训练loss信息
     * @return loss
     */
    public Object getLoss() {
        return loss;
    }

    public void setLoss(Object loss) {
        this.loss = loss;
    }

    public ShowFtMetricsResponse withEvalLoss(Object evalLoss) {
        this.evalLoss = evalLoss;
        return this;
    }

    /**
     * 评测loss信息
     * @return evalLoss
     */
    public Object getEvalLoss() {
        return evalLoss;
    }

    public void setEvalLoss(Object evalLoss) {
        this.evalLoss = evalLoss;
    }

    public ShowFtMetricsResponse withTrainingInfo(Object trainingInfo) {
        this.trainingInfo = trainingInfo;
        return this;
    }

    /**
     * 训练预估时长信息
     * @return trainingInfo
     */
    public Object getTrainingInfo() {
        return trainingInfo;
    }

    public void setTrainingInfo(Object trainingInfo) {
        this.trainingInfo = trainingInfo;
    }

    public ShowFtMetricsResponse withTrainProcess(Double trainProcess) {
        this.trainProcess = trainProcess;
        return this;
    }

    /**
     * 训练进度信息
     * minimum: 0
     * maximum: 1
     * @return trainProcess
     */
    public Double getTrainProcess() {
        return trainProcess;
    }

    public void setTrainProcess(Double trainProcess) {
        this.trainProcess = trainProcess;
    }

    public ShowFtMetricsResponse withData(FtMetricData data) {
        this.data = data;
        return this;
    }

    public ShowFtMetricsResponse withData(Consumer<FtMetricData> dataSetter) {
        if (this.data == null) {
            this.data = new FtMetricData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public FtMetricData getData() {
        return data;
    }

    public void setData(FtMetricData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFtMetricsResponse that = (ShowFtMetricsResponse) obj;
        return Objects.equals(this.loss, that.loss) && Objects.equals(this.evalLoss, that.evalLoss)
            && Objects.equals(this.trainingInfo, that.trainingInfo)
            && Objects.equals(this.trainProcess, that.trainProcess) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loss, evalLoss, trainingInfo, trainProcess, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFtMetricsResponse {\n");
        sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
        sb.append("    evalLoss: ").append(toIndentedString(evalLoss)).append("\n");
        sb.append("    trainingInfo: ").append(toIndentedString(trainingInfo)).append("\n");
        sb.append("    trainProcess: ").append(toIndentedString(trainProcess)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
