package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TicsJobInstanceVo
 */
public class TicsJobInstanceVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext")

    private String ext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_single_predict")

    private Boolean isSinglePredict;

    /**
     * 作业类型，HFL.横向联邦，SQL.联邦分析，VFL_EVALUATE.联邦评估，VFL_FEATURE_SELECTION.特征选择，VFL_ID_TRUNCATION.Id截断，VFL_PREDICT.联邦预测，VFL_SAMPLE_ALIGNMENT.样本对齐，VFL_TRAIN.联邦训练
     */
    public static final class JobInstanceTypeEnum {

        /**
         * Enum HFL for value: "HFL"
         */
        public static final JobInstanceTypeEnum HFL = new JobInstanceTypeEnum("HFL");

        /**
         * Enum SQL for value: "SQL"
         */
        public static final JobInstanceTypeEnum SQL = new JobInstanceTypeEnum("SQL");

        /**
         * Enum VFL_EVALUATE for value: "VFL_EVALUATE"
         */
        public static final JobInstanceTypeEnum VFL_EVALUATE = new JobInstanceTypeEnum("VFL_EVALUATE");

        /**
         * Enum VFL_FEATURE_SELECTION for value: "VFL_FEATURE_SELECTION"
         */
        public static final JobInstanceTypeEnum VFL_FEATURE_SELECTION =
            new JobInstanceTypeEnum("VFL_FEATURE_SELECTION");

        /**
         * Enum VFL_ID_TRUNCATION for value: "VFL_ID_TRUNCATION"
         */
        public static final JobInstanceTypeEnum VFL_ID_TRUNCATION = new JobInstanceTypeEnum("VFL_ID_TRUNCATION");

        /**
         * Enum VFL_PREDICT for value: "VFL_PREDICT"
         */
        public static final JobInstanceTypeEnum VFL_PREDICT = new JobInstanceTypeEnum("VFL_PREDICT");

        /**
         * Enum VFL_SAMPLE_ALIGNMENT for value: "VFL_SAMPLE_ALIGNMENT"
         */
        public static final JobInstanceTypeEnum VFL_SAMPLE_ALIGNMENT = new JobInstanceTypeEnum("VFL_SAMPLE_ALIGNMENT");

        /**
         * Enum VFL_TRAIN for value: "VFL_TRAIN"
         */
        public static final JobInstanceTypeEnum VFL_TRAIN = new JobInstanceTypeEnum("VFL_TRAIN");

        private static final Map<String, JobInstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobInstanceTypeEnum> createStaticFields() {
            Map<String, JobInstanceTypeEnum> map = new HashMap<>();
            map.put("HFL", HFL);
            map.put("SQL", SQL);
            map.put("VFL_EVALUATE", VFL_EVALUATE);
            map.put("VFL_FEATURE_SELECTION", VFL_FEATURE_SELECTION);
            map.put("VFL_ID_TRUNCATION", VFL_ID_TRUNCATION);
            map.put("VFL_PREDICT", VFL_PREDICT);
            map.put("VFL_SAMPLE_ALIGNMENT", VFL_SAMPLE_ALIGNMENT);
            map.put("VFL_TRAIN", VFL_TRAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobInstanceTypeEnum(String value) {
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
        public static JobInstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobInstanceTypeEnum(value));
        }

        public static JobInstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobInstanceTypeEnum) {
                return this.value.equals(((JobInstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_instance_type")

    private JobInstanceTypeEnum jobInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_partner")

    private String jobPartner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_ext")

    private String resultExt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "round_id")

    private Integer roundId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    /**
     * 作业、任务状态，作业任务状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
     */
    public static final class StatusEnum {

        /**
         * Enum ACCEPTED for value: "ACCEPTED"
         */
        public static final StatusEnum ACCEPTED = new StatusEnum("ACCEPTED");

        /**
         * Enum DEPLOYING for value: "DEPLOYING"
         */
        public static final StatusEnum DEPLOYING = new StatusEnum("DEPLOYING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final StatusEnum NEW = new StatusEnum("NEW");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StatusEnum PENDING = new StatusEnum("PENDING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum SUBMITING for value: "SUBMITING"
         */
        public static final StatusEnum SUBMITING = new StatusEnum("SUBMITING");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final StatusEnum TERMINATED = new StatusEnum("TERMINATED");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final StatusEnum TERMINATING = new StatusEnum("TERMINATING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACCEPTED", ACCEPTED);
            map.put("DEPLOYING", DEPLOYING);
            map.put("FAILED", FAILED);
            map.put("NEW", NEW);
            map.put("PENDING", PENDING);
            map.put("RUNNING", RUNNING);
            map.put("SUBMITING", SUBMITING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("TERMINATED", TERMINATED);
            map.put("TERMINATING", TERMINATING);
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

    public TicsJobInstanceVo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public TicsJobInstanceVo withExt(String ext) {
        this.ext = ext;
        return this;
    }

    /**
     * 参数等额外信息
     * @return ext
     */
    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public TicsJobInstanceVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TicsJobInstanceVo withIsSinglePredict(Boolean isSinglePredict) {
        this.isSinglePredict = isSinglePredict;
        return this;
    }

    /**
     * 单方还是双方预测
     * @return isSinglePredict
     */
    public Boolean getIsSinglePredict() {
        return isSinglePredict;
    }

    public void setIsSinglePredict(Boolean isSinglePredict) {
        this.isSinglePredict = isSinglePredict;
    }

    public TicsJobInstanceVo withJobInstanceType(JobInstanceTypeEnum jobInstanceType) {
        this.jobInstanceType = jobInstanceType;
        return this;
    }

    /**
     * 作业类型，HFL.横向联邦，SQL.联邦分析，VFL_EVALUATE.联邦评估，VFL_FEATURE_SELECTION.特征选择，VFL_ID_TRUNCATION.Id截断，VFL_PREDICT.联邦预测，VFL_SAMPLE_ALIGNMENT.样本对齐，VFL_TRAIN.联邦训练
     * @return jobInstanceType
     */
    public JobInstanceTypeEnum getJobInstanceType() {
        return jobInstanceType;
    }

    public void setJobInstanceType(JobInstanceTypeEnum jobInstanceType) {
        this.jobInstanceType = jobInstanceType;
    }

    public TicsJobInstanceVo withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public TicsJobInstanceVo withJobPartner(String jobPartner) {
        this.jobPartner = jobPartner;
        return this;
    }

    /**
     * 参与方信息
     * @return jobPartner
     */
    public String getJobPartner() {
        return jobPartner;
    }

    public void setJobPartner(String jobPartner) {
        this.jobPartner = jobPartner;
    }

    public TicsJobInstanceVo withResultExt(String resultExt) {
        this.resultExt = resultExt;
        return this;
    }

    /**
     * 参数等额外信息
     * @return resultExt
     */
    public String getResultExt() {
        return resultExt;
    }

    public void setResultExt(String resultExt) {
        this.resultExt = resultExt;
    }

    public TicsJobInstanceVo withRoundId(Integer roundId) {
        this.roundId = roundId;
        return this;
    }

    /**
     * 作业执行总轮数
     * @return roundId
     */
    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public TicsJobInstanceVo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public TicsJobInstanceVo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 作业、任务状态，作业任务状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsJobInstanceVo that = (TicsJobInstanceVo) obj;
        return Objects.equals(this.endTime, that.endTime) && Objects.equals(this.ext, that.ext)
            && Objects.equals(this.id, that.id) && Objects.equals(this.isSinglePredict, that.isSinglePredict)
            && Objects.equals(this.jobInstanceType, that.jobInstanceType) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobPartner, that.jobPartner) && Objects.equals(this.resultExt, that.resultExt)
            && Objects.equals(this.roundId, that.roundId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime,
            ext,
            id,
            isSinglePredict,
            jobInstanceType,
            jobName,
            jobPartner,
            resultExt,
            roundId,
            startTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsJobInstanceVo {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isSinglePredict: ").append(toIndentedString(isSinglePredict)).append("\n");
        sb.append("    jobInstanceType: ").append(toIndentedString(jobInstanceType)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobPartner: ").append(toIndentedString(jobPartner)).append("\n");
        sb.append("    resultExt: ").append(toIndentedString(resultExt)).append("\n");
        sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
