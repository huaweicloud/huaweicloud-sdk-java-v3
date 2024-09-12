package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 操作日志。
 */
public class OperationLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private String operateTime;

    /**
     * 命令执行结果。 * USER_CREATE_JOD：用户开始分身数字人定制 * USER_VERIFYING_SUBMITTED：用户提交审核 * SYSTEM_VERIFY_FAILED：自动审核失败 * SYSTEM_VERIFY_SUCCESS：自动审核成功 * ADMIN_VERIFY_SUCCESS：人工审核通过 * ADMIN_VERIFY_FAILED：人工审核不通过 * SYSTEM_TRAIN_DATA_PREPROCESSING：训练数据预处理中 * SYSTEM_TRAIN_DATA_PREPROCESS_FAILED：训练数据预处理失 * SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS：训练数据预处理成功 * SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING：动作编排原子动作生成中 * SYSTEM_ACTION_GENERATE_DATA_SUCCESS：动作编排原子动作生成成功 * SYSTEM_ACTION_GENERATE_ORI_SUCCESS：动作编排资产数据生成成功 * SYSTEM_ACTION_GENERATE_DATA_FAILED：动作编排原子动作生成失败 * SYSTEM_ACTION_GENERATE_ORI_FAILED：动作编排资产数据生成失败 * SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING：动作编排资产数据生成中 * SYSTEM_TRAINING：开始训练 * ADMIN_STOP_TRAINING_DATA_PREPROCESS：人工中止训练 * ADMIN_STOP_INFERENCE_DATA_PREPROCESS：人工中止推理预处理 * ADMIN_STOP_TRAIN：人工终止训练 * SYSTEM_TRAIN_FAILED：训练失败 * SYSTEM_TRAIN_SUCCESS：训练成功 * SYSTEM_INFERENCE_DATA_PREPROCESSING：推理数据预处理中 * SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED：推理数据预处理失败 * SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS：推理数据预处理成功 * SYSTEM_JOB_SUCCESS：任务处理完成 * ADMIN_MASK_UPLOADED：遮罩文件上传完成（已废弃） * ADMIN_UPDATE_VIDEO：管理员更换视频 * ADMIN_UPDATE_ACTION_VIDEO：管理员更换动作编排视频 * ADMIN_RESET：管理员一键重置 * ADMIN_ACCEPT：管理员通过 * USER_REPAIR：用户修复 * SYSTEM_UPDATE_COVER：更换封面 * ADMIN_SET_SILENCE_REPEAT_NUM：管理员设置静默轮数 * SYSTEM_MARKABLE_VIDEO：标记视频生成任务 * SYSTEM_MASK_VERIFY_VIDEO：校验视频生成任务 * SYSTEM_MASK_VERIFY_VIDEO_SUCCESS：校验视频生成成功 * SYSTEM_MASK_VERIFY_VIDEO_FAILED：校验视频生成失败 * SYSTEM_MARKABLE_VIDEO_SUCCESS：标记视频生成成功 * ADMIN_CONFIRM_ACTION：管理员确认动作 * ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS：人工中止原子动作生成 * ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS：人工中止动作编排 * SYSTEM_COMPILE_FAILED：转编译失败 * SYSTEM_COMPILE_SUCCESS：转编译成功 * SYSTEM_MARKABLE_VIDEO_FAILED：标记视频生成失败 * ADMIN_UPDATE_COMPILE：管理员更新转编译配置 * ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO：管理员更新推理预处里时间段信息 * SYSTEM_EXECUTE_COMPILE：执行转编译 * SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS：自动标记成功 * SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED：自动标记失败 * USER_UPDATE_VIDEO：用户更换视频 * ADMIN_UPDATE_GENERAL_CONFIG：管理员更新通用配置 * ADMIN_MASK_ACTION_TIME：管理员标记 * STOP_COMPILE：人工中止转编译
     */
    public static final class LogTypeEnum {

        /**
         * Enum USER_CREATE_JOD for value: "USER_CREATE_JOD"
         */
        public static final LogTypeEnum USER_CREATE_JOD = new LogTypeEnum("USER_CREATE_JOD");

        /**
         * Enum USER_VERIFYING_SUBMITTED for value: "USER_VERIFYING_SUBMITTED"
         */
        public static final LogTypeEnum USER_VERIFYING_SUBMITTED = new LogTypeEnum("USER_VERIFYING_SUBMITTED");

        /**
         * Enum SYSTEM_VERIFY_FAILED for value: "SYSTEM_VERIFY_FAILED"
         */
        public static final LogTypeEnum SYSTEM_VERIFY_FAILED = new LogTypeEnum("SYSTEM_VERIFY_FAILED");

        /**
         * Enum ADMIN_UPDATE_BEAUTY_LEVEL for value: "ADMIN_UPDATE_BEAUTY_LEVEL"
         */
        public static final LogTypeEnum ADMIN_UPDATE_BEAUTY_LEVEL = new LogTypeEnum("ADMIN_UPDATE_BEAUTY_LEVEL");

        /**
         * Enum SYSTEM_VERIFY_SUCCESS for value: "SYSTEM_VERIFY_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_VERIFY_SUCCESS = new LogTypeEnum("SYSTEM_VERIFY_SUCCESS");

        /**
         * Enum ADMIN_VERIFY_SUCCESS for value: "ADMIN_VERIFY_SUCCESS"
         */
        public static final LogTypeEnum ADMIN_VERIFY_SUCCESS = new LogTypeEnum("ADMIN_VERIFY_SUCCESS");

        /**
         * Enum ADMIN_VERIFY_FAILED for value: "ADMIN_VERIFY_FAILED"
         */
        public static final LogTypeEnum ADMIN_VERIFY_FAILED = new LogTypeEnum("ADMIN_VERIFY_FAILED");

        /**
         * Enum SYSTEM_TRAIN_DATA_PREPROCESSING for value: "SYSTEM_TRAIN_DATA_PREPROCESSING"
         */
        public static final LogTypeEnum SYSTEM_TRAIN_DATA_PREPROCESSING =
            new LogTypeEnum("SYSTEM_TRAIN_DATA_PREPROCESSING");

        /**
         * Enum SYSTEM_TRAIN_DATA_PREPROCESS_FAILED for value: "SYSTEM_TRAIN_DATA_PREPROCESS_FAILED"
         */
        public static final LogTypeEnum SYSTEM_TRAIN_DATA_PREPROCESS_FAILED =
            new LogTypeEnum("SYSTEM_TRAIN_DATA_PREPROCESS_FAILED");

        /**
         * Enum SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS for value: "SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS =
            new LogTypeEnum("SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS");

        /**
         * Enum SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING for value: "SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING"
         */
        public static final LogTypeEnum SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING =
            new LogTypeEnum("SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING");

        /**
         * Enum SYSTEM_ACTION_GENERATE_DATA_SUCCESS for value: "SYSTEM_ACTION_GENERATE_DATA_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_ACTION_GENERATE_DATA_SUCCESS =
            new LogTypeEnum("SYSTEM_ACTION_GENERATE_DATA_SUCCESS");

        /**
         * Enum SYSTEM_ACTION_GENERATE_ORI_SUCCESS for value: "SYSTEM_ACTION_GENERATE_ORI_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_ACTION_GENERATE_ORI_SUCCESS =
            new LogTypeEnum("SYSTEM_ACTION_GENERATE_ORI_SUCCESS");

        /**
         * Enum SYSTEM_ACTION_GENERATE_DATA_FAILED for value: "SYSTEM_ACTION_GENERATE_DATA_FAILED"
         */
        public static final LogTypeEnum SYSTEM_ACTION_GENERATE_DATA_FAILED =
            new LogTypeEnum("SYSTEM_ACTION_GENERATE_DATA_FAILED");

        /**
         * Enum SYSTEM_ACTION_GENERATE_ORI_FAILED for value: "SYSTEM_ACTION_GENERATE_ORI_FAILED"
         */
        public static final LogTypeEnum SYSTEM_ACTION_GENERATE_ORI_FAILED =
            new LogTypeEnum("SYSTEM_ACTION_GENERATE_ORI_FAILED");

        /**
         * Enum SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING for value: "SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING"
         */
        public static final LogTypeEnum SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING =
            new LogTypeEnum("SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING");

        /**
         * Enum SYSTEM_TRAINING for value: "SYSTEM_TRAINING"
         */
        public static final LogTypeEnum SYSTEM_TRAINING = new LogTypeEnum("SYSTEM_TRAINING");

        /**
         * Enum ADMIN_STOP_TRAINING_DATA_PREPROCESS for value: "ADMIN_STOP_TRAINING_DATA_PREPROCESS"
         */
        public static final LogTypeEnum ADMIN_STOP_TRAINING_DATA_PREPROCESS =
            new LogTypeEnum("ADMIN_STOP_TRAINING_DATA_PREPROCESS");

        /**
         * Enum ADMIN_STOP_BEAUTY_PREPROCESS for value: "ADMIN_STOP_BEAUTY_PREPROCESS"
         */
        public static final LogTypeEnum ADMIN_STOP_BEAUTY_PREPROCESS = new LogTypeEnum("ADMIN_STOP_BEAUTY_PREPROCESS");

        /**
         * Enum ADMIN_STOP_INFERENCE_DATA_PREPROCESS for value: "ADMIN_STOP_INFERENCE_DATA_PREPROCESS"
         */
        public static final LogTypeEnum ADMIN_STOP_INFERENCE_DATA_PREPROCESS =
            new LogTypeEnum("ADMIN_STOP_INFERENCE_DATA_PREPROCESS");

        /**
         * Enum ADMIN_STOP_TRAIN for value: "ADMIN_STOP_TRAIN"
         */
        public static final LogTypeEnum ADMIN_STOP_TRAIN = new LogTypeEnum("ADMIN_STOP_TRAIN");

        /**
         * Enum SYSTEM_TRAIN_FAILED for value: "SYSTEM_TRAIN_FAILED"
         */
        public static final LogTypeEnum SYSTEM_TRAIN_FAILED = new LogTypeEnum("SYSTEM_TRAIN_FAILED");

        /**
         * Enum SYSTEM_TRAIN_SUCCESS for value: "SYSTEM_TRAIN_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_TRAIN_SUCCESS = new LogTypeEnum("SYSTEM_TRAIN_SUCCESS");

        /**
         * Enum SYSTEM_INFERENCE_DATA_PREPROCESSING for value: "SYSTEM_INFERENCE_DATA_PREPROCESSING"
         */
        public static final LogTypeEnum SYSTEM_INFERENCE_DATA_PREPROCESSING =
            new LogTypeEnum("SYSTEM_INFERENCE_DATA_PREPROCESSING");

        /**
         * Enum SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED for value: "SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED"
         */
        public static final LogTypeEnum SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED =
            new LogTypeEnum("SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED");

        /**
         * Enum SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS for value: "SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS =
            new LogTypeEnum("SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS");

        /**
         * Enum SYSTEM_JOB_SUCCESS for value: "SYSTEM_JOB_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_JOB_SUCCESS = new LogTypeEnum("SYSTEM_JOB_SUCCESS");

        /**
         * Enum ADMIN_MASK_UPLOADED for value: "ADMIN_MASK_UPLOADED"
         */
        public static final LogTypeEnum ADMIN_MASK_UPLOADED = new LogTypeEnum("ADMIN_MASK_UPLOADED");

        /**
         * Enum ADMIN_UPDATE_VIDEO for value: "ADMIN_UPDATE_VIDEO"
         */
        public static final LogTypeEnum ADMIN_UPDATE_VIDEO = new LogTypeEnum("ADMIN_UPDATE_VIDEO");

        /**
         * Enum ADMIN_UPDATE_ACTION_VIDEO for value: "ADMIN_UPDATE_ACTION_VIDEO"
         */
        public static final LogTypeEnum ADMIN_UPDATE_ACTION_VIDEO = new LogTypeEnum("ADMIN_UPDATE_ACTION_VIDEO");

        /**
         * Enum ADMIN_RESET for value: "ADMIN_RESET"
         */
        public static final LogTypeEnum ADMIN_RESET = new LogTypeEnum("ADMIN_RESET");

        /**
         * Enum ADMIN_ACCEPT for value: "ADMIN_ACCEPT"
         */
        public static final LogTypeEnum ADMIN_ACCEPT = new LogTypeEnum("ADMIN_ACCEPT");

        /**
         * Enum USER_REPAIR for value: "USER_REPAIR"
         */
        public static final LogTypeEnum USER_REPAIR = new LogTypeEnum("USER_REPAIR");

        /**
         * Enum SYSTEM_UPDATE_COVER for value: "SYSTEM_UPDATE_COVER"
         */
        public static final LogTypeEnum SYSTEM_UPDATE_COVER = new LogTypeEnum("SYSTEM_UPDATE_COVER");

        /**
         * Enum ADMIN_SET_SILENCE_REPEAT_NUM for value: "ADMIN_SET_SILENCE_REPEAT_NUM"
         */
        public static final LogTypeEnum ADMIN_SET_SILENCE_REPEAT_NUM = new LogTypeEnum("ADMIN_SET_SILENCE_REPEAT_NUM");

        /**
         * Enum SYSTEM_MARKABLE_VIDEO for value: "SYSTEM_MARKABLE_VIDEO"
         */
        public static final LogTypeEnum SYSTEM_MARKABLE_VIDEO = new LogTypeEnum("SYSTEM_MARKABLE_VIDEO");

        /**
         * Enum SYSTEM_MASK_VERIFY_VIDEO for value: "SYSTEM_MASK_VERIFY_VIDEO"
         */
        public static final LogTypeEnum SYSTEM_MASK_VERIFY_VIDEO = new LogTypeEnum("SYSTEM_MASK_VERIFY_VIDEO");

        /**
         * Enum SYSTEM_MASK_VERIFY_VIDEO_SUCCESS for value: "SYSTEM_MASK_VERIFY_VIDEO_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_MASK_VERIFY_VIDEO_SUCCESS =
            new LogTypeEnum("SYSTEM_MASK_VERIFY_VIDEO_SUCCESS");

        /**
         * Enum SYSTEM_MASK_VERIFY_VIDEO_FAILED for value: "SYSTEM_MASK_VERIFY_VIDEO_FAILED"
         */
        public static final LogTypeEnum SYSTEM_MASK_VERIFY_VIDEO_FAILED =
            new LogTypeEnum("SYSTEM_MASK_VERIFY_VIDEO_FAILED");

        /**
         * Enum SYSTEM_MARKABLE_VIDEO_SUCCESS for value: "SYSTEM_MARKABLE_VIDEO_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_MARKABLE_VIDEO_SUCCESS =
            new LogTypeEnum("SYSTEM_MARKABLE_VIDEO_SUCCESS");

        /**
         * Enum SYSTEM_BEAUTY_PREPROCESSING for value: "SYSTEM_BEAUTY_PREPROCESSING"
         */
        public static final LogTypeEnum SYSTEM_BEAUTY_PREPROCESSING = new LogTypeEnum("SYSTEM_BEAUTY_PREPROCESSING");

        /**
         * Enum SYSTEM_BEAUTY_PREPROCESS_FAILED for value: "SYSTEM_BEAUTY_PREPROCESS_FAILED"
         */
        public static final LogTypeEnum SYSTEM_BEAUTY_PREPROCESS_FAILED =
            new LogTypeEnum("SYSTEM_BEAUTY_PREPROCESS_FAILED");

        /**
         * Enum ADMIN_CONFIRM_ACTION for value: "ADMIN_CONFIRM_ACTION"
         */
        public static final LogTypeEnum ADMIN_CONFIRM_ACTION = new LogTypeEnum("ADMIN_CONFIRM_ACTION");

        /**
         * Enum ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS for value: "ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS"
         */
        public static final LogTypeEnum ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS =
            new LogTypeEnum("ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS");

        /**
         * Enum ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS for value: "ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS"
         */
        public static final LogTypeEnum ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS =
            new LogTypeEnum("ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS");

        /**
         * Enum SYSTEM_BEAUTY_PREPROCESS_SUCCESS for value: "SYSTEM_BEAUTY_PREPROCESS_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_BEAUTY_PREPROCESS_SUCCESS =
            new LogTypeEnum("SYSTEM_BEAUTY_PREPROCESS_SUCCESS");

        /**
         * Enum SYSTEM_COMPILE_FAILED for value: "SYSTEM_COMPILE_FAILED"
         */
        public static final LogTypeEnum SYSTEM_COMPILE_FAILED = new LogTypeEnum("SYSTEM_COMPILE_FAILED");

        /**
         * Enum SYSTEM_COMPILE_SUCCESS for value: "SYSTEM_COMPILE_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_COMPILE_SUCCESS = new LogTypeEnum("SYSTEM_COMPILE_SUCCESS");

        /**
         * Enum SYSTEM_MARKABLE_VIDEO_FAILED for value: "SYSTEM_MARKABLE_VIDEO_FAILED"
         */
        public static final LogTypeEnum SYSTEM_MARKABLE_VIDEO_FAILED = new LogTypeEnum("SYSTEM_MARKABLE_VIDEO_FAILED");

        /**
         * Enum ADMIN_UPDATE_COMPILE for value: "ADMIN_UPDATE_COMPILE"
         */
        public static final LogTypeEnum ADMIN_UPDATE_COMPILE = new LogTypeEnum("ADMIN_UPDATE_COMPILE");

        /**
         * Enum ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO for value: "ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO"
         */
        public static final LogTypeEnum ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO =
            new LogTypeEnum("ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO");

        /**
         * Enum SYSTEM_EXECUTE_COMPILE for value: "SYSTEM_EXECUTE_COMPILE"
         */
        public static final LogTypeEnum SYSTEM_EXECUTE_COMPILE = new LogTypeEnum("SYSTEM_EXECUTE_COMPILE");

        /**
         * Enum SYSTEM_EXECUTE_BEAUTY for value: "SYSTEM_EXECUTE_BEAUTY"
         */
        public static final LogTypeEnum SYSTEM_EXECUTE_BEAUTY = new LogTypeEnum("SYSTEM_EXECUTE_BEAUTY");

        /**
         * Enum SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS for value: "SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS"
         */
        public static final LogTypeEnum SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS =
            new LogTypeEnum("SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS");

        /**
         * Enum SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED for value: "SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED"
         */
        public static final LogTypeEnum SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED =
            new LogTypeEnum("SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED");

        /**
         * Enum USER_UPDATE_VIDEO for value: "USER_UPDATE_VIDEO"
         */
        public static final LogTypeEnum USER_UPDATE_VIDEO = new LogTypeEnum("USER_UPDATE_VIDEO");

        /**
         * Enum ADMIN_UPDATE_GENERAL_CONFIG for value: "ADMIN_UPDATE_GENERAL_CONFIG"
         */
        public static final LogTypeEnum ADMIN_UPDATE_GENERAL_CONFIG = new LogTypeEnum("ADMIN_UPDATE_GENERAL_CONFIG");

        /**
         * Enum ADMIN_MASK_ACTION_TIME for value: "ADMIN_MASK_ACTION_TIME"
         */
        public static final LogTypeEnum ADMIN_MASK_ACTION_TIME = new LogTypeEnum("ADMIN_MASK_ACTION_TIME");

        /**
         * Enum STOP_COMPILE for value: "STOP_COMPILE"
         */
        public static final LogTypeEnum STOP_COMPILE = new LogTypeEnum("STOP_COMPILE");

        private static final Map<String, LogTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTypeEnum> createStaticFields() {
            Map<String, LogTypeEnum> map = new HashMap<>();
            map.put("USER_CREATE_JOD", USER_CREATE_JOD);
            map.put("USER_VERIFYING_SUBMITTED", USER_VERIFYING_SUBMITTED);
            map.put("SYSTEM_VERIFY_FAILED", SYSTEM_VERIFY_FAILED);
            map.put("ADMIN_UPDATE_BEAUTY_LEVEL", ADMIN_UPDATE_BEAUTY_LEVEL);
            map.put("SYSTEM_VERIFY_SUCCESS", SYSTEM_VERIFY_SUCCESS);
            map.put("ADMIN_VERIFY_SUCCESS", ADMIN_VERIFY_SUCCESS);
            map.put("ADMIN_VERIFY_FAILED", ADMIN_VERIFY_FAILED);
            map.put("SYSTEM_TRAIN_DATA_PREPROCESSING", SYSTEM_TRAIN_DATA_PREPROCESSING);
            map.put("SYSTEM_TRAIN_DATA_PREPROCESS_FAILED", SYSTEM_TRAIN_DATA_PREPROCESS_FAILED);
            map.put("SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS", SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS);
            map.put("SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING", SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING);
            map.put("SYSTEM_ACTION_GENERATE_DATA_SUCCESS", SYSTEM_ACTION_GENERATE_DATA_SUCCESS);
            map.put("SYSTEM_ACTION_GENERATE_ORI_SUCCESS", SYSTEM_ACTION_GENERATE_ORI_SUCCESS);
            map.put("SYSTEM_ACTION_GENERATE_DATA_FAILED", SYSTEM_ACTION_GENERATE_DATA_FAILED);
            map.put("SYSTEM_ACTION_GENERATE_ORI_FAILED", SYSTEM_ACTION_GENERATE_ORI_FAILED);
            map.put("SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING", SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING);
            map.put("SYSTEM_TRAINING", SYSTEM_TRAINING);
            map.put("ADMIN_STOP_TRAINING_DATA_PREPROCESS", ADMIN_STOP_TRAINING_DATA_PREPROCESS);
            map.put("ADMIN_STOP_BEAUTY_PREPROCESS", ADMIN_STOP_BEAUTY_PREPROCESS);
            map.put("ADMIN_STOP_INFERENCE_DATA_PREPROCESS", ADMIN_STOP_INFERENCE_DATA_PREPROCESS);
            map.put("ADMIN_STOP_TRAIN", ADMIN_STOP_TRAIN);
            map.put("SYSTEM_TRAIN_FAILED", SYSTEM_TRAIN_FAILED);
            map.put("SYSTEM_TRAIN_SUCCESS", SYSTEM_TRAIN_SUCCESS);
            map.put("SYSTEM_INFERENCE_DATA_PREPROCESSING", SYSTEM_INFERENCE_DATA_PREPROCESSING);
            map.put("SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED", SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED);
            map.put("SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS", SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS);
            map.put("SYSTEM_JOB_SUCCESS", SYSTEM_JOB_SUCCESS);
            map.put("ADMIN_MASK_UPLOADED", ADMIN_MASK_UPLOADED);
            map.put("ADMIN_UPDATE_VIDEO", ADMIN_UPDATE_VIDEO);
            map.put("ADMIN_UPDATE_ACTION_VIDEO", ADMIN_UPDATE_ACTION_VIDEO);
            map.put("ADMIN_RESET", ADMIN_RESET);
            map.put("ADMIN_ACCEPT", ADMIN_ACCEPT);
            map.put("USER_REPAIR", USER_REPAIR);
            map.put("SYSTEM_UPDATE_COVER", SYSTEM_UPDATE_COVER);
            map.put("ADMIN_SET_SILENCE_REPEAT_NUM", ADMIN_SET_SILENCE_REPEAT_NUM);
            map.put("SYSTEM_MARKABLE_VIDEO", SYSTEM_MARKABLE_VIDEO);
            map.put("SYSTEM_MASK_VERIFY_VIDEO", SYSTEM_MASK_VERIFY_VIDEO);
            map.put("SYSTEM_MASK_VERIFY_VIDEO_SUCCESS", SYSTEM_MASK_VERIFY_VIDEO_SUCCESS);
            map.put("SYSTEM_MASK_VERIFY_VIDEO_FAILED", SYSTEM_MASK_VERIFY_VIDEO_FAILED);
            map.put("SYSTEM_MARKABLE_VIDEO_SUCCESS", SYSTEM_MARKABLE_VIDEO_SUCCESS);
            map.put("SYSTEM_BEAUTY_PREPROCESSING", SYSTEM_BEAUTY_PREPROCESSING);
            map.put("SYSTEM_BEAUTY_PREPROCESS_FAILED", SYSTEM_BEAUTY_PREPROCESS_FAILED);
            map.put("ADMIN_CONFIRM_ACTION", ADMIN_CONFIRM_ACTION);
            map.put("ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS", ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS);
            map.put("ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS", ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS);
            map.put("SYSTEM_BEAUTY_PREPROCESS_SUCCESS", SYSTEM_BEAUTY_PREPROCESS_SUCCESS);
            map.put("SYSTEM_COMPILE_FAILED", SYSTEM_COMPILE_FAILED);
            map.put("SYSTEM_COMPILE_SUCCESS", SYSTEM_COMPILE_SUCCESS);
            map.put("SYSTEM_MARKABLE_VIDEO_FAILED", SYSTEM_MARKABLE_VIDEO_FAILED);
            map.put("ADMIN_UPDATE_COMPILE", ADMIN_UPDATE_COMPILE);
            map.put("ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO", ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO);
            map.put("SYSTEM_EXECUTE_COMPILE", SYSTEM_EXECUTE_COMPILE);
            map.put("SYSTEM_EXECUTE_BEAUTY", SYSTEM_EXECUTE_BEAUTY);
            map.put("SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS", SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS);
            map.put("SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED", SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED);
            map.put("USER_UPDATE_VIDEO", USER_UPDATE_VIDEO);
            map.put("ADMIN_UPDATE_GENERAL_CONFIG", ADMIN_UPDATE_GENERAL_CONFIG);
            map.put("ADMIN_MASK_ACTION_TIME", ADMIN_MASK_ACTION_TIME);
            map.put("STOP_COMPILE", STOP_COMPILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTypeEnum(String value) {
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
        public static LogTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogTypeEnum(value));
        }

        public static LogTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTypeEnum) {
                return this.value.equals(((LogTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private LogTypeEnum logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_description")

    private String logDescription;

    /**
     * 操作人员。 * USER：用户 * ADMIN：管理员 * SYSTEM：系统
     */
    public static final class OperateUserEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final OperateUserEnum USER = new OperateUserEnum("USER");

        /**
         * Enum ADMIN for value: "ADMIN"
         */
        public static final OperateUserEnum ADMIN = new OperateUserEnum("ADMIN");

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final OperateUserEnum SYSTEM = new OperateUserEnum("SYSTEM");

        private static final Map<String, OperateUserEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateUserEnum> createStaticFields() {
            Map<String, OperateUserEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("ADMIN", ADMIN);
            map.put("SYSTEM", SYSTEM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateUserEnum(String value) {
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
        public static OperateUserEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateUserEnum(value));
        }

        public static OperateUserEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateUserEnum) {
                return this.value.equals(((OperateUserEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_user")

    private OperateUserEnum operateUser;

    public OperationLogInfo withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 操作时间,格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public OperationLogInfo withLogType(LogTypeEnum logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 命令执行结果。 * USER_CREATE_JOD：用户开始分身数字人定制 * USER_VERIFYING_SUBMITTED：用户提交审核 * SYSTEM_VERIFY_FAILED：自动审核失败 * SYSTEM_VERIFY_SUCCESS：自动审核成功 * ADMIN_VERIFY_SUCCESS：人工审核通过 * ADMIN_VERIFY_FAILED：人工审核不通过 * SYSTEM_TRAIN_DATA_PREPROCESSING：训练数据预处理中 * SYSTEM_TRAIN_DATA_PREPROCESS_FAILED：训练数据预处理失 * SYSTEM_TRAIN_DATA_PREPROCESS_SUCCESS：训练数据预处理成功 * SYSTEM_ACTION_GENERATE_DATA_PREPROCESSING：动作编排原子动作生成中 * SYSTEM_ACTION_GENERATE_DATA_SUCCESS：动作编排原子动作生成成功 * SYSTEM_ACTION_GENERATE_ORI_SUCCESS：动作编排资产数据生成成功 * SYSTEM_ACTION_GENERATE_DATA_FAILED：动作编排原子动作生成失败 * SYSTEM_ACTION_GENERATE_ORI_FAILED：动作编排资产数据生成失败 * SYSTEM_ACTION_GENERATE_ORI_PREPROCESSING：动作编排资产数据生成中 * SYSTEM_TRAINING：开始训练 * ADMIN_STOP_TRAINING_DATA_PREPROCESS：人工中止训练 * ADMIN_STOP_INFERENCE_DATA_PREPROCESS：人工中止推理预处理 * ADMIN_STOP_TRAIN：人工终止训练 * SYSTEM_TRAIN_FAILED：训练失败 * SYSTEM_TRAIN_SUCCESS：训练成功 * SYSTEM_INFERENCE_DATA_PREPROCESSING：推理数据预处理中 * SYSTEM_INFERENCE_DATA_PREPROCESS_FAILED：推理数据预处理失败 * SYSTEM_INFERENCE_DATA_PREPROCESS_SUCCESS：推理数据预处理成功 * SYSTEM_JOB_SUCCESS：任务处理完成 * ADMIN_MASK_UPLOADED：遮罩文件上传完成（已废弃） * ADMIN_UPDATE_VIDEO：管理员更换视频 * ADMIN_UPDATE_ACTION_VIDEO：管理员更换动作编排视频 * ADMIN_RESET：管理员一键重置 * ADMIN_ACCEPT：管理员通过 * USER_REPAIR：用户修复 * SYSTEM_UPDATE_COVER：更换封面 * ADMIN_SET_SILENCE_REPEAT_NUM：管理员设置静默轮数 * SYSTEM_MARKABLE_VIDEO：标记视频生成任务 * SYSTEM_MASK_VERIFY_VIDEO：校验视频生成任务 * SYSTEM_MASK_VERIFY_VIDEO_SUCCESS：校验视频生成成功 * SYSTEM_MASK_VERIFY_VIDEO_FAILED：校验视频生成失败 * SYSTEM_MARKABLE_VIDEO_SUCCESS：标记视频生成成功 * ADMIN_CONFIRM_ACTION：管理员确认动作 * ADMIN_STOP_ACTION_GENERATE_DATA_PREPROCESS：人工中止原子动作生成 * ADMIN_STOP_ACTION_GENERATE_ORI_PREPROCESS：人工中止动作编排 * SYSTEM_COMPILE_FAILED：转编译失败 * SYSTEM_COMPILE_SUCCESS：转编译成功 * SYSTEM_MARKABLE_VIDEO_FAILED：标记视频生成失败 * ADMIN_UPDATE_COMPILE：管理员更新转编译配置 * ADMIN_UPDATE_INFERENCE_DATA_PROCESS_VIDEO：管理员更新推理预处里时间段信息 * SYSTEM_EXECUTE_COMPILE：执行转编译 * SYSTEM_MASK_VIDEO_AND_ACTION_TIME_SUCCESS：自动标记成功 * SYSTEM_MASK_VIDEO_AND_ACTION_TIME_FAILED：自动标记失败 * USER_UPDATE_VIDEO：用户更换视频 * ADMIN_UPDATE_GENERAL_CONFIG：管理员更新通用配置 * ADMIN_MASK_ACTION_TIME：管理员标记 * STOP_COMPILE：人工中止转编译
     * @return logType
     */
    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(LogTypeEnum logType) {
        this.logType = logType;
    }

    public OperationLogInfo withLogDescription(String logDescription) {
        this.logDescription = logDescription;
        return this;
    }

    /**
     * 日志描述。用于记录人工审核不通过时的审核意见和DHTS、DHPS上报的错误信息。
     * @return logDescription
     */
    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }

    public OperationLogInfo withOperateUser(OperateUserEnum operateUser) {
        this.operateUser = operateUser;
        return this;
    }

    /**
     * 操作人员。 * USER：用户 * ADMIN：管理员 * SYSTEM：系统
     * @return operateUser
     */
    public OperateUserEnum getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(OperateUserEnum operateUser) {
        this.operateUser = operateUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationLogInfo that = (OperationLogInfo) obj;
        return Objects.equals(this.operateTime, that.operateTime) && Objects.equals(this.logType, that.logType)
            && Objects.equals(this.logDescription, that.logDescription)
            && Objects.equals(this.operateUser, that.operateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateTime, logType, logDescription, operateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationLogInfo {\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    logDescription: ").append(toIndentedString(logDescription)).append("\n");
        sb.append("    operateUser: ").append(toIndentedString(operateUser)).append("\n");
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
