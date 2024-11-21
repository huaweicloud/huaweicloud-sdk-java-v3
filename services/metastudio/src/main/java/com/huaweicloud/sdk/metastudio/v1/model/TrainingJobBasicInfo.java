package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TrainingJobBasicInfo
 */
public class TrainingJobBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务的状态。  与MetaStudio Console上用户看到的状态映射关系如下：  - 待提交   * WAIT_FILE_UPLOAD: 待上传文件  - 系统审核中   * AUTO_VERIFYING: 自动审核中   * MANUAL_VERIFYING: 人工审核中  - 系统审核未通过   * AUTO_VERIFY_FAILED: 自动审核失败   * MANUAL_VERIFY_FAILED: 人工审核失败  - 算法训练中   > 算法训练中的状态仅管理员需要处理，普通用户仅需要显示“算法训练中”即可。   * MANUAL_VERIFY_SUCCESS: 审核通过，等待预处理资源   * WAIT_TRAINING_DATA_PREPROCESS: 等待训练数据预处理   * TRAINING_DATA_PREPROCESSING: 训练数据预处理中   * TRAINING_DATA_PREPROCESS_FAILED: 训练数据预处理失败   * TRAINING_DATA_PREPROCESS_SUCCESS: 训练数据预处理完成，等待训练资源中   * TRAINING: 训练中   * TRAIN_FAILED: 训练失败   * TRAIN_SUCCESS: 训练完成，等待预处理资源   * INFERENCE_DATA_PREPROCESSING: 推理数据预处理中   * INFERENCE_DATA_PREPROCESS_FAILED: 推理数据预处理失败   * WAIT_MAIN_FILE_UPLOAD: 等待主文件上传   * MANUAL_STOP_INFERENCE_DATA_PREPROCESS: 人工中止推理预处理   * MANUAL_STOP_TRAIN: 人工中止训练   * MANUAL_STOP_TRAINING_DATA_PREPROCESS: 人工中止训练预处理   * WAIT_ADMIN_CONFIRM: 等待管理员审核   * WAIT_COMPILE: 等待转编译   * COMPILING: 转编译中   * COMPILE_FAILED: 转编译失败   * WAIT_GENERATE_ACTION: 等待原子动作生成   * WAIT_ARRANGE: 等待编排   * ACTION_GENERATE_DATA_PROCESSING: 原子动作生成中   * MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING: 人工中止动作生成   * MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING: 人工中止动作编排   * ACTION_GENERATE_ORI_PROCESSING: 动作编排中   * ACTION_GENERATE_DATA_FAILED: 动作生成失败   * ACTION_GENERATE_ORI_FAILED: 生成动作编排资产失败   * ACTION_GENERATE_ORI_SUCCESS: 动作编排成功   * GENERATE_ACTION_PREPROCESS_FAILED: 生成动作编排原子动作失败   * WAIT_ADMIN_CALIBRATION: 等待管理员确认动作信息   * WAIT_ASSET_SYNC: 等待资产同步  - 待用户审核，仅NA白名单用户有该状态   * WAIT_USER_CONFIRM: 等待用户确认训练效果  - 用户驳回，仅NA白名单用户有该状态   * JOB_REJECT: 驳回任务  - 已完成   * JOB_SUCCESS: 训练任务完成（普通用户任务的完成状态，此时用户已经可以使用模型）   * JOB_FINISH: 任务结束，是最终状态，不支持修改此状态(NA用户任务的完成状态，并且此状态表明模型效果已通过用户的验收)  - 挂起，仅NA白名单用户有该状态   * JOB_PENDING: 挂起任务
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
         * Enum WAIT_TRAINING_DATA_PREPROCESS for value: "WAIT_TRAINING_DATA_PREPROCESS"
         */
        public static final StateEnum WAIT_TRAINING_DATA_PREPROCESS = new StateEnum("WAIT_TRAINING_DATA_PREPROCESS");

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
         * Enum MANUAL_STOP_INFERENCE_DATA_PREPROCESS for value: "MANUAL_STOP_INFERENCE_DATA_PREPROCESS"
         */
        public static final StateEnum MANUAL_STOP_INFERENCE_DATA_PREPROCESS =
            new StateEnum("MANUAL_STOP_INFERENCE_DATA_PREPROCESS");

        /**
         * Enum MANUAL_STOP_TRAIN for value: "MANUAL_STOP_TRAIN"
         */
        public static final StateEnum MANUAL_STOP_TRAIN = new StateEnum("MANUAL_STOP_TRAIN");

        /**
         * Enum MANUAL_STOP_TRAINING_DATA_PREPROCESS for value: "MANUAL_STOP_TRAINING_DATA_PREPROCESS"
         */
        public static final StateEnum MANUAL_STOP_TRAINING_DATA_PREPROCESS =
            new StateEnum("MANUAL_STOP_TRAINING_DATA_PREPROCESS");

        /**
         * Enum MANUAL_STOP_BEAUTY_PREPROCESS for value: "MANUAL_STOP_BEAUTY_PREPROCESS"
         */
        public static final StateEnum MANUAL_STOP_BEAUTY_PREPROCESS = new StateEnum("MANUAL_STOP_BEAUTY_PREPROCESS");

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
         * Enum WAIT_ASSET_SYNC for value: "WAIT_ASSET_SYNC"
         */
        public static final StateEnum WAIT_ASSET_SYNC = new StateEnum("WAIT_ASSET_SYNC");

        /**
         * Enum WAIT_ADMIN_CONFIRM for value: "WAIT_ADMIN_CONFIRM"
         */
        public static final StateEnum WAIT_ADMIN_CONFIRM = new StateEnum("WAIT_ADMIN_CONFIRM");

        /**
         * Enum JOB_FINISH for value: "JOB_FINISH"
         */
        public static final StateEnum JOB_FINISH = new StateEnum("JOB_FINISH");

        /**
         * Enum COMPILING for value: "COMPILING"
         */
        public static final StateEnum COMPILING = new StateEnum("COMPILING");

        /**
         * Enum WAIT_COMPILE for value: "WAIT_COMPILE"
         */
        public static final StateEnum WAIT_COMPILE = new StateEnum("WAIT_COMPILE");

        /**
         * Enum COMPILE_FAILED for value: "COMPILE_FAILED"
         */
        public static final StateEnum COMPILE_FAILED = new StateEnum("COMPILE_FAILED");

        /**
         * Enum WAIT_BEAUTY for value: "WAIT_BEAUTY"
         */
        public static final StateEnum WAIT_BEAUTY = new StateEnum("WAIT_BEAUTY");

        /**
         * Enum WAIT_GENERATE_ACTION for value: "WAIT_GENERATE_ACTION"
         */
        public static final StateEnum WAIT_GENERATE_ACTION = new StateEnum("WAIT_GENERATE_ACTION");

        /**
         * Enum WAIT_ARRANGE for value: "WAIT_ARRANGE"
         */
        public static final StateEnum WAIT_ARRANGE = new StateEnum("WAIT_ARRANGE");

        /**
         * Enum ACTION_GENERATE_DATA_PROCESSING for value: "ACTION_GENERATE_DATA_PROCESSING"
         */
        public static final StateEnum ACTION_GENERATE_DATA_PROCESSING =
            new StateEnum("ACTION_GENERATE_DATA_PROCESSING");

        /**
         * Enum MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING for value: "MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING"
         */
        public static final StateEnum MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING =
            new StateEnum("MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING");

        /**
         * Enum MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING for value: "MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING"
         */
        public static final StateEnum MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING =
            new StateEnum("MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING");

        /**
         * Enum ACTION_GENERATE_ORI_PROCESSING for value: "ACTION_GENERATE_ORI_PROCESSING"
         */
        public static final StateEnum ACTION_GENERATE_ORI_PROCESSING = new StateEnum("ACTION_GENERATE_ORI_PROCESSING");

        /**
         * Enum ACTION_GENERATE_DATA_FAILED for value: "ACTION_GENERATE_DATA_FAILED"
         */
        public static final StateEnum ACTION_GENERATE_DATA_FAILED = new StateEnum("ACTION_GENERATE_DATA_FAILED");

        /**
         * Enum ACTION_GENERATE_ORI_FAILED for value: "ACTION_GENERATE_ORI_FAILED"
         */
        public static final StateEnum ACTION_GENERATE_ORI_FAILED = new StateEnum("ACTION_GENERATE_ORI_FAILED");

        /**
         * Enum ACTION_GENERATE_ORI_SUCCESS for value: "ACTION_GENERATE_ORI_SUCCESS"
         */
        public static final StateEnum ACTION_GENERATE_ORI_SUCCESS = new StateEnum("ACTION_GENERATE_ORI_SUCCESS");

        /**
         * Enum GENERATE_ACTION_PREPROCESS_FAILED for value: "GENERATE_ACTION_PREPROCESS_FAILED"
         */
        public static final StateEnum GENERATE_ACTION_PREPROCESS_FAILED =
            new StateEnum("GENERATE_ACTION_PREPROCESS_FAILED");

        /**
         * Enum WAIT_ADMIN_CALIBRATION for value: "WAIT_ADMIN_CALIBRATION"
         */
        public static final StateEnum WAIT_ADMIN_CALIBRATION = new StateEnum("WAIT_ADMIN_CALIBRATION");

        /**
         * Enum BEAUTY_VIDEO_FILE_UPLOADED for value: "BEAUTY_VIDEO_FILE_UPLOADED"
         */
        public static final StateEnum BEAUTY_VIDEO_FILE_UPLOADED = new StateEnum("BEAUTY_VIDEO_FILE_UPLOADED");

        /**
         * Enum BEAUTYFACE_SUCCESS for value: "BEAUTYFACE_SUCCESS"
         */
        public static final StateEnum BEAUTYFACE_SUCCESS = new StateEnum("BEAUTYFACE_SUCCESS");

        /**
         * Enum BEAUTYFACE_FAILED for value: "BEAUTYFACE_FAILED"
         */
        public static final StateEnum BEAUTYFACE_FAILED = new StateEnum("BEAUTYFACE_FAILED");

        /**
         * Enum WAIT_BEAUTY_VIDEO_FILE_UPLOAD for value: "WAIT_BEAUTY_VIDEO_FILE_UPLOAD"
         */
        public static final StateEnum WAIT_BEAUTY_VIDEO_FILE_UPLOAD = new StateEnum("WAIT_BEAUTY_VIDEO_FILE_UPLOAD");

        /**
         * Enum BEAUTYFACE_ROCESSING for value: "BEAUTYFACE_ROCESSING"
         */
        public static final StateEnum BEAUTYFACE_ROCESSING = new StateEnum("BEAUTYFACE_ROCESSING");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAIT_FILE_UPLOAD", WAIT_FILE_UPLOAD);
            map.put("AUTO_VERIFYING", AUTO_VERIFYING);
            map.put("AUTO_VERIFY_FAILED", AUTO_VERIFY_FAILED);
            map.put("MANUAL_VERIFYING", MANUAL_VERIFYING);
            map.put("WAIT_TRAINING_DATA_PREPROCESS", WAIT_TRAINING_DATA_PREPROCESS);
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
            map.put("MANUAL_STOP_INFERENCE_DATA_PREPROCESS", MANUAL_STOP_INFERENCE_DATA_PREPROCESS);
            map.put("MANUAL_STOP_TRAIN", MANUAL_STOP_TRAIN);
            map.put("MANUAL_STOP_TRAINING_DATA_PREPROCESS", MANUAL_STOP_TRAINING_DATA_PREPROCESS);
            map.put("MANUAL_STOP_BEAUTY_PREPROCESS", MANUAL_STOP_BEAUTY_PREPROCESS);
            map.put("WAIT_USER_CONFIRM", WAIT_USER_CONFIRM);
            map.put("JOB_REJECT", JOB_REJECT);
            map.put("JOB_PENDING", JOB_PENDING);
            map.put("WAIT_ASSET_SYNC", WAIT_ASSET_SYNC);
            map.put("WAIT_ADMIN_CONFIRM", WAIT_ADMIN_CONFIRM);
            map.put("JOB_FINISH", JOB_FINISH);
            map.put("COMPILING", COMPILING);
            map.put("WAIT_COMPILE", WAIT_COMPILE);
            map.put("COMPILE_FAILED", COMPILE_FAILED);
            map.put("WAIT_BEAUTY", WAIT_BEAUTY);
            map.put("WAIT_GENERATE_ACTION", WAIT_GENERATE_ACTION);
            map.put("WAIT_ARRANGE", WAIT_ARRANGE);
            map.put("ACTION_GENERATE_DATA_PROCESSING", ACTION_GENERATE_DATA_PROCESSING);
            map.put("MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING", MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING);
            map.put("MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING", MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING);
            map.put("ACTION_GENERATE_ORI_PROCESSING", ACTION_GENERATE_ORI_PROCESSING);
            map.put("ACTION_GENERATE_DATA_FAILED", ACTION_GENERATE_DATA_FAILED);
            map.put("ACTION_GENERATE_ORI_FAILED", ACTION_GENERATE_ORI_FAILED);
            map.put("ACTION_GENERATE_ORI_SUCCESS", ACTION_GENERATE_ORI_SUCCESS);
            map.put("GENERATE_ACTION_PREPROCESS_FAILED", GENERATE_ACTION_PREPROCESS_FAILED);
            map.put("WAIT_ADMIN_CALIBRATION", WAIT_ADMIN_CALIBRATION);
            map.put("BEAUTY_VIDEO_FILE_UPLOADED", BEAUTY_VIDEO_FILE_UPLOADED);
            map.put("BEAUTYFACE_SUCCESS", BEAUTYFACE_SUCCESS);
            map.put("BEAUTYFACE_FAILED", BEAUTYFACE_FAILED);
            map.put("WAIT_BEAUTY_VIDEO_FILE_UPLOAD", WAIT_BEAUTY_VIDEO_FILE_UPLOAD);
            map.put("BEAUTYFACE_ROCESSING", BEAUTYFACE_ROCESSING);
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
     * 分身数字人模型版本。默认是V3.2版本模型。 * V3.2：V3.2版本模型 > * V3和V2版本已废弃不用
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
    @JsonProperty(value = "is_flexus")

    private Boolean isFlexus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_only_human_model")

    private Boolean isOnlyHumanModel;

    public TrainingJobBasicInfo withJobId(String jobId) {
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

    public TrainingJobBasicInfo withName(String name) {
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

    public TrainingJobBasicInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务的状态。  与MetaStudio Console上用户看到的状态映射关系如下：  - 待提交   * WAIT_FILE_UPLOAD: 待上传文件  - 系统审核中   * AUTO_VERIFYING: 自动审核中   * MANUAL_VERIFYING: 人工审核中  - 系统审核未通过   * AUTO_VERIFY_FAILED: 自动审核失败   * MANUAL_VERIFY_FAILED: 人工审核失败  - 算法训练中   > 算法训练中的状态仅管理员需要处理，普通用户仅需要显示“算法训练中”即可。   * MANUAL_VERIFY_SUCCESS: 审核通过，等待预处理资源   * WAIT_TRAINING_DATA_PREPROCESS: 等待训练数据预处理   * TRAINING_DATA_PREPROCESSING: 训练数据预处理中   * TRAINING_DATA_PREPROCESS_FAILED: 训练数据预处理失败   * TRAINING_DATA_PREPROCESS_SUCCESS: 训练数据预处理完成，等待训练资源中   * TRAINING: 训练中   * TRAIN_FAILED: 训练失败   * TRAIN_SUCCESS: 训练完成，等待预处理资源   * INFERENCE_DATA_PREPROCESSING: 推理数据预处理中   * INFERENCE_DATA_PREPROCESS_FAILED: 推理数据预处理失败   * WAIT_MAIN_FILE_UPLOAD: 等待主文件上传   * MANUAL_STOP_INFERENCE_DATA_PREPROCESS: 人工中止推理预处理   * MANUAL_STOP_TRAIN: 人工中止训练   * MANUAL_STOP_TRAINING_DATA_PREPROCESS: 人工中止训练预处理   * WAIT_ADMIN_CONFIRM: 等待管理员审核   * WAIT_COMPILE: 等待转编译   * COMPILING: 转编译中   * COMPILE_FAILED: 转编译失败   * WAIT_GENERATE_ACTION: 等待原子动作生成   * WAIT_ARRANGE: 等待编排   * ACTION_GENERATE_DATA_PROCESSING: 原子动作生成中   * MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING: 人工中止动作生成   * MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING: 人工中止动作编排   * ACTION_GENERATE_ORI_PROCESSING: 动作编排中   * ACTION_GENERATE_DATA_FAILED: 动作生成失败   * ACTION_GENERATE_ORI_FAILED: 生成动作编排资产失败   * ACTION_GENERATE_ORI_SUCCESS: 动作编排成功   * GENERATE_ACTION_PREPROCESS_FAILED: 生成动作编排原子动作失败   * WAIT_ADMIN_CALIBRATION: 等待管理员确认动作信息   * WAIT_ASSET_SYNC: 等待资产同步  - 待用户审核，仅NA白名单用户有该状态   * WAIT_USER_CONFIRM: 等待用户确认训练效果  - 用户驳回，仅NA白名单用户有该状态   * JOB_REJECT: 驳回任务  - 已完成   * JOB_SUCCESS: 训练任务完成（普通用户任务的完成状态，此时用户已经可以使用模型）   * JOB_FINISH: 任务结束，是最终状态，不支持修改此状态(NA用户任务的完成状态，并且此状态表明模型效果已通过用户的验收)  - 挂起，仅NA白名单用户有该状态   * JOB_PENDING: 挂起任务
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TrainingJobBasicInfo withAssetId(String assetId) {
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

    public TrainingJobBasicInfo withProjectId(String projectId) {
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

    public TrainingJobBasicInfo withCoverDownloadUrl(String coverDownloadUrl) {
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

    public TrainingJobBasicInfo withLastUpdateTime(String lastUpdateTime) {
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

    public TrainingJobBasicInfo withCreateTime(String createTime) {
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

    public TrainingJobBasicInfo withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * 分身数字人训练任务创建者的手机号。
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public TrainingJobBasicInfo withBatchName(String batchName) {
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

    public TrainingJobBasicInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public TrainingJobBasicInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TrainingJobBasicInfo withTags(Consumer<List<String>> tagsSetter) {
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

    public TrainingJobBasicInfo withModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * 分身数字人模型版本。默认是V3.2版本模型。 * V3.2：V3.2版本模型 > * V3和V2版本已废弃不用
     * @return modelVersion
     */
    public ModelVersionEnum getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
    }

    public TrainingJobBasicInfo withMattingType(MattingTypeEnum mattingType) {
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

    public TrainingJobBasicInfo withModelResolution(String modelResolution) {
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

    public TrainingJobBasicInfo withAppUserId(String appUserId) {
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

    public TrainingJobBasicInfo withIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
        return this;
    }

    /**
     * 是否是基础版的形象训练
     * @return isFlexus
     */
    public Boolean getIsFlexus() {
        return isFlexus;
    }

    public void setIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
    }

    public TrainingJobBasicInfo withIsOnlyHumanModel(Boolean isOnlyHumanModel) {
        this.isOnlyHumanModel = isOnlyHumanModel;
        return this;
    }

    /**
     * 是否只训练形象模型，不训练声音模型。仅Flexus版本时有效，默认false。
     * @return isOnlyHumanModel
     */
    public Boolean getIsOnlyHumanModel() {
        return isOnlyHumanModel;
    }

    public void setIsOnlyHumanModel(Boolean isOnlyHumanModel) {
        this.isOnlyHumanModel = isOnlyHumanModel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrainingJobBasicInfo that = (TrainingJobBasicInfo) obj;
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
            && Objects.equals(this.appUserId, that.appUserId) && Objects.equals(this.isFlexus, that.isFlexus)
            && Objects.equals(this.isOnlyHumanModel, that.isOnlyHumanModel);
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
            isFlexus,
            isOnlyHumanModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrainingJobBasicInfo {\n");
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
        sb.append("    isFlexus: ").append(toIndentedString(isFlexus)).append("\n");
        sb.append("    isOnlyHumanModel: ").append(toIndentedString(isOnlyHumanModel)).append("\n");
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
