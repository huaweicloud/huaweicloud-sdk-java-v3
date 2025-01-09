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
 * SmartLiveRoomBaseInfo
 */
public class SmartLiveRoomBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_name")

    private String roomName;

    /**
     * 直播间类型。 * NORMAL：普通直播间，直播间一直存在，可以反复开播 * TEMP：临时直播间，直播任务结束后自动清理直播间。 * TEMPLATE：直播间模板。
     */
    public static final class RoomTypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final RoomTypeEnum NORMAL = new RoomTypeEnum("NORMAL");

        /**
         * Enum TEMP for value: "TEMP"
         */
        public static final RoomTypeEnum TEMP = new RoomTypeEnum("TEMP");

        /**
         * Enum TEMPLATE for value: "TEMPLATE"
         */
        public static final RoomTypeEnum TEMPLATE = new RoomTypeEnum("TEMPLATE");

        private static final Map<String, RoomTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoomTypeEnum> createStaticFields() {
            Map<String, RoomTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("TEMP", TEMP);
            map.put("TEMPLATE", TEMPLATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoomTypeEnum(String value) {
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
        public static RoomTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoomTypeEnum(value));
        }

        public static RoomTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoomTypeEnum) {
                return this.value.equals(((RoomTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_type")

    private RoomTypeEnum roomType;

    /**
     * 直播间配置状态。 - ENABLE: 直播间正常可用。 - DISABLE： 直播间不可用。不可用原因在error_info中说明。 - BLOCKED：直播间被冻结。冻结原因在error_info中说明。
     */
    public static final class RoomStateEnum {

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final RoomStateEnum ENABLE = new RoomStateEnum("ENABLE");

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final RoomStateEnum DISABLE = new RoomStateEnum("DISABLE");

        /**
         * Enum BLOCKED for value: "BLOCKED"
         */
        public static final RoomStateEnum BLOCKED = new RoomStateEnum("BLOCKED");

        private static final Map<String, RoomStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoomStateEnum> createStaticFields() {
            Map<String, RoomStateEnum> map = new HashMap<>();
            map.put("ENABLE", ENABLE);
            map.put("DISABLE", DISABLE);
            map.put("BLOCKED", BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoomStateEnum(String value) {
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
        public static RoomStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoomStateEnum(value));
        }

        public static RoomStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoomStateEnum) {
                return this.value.equals(((RoomStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_state")

    private RoomStateEnum roomState;

    /**
     * 横竖屏类型。默认值为：VERTICAL。 * LANDSCAPE：横屏。 * VERTICAL： 竖屏。
     */
    public static final class ViewModeEnum {

        /**
         * Enum LANDSCAPE for value: "LANDSCAPE"
         */
        public static final ViewModeEnum LANDSCAPE = new ViewModeEnum("LANDSCAPE");

        /**
         * Enum VERTICAL for value: "VERTICAL"
         */
        public static final ViewModeEnum VERTICAL = new ViewModeEnum("VERTICAL");

        private static final Map<String, ViewModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewModeEnum> createStaticFields() {
            Map<String, ViewModeEnum> map = new HashMap<>();
            map.put("LANDSCAPE", LANDSCAPE);
            map.put("VERTICAL", VERTICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewModeEnum(String value) {
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
        public static ViewModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewModeEnum(value));
        }

        public static ViewModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewModeEnum) {
                return this.value.equals(((ViewModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_mode")

    private ViewModeEnum viewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_config")

    private SharedConfig sharedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_description")

    private String roomDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_url")

    private String coverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    private String thumbnail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_infos")

    private List<ModelInfo> modelInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_start_time")

    private String lastJobStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_end_time")

    private String lastJobEndTime;

    /**
     * 当前直播状态 - WAITING：任务等待执行 - PROCESSING：任务执行中 - SUCCEED：任务处理成功 - FAILED：任务处理时变 - CANCELED：任务取消 - BLOCKED：任务被冻结
     */
    public static final class LastJobStatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final LastJobStatusEnum WAITING = new LastJobStatusEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final LastJobStatusEnum PROCESSING = new LastJobStatusEnum("PROCESSING");

        /**
         * Enum SUCCEED for value: "SUCCEED"
         */
        public static final LastJobStatusEnum SUCCEED = new LastJobStatusEnum("SUCCEED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final LastJobStatusEnum FAILED = new LastJobStatusEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final LastJobStatusEnum CANCELED = new LastJobStatusEnum("CANCELED");

        /**
         * Enum BLOCKED for value: "BLOCKED"
         */
        public static final LastJobStatusEnum BLOCKED = new LastJobStatusEnum("BLOCKED");

        private static final Map<String, LastJobStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LastJobStatusEnum> createStaticFields() {
            Map<String, LastJobStatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            map.put("BLOCKED", BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LastJobStatusEnum(String value) {
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
        public static LastJobStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LastJobStatusEnum(value));
        }

        public static LastJobStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LastJobStatusEnum) {
                return this.value.equals(((LastJobStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_status")

    private LastJobStatusEnum lastJobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priv_data")

    private String privData;

    /**
     * 直播间确认状态。此状态仅用于特定用户需要人工确认场景。 - UNCONFIRM: 未确认 - CONFIRMED：已确认 - REJECT： 拒绝
     */
    public static final class ConfirmStateEnum {

        /**
         * Enum UNCONFIRM for value: "UNCONFIRM"
         */
        public static final ConfirmStateEnum UNCONFIRM = new ConfirmStateEnum("UNCONFIRM");

        /**
         * Enum CONFIRMED for value: "CONFIRMED"
         */
        public static final ConfirmStateEnum CONFIRMED = new ConfirmStateEnum("CONFIRMED");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final ConfirmStateEnum REJECT = new ConfirmStateEnum("REJECT");

        private static final Map<String, ConfirmStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfirmStateEnum> createStaticFields() {
            Map<String, ConfirmStateEnum> map = new HashMap<>();
            map.put("UNCONFIRM", UNCONFIRM);
            map.put("CONFIRMED", CONFIRMED);
            map.put("REJECT", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfirmStateEnum(String value) {
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
        public static ConfirmStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfirmStateEnum(value));
        }

        public static ConfirmStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfirmStateEnum) {
                return this.value.equals(((ConfirmStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_state")

    private ConfirmStateEnum confirmState;

    public SmartLiveRoomBaseInfo withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 直播间ID
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public SmartLiveRoomBaseInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SmartLiveRoomBaseInfo withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * 直播间名称
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public SmartLiveRoomBaseInfo withRoomType(RoomTypeEnum roomType) {
        this.roomType = roomType;
        return this;
    }

    /**
     * 直播间类型。 * NORMAL：普通直播间，直播间一直存在，可以反复开播 * TEMP：临时直播间，直播任务结束后自动清理直播间。 * TEMPLATE：直播间模板。
     * @return roomType
     */
    public RoomTypeEnum getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypeEnum roomType) {
        this.roomType = roomType;
    }

    public SmartLiveRoomBaseInfo withRoomState(RoomStateEnum roomState) {
        this.roomState = roomState;
        return this;
    }

    /**
     * 直播间配置状态。 - ENABLE: 直播间正常可用。 - DISABLE： 直播间不可用。不可用原因在error_info中说明。 - BLOCKED：直播间被冻结。冻结原因在error_info中说明。
     * @return roomState
     */
    public RoomStateEnum getRoomState() {
        return roomState;
    }

    public void setRoomState(RoomStateEnum roomState) {
        this.roomState = roomState;
    }

    public SmartLiveRoomBaseInfo withViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * 横竖屏类型。默认值为：VERTICAL。 * LANDSCAPE：横屏。 * VERTICAL： 竖屏。
     * @return viewMode
     */
    public ViewModeEnum getViewMode() {
        return viewMode;
    }

    public void setViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
    }

    public SmartLiveRoomBaseInfo withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public SmartLiveRoomBaseInfo withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    public SmartLiveRoomBaseInfo withSharedConfig(SharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
        return this;
    }

    public SmartLiveRoomBaseInfo withSharedConfig(Consumer<SharedConfig> sharedConfigSetter) {
        if (this.sharedConfig == null) {
            this.sharedConfig = new SharedConfig();
            sharedConfigSetter.accept(this.sharedConfig);
        }

        return this;
    }

    /**
     * Get sharedConfig
     * @return sharedConfig
     */
    public SharedConfig getSharedConfig() {
        return sharedConfig;
    }

    public void setSharedConfig(SharedConfig sharedConfig) {
        this.sharedConfig = sharedConfig;
    }

    public SmartLiveRoomBaseInfo withRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
        return this;
    }

    /**
     * 直播间描述。
     * @return roomDescription
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public SmartLiveRoomBaseInfo withCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * 直播间封面图URL
     * @return coverUrl
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public SmartLiveRoomBaseInfo withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 直播间封面图URL
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public SmartLiveRoomBaseInfo withModelInfos(List<ModelInfo> modelInfos) {
        this.modelInfos = modelInfos;
        return this;
    }

    public SmartLiveRoomBaseInfo addModelInfosItem(ModelInfo modelInfosItem) {
        if (this.modelInfos == null) {
            this.modelInfos = new ArrayList<>();
        }
        this.modelInfos.add(modelInfosItem);
        return this;
    }

    public SmartLiveRoomBaseInfo withModelInfos(Consumer<List<ModelInfo>> modelInfosSetter) {
        if (this.modelInfos == null) {
            this.modelInfos = new ArrayList<>();
        }
        modelInfosSetter.accept(this.modelInfos);
        return this;
    }

    /**
     * 数字人模型信息
     * @return modelInfos
     */
    public List<ModelInfo> getModelInfos() {
        return modelInfos;
    }

    public void setModelInfos(List<ModelInfo> modelInfos) {
        this.modelInfos = modelInfos;
    }

    public SmartLiveRoomBaseInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SmartLiveRoomBaseInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public SmartLiveRoomBaseInfo withLastJobStartTime(String lastJobStartTime) {
        this.lastJobStartTime = lastJobStartTime;
        return this;
    }

    /**
     * 开始直播时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return lastJobStartTime
     */
    public String getLastJobStartTime() {
        return lastJobStartTime;
    }

    public void setLastJobStartTime(String lastJobStartTime) {
        this.lastJobStartTime = lastJobStartTime;
    }

    public SmartLiveRoomBaseInfo withLastJobEndTime(String lastJobEndTime) {
        this.lastJobEndTime = lastJobEndTime;
        return this;
    }

    /**
     * 结束直播时间，格式遵循：RFC 3339 如“2021-01-10T08:43:17Z”。
     * @return lastJobEndTime
     */
    public String getLastJobEndTime() {
        return lastJobEndTime;
    }

    public void setLastJobEndTime(String lastJobEndTime) {
        this.lastJobEndTime = lastJobEndTime;
    }

    public SmartLiveRoomBaseInfo withLastJobStatus(LastJobStatusEnum lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
        return this;
    }

    /**
     * 当前直播状态 - WAITING：任务等待执行 - PROCESSING：任务执行中 - SUCCEED：任务处理成功 - FAILED：任务处理时变 - CANCELED：任务取消 - BLOCKED：任务被冻结
     * @return lastJobStatus
     */
    public LastJobStatusEnum getLastJobStatus() {
        return lastJobStatus;
    }

    public void setLastJobStatus(LastJobStatusEnum lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
    }

    public SmartLiveRoomBaseInfo withPrivData(String privData) {
        this.privData = privData;
        return this;
    }

    /**
     * 私有数据，用户填写，原样带回。
     * @return privData
     */
    public String getPrivData() {
        return privData;
    }

    public void setPrivData(String privData) {
        this.privData = privData;
    }

    public SmartLiveRoomBaseInfo withConfirmState(ConfirmStateEnum confirmState) {
        this.confirmState = confirmState;
        return this;
    }

    /**
     * 直播间确认状态。此状态仅用于特定用户需要人工确认场景。 - UNCONFIRM: 未确认 - CONFIRMED：已确认 - REJECT： 拒绝
     * @return confirmState
     */
    public ConfirmStateEnum getConfirmState() {
        return confirmState;
    }

    public void setConfirmState(ConfirmStateEnum confirmState) {
        this.confirmState = confirmState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartLiveRoomBaseInfo that = (SmartLiveRoomBaseInfo) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.roomName, that.roomName) && Objects.equals(this.roomType, that.roomType)
            && Objects.equals(this.roomState, that.roomState) && Objects.equals(this.viewMode, that.viewMode)
            && Objects.equals(this.errorInfo, that.errorInfo) && Objects.equals(this.sharedConfig, that.sharedConfig)
            && Objects.equals(this.roomDescription, that.roomDescription)
            && Objects.equals(this.coverUrl, that.coverUrl) && Objects.equals(this.thumbnail, that.thumbnail)
            && Objects.equals(this.modelInfos, that.modelInfos) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.lastJobStartTime, that.lastJobStartTime)
            && Objects.equals(this.lastJobEndTime, that.lastJobEndTime)
            && Objects.equals(this.lastJobStatus, that.lastJobStatus) && Objects.equals(this.privData, that.privData)
            && Objects.equals(this.confirmState, that.confirmState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId,
            projectId,
            roomName,
            roomType,
            roomState,
            viewMode,
            errorInfo,
            sharedConfig,
            roomDescription,
            coverUrl,
            thumbnail,
            modelInfos,
            createTime,
            updateTime,
            lastJobStartTime,
            lastJobEndTime,
            lastJobStatus,
            privData,
            confirmState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartLiveRoomBaseInfo {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
        sb.append("    roomState: ").append(toIndentedString(roomState)).append("\n");
        sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    sharedConfig: ").append(toIndentedString(sharedConfig)).append("\n");
        sb.append("    roomDescription: ").append(toIndentedString(roomDescription)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    modelInfos: ").append(toIndentedString(modelInfos)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastJobStartTime: ").append(toIndentedString(lastJobStartTime)).append("\n");
        sb.append("    lastJobEndTime: ").append(toIndentedString(lastJobEndTime)).append("\n");
        sb.append("    lastJobStatus: ").append(toIndentedString(lastJobStatus)).append("\n");
        sb.append("    privData: ").append(toIndentedString(privData)).append("\n");
        sb.append("    confirmState: ").append(toIndentedString(confirmState)).append("\n");
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
