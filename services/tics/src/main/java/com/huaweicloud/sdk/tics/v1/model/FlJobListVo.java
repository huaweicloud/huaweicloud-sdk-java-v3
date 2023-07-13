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
 * FlJobListVo
 */
public class FlJobListVo {

    /**
     * 纵向联邦算法类型枚举，XG_BOOST.XGBoost,LIGHT_BGM.LightGBM,LOGISTIC_REGRESSION.逻辑回归,NEURAL_NETWORK.神经网络，FIBINET.FIBINET
     */
    public static final class AlgorithmTypeEnum {

        /**
         * Enum FIBINET for value: "FIBINET"
         */
        public static final AlgorithmTypeEnum FIBINET = new AlgorithmTypeEnum("FIBINET");

        /**
         * Enum LIGHT_BGM for value: "LIGHT_BGM"
         */
        public static final AlgorithmTypeEnum LIGHT_BGM = new AlgorithmTypeEnum("LIGHT_BGM");

        /**
         * Enum LOGISTIC_REGRESSION for value: "LOGISTIC_REGRESSION"
         */
        public static final AlgorithmTypeEnum LOGISTIC_REGRESSION = new AlgorithmTypeEnum("LOGISTIC_REGRESSION");

        /**
         * Enum NEURAL_NETWORK for value: "NEURAL_NETWORK"
         */
        public static final AlgorithmTypeEnum NEURAL_NETWORK = new AlgorithmTypeEnum("NEURAL_NETWORK");

        /**
         * Enum XG_BOOST for value: "XG_BOOST"
         */
        public static final AlgorithmTypeEnum XG_BOOST = new AlgorithmTypeEnum("XG_BOOST");

