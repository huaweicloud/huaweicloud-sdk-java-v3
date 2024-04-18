package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class Show2dModelTrainingJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务的状态。 * WAIT_FILE_UPLOAD：待上传文件 * AUTO_VERIFYING：自动审核中 * AUTO_VERIFY_FAILED：自动审核失败 * MANUAL_VERIFYING：人工审核中 * MANUAL_VERIFY_FAILED：人工审核失败 * MANUAL_VERIFY_SUCCESS：审核通过，等待预处理资源 * TRAINING_DATA_PREPROCESSING：训练数据预处理中 * TRAINING_DATA_PREPROCESS_FAILED：训练数据预处理失败 * TRAINING_DATA_PREPROCESS_SUCCESS：训练数据预处理完成，等待训练资源中 * TRAINING：训练中 * TRAIN_FAILED：训练失败 * TRAIN_SUCCESS：训练完成，等待预处理资源 * INFERENCE_DATA_PREPROCESSING：推理数据预处理中 * INFERENCE_DATA_PREPROCESS_FAILED：推理数据预处理失败 * WAIT_MASK_UPLOAD：等待遮罩上传 * WAIT_MAIN_FILE_UPLOAD：等待主文件上传 * JOB_SUCCESS：训练任务完成 * WAIT_USER_CONFIRM：等待用户确认训练效果 * JOB_REJECT：驳回任务 * JOB_PENDING：挂起任务 * JOB_FINISH：任务结束，是最终状态，不支持修改此状态。
     */
    public static final class StateEnum {

        /**
         * Enum WAIT_FILE_UPLOAD for value: "WAIT_FILE_UPLOAD"
         */
        public static final StateEnum WAIT_FILE_UPLOAD = new StateEnum("WAIT_FILE_UPLOAD");

        /**
         * Enum AUTO_VERIFYING for value: "AUTO_VERIFYING"
         */
        public static final StateEnum AUTO_VERIFYING = new StateEnum("AUTO_VERIFYING");

        /**
         * Enum AUTO_VERIFY_FAILED for value: "AUTO_VERIFY_FAILED"
         */
        public static final StateEnum AUTO_VERIFY_FAILED = new StateEnum("AUTO_VERIFY_FAILED");

        /**
         * Enum MANUAL_VERIFYING for value: "MANUAL_VERIFYING"
         */
        public static final StateEnum MANUAL_VERIFYING = new StateEnum("MANUAL_VERIFYING");

        /**
         * Enum MANUAL_VERIFY_FAILED for value: "MANUAL_VERIFY_FAILED"
         */
        public static final StateEnum MANUAL_VERIFY_FAILED = new StateEnum("MANUAL_VERIFY_FAILED");

        /**
         * Enum MANUAL_VERIFY_SUCCESS for value: "MANUAL_VERIFY_SUCCESS"
         */
        public static final StateEnum MANUAL_VERIFY_SUCCESS = new StateEnum("MANUAL_VERIFY_SUCCESS");

        /**
         * Enum TRAINING_DATA_PREPROCESSING for value: "TRAINING_DATA_PREPROCESSING"
         */
        public static final StateEnum TRAINING_DATA_PREPROCESSING = new StateEnum("TRAINING_DATA_PREPROCESSING");

        /**
         * Enum TRAINING_DATA_PREPROCESS_FAILED for value: "TRAINING_DATA_PREPROCESS_FAILED"
         */
        public static final StateEnum TRAINING_DATA_PREPROCESS_FAILED =
            new StateEnum("TRAINING_DATA_PREPROCESS_FAILED");

        /**
         * Enum TRAINING_DATA_PREPROCESS_SUCCESS for value: "TRAINING_DATA_PREPROCESS_SUCCESS"
         */
        public static final StateEnum TRAINING_DATA_PREPROCESS_SUCCESS =
            new StateEnum("TRAINING_DATA_PREPROCESS_SUCCESS");

        /**
         * Enum TRAINING for value: "TRAINING"
         */
        public static final StateEnum TRAINING = new StateEnum("TRAINING");

        /**
         * Enum TRAIN_FAILED for value: "TRAIN_FAILED"
         */
        public static final StateEnum TRAIN_FAILED = new StateEnum("TRAIN_FAILED");

        /**
         * Enum TRAIN_SUCCESS for value: "TRAIN_SUCCESS"
         */
        public static final StateEnum TRAIN_SUCCESS = new StateEnum("TRAIN_SUCCESS");

        /**
         * Enum INFERENCE_DATA_PREPROCESSING for value: "INFERENCE_DATA_PREPROCESSING"
         */
        public static final StateEnum INFERENCE_DATA_PREPROCESSING = new StateEnum("INFERENCE_DATA_PREPROCESSING");

        /**
         * Enum INFERENCE_DATA_PREPROCESS_FAILED for value: "INFERENCE_DATA_PREPROCESS_FAILED"
         */
        public static final StateEnum INFERENCE_DATA_PREPROCESS_FAILED =
            new StateEnum("INFERENCE_DATA_PREPROCESS_FAILED");

        /**
         * Enum WAIT_MASK_UPLOAD for value: "WAIT_MASK_UPLOAD"
         */
        public static final StateEnum WAIT_MASK_UPLOAD = new StateEnum("WAIT_MASK_UPLOAD");

        /**
         * Enum WAIT_MAIN_FILE_UPLOAD for value: "WAIT_MAIN_FILE_UPLOAD"
         */
        public static final StateEnum WAIT_MAIN_FILE_UPLOAD = new StateEnum("WAIT_MAIN_FILE_UPLOAD");

        /**
         * Enum JOB_SUCCESS for value: "JOB_SUCCESS"
         */
        public static final StateEnum JOB_SUCCESS = new StateEnum("JOB_SUCCESS");

        /**
         * Enum WAIT_USER_CONFIRM for value: "WAIT_USER_CONFIRM"
         */
        public static final StateEnum WAIT_USER_CONFIRM = new StateEnum("WAIT_USER_CONFIRM");

        /**
         * Enum JOB_REJECT for value: "JOB_REJECT"
         */
        public static final StateEnum JOB_REJECT = new StateEnum("JOB_REJECT");

        /**
         * Enum JOB_PENDING for value: "JOB_PENDING"
         */
        public static final StateEnum JOB_PENDING = new StateEnum("JOB_PENDING");

        /**
         * Enum JOB_FINISH for value: "JOB_FINISH"
         */
        public static final StateEnum JOB_FINISH = new StateEnum("JOB_FINISH");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAIT_FILE_UPLOAD", WAIT_FILE_UPLOAD);
            map.put("AUTO_VERIFYING", AUTO_VERIFYING);
            map.put("AUTO_VERIFY_FAILED", AUTO_VERIFY_FAILED);
            map.put("MANUAL_VERIFYING", MANUAL_VERIFYING);
            map.put("MANUAL_VERIFY_FAILED", MANUAL_VERIFY_FAILED);
            map.put("MANUAL_VERIFY_SUCCESS", MANUAL_VERIFY_SUCCESS);
            map.put("TRAINING_DATA_PREPROCESSING", TRAINING_DATA_PREPROCESSING);
            map.put("TRAINING_DATA_PREPROCESS_FAILED", TRAINING_DATA_PREPROCESS_FAILED);
            map.put("TRAINING_DATA_PREPROCESS_SUCCESS", TRAINING_DATA_PREPROCESS_SUCCESS);
            map.put("TRAINING", TRAINING);
            map.put("TRAIN_FAILED", TRAIN_FAILED);
            map.put("TRAIN_SUCCESS", TRAIN_SUCCESS);
            map.put("INFERENCE_DATA_PREPROCESSING", INFERENCE_DATA_PREPROCESSING);
            map.put("INFERENCE_DATA_PREPROCESS_FAILED", INFERENCE_DATA_PREPROCESS_FAILED);
            map.put("WAIT_MASK_UPLOAD", WAIT_MASK_UPLOAD);
            map.put("WAIT_MAIN_FILE_UPLOAD", WAIT_MAIN_FILE_UPLOAD);
            map.put("JOB_SUCCESS", JOB_SUCCESS);
            map.put("WAIT_USER_CONFIRM", WAIT_USER_CONFIRM);
            map.put("JOB_REJECT", JOB_REJECT);
            map.put("JOB_PENDING", JOB_PENDING);
            map.put("JOB_FINISH", JOB_FINISH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_download_url")

    private String coverDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact")

    private String contact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    /**
     * 分身数字人模型版本。默认是V3版本模型。 * V2: V2版本模型 * V3：V3版本模型 * V3.2：V3.2版本模型
     */
    public static final class ModelVersionEnum {

        /**
         * Enum V2 for value: "V2"
         */
        public static final ModelVersionEnum V2 = new ModelVersionEnum("V2");

        /**
         * Enum V3 for value: "V3"
         */
        public static final ModelVersionEnum V3 = new ModelVersionEnum("V3");

        /**
         * Enum V3_2 for value: "V3.2"
         */
        public static final ModelVersionEnum V3_2 = new ModelVersionEnum("V3.2");

        private static final Map<String, ModelVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelVersionEnum> createStaticFields() {
            Map<String, ModelVersionEnum> map = new HashMap<>();
            map.put("V2", V2);
            map.put("V3", V3);
            map.put("V3.2", V3_2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelVersionEnum(String value) {
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
        public static ModelVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelVersionEnum(value));
        }

        public static ModelVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelVersionEnum) {
                return this.value.equals(((ModelVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_version")

    private ModelVersionEnum modelVersion;

    /**
     * 抠图类型。默认是AI。 * AI：AI抠图 * MANUAL：人工抠图
     */
    public static final class MattingTypeEnum {

        /**
         * Enum AI for value: "AI"
         */
        public static final MattingTypeEnum AI = new MattingTypeEnum("AI");

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final MattingTypeEnum MANUAL = new MattingTypeEnum("MANUAL");

        private static final Map<String, MattingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MattingTypeEnum> createStaticFields() {
            Map<String, MattingTypeEnum> map = new HashMap<>();
            map.put("AI", AI);
            map.put("MANUAL", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MattingTypeEnum(String value) {
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
        public static MattingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MattingTypeEnum(value));
        }

        public static MattingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MattingTypeEnum) {
                return this.value.equals(((MattingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matting_type")

    private MattingTypeEnum mattingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_resolution")

    private String modelResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_user_id")

    private String appUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_video_download_url")

    private String trainingVideoDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_image1_download_url")

    private String idCardImage1DownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_image2_download_url")

    private String idCardImage2DownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_file_download_url")

    private String grantFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_logs")

    private List<OperationLogInfo> operationLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_logs")

    private List<CommentLogInfo> commentLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_mask_file_uploaded")

    private Boolean isMaskFileUploaded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_file_download_url")

    private String maskFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_video_download_url")

    private String verifyVideoDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "markable_video_download_url")

    private String markableVideoDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_video_mark_info")

    private InferenceVideoMarkInfo inferenceDataProcessVideoMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_action_mark_info")

    private InferenceActionMarkInfo inferenceDataProcessActionMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_eye_correction_mark_info")

    private InferenceEyeCorrectionMarkInfo inferenceDataProcessEyeCorrectionMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_background_replacement")

    private Boolean isBackgroundReplacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_type")

    private List<String> workerType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public Show2dModelTrainingJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Show2dModelTrainingJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分身数字人模型名称。该名称会作为资产库中分身数字人模型资产名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Show2dModelTrainingJobResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务的状态。 * WAIT_FILE_UPLOAD：待上传文件 * AUTO_VERIFYING：自动审核中 * AUTO_VERIFY_FAILED：自动审核失败 * MANUAL_VERIFYING：人工审核中 * MANUAL_VERIFY_FAILED：人工审核失败 * MANUAL_VERIFY_SUCCESS：审核通过，等待预处理资源 * TRAINING_DATA_PREPROCESSING：训练数据预处理中 * TRAINING_DATA_PREPROCESS_FAILED：训练数据预处理失败 * TRAINING_DATA_PREPROCESS_SUCCESS：训练数据预处理完成，等待训练资源中 * TRAINING：训练中 * TRAIN_FAILED：训练失败 * TRAIN_SUCCESS：训练完成，等待预处理资源 * INFERENCE_DATA_PREPROCESSING：推理数据预处理中 * INFERENCE_DATA_PREPROCESS_FAILED：推理数据预处理失败 * WAIT_MASK_UPLOAD：等待遮罩上传 * WAIT_MAIN_FILE_UPLOAD：等待主文件上传 * JOB_SUCCESS：训练任务完成 * WAIT_USER_CONFIRM：等待用户确认训练效果 * JOB_REJECT：驳回任务 * JOB_PENDING：挂起任务 * JOB_FINISH：任务结束，是最终状态，不支持修改此状态。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Show2dModelTrainingJobResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 模型资产ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Show2dModelTrainingJobResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 模型资产所属项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Show2dModelTrainingJobResponse withCoverDownloadUrl(String coverDownloadUrl) {
        this.coverDownloadUrl = coverDownloadUrl;
        return this;
    }

    /**
     * 分身数字人模型封面下载URL。URL有效期24小时。
     * @return coverDownloadUrl
     */
    public String getCoverDownloadUrl() {
        return coverDownloadUrl;
    }

    public void setCoverDownloadUrl(String coverDownloadUrl) {
        this.coverDownloadUrl = coverDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 用户最近一次更新任务的时间（包括租户创建或者重新提交），格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Show2dModelTrainingJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Show2dModelTrainingJobResponse withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * 分身数字人训练任务创建者联系方式，如手机或邮箱等。
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Show2dModelTrainingJobResponse withBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    /**
     * 分身数字人训练任务的批次名称。
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Show2dModelTrainingJobResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Show2dModelTrainingJobResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 分身数字人训练任务标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Show2dModelTrainingJobResponse withModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * 分身数字人模型版本。默认是V3版本模型。 * V2: V2版本模型 * V3：V3版本模型 * V3.2：V3.2版本模型
     * @return modelVersion
     */
    public ModelVersionEnum getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
    }

    public Show2dModelTrainingJobResponse withMattingType(MattingTypeEnum mattingType) {
        this.mattingType = mattingType;
        return this;
    }

    /**
     * 抠图类型。默认是AI。 * AI：AI抠图 * MANUAL：人工抠图
     * @return mattingType
     */
    public MattingTypeEnum getMattingType() {
        return mattingType;
    }

    public void setMattingType(MattingTypeEnum mattingType) {
        this.mattingType = mattingType;
    }

    public Show2dModelTrainingJobResponse withModelResolution(String modelResolution) {
        this.modelResolution = modelResolution;
        return this;
    }

    /**
     * 分身数字人模型分辨率。默认是1080P。 * 1080P：1080P。支持1080P及720P的视频输出。 * 4K：4K。支持4K、1080P及720P的视频输出。
     * @return modelResolution
     */
    public String getModelResolution() {
        return modelResolution;
    }

    public void setModelResolution(String modelResolution) {
        this.modelResolution = modelResolution;
    }

    public Show2dModelTrainingJobResponse withAppUserId(String appUserId) {
        this.appUserId = appUserId;
        return this;
    }

    /**
     * 自定义用户id（如创建任务时设置了X-App-UserId则会携带）。
     * @return appUserId
     */
    public String getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(String appUserId) {
        this.appUserId = appUserId;
    }

    public Show2dModelTrainingJobResponse withTrainingVideoDownloadUrl(String trainingVideoDownloadUrl) {
        this.trainingVideoDownloadUrl = trainingVideoDownloadUrl;
        return this;
    }

    /**
     * 分身数字人训练视频下载URL。24小时内有效。
     * @return trainingVideoDownloadUrl
     */
    public String getTrainingVideoDownloadUrl() {
        return trainingVideoDownloadUrl;
    }

    public void setTrainingVideoDownloadUrl(String trainingVideoDownloadUrl) {
        this.trainingVideoDownloadUrl = trainingVideoDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withIdCardImage1DownloadUrl(String idCardImage1DownloadUrl) {
        this.idCardImage1DownloadUrl = idCardImage1DownloadUrl;
        return this;
    }

    /**
     * 身份证正面照片下载URL。24小时内有效。
     * @return idCardImage1DownloadUrl
     */
    public String getIdCardImage1DownloadUrl() {
        return idCardImage1DownloadUrl;
    }

    public void setIdCardImage1DownloadUrl(String idCardImage1DownloadUrl) {
        this.idCardImage1DownloadUrl = idCardImage1DownloadUrl;
    }

    public Show2dModelTrainingJobResponse withIdCardImage2DownloadUrl(String idCardImage2DownloadUrl) {
        this.idCardImage2DownloadUrl = idCardImage2DownloadUrl;
        return this;
    }

    /**
     * 身份证反面照片下载URL。24小时内有效。
     * @return idCardImage2DownloadUrl
     */
    public String getIdCardImage2DownloadUrl() {
        return idCardImage2DownloadUrl;
    }

    public void setIdCardImage2DownloadUrl(String idCardImage2DownloadUrl) {
        this.idCardImage2DownloadUrl = idCardImage2DownloadUrl;
    }

    public Show2dModelTrainingJobResponse withGrantFileDownloadUrl(String grantFileDownloadUrl) {
        this.grantFileDownloadUrl = grantFileDownloadUrl;
        return this;
    }

    /**
     * 授权书下载URL。24小时内有效。
     * @return grantFileDownloadUrl
     */
    public String getGrantFileDownloadUrl() {
        return grantFileDownloadUrl;
    }

    public void setGrantFileDownloadUrl(String grantFileDownloadUrl) {
        this.grantFileDownloadUrl = grantFileDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withOperationLogs(List<OperationLogInfo> operationLogs) {
        this.operationLogs = operationLogs;
        return this;
    }

    public Show2dModelTrainingJobResponse addOperationLogsItem(OperationLogInfo operationLogsItem) {
        if (this.operationLogs == null) {
            this.operationLogs = new ArrayList<>();
        }
        this.operationLogs.add(operationLogsItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withOperationLogs(Consumer<List<OperationLogInfo>> operationLogsSetter) {
        if (this.operationLogs == null) {
            this.operationLogs = new ArrayList<>();
        }
        operationLogsSetter.accept(this.operationLogs);
        return this;
    }

    /**
     * 操作日志列表。
     * @return operationLogs
     */
    public List<OperationLogInfo> getOperationLogs() {
        return operationLogs;
    }

    public void setOperationLogs(List<OperationLogInfo> operationLogs) {
        this.operationLogs = operationLogs;
    }

    public Show2dModelTrainingJobResponse withCommentLogs(List<CommentLogInfo> commentLogs) {
        this.commentLogs = commentLogs;
        return this;
    }

    public Show2dModelTrainingJobResponse addCommentLogsItem(CommentLogInfo commentLogsItem) {
        if (this.commentLogs == null) {
            this.commentLogs = new ArrayList<>();
        }
        this.commentLogs.add(commentLogsItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withCommentLogs(Consumer<List<CommentLogInfo>> commentLogsSetter) {
        if (this.commentLogs == null) {
            this.commentLogs = new ArrayList<>();
        }
        commentLogsSetter.accept(this.commentLogs);
        return this;
    }

    /**
     * 评论记录列表。
     * @return commentLogs
     */
    public List<CommentLogInfo> getCommentLogs() {
        return commentLogs;
    }

    public void setCommentLogs(List<CommentLogInfo> commentLogs) {
        this.commentLogs = commentLogs;
    }

    public Show2dModelTrainingJobResponse withIsMaskFileUploaded(Boolean isMaskFileUploaded) {
        this.isMaskFileUploaded = isMaskFileUploaded;
        return this;
    }

    /**
     * 遮罩文件是否已上传。
     * @return isMaskFileUploaded
     */
    public Boolean getIsMaskFileUploaded() {
        return isMaskFileUploaded;
    }

    public void setIsMaskFileUploaded(Boolean isMaskFileUploaded) {
        this.isMaskFileUploaded = isMaskFileUploaded;
    }

    public Show2dModelTrainingJobResponse withMaskFileDownloadUrl(String maskFileDownloadUrl) {
        this.maskFileDownloadUrl = maskFileDownloadUrl;
        return this;
    }

    /**
     * 遮罩下载URL。24小时内有效。
     * @return maskFileDownloadUrl
     */
    public String getMaskFileDownloadUrl() {
        return maskFileDownloadUrl;
    }

    public void setMaskFileDownloadUrl(String maskFileDownloadUrl) {
        this.maskFileDownloadUrl = maskFileDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withVerifyVideoDownloadUrl(String verifyVideoDownloadUrl) {
        this.verifyVideoDownloadUrl = verifyVideoDownloadUrl;
        return this;
    }

    /**
     * 制作审核视频
     * @return verifyVideoDownloadUrl
     */
    public String getVerifyVideoDownloadUrl() {
        return verifyVideoDownloadUrl;
    }

    public void setVerifyVideoDownloadUrl(String verifyVideoDownloadUrl) {
        this.verifyVideoDownloadUrl = verifyVideoDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withMarkableVideoDownloadUrl(String markableVideoDownloadUrl) {
        this.markableVideoDownloadUrl = markableVideoDownloadUrl;
        return this;
    }

    /**
     * 标注视频url下载链接。24小时内有效。
     * @return markableVideoDownloadUrl
     */
    public String getMarkableVideoDownloadUrl() {
        return markableVideoDownloadUrl;
    }

    public void setMarkableVideoDownloadUrl(String markableVideoDownloadUrl) {
        this.markableVideoDownloadUrl = markableVideoDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessVideoMarkInfo(
        InferenceVideoMarkInfo inferenceDataProcessVideoMarkInfo) {
        this.inferenceDataProcessVideoMarkInfo = inferenceDataProcessVideoMarkInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessVideoMarkInfo(
        Consumer<InferenceVideoMarkInfo> inferenceDataProcessVideoMarkInfoSetter) {
        if (this.inferenceDataProcessVideoMarkInfo == null) {
            this.inferenceDataProcessVideoMarkInfo = new InferenceVideoMarkInfo();
            inferenceDataProcessVideoMarkInfoSetter.accept(this.inferenceDataProcessVideoMarkInfo);
        }

        return this;
    }

    /**
     * Get inferenceDataProcessVideoMarkInfo
     * @return inferenceDataProcessVideoMarkInfo
     */
    public InferenceVideoMarkInfo getInferenceDataProcessVideoMarkInfo() {
        return inferenceDataProcessVideoMarkInfo;
    }

    public void setInferenceDataProcessVideoMarkInfo(InferenceVideoMarkInfo inferenceDataProcessVideoMarkInfo) {
        this.inferenceDataProcessVideoMarkInfo = inferenceDataProcessVideoMarkInfo;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessActionMarkInfo(
        InferenceActionMarkInfo inferenceDataProcessActionMarkInfo) {
        this.inferenceDataProcessActionMarkInfo = inferenceDataProcessActionMarkInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessActionMarkInfo(
        Consumer<InferenceActionMarkInfo> inferenceDataProcessActionMarkInfoSetter) {
        if (this.inferenceDataProcessActionMarkInfo == null) {
            this.inferenceDataProcessActionMarkInfo = new InferenceActionMarkInfo();
            inferenceDataProcessActionMarkInfoSetter.accept(this.inferenceDataProcessActionMarkInfo);
        }

        return this;
    }

    /**
     * Get inferenceDataProcessActionMarkInfo
     * @return inferenceDataProcessActionMarkInfo
     */
    public InferenceActionMarkInfo getInferenceDataProcessActionMarkInfo() {
        return inferenceDataProcessActionMarkInfo;
    }

    public void setInferenceDataProcessActionMarkInfo(InferenceActionMarkInfo inferenceDataProcessActionMarkInfo) {
        this.inferenceDataProcessActionMarkInfo = inferenceDataProcessActionMarkInfo;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessEyeCorrectionMarkInfo(
        InferenceEyeCorrectionMarkInfo inferenceDataProcessEyeCorrectionMarkInfo) {
        this.inferenceDataProcessEyeCorrectionMarkInfo = inferenceDataProcessEyeCorrectionMarkInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessEyeCorrectionMarkInfo(
        Consumer<InferenceEyeCorrectionMarkInfo> inferenceDataProcessEyeCorrectionMarkInfoSetter) {
        if (this.inferenceDataProcessEyeCorrectionMarkInfo == null) {
            this.inferenceDataProcessEyeCorrectionMarkInfo = new InferenceEyeCorrectionMarkInfo();
            inferenceDataProcessEyeCorrectionMarkInfoSetter.accept(this.inferenceDataProcessEyeCorrectionMarkInfo);
        }

        return this;
    }

    /**
     * Get inferenceDataProcessEyeCorrectionMarkInfo
     * @return inferenceDataProcessEyeCorrectionMarkInfo
     */
    public InferenceEyeCorrectionMarkInfo getInferenceDataProcessEyeCorrectionMarkInfo() {
        return inferenceDataProcessEyeCorrectionMarkInfo;
    }

    public void setInferenceDataProcessEyeCorrectionMarkInfo(
        InferenceEyeCorrectionMarkInfo inferenceDataProcessEyeCorrectionMarkInfo) {
        this.inferenceDataProcessEyeCorrectionMarkInfo = inferenceDataProcessEyeCorrectionMarkInfo;
    }

    public Show2dModelTrainingJobResponse withIsBackgroundReplacement(Boolean isBackgroundReplacement) {
        this.isBackgroundReplacement = isBackgroundReplacement;
        return this;
    }

    /**
     * 分身数字人是否需要背景替换。需要背景替换的分身数字人训练视频需要绿幕拍摄。
     * @return isBackgroundReplacement
     */
    public Boolean getIsBackgroundReplacement() {
        return isBackgroundReplacement;
    }

    public void setIsBackgroundReplacement(Boolean isBackgroundReplacement) {
        this.isBackgroundReplacement = isBackgroundReplacement;
    }

    public Show2dModelTrainingJobResponse withWorkerType(List<String> workerType) {
        this.workerType = workerType;
        return this;
    }

    public Show2dModelTrainingJobResponse addWorkerTypeItem(String workerTypeItem) {
        if (this.workerType == null) {
            this.workerType = new ArrayList<>();
        }
        this.workerType.add(workerTypeItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withWorkerType(Consumer<List<String>> workerTypeSetter) {
        if (this.workerType == null) {
            this.workerType = new ArrayList<>();
        }
        workerTypeSetter.accept(this.workerType);
        return this;
    }

    /**
     * 转编译任务机型
     * @return workerType
     */
    public List<String> getWorkerType() {
        return workerType;
    }

    public void setWorkerType(List<String> workerType) {
        this.workerType = workerType;
    }

    public Show2dModelTrainingJobResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Show2dModelTrainingJobResponse that = (Show2dModelTrainingJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.coverDownloadUrl, that.coverDownloadUrl)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.contact, that.contact)
            && Objects.equals(this.batchName, that.batchName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.modelVersion, that.modelVersion)
            && Objects.equals(this.mattingType, that.mattingType)
            && Objects.equals(this.modelResolution, that.modelResolution)
            && Objects.equals(this.appUserId, that.appUserId)
            && Objects.equals(this.trainingVideoDownloadUrl, that.trainingVideoDownloadUrl)
            && Objects.equals(this.idCardImage1DownloadUrl, that.idCardImage1DownloadUrl)
            && Objects.equals(this.idCardImage2DownloadUrl, that.idCardImage2DownloadUrl)
            && Objects.equals(this.grantFileDownloadUrl, that.grantFileDownloadUrl)
            && Objects.equals(this.operationLogs, that.operationLogs)
            && Objects.equals(this.commentLogs, that.commentLogs)
            && Objects.equals(this.isMaskFileUploaded, that.isMaskFileUploaded)
            && Objects.equals(this.maskFileDownloadUrl, that.maskFileDownloadUrl)
            && Objects.equals(this.verifyVideoDownloadUrl, that.verifyVideoDownloadUrl)
            && Objects.equals(this.markableVideoDownloadUrl, that.markableVideoDownloadUrl)
            && Objects.equals(this.inferenceDataProcessVideoMarkInfo, that.inferenceDataProcessVideoMarkInfo)
            && Objects.equals(this.inferenceDataProcessActionMarkInfo, that.inferenceDataProcessActionMarkInfo)
            && Objects.equals(this.inferenceDataProcessEyeCorrectionMarkInfo,
                that.inferenceDataProcessEyeCorrectionMarkInfo)
            && Objects.equals(this.isBackgroundReplacement, that.isBackgroundReplacement)
            && Objects.equals(this.workerType, that.workerType) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            name,
            state,
            assetId,
            projectId,
            coverDownloadUrl,
            lastUpdateTime,
            createTime,
            contact,
            batchName,
            tags,
            modelVersion,
            mattingType,
            modelResolution,
            appUserId,
            trainingVideoDownloadUrl,
            idCardImage1DownloadUrl,
            idCardImage2DownloadUrl,
            grantFileDownloadUrl,
            operationLogs,
            commentLogs,
            isMaskFileUploaded,
            maskFileDownloadUrl,
            verifyVideoDownloadUrl,
            markableVideoDownloadUrl,
            inferenceDataProcessVideoMarkInfo,
            inferenceDataProcessActionMarkInfo,
            inferenceDataProcessEyeCorrectionMarkInfo,
            isBackgroundReplacement,
            workerType,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Show2dModelTrainingJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    coverDownloadUrl: ").append(toIndentedString(coverDownloadUrl)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
        sb.append("    mattingType: ").append(toIndentedString(mattingType)).append("\n");
        sb.append("    modelResolution: ").append(toIndentedString(modelResolution)).append("\n");
        sb.append("    appUserId: ").append(toIndentedString(appUserId)).append("\n");
        sb.append("    trainingVideoDownloadUrl: ").append(toIndentedString(trainingVideoDownloadUrl)).append("\n");
        sb.append("    idCardImage1DownloadUrl: ").append(toIndentedString(idCardImage1DownloadUrl)).append("\n");
        sb.append("    idCardImage2DownloadUrl: ").append(toIndentedString(idCardImage2DownloadUrl)).append("\n");
        sb.append("    grantFileDownloadUrl: ").append(toIndentedString(grantFileDownloadUrl)).append("\n");
        sb.append("    operationLogs: ").append(toIndentedString(operationLogs)).append("\n");
        sb.append("    commentLogs: ").append(toIndentedString(commentLogs)).append("\n");
        sb.append("    isMaskFileUploaded: ").append(toIndentedString(isMaskFileUploaded)).append("\n");
        sb.append("    maskFileDownloadUrl: ").append(toIndentedString(maskFileDownloadUrl)).append("\n");
        sb.append("    verifyVideoDownloadUrl: ").append(toIndentedString(verifyVideoDownloadUrl)).append("\n");
        sb.append("    markableVideoDownloadUrl: ").append(toIndentedString(markableVideoDownloadUrl)).append("\n");
        sb.append("    inferenceDataProcessVideoMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessVideoMarkInfo))
            .append("\n");
        sb.append("    inferenceDataProcessActionMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessActionMarkInfo))
            .append("\n");
        sb.append("    inferenceDataProcessEyeCorrectionMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessEyeCorrectionMarkInfo))
            .append("\n");
        sb.append("    isBackgroundReplacement: ").append(toIndentedString(isBackgroundReplacement)).append("\n");
        sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
