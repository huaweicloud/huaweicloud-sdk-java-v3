package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StarRocks同步任务信息。
 */
public class StarRocksReplicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database")

    private String sourceDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database")

    private String targetDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 当前状态。Yes:正常;No:异常。
     */
    public static final class StatusEnum {

        /**
         * Enum YES for value: "Yes"
         */
        public static final StatusEnum YES = new StatusEnum("Yes");

        /**
         * Enum NO for value: "No"
         */
        public static final StatusEnum NO = new StatusEnum("No");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Yes", YES);
            map.put("No", NO);
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

    /**
     * 同步阶段。wait:等待同步;incremental:增量同步;full:全量同步;cancelled:删除;paused:暂停同步。
     */
    public static final class StageEnum {

        /**
         * Enum WAIT for value: "wait"
         */
        public static final StageEnum WAIT = new StageEnum("wait");

        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final StageEnum INCREMENTAL = new StageEnum("incremental");

        /**
         * Enum FULL for value: "full"
         */
        public static final StageEnum FULL = new StageEnum("full");

        /**
         * Enum CANCELLED for value: "cancelled"
         */
        public static final StageEnum CANCELLED = new StageEnum("cancelled");

        /**
         * Enum PAUSED for value: "paused"
         */
        public static final StageEnum PAUSED = new StageEnum("paused");

        private static final Map<String, StageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StageEnum> createStaticFields() {
            Map<String, StageEnum> map = new HashMap<>();
            map.put("wait", WAIT);
            map.put("incremental", INCREMENTAL);
            map.put("full", FULL);
            map.put("cancelled", CANCELLED);
            map.put("paused", PAUSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StageEnum(String value) {
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
        public static StageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StageEnum(value));
        }

        public static StageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StageEnum) {
                return this.value.equals(((StageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private StageEnum stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private String percentage;

    /**
     * 追赶阶段。wait:等待同步;incremental:增量同步;full:全量同步;cancelled:删除;paused:暂停同步。
     */
    public static final class CatchupStageEnum {

        /**
         * Enum WAIT for value: "wait"
         */
        public static final CatchupStageEnum WAIT = new CatchupStageEnum("wait");

        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final CatchupStageEnum INCREMENTAL = new CatchupStageEnum("incremental");

        /**
         * Enum FULL for value: "full"
         */
        public static final CatchupStageEnum FULL = new CatchupStageEnum("full");

        /**
         * Enum CANCELLED for value: "cancelled"
         */
        public static final CatchupStageEnum CANCELLED = new CatchupStageEnum("cancelled");

        /**
         * Enum PAUSED for value: "paused"
         */
        public static final CatchupStageEnum PAUSED = new CatchupStageEnum("paused");

        private static final Map<String, CatchupStageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CatchupStageEnum> createStaticFields() {
            Map<String, CatchupStageEnum> map = new HashMap<>();
            map.put("wait", WAIT);
            map.put("incremental", INCREMENTAL);
            map.put("full", FULL);
            map.put("cancelled", CANCELLED);
            map.put("paused", PAUSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CatchupStageEnum(String value) {
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
        public static CatchupStageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CatchupStageEnum(value));
        }

        public static CatchupStageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CatchupStageEnum) {
                return this.value.equals(((CatchupStageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catchup_stage")

    private CatchupStageEnum catchupStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catchup_percentage")

    private String catchupPercentage;

    public StarRocksReplicationInfo withSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
        return this;
    }

    /**
     * GaussDB(for MySQL)数据库。
     * @return sourceDatabase
     */
    public String getSourceDatabase() {
        return sourceDatabase;
    }

    public void setSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
    }

    public StarRocksReplicationInfo withTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }

    /**
     * 目标数据库。
     * @return targetDatabase
     */
    public String getTargetDatabase() {
        return targetDatabase;
    }

    public void setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
    }

    public StarRocksReplicationInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 同步任务名。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public StarRocksReplicationInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 当前状态。Yes:正常;No:异常。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StarRocksReplicationInfo withStage(StageEnum stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 同步阶段。wait:等待同步;incremental:增量同步;full:全量同步;cancelled:删除;paused:暂停同步。
     * @return stage
     */
    public StageEnum getStage() {
        return stage;
    }

    public void setStage(StageEnum stage) {
        this.stage = stage;
    }

    public StarRocksReplicationInfo withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 进度百分比。
     * @return percentage
     */
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public StarRocksReplicationInfo withCatchupStage(CatchupStageEnum catchupStage) {
        this.catchupStage = catchupStage;
        return this;
    }

    /**
     * 追赶阶段。wait:等待同步;incremental:增量同步;full:全量同步;cancelled:删除;paused:暂停同步。
     * @return catchupStage
     */
    public CatchupStageEnum getCatchupStage() {
        return catchupStage;
    }

    public void setCatchupStage(CatchupStageEnum catchupStage) {
        this.catchupStage = catchupStage;
    }

    public StarRocksReplicationInfo withCatchupPercentage(String catchupPercentage) {
        this.catchupPercentage = catchupPercentage;
        return this;
    }

    /**
     * 追赶进度百分比。
     * @return catchupPercentage
     */
    public String getCatchupPercentage() {
        return catchupPercentage;
    }

    public void setCatchupPercentage(String catchupPercentage) {
        this.catchupPercentage = catchupPercentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksReplicationInfo that = (StarRocksReplicationInfo) obj;
        return Objects.equals(this.sourceDatabase, that.sourceDatabase)
            && Objects.equals(this.targetDatabase, that.targetDatabase) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.stage, that.stage)
            && Objects.equals(this.percentage, that.percentage) && Objects.equals(this.catchupStage, that.catchupStage)
            && Objects.equals(this.catchupPercentage, that.catchupPercentage);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceDatabase, targetDatabase, taskName, status, stage, percentage, catchupStage, catchupPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksReplicationInfo {\n");
        sb.append("    sourceDatabase: ").append(toIndentedString(sourceDatabase)).append("\n");
        sb.append("    targetDatabase: ").append(toIndentedString(targetDatabase)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    catchupStage: ").append(toIndentedString(catchupStage)).append("\n");
        sb.append("    catchupPercentage: ").append(toIndentedString(catchupPercentage)).append("\n");
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
