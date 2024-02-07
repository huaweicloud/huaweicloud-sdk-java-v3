package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModelDto
 */
public class ModelDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_quantity")

    private Integer dataQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ModelFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private ValueRange2 valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "losses")

    private List<Float> losses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<ModelMetric> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ModelMetric")

    private ModelDtoModelMetric modelMetric;

    public ModelDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模型ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模型类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModelDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 模型创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ModelDto withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 模型结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ModelDto withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建模型的用户名称
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ModelDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModelDto withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * 是否打开组织共享
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public ModelDto withDataQuantity(Integer dataQuantity) {
        this.dataQuantity = dataQuantity;
        return this;
    }

    /**
     * 模型数据量
     * @return dataQuantity
     */
    public Integer getDataQuantity() {
        return dataQuantity;
    }

    public void setDataQuantity(Integer dataQuantity) {
        this.dataQuantity = dataQuantity;
    }

    public ModelDto withFile(ModelFile file) {
        this.file = file;
        return this;
    }

    public ModelDto withFile(Consumer<ModelFile> fileSetter) {
        if (this.file == null) {
            this.file = new ModelFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ModelFile getFile() {
        return file;
    }

    public void setFile(ModelFile file) {
        this.file = file;
    }

    public ModelDto withValueRange(ValueRange2 valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    public ModelDto withValueRange(Consumer<ValueRange2> valueRangeSetter) {
        if (this.valueRange == null) {
            this.valueRange = new ValueRange2();
            valueRangeSetter.accept(this.valueRange);
        }

        return this;
    }

    /**
     * Get valueRange
     * @return valueRange
     */
    public ValueRange2 getValueRange() {
        return valueRange;
    }

    public void setValueRange(ValueRange2 valueRange) {
        this.valueRange = valueRange;
    }

    public ModelDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模型描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelDto withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 失败提示，当作业执行失败时会返回
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public ModelDto withLosses(List<Float> losses) {
        this.losses = losses;
        return this;
    }

    public ModelDto addLossesItem(Float lossesItem) {
        if (this.losses == null) {
            this.losses = new ArrayList<>();
        }
        this.losses.add(lossesItem);
        return this;
    }

    public ModelDto withLosses(Consumer<List<Float>> lossesSetter) {
        if (this.losses == null) {
            this.losses = new ArrayList<>();
        }
        lossesSetter.accept(this.losses);
        return this;
    }

    /**
     * 模型训练loss信息
     * @return losses
     */
    public List<Float> getLosses() {
        return losses;
    }

    public void setLosses(List<Float> losses) {
        this.losses = losses;
    }

    public ModelDto withMetrics(List<ModelMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ModelDto addMetricsItem(ModelMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ModelDto withMetrics(Consumer<List<ModelMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 模型评估指标
     * @return metrics
     */
    public List<ModelMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<ModelMetric> metrics) {
        this.metrics = metrics;
    }

    public ModelDto withModelMetric(ModelDtoModelMetric modelMetric) {
        this.modelMetric = modelMetric;
        return this;
    }

    public ModelDto withModelMetric(Consumer<ModelDtoModelMetric> modelMetricSetter) {
        if (this.modelMetric == null) {
            this.modelMetric = new ModelDtoModelMetric();
            modelMetricSetter.accept(this.modelMetric);
        }

        return this;
    }

    /**
     * Get modelMetric
     * @return modelMetric
     */
    public ModelDtoModelMetric getModelMetric() {
        return modelMetric;
    }

    public void setModelMetric(ModelDtoModelMetric modelMetric) {
        this.modelMetric = modelMetric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelDto that = (ModelDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.status, that.status) && Objects.equals(this.shareable, that.shareable)
            && Objects.equals(this.dataQuantity, that.dataQuantity) && Objects.equals(this.file, that.file)
            && Objects.equals(this.valueRange, that.valueRange) && Objects.equals(this.description, that.description)
            && Objects.equals(this.failedMessage, that.failedMessage) && Objects.equals(this.losses, that.losses)
            && Objects.equals(this.metrics, that.metrics) && Objects.equals(this.modelMetric, that.modelMetric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            type,
            createTime,
            finishTime,
            creator,
            status,
            shareable,
            dataQuantity,
            file,
            valueRange,
            description,
            failedMessage,
            losses,
            metrics,
            modelMetric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
        sb.append("    dataQuantity: ").append(toIndentedString(dataQuantity)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    modelMetric: ").append(toIndentedString(modelMetric)).append("\n");
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
