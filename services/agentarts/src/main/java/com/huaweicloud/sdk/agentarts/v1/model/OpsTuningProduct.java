package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OpsTuningProduct
 */
public class OpsTuningProduct {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epoch")

    private Integer epoch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reward_value")

    private Double rewardValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eval_reward_value")

    private Double evalRewardValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_length")

    private Double responseLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    /**
     * **参数解释：** 产物文件上传状态。  **取值范围：** uploading上传中，uploaded已上传，failed上传失败。
     */
    public static final class StatusEnum {

        /**
         * Enum UPLOADED for value: "uploaded"
         */
        public static final StatusEnum UPLOADED = new StatusEnum("uploaded");

        /**
         * Enum UPLOADING for value: "uploading"
         */
        public static final StatusEnum UPLOADING = new StatusEnum("uploading");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("uploaded", UPLOADED);
            map.put("uploading", UPLOADING);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public OpsTuningProduct withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 产物ID，标识模型产物的唯一ID。  **取值范围：** 唯一标识符字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsTuningProduct withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 产物名称。  **取值范围：** 产物名称字符串。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsTuningProduct withEpoch(Integer epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * **参数解释：** 训练轮数，生成该产物时模型已完成训练的轮数，单位：轮。  **取值范围：** 大于等于0的整数。
     * minimum: 1
     * maximum: 1000
     * @return epoch
     */
    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public OpsTuningProduct withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释：** 训练步数，生成该产物时模型已完成训练的步，单位：步。  **取值范围：** 大于等于0的整数。
     * minimum: 1
     * maximum: 1000
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public OpsTuningProduct withRewardValue(Double rewardValue) {
        this.rewardValue = rewardValue;
        return this;
    }

    /**
     * **参数解释：** 奖励值，该产物模型在评估时的得分。  **取值范围：** 0-1的浮点数。
     * minimum: 0
     * maximum: 1E+5
     * @return rewardValue
     */
    public Double getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(Double rewardValue) {
        this.rewardValue = rewardValue;
    }

    public OpsTuningProduct withEvalRewardValue(Double evalRewardValue) {
        this.evalRewardValue = evalRewardValue;
        return this;
    }

    /**
     * **参数解释：** 在该步数下计算得出验证集上的奖励值，反映模型生成结果的质量。  **取值范围：** 浮点数。
     * minimum: 0
     * maximum: 1E+5
     * @return evalRewardValue
     */
    public Double getEvalRewardValue() {
        return evalRewardValue;
    }

    public void setEvalRewardValue(Double evalRewardValue) {
        this.evalRewardValue = evalRewardValue;
    }

    public OpsTuningProduct withResponseLength(Double responseLength) {
        this.responseLength = responseLength;
        return this;
    }

    /**
     * **参数解释：** 平均响应长度，模型生成内容的平均Token数，单位：Token。  **取值范围：** 大于等于0的整数。
     * minimum: 0
     * maximum: 1E+5
     * @return responseLength
     */
    public Double getResponseLength() {
        return responseLength;
    }

    public void setResponseLength(Double responseLength) {
        this.responseLength = responseLength;
    }

    public OpsTuningProduct withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 产物地址（如OBS路径）。  **取值范围：** 不涉及
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OpsTuningProduct withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public OpsTuningProduct withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 产物文件上传状态。  **取值范围：** uploading上传中，uploaded已上传，failed上传失败。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OpsTuningProduct withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释：** 产物转存错误信息。  **取值范围：** 无。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningProduct that = (OpsTuningProduct) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.epoch, that.epoch) && Objects.equals(this.step, that.step)
            && Objects.equals(this.rewardValue, that.rewardValue)
            && Objects.equals(this.evalRewardValue, that.evalRewardValue)
            && Objects.equals(this.responseLength, that.responseLength) && Objects.equals(this.url, that.url)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            epoch,
            step,
            rewardValue,
            evalRewardValue,
            responseLength,
            url,
            createdAt,
            status,
            failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningProduct {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
        sb.append("    evalRewardValue: ").append(toIndentedString(evalRewardValue)).append("\n");
        sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
