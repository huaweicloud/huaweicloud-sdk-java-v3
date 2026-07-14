package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动扩缩容事件返回体
 */
public class HpaEventResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpa_id")

    private String hpaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_replicas")

    private Integer currentReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_replicas")

    private Integer targetReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "final_replicas")

    private Integer finalReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private String recordTime;

    public HpaEventResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略事件ID **取值范围：** 事件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HpaEventResponse withHpaId(String hpaId) {
        this.hpaId = hpaId;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容策略ID **取值范围：** 策略ID
     * @return hpaId
     */
    public String getHpaId() {
        return hpaId;
    }

    public void setHpaId(String hpaId) {
        this.hpaId = hpaId;
    }

    public HpaEventResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容事件状态。 **取值范围：** - SUCCESS: 成功 - FAILED: 失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HpaEventResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 自动扩缩容规则执行信息。 **取值范围：** 不涉及
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HpaEventResponse withCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    /**
     * **参数解释：** 扩缩容前实例数。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 128
     * @return currentReplicas
     */
    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    public HpaEventResponse withTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
        return this;
    }

    /**
     * **参数解释：** 预设目标实例数。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 128
     * @return targetReplicas
     */
    public Integer getTargetReplicas() {
        return targetReplicas;
    }

    public void setTargetReplicas(Integer targetReplicas) {
        this.targetReplicas = targetReplicas;
    }

    public HpaEventResponse withFinalReplicas(Integer finalReplicas) {
        this.finalReplicas = finalReplicas;
        return this;
    }

    /**
     * **参数解释：** 扩缩容后实例数。 **取值范围：** 不涉及。
     * minimum: 0
     * maximum: 128
     * @return finalReplicas
     */
    public Integer getFinalReplicas() {
        return finalReplicas;
    }

    public void setFinalReplicas(Integer finalReplicas) {
        this.finalReplicas = finalReplicas;
    }

    public HpaEventResponse withRecordTime(String recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * **参数解释：** 执行记录时间。 **取值范围：** 2025-05-20 10:05:55
     * @return recordTime
     */
    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HpaEventResponse that = (HpaEventResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hpaId, that.hpaId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.currentReplicas, that.currentReplicas)
            && Objects.equals(this.targetReplicas, that.targetReplicas)
            && Objects.equals(this.finalReplicas, that.finalReplicas)
            && Objects.equals(this.recordTime, that.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hpaId, status, message, currentReplicas, targetReplicas, finalReplicas, recordTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HpaEventResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hpaId: ").append(toIndentedString(hpaId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
        sb.append("    targetReplicas: ").append(toIndentedString(targetReplicas)).append("\n");
        sb.append("    finalReplicas: ").append(toIndentedString(finalReplicas)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
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
