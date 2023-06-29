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
 * JobReportBaseInfoVo
 */
public class JobReportBaseInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exe_time")

    private OffsetDateTime exeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    /**
     * hfl作业类型枚举，TRAIN.训练,EVALUATE.评估
     */
    public static final class HflTypeEnum {

        /**
         * Enum EVALUATE for value: "EVALUATE"
         */
        public static final HflTypeEnum EVALUATE = new HflTypeEnum("EVALUATE");

        /**
         * Enum TRAIN for value: "TRAIN"
         */
        public static final HflTypeEnum TRAIN = new HflTypeEnum("TRAIN");

        private static final Map<String, HflTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HflTypeEnum> createStaticFields() {
            Map<String, HflTypeEnum> map = new HashMap<>();
            map.put("EVALUATE", EVALUATE);
            map.put("TRAIN", TRAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HflTypeEnum(String value) {
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
        public static HflTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HflTypeEnum(value));
        }

        public static HflTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HflTypeEnum) {
                return this.value.equals(((HflTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hfl_type")

    private HflTypeEnum hflType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    /**
     * 作业类型，HFL.横向联邦，SQL.联邦分析，VFL_EVALUATE.联邦评估，VFL_FEATURE_SELECTION.特征选择，VFL_ID_TRUNCATION.Id截断，VFL_PREDICT.联邦预测，VFL_SAMPLE_ALIGNMENT.样本对齐，VFL_TRAIN.联邦训练
     */
    public static final class JobTypeEnum {

        /**
         * Enum HFL for value: "HFL"
         */
        public static final JobTypeEnum HFL = new JobTypeEnum("HFL");

        /**
         * Enum SQL for value: "SQL"
         */
        public static final JobTypeEnum SQL = new JobTypeEnum("SQL");

        /**
         * Enum VFL_EVALUATE for value: "VFL_EVALUATE"
         */
        public static final JobTypeEnum VFL_EVALUATE = new JobTypeEnum("VFL_EVALUATE");

        /**
         * Enum VFL_FEATURE_SELECTION for value: "VFL_FEATURE_SELECTION"
         */
        public static final JobTypeEnum VFL_FEATURE_SELECTION = new JobTypeEnum("VFL_FEATURE_SELECTION");

        /**
         * Enum VFL_ID_TRUNCATION for value: "VFL_ID_TRUNCATION"
         */
        public static final JobTypeEnum VFL_ID_TRUNCATION = new JobTypeEnum("VFL_ID_TRUNCATION");

        /**
         * Enum VFL_PREDICT for value: "VFL_PREDICT"
         */
        public static final JobTypeEnum VFL_PREDICT = new JobTypeEnum("VFL_PREDICT");

        /**
         * Enum VFL_SAMPLE_ALIGNMENT for value: "VFL_SAMPLE_ALIGNMENT"
         */
        public static final JobTypeEnum VFL_SAMPLE_ALIGNMENT = new JobTypeEnum("VFL_SAMPLE_ALIGNMENT");

        /**
         * Enum VFL_TRAIN for value: "VFL_TRAIN"
         */
        public static final JobTypeEnum VFL_TRAIN = new JobTypeEnum("VFL_TRAIN");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
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

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    /**
     * 作业任务状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
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

    public JobReportBaseInfoVo withExeTime(OffsetDateTime exeTime) {
        this.exeTime = exeTime;
        return this;
    }

    /**
     * 执行时间
     * @return exeTime
     */
    public OffsetDateTime getExeTime() {
        return exeTime;
    }

    public void setExeTime(OffsetDateTime exeTime) {
        this.exeTime = exeTime;
    }

    public JobReportBaseInfoVo withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 执行人
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public JobReportBaseInfoVo withHflType(HflTypeEnum hflType) {
        this.hflType = hflType;
        return this;
    }

    /**
     * hfl作业类型枚举，TRAIN.训练,EVALUATE.评估
     * @return hflType
     */
    public HflTypeEnum getHflType() {
        return hflType;
    }

    public void setHflType(HflTypeEnum hflType) {
        this.hflType = hflType;
    }

    public JobReportBaseInfoVo withJobName(String jobName) {
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

    public JobReportBaseInfoVo withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型，HFL.横向联邦，SQL.联邦分析，VFL_EVALUATE.联邦评估，VFL_FEATURE_SELECTION.特征选择，VFL_ID_TRUNCATION.Id截断，VFL_PREDICT.联邦预测，VFL_SAMPLE_ALIGNMENT.样本对齐，VFL_TRAIN.联邦训练
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public JobReportBaseInfoVo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 作业任务状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
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
        JobReportBaseInfoVo that = (JobReportBaseInfoVo) obj;
        return Objects.equals(this.exeTime, that.exeTime) && Objects.equals(this.executor, that.executor)
            && Objects.equals(this.hflType, that.hflType) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exeTime, executor, hflType, jobName, jobType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobReportBaseInfoVo {\n");
        sb.append("    exeTime: ").append(toIndentedString(exeTime)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    hflType: ").append(toIndentedString(hflType)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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
