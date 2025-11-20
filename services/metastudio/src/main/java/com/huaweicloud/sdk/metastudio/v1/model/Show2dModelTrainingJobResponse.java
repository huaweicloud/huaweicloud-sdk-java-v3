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
     * 任务的状态。  与MetaStudio Console上用户看到的状态映射关系如下：  - 待提交   * WAIT_FILE_UPLOAD: 待上传文件  - 系统审核中   * AUTO_VERIFYING: 自动审核中   * MANUAL_VERIFYING: 人工审核中  - 系统审核未通过   * AUTO_VERIFY_FAILED: 自动审核失败   * MANUAL_VERIFY_FAILED: 人工审核失败  - 算法训练中   > 算法训练中的状态仅管理员需要处理，普通用户仅需要显示“算法训练中”即可。   * MANUAL_VERIFY_SUCCESS: 审核通过，等待预处理资源   * WAIT_TRAINING_DATA_PREPROCESS: 等待训练数据预处理   * TRAINING_DATA_PREPROCESSING: 训练数据预处理中   * TRAINING_DATA_PREPROCESS_FAILED: 训练数据预处理失败   * TRAINING_DATA_PREPROCESS_SUCCESS: 训练数据预处理完成，等待训练资源中   * TRAINING: 训练中   * TRAIN_FAILED: 训练失败   * TRAIN_SUCCESS: 训练完成，等待预处理资源   * INFERENCE_DATA_PREPROCESSING: 推理数据预处理中   * INFERENCE_DATA_PREPROCESS_FAILED: 推理数据预处理失败   * WAIT_MAIN_FILE_UPLOAD: 等待主文件上传   * MANUAL_STOP_INFERENCE_DATA_PREPROCESS: 人工中止推理预处理   * MANUAL_STOP_TRAIN: 人工中止训练   * MANUAL_STOP_TRAINING_DATA_PREPROCESS: 人工中止训练预处理   * WAIT_ADMIN_CONFIRM: 等待管理员审核   * WAIT_COMPILE: 等待转编译   * COMPILING: 转编译中   * COMPILE_FAILED: 转编译失败   * WAIT_GENERATE_ACTION: 等待原子动作生成   * WAIT_ARRANGE: 等待编排   * ACTION_GENERATE_DATA_PROCESSING: 原子动作生成中   * MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING: 人工中止动作生成   * MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING: 人工中止动作编排   * ACTION_GENERATE_ORI_PROCESSING: 动作编排中   * ACTION_GENERATE_DATA_FAILED: 动作生成失败   * ACTION_GENERATE_ORI_FAILED: 生成动作编排资产失败   * ACTION_GENERATE_ORI_SUCCESS: 动作编排成功   * GENERATE_ACTION_PREPROCESS_FAILED: 生成动作编排原子动作失败   * WAIT_ADMIN_CALIBRATION: 等待管理员确认动作信息   * WAIT_ASSET_SYNC: 等待资产同步   * WAIT_GENERATE_ACTION_MARK 等待动作标定   * ACTION_MARKING: 动作标定生成 - 待用户审核，仅NA白名单用户有该状态   * WAIT_USER_CONFIRM: 等待用户确认训练效果  - 用户驳回，仅NA白名单用户有该状态   * JOB_REJECT: 驳回任务  - 已完成   * JOB_SUCCESS: 训练任务完成（普通用户任务的完成状态，此时用户已经可以使用模型）   * JOB_FINISH: 任务结束，是最终状态，不支持修改此状态(NA用户任务的完成状态，并且此状态表明模型效果已通过用户的验收)  - 挂起，仅NA白名单用户有该状态   * JOB_PENDING: 挂起任务   * WAIT_TEST_VIDEO_CHECK: 等待进行测试视频推理任务  * TEST_VIDEO_CHECK_PROCESSING：测试视频推理质量检测中  * TEST_VIDEO_CHECK_SUCCESS：测试视频推理质量检测通过  * TEST_VIDEO_CHECK_FAILED：测试视频推理质量检测未通过  * VIDEO_ANALYZE_PROCESSING：视频检测中  * VIDEO_ANALYZE_SUCCESS：视频检测通过  * VIDEO_ANALYZE_FAILED：视频检测未通过  * ACTION_MARKING：动作标定中  * ACTION_MARK_SUCCESS：动作标定成功  * ACTION_MARK_FAILED：动作标定失败  * ACTION_MARK_UPLOADED：动作标定文件上传成功  * MANUL_STOP_ACTION_MARK：中止动作标定
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

        /**
         * Enum WAIT_TEST_VIDEO_CHECK for value: "WAIT_TEST_VIDEO_CHECK"
         */
        public static final StateEnum WAIT_TEST_VIDEO_CHECK = new StateEnum("WAIT_TEST_VIDEO_CHECK");

        /**
         * Enum TEST_VIDEO_CHECK_PROCESSING for value: "TEST_VIDEO_CHECK_PROCESSING"
         */
        public static final StateEnum TEST_VIDEO_CHECK_PROCESSING = new StateEnum("TEST_VIDEO_CHECK_PROCESSING");

        /**
         * Enum TEST_VIDEO_CHECK_SUCCESS for value: "TEST_VIDEO_CHECK_SUCCESS"
         */
        public static final StateEnum TEST_VIDEO_CHECK_SUCCESS = new StateEnum("TEST_VIDEO_CHECK_SUCCESS");

        /**
         * Enum TEST_VIDEO_CHECK_FAILED for value: "TEST_VIDEO_CHECK_FAILED"
         */
        public static final StateEnum TEST_VIDEO_CHECK_FAILED = new StateEnum("TEST_VIDEO_CHECK_FAILED");

        /**
         * Enum VIDEO_ANALYZE_PROCESSING for value: "VIDEO_ANALYZE_PROCESSING"
         */
        public static final StateEnum VIDEO_ANALYZE_PROCESSING = new StateEnum("VIDEO_ANALYZE_PROCESSING");

        /**
         * Enum VIDEO_ANALYZE_SUCCESS for value: "VIDEO_ANALYZE_SUCCESS"
         */
        public static final StateEnum VIDEO_ANALYZE_SUCCESS = new StateEnum("VIDEO_ANALYZE_SUCCESS");

        /**
         * Enum VIDEO_ANALYZE_FAILED for value: "VIDEO_ANALYZE_FAILED"
         */
        public static final StateEnum VIDEO_ANALYZE_FAILED = new StateEnum("VIDEO_ANALYZE_FAILED");

        /**
         * Enum ACTION_MARKING for value: "ACTION_MARKING"
         */
        public static final StateEnum ACTION_MARKING = new StateEnum("ACTION_MARKING");

        /**
         * Enum ACTION_MARK_SUCCESS for value: "ACTION_MARK_SUCCESS"
         */
        public static final StateEnum ACTION_MARK_SUCCESS = new StateEnum("ACTION_MARK_SUCCESS");

        /**
         * Enum ACTION_MARK_FAILED for value: "ACTION_MARK_FAILED"
         */
        public static final StateEnum ACTION_MARK_FAILED = new StateEnum("ACTION_MARK_FAILED");

        /**
         * Enum ACTION_MARK_UPLOADED for value: "ACTION_MARK_UPLOADED"
         */
        public static final StateEnum ACTION_MARK_UPLOADED = new StateEnum("ACTION_MARK_UPLOADED");

        /**
         * Enum WAIT_GENERATE_ACTION_MARK for value: "WAIT_GENERATE_ACTION_MARK"
         */
        public static final StateEnum WAIT_GENERATE_ACTION_MARK = new StateEnum("WAIT_GENERATE_ACTION_MARK");

        /**
         * Enum MANUL_STOP_ACTION_MARK for value: "MANUL_STOP_ACTION_MARK"
         */
        public static final StateEnum MANUL_STOP_ACTION_MARK = new StateEnum("MANUL_STOP_ACTION_MARK");

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
            map.put("WAIT_TEST_VIDEO_CHECK", WAIT_TEST_VIDEO_CHECK);
            map.put("TEST_VIDEO_CHECK_PROCESSING", TEST_VIDEO_CHECK_PROCESSING);
            map.put("TEST_VIDEO_CHECK_SUCCESS", TEST_VIDEO_CHECK_SUCCESS);
            map.put("TEST_VIDEO_CHECK_FAILED", TEST_VIDEO_CHECK_FAILED);
            map.put("VIDEO_ANALYZE_PROCESSING", VIDEO_ANALYZE_PROCESSING);
            map.put("VIDEO_ANALYZE_SUCCESS", VIDEO_ANALYZE_SUCCESS);
            map.put("VIDEO_ANALYZE_FAILED", VIDEO_ANALYZE_FAILED);
            map.put("ACTION_MARKING", ACTION_MARKING);
            map.put("ACTION_MARK_SUCCESS", ACTION_MARK_SUCCESS);
            map.put("ACTION_MARK_FAILED", ACTION_MARK_FAILED);
            map.put("ACTION_MARK_UPLOADED", ACTION_MARK_UPLOADED);
            map.put("WAIT_GENERATE_ACTION_MARK", WAIT_GENERATE_ACTION_MARK);
            map.put("MANUL_STOP_ACTION_MARK", MANUL_STOP_ACTION_MARK);
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
     * 分身数字人模型版本。默认是V3.2版本模型。 * V3.2：V3.2版本模型 * V3.3: 极速版flexus用的训练模型 > * V3和V2版本已废弃不用
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

        /**
         * Enum V3_3 for value: "V3.3"
         */
        public static final ModelVersionEnum V3_3 = new ModelVersionEnum("V3.3");

        private static final Map<String, ModelVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelVersionEnum> createStaticFields() {
            Map<String, ModelVersionEnum> map = new HashMap<>();
            map.put("V2", V2);
            map.put("V3", V3);
            map.put("V3.2", V3_2);
            map.put("V3.3", V3_3);
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
    @JsonProperty(value = "is_live_copy")

    private Boolean isLiveCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_fast_flexus")

    private Boolean isFastFlexus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_only_human_model")

    private Boolean isOnlyHumanModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_training_location")

    private List<String> optionalTrainingLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_background_replacement")

    private Boolean isBackgroundReplacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ondemand_resource")

    private Boolean isOndemandResource;

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
    @JsonProperty(value = "pre_beauty_image_download_url")

    private String preBeautyImageDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_action_json_data_download_url")

    private String externalActionJsonDataDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_video_download_url")

    private String actionVideoDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_beauty_image_download_url")

    private String postBeautyImageDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_download_url")

    private String audioFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_mark_file_download_url")

    private String actionMarkFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_mark_file_upload_url")

    private String actionMarkFileUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_logs")

    private List<OperationLogInfo> operationLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_video_matting_info")

    private List<VerifyVideoMattingInfo> verifyVideoMattingInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_logs")

    private List<CommentLogInfo> commentLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "samples")

    private List<ActionSampleInfo> samples = null;

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
    @JsonProperty(value = "markable_action_video_download_url")

    private String markableActionVideoDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traning_video_mark_info")

    private TrainingVideoMarkInfo traningVideoMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_video_mark_info")

    private InferenceVideoMarkInfo inferenceDataProcessVideoMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_properties")

    private VoiceProperties voiceProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_action_mark_info")

    private InferenceActionMarkInfo inferenceDataProcessActionMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_chat_action_mark_info")

    private InferenceActionMarkInfo inferenceDataProcessChatActionMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inference_data_process_eye_correction_mark_info")

    private InferenceEyeCorrectionMarkInfo inferenceDataProcessEyeCorrectionMarkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_type")

    private List<String> workerType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_train_job_id")

    private String voiceTrainJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexus_retry_count")

    private Integer flexusRetryCount;

    /**
     * 声音来源类型 * VIDEO：视频中抽取音频 * AUDIO：单独上传的音频
     */
    public static final class AudioSourceTypeEnum {

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AudioSourceTypeEnum VIDEO = new AudioSourceTypeEnum("VIDEO");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final AudioSourceTypeEnum AUDIO = new AudioSourceTypeEnum("AUDIO");

        private static final Map<String, AudioSourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioSourceTypeEnum> createStaticFields() {
            Map<String, AudioSourceTypeEnum> map = new HashMap<>();
            map.put("VIDEO", VIDEO);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioSourceTypeEnum(String value) {
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
        public static AudioSourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioSourceTypeEnum(value));
        }

        public static AudioSourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioSourceTypeEnum) {
                return this.value.equals(((AudioSourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_source_type")

    private AudioSourceTypeEnum audioSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_service")

    private List<SupportedServiceEnum> supportedService = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated_resource")

    private TrainingAllocatedResource allocatedResource;

    /**
     * 训练视频旋转任务状态。 * WAITING：等待中 * PROCESSING：转编译中 * SUCCESS：转编译成功 * FAILED：转编译失败
     */
    public static final class TrainVideoRotationStateEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final TrainVideoRotationStateEnum WAITING = new TrainVideoRotationStateEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final TrainVideoRotationStateEnum PROCESSING = new TrainVideoRotationStateEnum("PROCESSING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final TrainVideoRotationStateEnum SUCCESS = new TrainVideoRotationStateEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final TrainVideoRotationStateEnum FAILED = new TrainVideoRotationStateEnum("FAILED");

        private static final Map<String, TrainVideoRotationStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrainVideoRotationStateEnum> createStaticFields() {
            Map<String, TrainVideoRotationStateEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrainVideoRotationStateEnum(String value) {
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
        public static TrainVideoRotationStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new TrainVideoRotationStateEnum(value));
        }

        public static TrainVideoRotationStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrainVideoRotationStateEnum) {
                return this.value.equals(((TrainVideoRotationStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_video_rotation_state")

    private TrainVideoRotationStateEnum trainVideoRotationState;

    /**
     * 训练视频旋转任务状态。 * WAITING：等待中 * PROCESSING：转编译中 * SUCCESS：转编译成功 * FAILED：转编译失败
     */
    public static final class ActionVideoRotationStateEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final ActionVideoRotationStateEnum WAITING = new ActionVideoRotationStateEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final ActionVideoRotationStateEnum PROCESSING = new ActionVideoRotationStateEnum("PROCESSING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final ActionVideoRotationStateEnum SUCCESS = new ActionVideoRotationStateEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final ActionVideoRotationStateEnum FAILED = new ActionVideoRotationStateEnum("FAILED");

        private static final Map<String, ActionVideoRotationStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionVideoRotationStateEnum> createStaticFields() {
            Map<String, ActionVideoRotationStateEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionVideoRotationStateEnum(String value) {
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
        public static ActionVideoRotationStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new ActionVideoRotationStateEnum(value));
        }

        public static ActionVideoRotationStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionVideoRotationStateEnum) {
                return this.value.equals(((ActionVideoRotationStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_video_rotation_state")

    private ActionVideoRotationStateEnum actionVideoRotationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_training_job_info")

    private List<SubTrainingJobInfoDto> subTrainingJobInfo = null;

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
     * 任务的状态。  与MetaStudio Console上用户看到的状态映射关系如下：  - 待提交   * WAIT_FILE_UPLOAD: 待上传文件  - 系统审核中   * AUTO_VERIFYING: 自动审核中   * MANUAL_VERIFYING: 人工审核中  - 系统审核未通过   * AUTO_VERIFY_FAILED: 自动审核失败   * MANUAL_VERIFY_FAILED: 人工审核失败  - 算法训练中   > 算法训练中的状态仅管理员需要处理，普通用户仅需要显示“算法训练中”即可。   * MANUAL_VERIFY_SUCCESS: 审核通过，等待预处理资源   * WAIT_TRAINING_DATA_PREPROCESS: 等待训练数据预处理   * TRAINING_DATA_PREPROCESSING: 训练数据预处理中   * TRAINING_DATA_PREPROCESS_FAILED: 训练数据预处理失败   * TRAINING_DATA_PREPROCESS_SUCCESS: 训练数据预处理完成，等待训练资源中   * TRAINING: 训练中   * TRAIN_FAILED: 训练失败   * TRAIN_SUCCESS: 训练完成，等待预处理资源   * INFERENCE_DATA_PREPROCESSING: 推理数据预处理中   * INFERENCE_DATA_PREPROCESS_FAILED: 推理数据预处理失败   * WAIT_MAIN_FILE_UPLOAD: 等待主文件上传   * MANUAL_STOP_INFERENCE_DATA_PREPROCESS: 人工中止推理预处理   * MANUAL_STOP_TRAIN: 人工中止训练   * MANUAL_STOP_TRAINING_DATA_PREPROCESS: 人工中止训练预处理   * WAIT_ADMIN_CONFIRM: 等待管理员审核   * WAIT_COMPILE: 等待转编译   * COMPILING: 转编译中   * COMPILE_FAILED: 转编译失败   * WAIT_GENERATE_ACTION: 等待原子动作生成   * WAIT_ARRANGE: 等待编排   * ACTION_GENERATE_DATA_PROCESSING: 原子动作生成中   * MANUAL_STOP_ACTION_GENERATE_DATA_PROCESSING: 人工中止动作生成   * MANUAL_STOP_ACTION_GENERATE_ORI_PROCESSING: 人工中止动作编排   * ACTION_GENERATE_ORI_PROCESSING: 动作编排中   * ACTION_GENERATE_DATA_FAILED: 动作生成失败   * ACTION_GENERATE_ORI_FAILED: 生成动作编排资产失败   * ACTION_GENERATE_ORI_SUCCESS: 动作编排成功   * GENERATE_ACTION_PREPROCESS_FAILED: 生成动作编排原子动作失败   * WAIT_ADMIN_CALIBRATION: 等待管理员确认动作信息   * WAIT_ASSET_SYNC: 等待资产同步   * WAIT_GENERATE_ACTION_MARK 等待动作标定   * ACTION_MARKING: 动作标定生成 - 待用户审核，仅NA白名单用户有该状态   * WAIT_USER_CONFIRM: 等待用户确认训练效果  - 用户驳回，仅NA白名单用户有该状态   * JOB_REJECT: 驳回任务  - 已完成   * JOB_SUCCESS: 训练任务完成（普通用户任务的完成状态，此时用户已经可以使用模型）   * JOB_FINISH: 任务结束，是最终状态，不支持修改此状态(NA用户任务的完成状态，并且此状态表明模型效果已通过用户的验收)  - 挂起，仅NA白名单用户有该状态   * JOB_PENDING: 挂起任务   * WAIT_TEST_VIDEO_CHECK: 等待进行测试视频推理任务  * TEST_VIDEO_CHECK_PROCESSING：测试视频推理质量检测中  * TEST_VIDEO_CHECK_SUCCESS：测试视频推理质量检测通过  * TEST_VIDEO_CHECK_FAILED：测试视频推理质量检测未通过  * VIDEO_ANALYZE_PROCESSING：视频检测中  * VIDEO_ANALYZE_SUCCESS：视频检测通过  * VIDEO_ANALYZE_FAILED：视频检测未通过  * ACTION_MARKING：动作标定中  * ACTION_MARK_SUCCESS：动作标定成功  * ACTION_MARK_FAILED：动作标定失败  * ACTION_MARK_UPLOADED：动作标定文件上传成功  * MANUL_STOP_ACTION_MARK：中止动作标定
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
     * 分身数字人训练任务创建者的手机号。
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
     * 分身数字人模型版本。默认是V3.2版本模型。 * V3.2：V3.2版本模型 * V3.3: 极速版flexus用的训练模型 > * V3和V2版本已废弃不用
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

    public Show2dModelTrainingJobResponse withIsFlexus(Boolean isFlexus) {
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

    public Show2dModelTrainingJobResponse withIsLiveCopy(Boolean isLiveCopy) {
        this.isLiveCopy = isLiveCopy;
        return this;
    }

    /**
     * 是否是直播间复刻任务
     * @return isLiveCopy
     */
    public Boolean getIsLiveCopy() {
        return isLiveCopy;
    }

    public void setIsLiveCopy(Boolean isLiveCopy) {
        this.isLiveCopy = isLiveCopy;
    }

    public Show2dModelTrainingJobResponse withIsFastFlexus(Boolean isFastFlexus) {
        this.isFastFlexus = isFastFlexus;
        return this;
    }

    /**
     * 是否极速版flexus
     * @return isFastFlexus
     */
    public Boolean getIsFastFlexus() {
        return isFastFlexus;
    }

    public void setIsFastFlexus(Boolean isFastFlexus) {
        this.isFastFlexus = isFastFlexus;
    }

    public Show2dModelTrainingJobResponse withIsOnlyHumanModel(Boolean isOnlyHumanModel) {
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

    public Show2dModelTrainingJobResponse withOptionalTrainingLocation(List<String> optionalTrainingLocation) {
        this.optionalTrainingLocation = optionalTrainingLocation;
        return this;
    }

    public Show2dModelTrainingJobResponse addOptionalTrainingLocationItem(String optionalTrainingLocationItem) {
        if (this.optionalTrainingLocation == null) {
            this.optionalTrainingLocation = new ArrayList<>();
        }
        this.optionalTrainingLocation.add(optionalTrainingLocationItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withOptionalTrainingLocation(
        Consumer<List<String>> optionalTrainingLocationSetter) {
        if (this.optionalTrainingLocation == null) {
            this.optionalTrainingLocation = new ArrayList<>();
        }
        optionalTrainingLocationSetter.accept(this.optionalTrainingLocation);
        return this;
    }

    /**
     * 可选训练region
     * @return optionalTrainingLocation
     */
    public List<String> getOptionalTrainingLocation() {
        return optionalTrainingLocation;
    }

    public void setOptionalTrainingLocation(List<String> optionalTrainingLocation) {
        this.optionalTrainingLocation = optionalTrainingLocation;
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

    public Show2dModelTrainingJobResponse withIsOndemandResource(Boolean isOndemandResource) {
        this.isOndemandResource = isOndemandResource;
        return this;
    }

    /**
     * 是否按需任务
     * @return isOndemandResource
     */
    public Boolean getIsOndemandResource() {
        return isOndemandResource;
    }

    public void setIsOndemandResource(Boolean isOndemandResource) {
        this.isOndemandResource = isOndemandResource;
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

    public Show2dModelTrainingJobResponse withPreBeautyImageDownloadUrl(String preBeautyImageDownloadUrl) {
        this.preBeautyImageDownloadUrl = preBeautyImageDownloadUrl;
        return this;
    }

    /**
     * 美白前图片下载url。
     * @return preBeautyImageDownloadUrl
     */
    public String getPreBeautyImageDownloadUrl() {
        return preBeautyImageDownloadUrl;
    }

    public void setPreBeautyImageDownloadUrl(String preBeautyImageDownloadUrl) {
        this.preBeautyImageDownloadUrl = preBeautyImageDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withExternalActionJsonDataDownloadUrl(
        String externalActionJsonDataDownloadUrl) {
        this.externalActionJsonDataDownloadUrl = externalActionJsonDataDownloadUrl;
        return this;
    }

    /**
     * 授权书下载URL。24小时内有效。
     * @return externalActionJsonDataDownloadUrl
     */
    public String getExternalActionJsonDataDownloadUrl() {
        return externalActionJsonDataDownloadUrl;
    }

    public void setExternalActionJsonDataDownloadUrl(String externalActionJsonDataDownloadUrl) {
        this.externalActionJsonDataDownloadUrl = externalActionJsonDataDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withActionVideoDownloadUrl(String actionVideoDownloadUrl) {
        this.actionVideoDownloadUrl = actionVideoDownloadUrl;
        return this;
    }

    /**
     * 动作视频
     * @return actionVideoDownloadUrl
     */
    public String getActionVideoDownloadUrl() {
        return actionVideoDownloadUrl;
    }

    public void setActionVideoDownloadUrl(String actionVideoDownloadUrl) {
        this.actionVideoDownloadUrl = actionVideoDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withPostBeautyImageDownloadUrl(String postBeautyImageDownloadUrl) {
        this.postBeautyImageDownloadUrl = postBeautyImageDownloadUrl;
        return this;
    }

    /**
     * 美白后图片下载url。
     * @return postBeautyImageDownloadUrl
     */
    public String getPostBeautyImageDownloadUrl() {
        return postBeautyImageDownloadUrl;
    }

    public void setPostBeautyImageDownloadUrl(String postBeautyImageDownloadUrl) {
        this.postBeautyImageDownloadUrl = postBeautyImageDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
        return this;
    }

    /**
     * 音频文件下载url。
     * @return audioFileDownloadUrl
     */
    public String getAudioFileDownloadUrl() {
        return audioFileDownloadUrl;
    }

    public void setAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withActionMarkFileDownloadUrl(String actionMarkFileDownloadUrl) {
        this.actionMarkFileDownloadUrl = actionMarkFileDownloadUrl;
        return this;
    }

    /**
     * 动作标定文件下载url。
     * @return actionMarkFileDownloadUrl
     */
    public String getActionMarkFileDownloadUrl() {
        return actionMarkFileDownloadUrl;
    }

    public void setActionMarkFileDownloadUrl(String actionMarkFileDownloadUrl) {
        this.actionMarkFileDownloadUrl = actionMarkFileDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withActionMarkFileUploadUrl(String actionMarkFileUploadUrl) {
        this.actionMarkFileUploadUrl = actionMarkFileUploadUrl;
        return this;
    }

    /**
     * 动作标定文件上传url。
     * @return actionMarkFileUploadUrl
     */
    public String getActionMarkFileUploadUrl() {
        return actionMarkFileUploadUrl;
    }

    public void setActionMarkFileUploadUrl(String actionMarkFileUploadUrl) {
        this.actionMarkFileUploadUrl = actionMarkFileUploadUrl;
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

    public Show2dModelTrainingJobResponse withVerifyVideoMattingInfo(
        List<VerifyVideoMattingInfo> verifyVideoMattingInfo) {
        this.verifyVideoMattingInfo = verifyVideoMattingInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse addVerifyVideoMattingInfoItem(
        VerifyVideoMattingInfo verifyVideoMattingInfoItem) {
        if (this.verifyVideoMattingInfo == null) {
            this.verifyVideoMattingInfo = new ArrayList<>();
        }
        this.verifyVideoMattingInfo.add(verifyVideoMattingInfoItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withVerifyVideoMattingInfo(
        Consumer<List<VerifyVideoMattingInfo>> verifyVideoMattingInfoSetter) {
        if (this.verifyVideoMattingInfo == null) {
            this.verifyVideoMattingInfo = new ArrayList<>();
        }
        verifyVideoMattingInfoSetter.accept(this.verifyVideoMattingInfo);
        return this;
    }

    /**
     * 生成抠图验证视频时不抠图区域。
     * @return verifyVideoMattingInfo
     */
    public List<VerifyVideoMattingInfo> getVerifyVideoMattingInfo() {
        return verifyVideoMattingInfo;
    }

    public void setVerifyVideoMattingInfo(List<VerifyVideoMattingInfo> verifyVideoMattingInfo) {
        this.verifyVideoMattingInfo = verifyVideoMattingInfo;
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

    public Show2dModelTrainingJobResponse withSamples(List<ActionSampleInfo> samples) {
        this.samples = samples;
        return this;
    }

    public Show2dModelTrainingJobResponse addSamplesItem(ActionSampleInfo samplesItem) {
        if (this.samples == null) {
            this.samples = new ArrayList<>();
        }
        this.samples.add(samplesItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withSamples(Consumer<List<ActionSampleInfo>> samplesSetter) {
        if (this.samples == null) {
            this.samples = new ArrayList<>();
        }
        samplesSetter.accept(this.samples);
        return this;
    }

    /**
     * 动作视频样例。
     * @return samples
     */
    public List<ActionSampleInfo> getSamples() {
        return samples;
    }

    public void setSamples(List<ActionSampleInfo> samples) {
        this.samples = samples;
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

    public Show2dModelTrainingJobResponse withMarkableActionVideoDownloadUrl(String markableActionVideoDownloadUrl) {
        this.markableActionVideoDownloadUrl = markableActionVideoDownloadUrl;
        return this;
    }

    /**
     * 动作标注视频url下载链接。24小时内有效。
     * @return markableActionVideoDownloadUrl
     */
    public String getMarkableActionVideoDownloadUrl() {
        return markableActionVideoDownloadUrl;
    }

    public void setMarkableActionVideoDownloadUrl(String markableActionVideoDownloadUrl) {
        this.markableActionVideoDownloadUrl = markableActionVideoDownloadUrl;
    }

    public Show2dModelTrainingJobResponse withTraningVideoMarkInfo(TrainingVideoMarkInfo traningVideoMarkInfo) {
        this.traningVideoMarkInfo = traningVideoMarkInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse withTraningVideoMarkInfo(
        Consumer<TrainingVideoMarkInfo> traningVideoMarkInfoSetter) {
        if (this.traningVideoMarkInfo == null) {
            this.traningVideoMarkInfo = new TrainingVideoMarkInfo();
            traningVideoMarkInfoSetter.accept(this.traningVideoMarkInfo);
        }

        return this;
    }

    /**
     * Get traningVideoMarkInfo
     * @return traningVideoMarkInfo
     */
    public TrainingVideoMarkInfo getTraningVideoMarkInfo() {
        return traningVideoMarkInfo;
    }

    public void setTraningVideoMarkInfo(TrainingVideoMarkInfo traningVideoMarkInfo) {
        this.traningVideoMarkInfo = traningVideoMarkInfo;
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

    public Show2dModelTrainingJobResponse withVoiceProperties(VoiceProperties voiceProperties) {
        this.voiceProperties = voiceProperties;
        return this;
    }

    public Show2dModelTrainingJobResponse withVoiceProperties(Consumer<VoiceProperties> voicePropertiesSetter) {
        if (this.voiceProperties == null) {
            this.voiceProperties = new VoiceProperties();
            voicePropertiesSetter.accept(this.voiceProperties);
        }

        return this;
    }

    /**
     * Get voiceProperties
     * @return voiceProperties
     */
    public VoiceProperties getVoiceProperties() {
        return voiceProperties;
    }

    public void setVoiceProperties(VoiceProperties voiceProperties) {
        this.voiceProperties = voiceProperties;
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

    public Show2dModelTrainingJobResponse withInferenceDataProcessChatActionMarkInfo(
        InferenceActionMarkInfo inferenceDataProcessChatActionMarkInfo) {
        this.inferenceDataProcessChatActionMarkInfo = inferenceDataProcessChatActionMarkInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse withInferenceDataProcessChatActionMarkInfo(
        Consumer<InferenceActionMarkInfo> inferenceDataProcessChatActionMarkInfoSetter) {
        if (this.inferenceDataProcessChatActionMarkInfo == null) {
            this.inferenceDataProcessChatActionMarkInfo = new InferenceActionMarkInfo();
            inferenceDataProcessChatActionMarkInfoSetter.accept(this.inferenceDataProcessChatActionMarkInfo);
        }

        return this;
    }

    /**
     * Get inferenceDataProcessChatActionMarkInfo
     * @return inferenceDataProcessChatActionMarkInfo
     */
    public InferenceActionMarkInfo getInferenceDataProcessChatActionMarkInfo() {
        return inferenceDataProcessChatActionMarkInfo;
    }

    public void setInferenceDataProcessChatActionMarkInfo(
        InferenceActionMarkInfo inferenceDataProcessChatActionMarkInfo) {
        this.inferenceDataProcessChatActionMarkInfo = inferenceDataProcessChatActionMarkInfo;
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

    public Show2dModelTrainingJobResponse withVoiceTrainJobId(String voiceTrainJobId) {
        this.voiceTrainJobId = voiceTrainJobId;
        return this;
    }

    /**
     * 声音训练任务id。
     * @return voiceTrainJobId
     */
    public String getVoiceTrainJobId() {
        return voiceTrainJobId;
    }

    public void setVoiceTrainJobId(String voiceTrainJobId) {
        this.voiceTrainJobId = voiceTrainJobId;
    }

    public Show2dModelTrainingJobResponse withFlexusRetryCount(Integer flexusRetryCount) {
        this.flexusRetryCount = flexusRetryCount;
        return this;
    }

    /**
     * flexus版本任务剩余可以重训的次数，每重训一次减1，减到0时不可再重训。
     * minimum: 0
     * maximum: 10
     * @return flexusRetryCount
     */
    public Integer getFlexusRetryCount() {
        return flexusRetryCount;
    }

    public void setFlexusRetryCount(Integer flexusRetryCount) {
        this.flexusRetryCount = flexusRetryCount;
    }

    public Show2dModelTrainingJobResponse withAudioSourceType(AudioSourceTypeEnum audioSourceType) {
        this.audioSourceType = audioSourceType;
        return this;
    }

    /**
     * 声音来源类型 * VIDEO：视频中抽取音频 * AUDIO：单独上传的音频
     * @return audioSourceType
     */
    public AudioSourceTypeEnum getAudioSourceType() {
        return audioSourceType;
    }

    public void setAudioSourceType(AudioSourceTypeEnum audioSourceType) {
        this.audioSourceType = audioSourceType;
    }

    public Show2dModelTrainingJobResponse withSupportedService(List<SupportedServiceEnum> supportedService) {
        this.supportedService = supportedService;
        return this;
    }

    public Show2dModelTrainingJobResponse addSupportedServiceItem(SupportedServiceEnum supportedServiceItem) {
        if (this.supportedService == null) {
            this.supportedService = new ArrayList<>();
        }
        this.supportedService.add(supportedServiceItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withSupportedService(
        Consumer<List<SupportedServiceEnum>> supportedServiceSetter) {
        if (this.supportedService == null) {
            this.supportedService = new ArrayList<>();
        }
        supportedServiceSetter.accept(this.supportedService);
        return this;
    }

    /**
     * 该任务所生成的模型支持的业务类型，可多选。  Flexus版数字人仅支持选择“VIDEO_2D”。
     * @return supportedService
     */
    public List<SupportedServiceEnum> getSupportedService() {
        return supportedService;
    }

    public void setSupportedService(List<SupportedServiceEnum> supportedService) {
        this.supportedService = supportedService;
    }

    public Show2dModelTrainingJobResponse withAllocatedResource(TrainingAllocatedResource allocatedResource) {
        this.allocatedResource = allocatedResource;
        return this;
    }

    public Show2dModelTrainingJobResponse withAllocatedResource(
        Consumer<TrainingAllocatedResource> allocatedResourceSetter) {
        if (this.allocatedResource == null) {
            this.allocatedResource = new TrainingAllocatedResource();
            allocatedResourceSetter.accept(this.allocatedResource);
        }

        return this;
    }

    /**
     * Get allocatedResource
     * @return allocatedResource
     */
    public TrainingAllocatedResource getAllocatedResource() {
        return allocatedResource;
    }

    public void setAllocatedResource(TrainingAllocatedResource allocatedResource) {
        this.allocatedResource = allocatedResource;
    }

    public Show2dModelTrainingJobResponse withTrainVideoRotationState(
        TrainVideoRotationStateEnum trainVideoRotationState) {
        this.trainVideoRotationState = trainVideoRotationState;
        return this;
    }

    /**
     * 训练视频旋转任务状态。 * WAITING：等待中 * PROCESSING：转编译中 * SUCCESS：转编译成功 * FAILED：转编译失败
     * @return trainVideoRotationState
     */
    public TrainVideoRotationStateEnum getTrainVideoRotationState() {
        return trainVideoRotationState;
    }

    public void setTrainVideoRotationState(TrainVideoRotationStateEnum trainVideoRotationState) {
        this.trainVideoRotationState = trainVideoRotationState;
    }

    public Show2dModelTrainingJobResponse withActionVideoRotationState(
        ActionVideoRotationStateEnum actionVideoRotationState) {
        this.actionVideoRotationState = actionVideoRotationState;
        return this;
    }

    /**
     * 训练视频旋转任务状态。 * WAITING：等待中 * PROCESSING：转编译中 * SUCCESS：转编译成功 * FAILED：转编译失败
     * @return actionVideoRotationState
     */
    public ActionVideoRotationStateEnum getActionVideoRotationState() {
        return actionVideoRotationState;
    }

    public void setActionVideoRotationState(ActionVideoRotationStateEnum actionVideoRotationState) {
        this.actionVideoRotationState = actionVideoRotationState;
    }

    public Show2dModelTrainingJobResponse withSubTrainingJobInfo(List<SubTrainingJobInfoDto> subTrainingJobInfo) {
        this.subTrainingJobInfo = subTrainingJobInfo;
        return this;
    }

    public Show2dModelTrainingJobResponse addSubTrainingJobInfoItem(SubTrainingJobInfoDto subTrainingJobInfoItem) {
        if (this.subTrainingJobInfo == null) {
            this.subTrainingJobInfo = new ArrayList<>();
        }
        this.subTrainingJobInfo.add(subTrainingJobInfoItem);
        return this;
    }

    public Show2dModelTrainingJobResponse withSubTrainingJobInfo(
        Consumer<List<SubTrainingJobInfoDto>> subTrainingJobInfoSetter) {
        if (this.subTrainingJobInfo == null) {
            this.subTrainingJobInfo = new ArrayList<>();
        }
        subTrainingJobInfoSetter.accept(this.subTrainingJobInfo);
        return this;
    }

    /**
     * 子任务信息
     * @return subTrainingJobInfo
     */
    public List<SubTrainingJobInfoDto> getSubTrainingJobInfo() {
        return subTrainingJobInfo;
    }

    public void setSubTrainingJobInfo(List<SubTrainingJobInfoDto> subTrainingJobInfo) {
        this.subTrainingJobInfo = subTrainingJobInfo;
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
            && Objects.equals(this.appUserId, that.appUserId) && Objects.equals(this.isFlexus, that.isFlexus)
            && Objects.equals(this.isLiveCopy, that.isLiveCopy) && Objects.equals(this.isFastFlexus, that.isFastFlexus)
            && Objects.equals(this.isOnlyHumanModel, that.isOnlyHumanModel)
            && Objects.equals(this.optionalTrainingLocation, that.optionalTrainingLocation)
            && Objects.equals(this.isBackgroundReplacement, that.isBackgroundReplacement)
            && Objects.equals(this.isOndemandResource, that.isOndemandResource)
            && Objects.equals(this.trainingVideoDownloadUrl, that.trainingVideoDownloadUrl)
            && Objects.equals(this.idCardImage1DownloadUrl, that.idCardImage1DownloadUrl)
            && Objects.equals(this.idCardImage2DownloadUrl, that.idCardImage2DownloadUrl)
            && Objects.equals(this.grantFileDownloadUrl, that.grantFileDownloadUrl)
            && Objects.equals(this.preBeautyImageDownloadUrl, that.preBeautyImageDownloadUrl)
            && Objects.equals(this.externalActionJsonDataDownloadUrl, that.externalActionJsonDataDownloadUrl)
            && Objects.equals(this.actionVideoDownloadUrl, that.actionVideoDownloadUrl)
            && Objects.equals(this.postBeautyImageDownloadUrl, that.postBeautyImageDownloadUrl)
            && Objects.equals(this.audioFileDownloadUrl, that.audioFileDownloadUrl)
            && Objects.equals(this.actionMarkFileDownloadUrl, that.actionMarkFileDownloadUrl)
            && Objects.equals(this.actionMarkFileUploadUrl, that.actionMarkFileUploadUrl)
            && Objects.equals(this.operationLogs, that.operationLogs)
            && Objects.equals(this.verifyVideoMattingInfo, that.verifyVideoMattingInfo)
            && Objects.equals(this.commentLogs, that.commentLogs) && Objects.equals(this.samples, that.samples)
            && Objects.equals(this.isMaskFileUploaded, that.isMaskFileUploaded)
            && Objects.equals(this.maskFileDownloadUrl, that.maskFileDownloadUrl)
            && Objects.equals(this.verifyVideoDownloadUrl, that.verifyVideoDownloadUrl)
            && Objects.equals(this.markableVideoDownloadUrl, that.markableVideoDownloadUrl)
            && Objects.equals(this.markableActionVideoDownloadUrl, that.markableActionVideoDownloadUrl)
            && Objects.equals(this.traningVideoMarkInfo, that.traningVideoMarkInfo)
            && Objects.equals(this.inferenceDataProcessVideoMarkInfo, that.inferenceDataProcessVideoMarkInfo)
            && Objects.equals(this.voiceProperties, that.voiceProperties)
            && Objects.equals(this.inferenceDataProcessActionMarkInfo, that.inferenceDataProcessActionMarkInfo)
            && Objects.equals(this.inferenceDataProcessChatActionMarkInfo, that.inferenceDataProcessChatActionMarkInfo)
            && Objects.equals(this.inferenceDataProcessEyeCorrectionMarkInfo,
                that.inferenceDataProcessEyeCorrectionMarkInfo)
            && Objects.equals(this.workerType, that.workerType)
            && Objects.equals(this.voiceTrainJobId, that.voiceTrainJobId)
            && Objects.equals(this.flexusRetryCount, that.flexusRetryCount)
            && Objects.equals(this.audioSourceType, that.audioSourceType)
            && Objects.equals(this.supportedService, that.supportedService)
            && Objects.equals(this.allocatedResource, that.allocatedResource)
            && Objects.equals(this.trainVideoRotationState, that.trainVideoRotationState)
            && Objects.equals(this.actionVideoRotationState, that.actionVideoRotationState)
            && Objects.equals(this.subTrainingJobInfo, that.subTrainingJobInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
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
            isLiveCopy,
            isFastFlexus,
            isOnlyHumanModel,
            optionalTrainingLocation,
            isBackgroundReplacement,
            isOndemandResource,
            trainingVideoDownloadUrl,
            idCardImage1DownloadUrl,
            idCardImage2DownloadUrl,
            grantFileDownloadUrl,
            preBeautyImageDownloadUrl,
            externalActionJsonDataDownloadUrl,
            actionVideoDownloadUrl,
            postBeautyImageDownloadUrl,
            audioFileDownloadUrl,
            actionMarkFileDownloadUrl,
            actionMarkFileUploadUrl,
            operationLogs,
            verifyVideoMattingInfo,
            commentLogs,
            samples,
            isMaskFileUploaded,
            maskFileDownloadUrl,
            verifyVideoDownloadUrl,
            markableVideoDownloadUrl,
            markableActionVideoDownloadUrl,
            traningVideoMarkInfo,
            inferenceDataProcessVideoMarkInfo,
            voiceProperties,
            inferenceDataProcessActionMarkInfo,
            inferenceDataProcessChatActionMarkInfo,
            inferenceDataProcessEyeCorrectionMarkInfo,
            workerType,
            voiceTrainJobId,
            flexusRetryCount,
            audioSourceType,
            supportedService,
            allocatedResource,
            trainVideoRotationState,
            actionVideoRotationState,
            subTrainingJobInfo,
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
        sb.append("    isFlexus: ").append(toIndentedString(isFlexus)).append("\n");
        sb.append("    isLiveCopy: ").append(toIndentedString(isLiveCopy)).append("\n");
        sb.append("    isFastFlexus: ").append(toIndentedString(isFastFlexus)).append("\n");
        sb.append("    isOnlyHumanModel: ").append(toIndentedString(isOnlyHumanModel)).append("\n");
        sb.append("    optionalTrainingLocation: ").append(toIndentedString(optionalTrainingLocation)).append("\n");
        sb.append("    isBackgroundReplacement: ").append(toIndentedString(isBackgroundReplacement)).append("\n");
        sb.append("    isOndemandResource: ").append(toIndentedString(isOndemandResource)).append("\n");
        sb.append("    trainingVideoDownloadUrl: ").append(toIndentedString(trainingVideoDownloadUrl)).append("\n");
        sb.append("    idCardImage1DownloadUrl: ").append(toIndentedString(idCardImage1DownloadUrl)).append("\n");
        sb.append("    idCardImage2DownloadUrl: ").append(toIndentedString(idCardImage2DownloadUrl)).append("\n");
        sb.append("    grantFileDownloadUrl: ").append(toIndentedString(grantFileDownloadUrl)).append("\n");
        sb.append("    preBeautyImageDownloadUrl: ").append(toIndentedString(preBeautyImageDownloadUrl)).append("\n");
        sb.append("    externalActionJsonDataDownloadUrl: ")
            .append(toIndentedString(externalActionJsonDataDownloadUrl))
            .append("\n");
        sb.append("    actionVideoDownloadUrl: ").append(toIndentedString(actionVideoDownloadUrl)).append("\n");
        sb.append("    postBeautyImageDownloadUrl: ").append(toIndentedString(postBeautyImageDownloadUrl)).append("\n");
        sb.append("    audioFileDownloadUrl: ").append(toIndentedString(audioFileDownloadUrl)).append("\n");
        sb.append("    actionMarkFileDownloadUrl: ").append(toIndentedString(actionMarkFileDownloadUrl)).append("\n");
        sb.append("    actionMarkFileUploadUrl: ").append(toIndentedString(actionMarkFileUploadUrl)).append("\n");
        sb.append("    operationLogs: ").append(toIndentedString(operationLogs)).append("\n");
        sb.append("    verifyVideoMattingInfo: ").append(toIndentedString(verifyVideoMattingInfo)).append("\n");
        sb.append("    commentLogs: ").append(toIndentedString(commentLogs)).append("\n");
        sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
        sb.append("    isMaskFileUploaded: ").append(toIndentedString(isMaskFileUploaded)).append("\n");
        sb.append("    maskFileDownloadUrl: ").append(toIndentedString(maskFileDownloadUrl)).append("\n");
        sb.append("    verifyVideoDownloadUrl: ").append(toIndentedString(verifyVideoDownloadUrl)).append("\n");
        sb.append("    markableVideoDownloadUrl: ").append(toIndentedString(markableVideoDownloadUrl)).append("\n");
        sb.append("    markableActionVideoDownloadUrl: ")
            .append(toIndentedString(markableActionVideoDownloadUrl))
            .append("\n");
        sb.append("    traningVideoMarkInfo: ").append(toIndentedString(traningVideoMarkInfo)).append("\n");
        sb.append("    inferenceDataProcessVideoMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessVideoMarkInfo))
            .append("\n");
        sb.append("    voiceProperties: ").append(toIndentedString(voiceProperties)).append("\n");
        sb.append("    inferenceDataProcessActionMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessActionMarkInfo))
            .append("\n");
        sb.append("    inferenceDataProcessChatActionMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessChatActionMarkInfo))
            .append("\n");
        sb.append("    inferenceDataProcessEyeCorrectionMarkInfo: ")
            .append(toIndentedString(inferenceDataProcessEyeCorrectionMarkInfo))
            .append("\n");
        sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
        sb.append("    voiceTrainJobId: ").append(toIndentedString(voiceTrainJobId)).append("\n");
        sb.append("    flexusRetryCount: ").append(toIndentedString(flexusRetryCount)).append("\n");
        sb.append("    audioSourceType: ").append(toIndentedString(audioSourceType)).append("\n");
        sb.append("    supportedService: ").append(toIndentedString(supportedService)).append("\n");
        sb.append("    allocatedResource: ").append(toIndentedString(allocatedResource)).append("\n");
        sb.append("    trainVideoRotationState: ").append(toIndentedString(trainVideoRotationState)).append("\n");
        sb.append("    actionVideoRotationState: ").append(toIndentedString(actionVideoRotationState)).append("\n");
        sb.append("    subTrainingJobInfo: ").append(toIndentedString(subTrainingJobInfo)).append("\n");
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
