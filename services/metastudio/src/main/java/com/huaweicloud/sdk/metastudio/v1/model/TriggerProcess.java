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
 * 触发器处理
 */
public class TriggerProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_window")

    private Integer timeWindow;

    /**
     * **参数解释**： 回复类型。 **约束限制**： 不涉及 **取值范围**： * SYSTEM_REPLY：系统自动回复预先设置的话术。 * CALLBACK：回调给其他服务，携带设置的话术。 * SYSTEM_REPLY_AND_CALLBACK：系统自动回复预先设置的话术，同时回调给用户,携带设置的话术。 * SHOW_LAYER：仅显示叠加图层，不影响话术。 * INTELLIGENT_REPLY：使用配置的大模型生成回复话术。  **默认取值**： 不涉及
     */
    public static final class ReplyModeEnum {

        /**
         * Enum SYSTEM_REPLY for value: "SYSTEM_REPLY"
         */
        public static final ReplyModeEnum SYSTEM_REPLY = new ReplyModeEnum("SYSTEM_REPLY");

        /**
         * Enum CALLBACK for value: "CALLBACK"
         */
        public static final ReplyModeEnum CALLBACK = new ReplyModeEnum("CALLBACK");

        /**
         * Enum SYSTEM_REPLY_AND_CALLBACK for value: "SYSTEM_REPLY_AND_CALLBACK"
         */
        public static final ReplyModeEnum SYSTEM_REPLY_AND_CALLBACK = new ReplyModeEnum("SYSTEM_REPLY_AND_CALLBACK");

        /**
         * Enum SHOW_LAYER for value: "SHOW_LAYER"
         */
        public static final ReplyModeEnum SHOW_LAYER = new ReplyModeEnum("SHOW_LAYER");

        /**
         * Enum INTELLIGENT_REPLY for value: "INTELLIGENT_REPLY"
         */
        public static final ReplyModeEnum INTELLIGENT_REPLY = new ReplyModeEnum("INTELLIGENT_REPLY");

        private static final Map<String, ReplyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplyModeEnum> createStaticFields() {
            Map<String, ReplyModeEnum> map = new HashMap<>();
            map.put("SYSTEM_REPLY", SYSTEM_REPLY);
            map.put("CALLBACK", CALLBACK);
            map.put("SYSTEM_REPLY_AND_CALLBACK", SYSTEM_REPLY_AND_CALLBACK);
            map.put("SHOW_LAYER", SHOW_LAYER);
            map.put("INTELLIGENT_REPLY", INTELLIGENT_REPLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplyModeEnum(String value) {
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
        public static ReplyModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplyModeEnum(value));
        }

        public static ReplyModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplyModeEnum) {
                return this.value.equals(((ReplyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_mode")

    private ReplyModeEnum replyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_config")

    private SmartLayerConfig layerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_layer_config")

    private SmartLayerConfig extraLayerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_texts")

    private List<String> replyTexts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_audios")

    private List<ReplyAudioInfo> replyAudios = null;

    /**
     * **参数解释**： 回复话术选择次序。 **约束限制**： 不涉及 **取值范围**： * RANDOM：随机 * ORDER：顺序循环  **默认取值**： 不涉及
     */
    public static final class ReplyOrderEnum {

        /**
         * Enum RANDOM for value: "RANDOM"
         */
        public static final ReplyOrderEnum RANDOM = new ReplyOrderEnum("RANDOM");

        /**
         * Enum ORDER for value: "ORDER"
         */
        public static final ReplyOrderEnum ORDER = new ReplyOrderEnum("ORDER");

        private static final Map<String, ReplyOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplyOrderEnum> createStaticFields() {
            Map<String, ReplyOrderEnum> map = new HashMap<>();
            map.put("RANDOM", RANDOM);
            map.put("ORDER", ORDER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplyOrderEnum(String value) {
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
        public static ReplyOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplyOrderEnum(value));
        }

        public static ReplyOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplyOrderEnum) {
                return this.value.equals(((ReplyOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_order")

    private ReplyOrderEnum replyOrder;

    /**
     * **参数解释**： 回复角色。 **约束限制**： 不涉及 **取值范围**： * STREAMER：主播 * CO_STREAMER：助播，仅声音。
     */
    public static final class ReplyRoleEnum {

        /**
         * Enum STREAMER for value: "STREAMER"
         */
        public static final ReplyRoleEnum STREAMER = new ReplyRoleEnum("STREAMER");

        /**
         * Enum CO_STREAMER for value: "CO_STREAMER"
         */
        public static final ReplyRoleEnum CO_STREAMER = new ReplyRoleEnum("CO_STREAMER");

        private static final Map<String, ReplyRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplyRoleEnum> createStaticFields() {
            Map<String, ReplyRoleEnum> map = new HashMap<>();
            map.put("STREAMER", STREAMER);
            map.put("CO_STREAMER", CO_STREAMER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplyRoleEnum(String value) {
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
        public static ReplyRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplyRoleEnum(value));
        }

        public static ReplyRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplyRoleEnum) {
                return this.value.equals(((ReplyRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_role")

    private ReplyRoleEnum replyRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_id")

    private String robotId;

    /**
     * 回复播放类型。 - APPEND：追加，放置在场景播放队列尾部 - INSERT： 插入，在两个音频文件，或者文本句末添加。 - PLAY_NOW : 立即插入，收到指令后，立即播放，无需等待句末。
     */
    public static final class PlayTypeEnum {

        /**
         * Enum APPEND for value: "APPEND"
         */
        public static final PlayTypeEnum APPEND = new PlayTypeEnum("APPEND");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final PlayTypeEnum INSERT = new PlayTypeEnum("INSERT");

        /**
         * Enum PLAY_NOW for value: "PLAY_NOW"
         */
        public static final PlayTypeEnum PLAY_NOW = new PlayTypeEnum("PLAY_NOW");

        private static final Map<String, PlayTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayTypeEnum> createStaticFields() {
            Map<String, PlayTypeEnum> map = new HashMap<>();
            map.put("APPEND", APPEND);
            map.put("INSERT", INSERT);
            map.put("PLAY_NOW", PLAY_NOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayTypeEnum(String value) {
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
        public static PlayTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayTypeEnum(value));
        }

        public static PlayTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayTypeEnum) {
                return this.value.equals(((PlayTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_type")

    private PlayTypeEnum playType;

    public TriggerProcess withTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    /**
     * **参数解释**： 处理抑制时长。单位秒。 - -1：表示整场直播仅触发一次。 - 0：表示无抑制，每次都触发。 - 其他值n：表示n秒内仅触发一次。  **约束限制**： 不涉及 **默认取值**： 不涉及
     * minimum: -1
     * maximum: 7200
     * @return timeWindow
     */
    public Integer getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
    }

    public TriggerProcess withReplyMode(ReplyModeEnum replyMode) {
        this.replyMode = replyMode;
        return this;
    }

    /**
     * **参数解释**： 回复类型。 **约束限制**： 不涉及 **取值范围**： * SYSTEM_REPLY：系统自动回复预先设置的话术。 * CALLBACK：回调给其他服务，携带设置的话术。 * SYSTEM_REPLY_AND_CALLBACK：系统自动回复预先设置的话术，同时回调给用户,携带设置的话术。 * SHOW_LAYER：仅显示叠加图层，不影响话术。 * INTELLIGENT_REPLY：使用配置的大模型生成回复话术。  **默认取值**： 不涉及
     * @return replyMode
     */
    public ReplyModeEnum getReplyMode() {
        return replyMode;
    }

    public void setReplyMode(ReplyModeEnum replyMode) {
        this.replyMode = replyMode;
    }

    public TriggerProcess withLayerConfig(SmartLayerConfig layerConfig) {
        this.layerConfig = layerConfig;
        return this;
    }

    public TriggerProcess withLayerConfig(Consumer<SmartLayerConfig> layerConfigSetter) {
        if (this.layerConfig == null) {
            this.layerConfig = new SmartLayerConfig();
            layerConfigSetter.accept(this.layerConfig);
        }

        return this;
    }

    /**
     * Get layerConfig
     * @return layerConfig
     */
    public SmartLayerConfig getLayerConfig() {
        return layerConfig;
    }

    public void setLayerConfig(SmartLayerConfig layerConfig) {
        this.layerConfig = layerConfig;
    }

    public TriggerProcess withExtraLayerConfig(SmartLayerConfig extraLayerConfig) {
        this.extraLayerConfig = extraLayerConfig;
        return this;
    }

    public TriggerProcess withExtraLayerConfig(Consumer<SmartLayerConfig> extraLayerConfigSetter) {
        if (this.extraLayerConfig == null) {
            this.extraLayerConfig = new SmartLayerConfig();
            extraLayerConfigSetter.accept(this.extraLayerConfig);
        }

        return this;
    }

    /**
     * Get extraLayerConfig
     * @return extraLayerConfig
     */
    public SmartLayerConfig getExtraLayerConfig() {
        return extraLayerConfig;
    }

    public void setExtraLayerConfig(SmartLayerConfig extraLayerConfig) {
        this.extraLayerConfig = extraLayerConfig;
    }

    public TriggerProcess withReplyTexts(List<String> replyTexts) {
        this.replyTexts = replyTexts;
        return this;
    }

    public TriggerProcess addReplyTextsItem(String replyTextsItem) {
        if (this.replyTexts == null) {
            this.replyTexts = new ArrayList<>();
        }
        this.replyTexts.add(replyTextsItem);
        return this;
    }

    public TriggerProcess withReplyTexts(Consumer<List<String>> replyTextsSetter) {
        if (this.replyTexts == null) {
            this.replyTexts = new ArrayList<>();
        }
        replyTextsSetter.accept(this.replyTexts);
        return this;
    }

    /**
     * **参数解释**： 回复话术集。 **约束限制**： 不涉及 **取值范围**： 最大支持5条预置话术。 单条话术字符长度0-1024位。 **默认取值**： 不涉及
     * @return replyTexts
     */
    public List<String> getReplyTexts() {
        return replyTexts;
    }

    public void setReplyTexts(List<String> replyTexts) {
        this.replyTexts = replyTexts;
    }

    public TriggerProcess withReplyAudios(List<ReplyAudioInfo> replyAudios) {
        this.replyAudios = replyAudios;
        return this;
    }

    public TriggerProcess addReplyAudiosItem(ReplyAudioInfo replyAudiosItem) {
        if (this.replyAudios == null) {
            this.replyAudios = new ArrayList<>();
        }
        this.replyAudios.add(replyAudiosItem);
        return this;
    }

    public TriggerProcess withReplyAudios(Consumer<List<ReplyAudioInfo>> replyAudiosSetter) {
        if (this.replyAudios == null) {
            this.replyAudios = new ArrayList<>();
        }
        replyAudiosSetter.accept(this.replyAudios);
        return this;
    }

    /**
     * **参数解释**： 回复音频集。填写audio_url。 **约束限制**： 不涉及 **取值范围**： 最大支持5条预置音频。 **默认取值**： 不涉及
     * @return replyAudios
     */
    public List<ReplyAudioInfo> getReplyAudios() {
        return replyAudios;
    }

    public void setReplyAudios(List<ReplyAudioInfo> replyAudios) {
        this.replyAudios = replyAudios;
    }

    public TriggerProcess withReplyOrder(ReplyOrderEnum replyOrder) {
        this.replyOrder = replyOrder;
        return this;
    }

    /**
     * **参数解释**： 回复话术选择次序。 **约束限制**： 不涉及 **取值范围**： * RANDOM：随机 * ORDER：顺序循环  **默认取值**： 不涉及
     * @return replyOrder
     */
    public ReplyOrderEnum getReplyOrder() {
        return replyOrder;
    }

    public void setReplyOrder(ReplyOrderEnum replyOrder) {
        this.replyOrder = replyOrder;
    }

    public TriggerProcess withReplyRole(ReplyRoleEnum replyRole) {
        this.replyRole = replyRole;
        return this;
    }

    /**
     * **参数解释**： 回复角色。 **约束限制**： 不涉及 **取值范围**： * STREAMER：主播 * CO_STREAMER：助播，仅声音。
     * @return replyRole
     */
    public ReplyRoleEnum getReplyRole() {
        return replyRole;
    }

    public void setReplyRole(ReplyRoleEnum replyRole) {
        this.replyRole = replyRole;
    }

    public TriggerProcess withRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }

    /**
     * **参数解释**： 机器人ID。 **约束限制**： reply_mode为INTELLIGENT_REPLY时必填，智能交互配置的大模型机器人ID。 获取方法请参考[创建应用](CreateRobot.xml)。 **取值范围**： 字符长度0-64位。 **默认取值**： 不涉及
     * @return robotId
     */
    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public TriggerProcess withPlayType(PlayTypeEnum playType) {
        this.playType = playType;
        return this;
    }

    /**
     * 回复播放类型。 - APPEND：追加，放置在场景播放队列尾部 - INSERT： 插入，在两个音频文件，或者文本句末添加。 - PLAY_NOW : 立即插入，收到指令后，立即播放，无需等待句末。
     * @return playType
     */
    public PlayTypeEnum getPlayType() {
        return playType;
    }

    public void setPlayType(PlayTypeEnum playType) {
        this.playType = playType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerProcess that = (TriggerProcess) obj;
        return Objects.equals(this.timeWindow, that.timeWindow) && Objects.equals(this.replyMode, that.replyMode)
            && Objects.equals(this.layerConfig, that.layerConfig)
            && Objects.equals(this.extraLayerConfig, that.extraLayerConfig)
            && Objects.equals(this.replyTexts, that.replyTexts) && Objects.equals(this.replyAudios, that.replyAudios)
            && Objects.equals(this.replyOrder, that.replyOrder) && Objects.equals(this.replyRole, that.replyRole)
            && Objects.equals(this.robotId, that.robotId) && Objects.equals(this.playType, that.playType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeWindow,
            replyMode,
            layerConfig,
            extraLayerConfig,
            replyTexts,
            replyAudios,
            replyOrder,
            replyRole,
            robotId,
            playType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerProcess {\n");
        sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
        sb.append("    replyMode: ").append(toIndentedString(replyMode)).append("\n");
        sb.append("    layerConfig: ").append(toIndentedString(layerConfig)).append("\n");
        sb.append("    extraLayerConfig: ").append(toIndentedString(extraLayerConfig)).append("\n");
        sb.append("    replyTexts: ").append(toIndentedString(replyTexts)).append("\n");
        sb.append("    replyAudios: ").append(toIndentedString(replyAudios)).append("\n");
        sb.append("    replyOrder: ").append(toIndentedString(replyOrder)).append("\n");
        sb.append("    replyRole: ").append(toIndentedString(replyRole)).append("\n");
        sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
        sb.append("    playType: ").append(toIndentedString(playType)).append("\n");
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