        private static final Map<String, AlgorithmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmTypeEnum> createStaticFields() {
            Map<String, AlgorithmTypeEnum> map = new HashMap<>();
            map.put("FIBINET", FIBINET);
            map.put("LIGHT_BGM", LIGHT_BGM);
            map.put("LOGISTIC_REGRESSION", LOGISTIC_REGRESSION);
            map.put("NEURAL_NETWORK", NEURAL_NETWORK);
            map.put("XG_BOOST", XG_BOOST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmTypeEnum(String value) {
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
        public static AlgorithmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlgorithmTypeEnum(value));
        }

        public static AlgorithmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmTypeEnum) {
                return this.value.equals(((AlgorithmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private AlgorithmTypeEnum algorithmType;

    /**
     * fl作业审批状态，APPROVED.审批通过，APPROVING.审批中，NEW.新建，REJECTED.驳回，REVOKED.撤销
     */
    public static final class ApprovalStatusEnum {

        /**
         * Enum APPROVED for value: "APPROVED"
         */
        public static final ApprovalStatusEnum APPROVED = new ApprovalStatusEnum("APPROVED");

        /**
         * Enum APPROVING for value: "APPROVING"
         */
        public static final ApprovalStatusEnum APPROVING = new ApprovalStatusEnum("APPROVING");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final ApprovalStatusEnum NEW = new ApprovalStatusEnum("NEW");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final ApprovalStatusEnum REJECTED = new ApprovalStatusEnum("REJECTED");

        /**
         * Enum REVOKED for value: "REVOKED"
         */
        public static final ApprovalStatusEnum REVOKED = new ApprovalStatusEnum("REVOKED");

        private static final Map<String, ApprovalStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApprovalStatusEnum> createStaticFields() {
            Map<String, ApprovalStatusEnum> map = new HashMap<>();
            map.put("APPROVED", APPROVED);
            map.put("APPROVING", APPROVING);
            map.put("NEW", NEW);
            map.put("REJECTED", REJECTED);
            map.put("REVOKED", REVOKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApprovalStatusEnum(String value) {
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
        public static ApprovalStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApprovalStatusEnum(value));
        }

        public static ApprovalStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApprovalStatusEnum) {
                return this.value.equals(((ApprovalStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_status")

    private ApprovalStatusEnum approvalStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext")

    private String ext;

    /**
     * 联邦学习运行平台枚举值，LOCAL.本地
     */
    public static final class HflPlatformTypeEnum {

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final HflPlatformTypeEnum LOCAL = new HflPlatformTypeEnum("LOCAL");

        private static final Map<String, HflPlatformTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HflPlatformTypeEnum> createStaticFields() {
            Map<String, HflPlatformTypeEnum> map = new HashMap<>();
            map.put("LOCAL", LOCAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HflPlatformTypeEnum(String value) {
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
        public static HflPlatformTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HflPlatformTypeEnum(value));
        }

        public static HflPlatformTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HflPlatformTypeEnum) {
                return this.value.equals(((HflPlatformTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hfl_platform_type")

    private HflPlatformTypeEnum hflPlatformType;

    /**
     * fl作业类型枚举,TRAIN.训练,EVALUATE.评估
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
    @JsonProperty(value = "is_single_predict")

    private Boolean isSinglePredict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    /**
     * 作业类型,SQL.联合SQL分析,HFL.横向联邦学习,VFL.纵向联邦学习,PREDICT.预测，DATA_EXCHANGE.数据交换
     */
    public static final class JobTypeEnum {

        /**
         * Enum HFL for value: "HFL"
         */
        public static final JobTypeEnum HFL = new JobTypeEnum("HFL");

        /**
         * Enum PREDICT for value: "PREDICT"
         */
        public static final JobTypeEnum PREDICT = new JobTypeEnum("PREDICT");

        /**
         * Enum SQL for value: "SQL"
         */
        public static final JobTypeEnum SQL = new JobTypeEnum("SQL");

        /**
         * Enum VFL for value: "VFL"
         */
        public static final JobTypeEnum VFL = new JobTypeEnum("VFL");

        /**
         * Enum DATA_EXCHANGE for value: "DATA_EXCHANGE"
         */
        public static final JobTypeEnum DATA_EXCHANGE = new JobTypeEnum("DATA_EXCHANGE");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("HFL", HFL);
            map.put("PREDICT", PREDICT);
            map.put("SQL", SQL);
            map.put("VFL", VFL);
            map.put("DATA_EXCHANGE", DATA_EXCHANGE);
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
     * 纵向联邦任务类型,CLASSIFICATION.分类，REGRESSION.拟合
     */
    public static final class LearningTaskTypeEnum {

        /**
         * Enum CLASSIFICATION for value: "CLASSIFICATION"
         */
        public static final LearningTaskTypeEnum CLASSIFICATION = new LearningTaskTypeEnum("CLASSIFICATION");

        /**
         * Enum REGRESSION for value: "REGRESSION"
         */
        public static final LearningTaskTypeEnum REGRESSION = new LearningTaskTypeEnum("REGRESSION");

        private static final Map<String, LearningTaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LearningTaskTypeEnum> createStaticFields() {
            Map<String, LearningTaskTypeEnum> map = new HashMap<>();
            map.put("CLASSIFICATION", CLASSIFICATION);
            map.put("REGRESSION", REGRESSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LearningTaskTypeEnum(String value) {
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
        public static LearningTaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LearningTaskTypeEnum(value));
        }

        public static LearningTaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LearningTaskTypeEnum) {
                return this.value.equals(((LearningTaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "learning_task_type")

    private LearningTaskTypeEnum learningTaskType;

    public FlJobListVo withAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 纵向联邦算法类型枚举，XG_BOOST.XGBoost,LIGHT_BGM.LightGBM,LOGISTIC_REGRESSION.逻辑回归,NEURAL_NETWORK.神经网络，FIBINET.FIBINET
     * @return algorithmType
     */
    public AlgorithmTypeEnum getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
    }

    public FlJobListVo withApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    /**
     * fl作业审批状态，APPROVED.审批通过，APPROVING.审批中，NEW.新建，REJECTED.驳回，REVOKED.撤销
     * @return approvalStatus
     */
    public ApprovalStatusEnum getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public FlJobListVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public FlJobListVo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public FlJobListVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlJobListVo withExt(String ext) {
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

    public FlJobListVo withHflPlatformType(HflPlatformTypeEnum hflPlatformType) {
        this.hflPlatformType = hflPlatformType;
        return this;
    }

    /**
     * 联邦学习运行平台枚举值，LOCAL.本地
     * @return hflPlatformType
     */
    public HflPlatformTypeEnum getHflPlatformType() {
        return hflPlatformType;
    }

    public void setHflPlatformType(HflPlatformTypeEnum hflPlatformType) {
        this.hflPlatformType = hflPlatformType;
    }

    public FlJobListVo withHflType(HflTypeEnum hflType) {
        this.hflType = hflType;
        return this;
    }

    /**
     * fl作业类型枚举,TRAIN.训练,EVALUATE.评估
     * @return hflType
     */
    public HflTypeEnum getHflType() {
        return hflType;
    }

    public void setHflType(HflTypeEnum hflType) {
        this.hflType = hflType;
    }

    public FlJobListVo withIsSinglePredict(Boolean isSinglePredict) {
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

    public FlJobListVo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public FlJobListVo withJobName(String jobName) {
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

    public FlJobListVo withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型,SQL.联合SQL分析,HFL.横向联邦学习,VFL.纵向联邦学习,PREDICT.预测，DATA_EXCHANGE.数据交换
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public FlJobListVo withLearningTaskType(LearningTaskTypeEnum learningTaskType) {
        this.learningTaskType = learningTaskType;
        return this;
    }

    /**
     * 纵向联邦任务类型,CLASSIFICATION.分类，REGRESSION.拟合
     * @return learningTaskType
     */
    public LearningTaskTypeEnum getLearningTaskType() {
        return learningTaskType;
    }

    public void setLearningTaskType(LearningTaskTypeEnum learningTaskType) {
        this.learningTaskType = learningTaskType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlJobListVo that = (FlJobListVo) obj;
        return Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.approvalStatus, that.approvalStatus)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ext, that.ext)
            && Objects.equals(this.hflPlatformType, that.hflPlatformType) && Objects.equals(this.hflType, that.hflType)
            && Objects.equals(this.isSinglePredict, that.isSinglePredict) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.learningTaskType, that.learningTaskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithmType,
            approvalStatus,
            createTime,
            creatorName,
            description,
            ext,
            hflPlatformType,
            hflType,
            isSinglePredict,
            jobId,
            jobName,
            jobType,
            learningTaskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlJobListVo {\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
        sb.append("    hflPlatformType: ").append(toIndentedString(hflPlatformType)).append("\n");
        sb.append("    hflType: ").append(toIndentedString(hflType)).append("\n");
        sb.append("    isSinglePredict: ").append(toIndentedString(isSinglePredict)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    learningTaskType: ").append(toIndentedString(learningTaskType)).append("\n");
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
