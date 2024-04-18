package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 控制命令。
 */
public class ControlSmartLiveReq {

    /**
     * 命令名称。 - INSERT_PLAY_SCRIPT: 插入表演脚本。用于互动回复。数字人不变，背景不变。params结构定义：PlayTextInfo - REWRITE_PLAY_SCRIPT: 动态编辑未播放剧本。params结构定义：scene_scripts - INSERT_PLAY_AUDIO:插入驱动音频。用于音频直接驱动。数字人不变，背景不变。params结构定义：PlayAudioInfo - REWRITE_INTERACTION_RULES: 动态修改互动规则。params结构定义：interaction_rules - GET_CURRENT_PLAYING_SCRIPTS: 查询本轮剧本列表。响应为LivePlayingScriptList结构 - SHOW_LAYER：显示导播素材，用于直播导播。params结构定义：LiveGuideRuleInfo - REFRESH_OUTPUT_URL: 更新当前任务的rtmp推流信息。params结构定义： RefreshOutputUrlConfig - GET_LIVE_JOB_CONFIG_INFO：获取任务中的房间信息。params结构定义：SmartLiveRoomInfo
     */
    public static final class CommandEnum {

        /**
         * Enum INSERT_PLAY_SCRIPT for value: "INSERT_PLAY_SCRIPT"
         */
        public static final CommandEnum INSERT_PLAY_SCRIPT = new CommandEnum("INSERT_PLAY_SCRIPT");

        /**
         * Enum REWRITE_PLAY_SCRIPT for value: "REWRITE_PLAY_SCRIPT"
         */
        public static final CommandEnum REWRITE_PLAY_SCRIPT = new CommandEnum("REWRITE_PLAY_SCRIPT");

        /**
         * Enum INSERT_PLAY_AUDIO for value: "INSERT_PLAY_AUDIO"
         */
        public static final CommandEnum INSERT_PLAY_AUDIO = new CommandEnum("INSERT_PLAY_AUDIO");

        /**
         * Enum REWRITE_INTERACTION_RULES for value: "REWRITE_INTERACTION_RULES"
         */
        public static final CommandEnum REWRITE_INTERACTION_RULES = new CommandEnum("REWRITE_INTERACTION_RULES");

        /**
         * Enum GET_CURRENT_PLAYING_SCRIPTS for value: "GET_CURRENT_PLAYING_SCRIPTS"
         */
        public static final CommandEnum GET_CURRENT_PLAYING_SCRIPTS = new CommandEnum("GET_CURRENT_PLAYING_SCRIPTS");

        /**
         * Enum REFRESH_OUTPUT_URL for value: "REFRESH_OUTPUT_URL"
         */
        public static final CommandEnum REFRESH_OUTPUT_URL = new CommandEnum("REFRESH_OUTPUT_URL");

        /**
         * Enum GET_LIVE_JOB_CONFIG_INFO for value: "GET_LIVE_JOB_CONFIG_INFO"
         */
        public static final CommandEnum GET_LIVE_JOB_CONFIG_INFO = new CommandEnum("GET_LIVE_JOB_CONFIG_INFO");

        private static final Map<String, CommandEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandEnum> createStaticFields() {
            Map<String, CommandEnum> map = new HashMap<>();
            map.put("INSERT_PLAY_SCRIPT", INSERT_PLAY_SCRIPT);
            map.put("REWRITE_PLAY_SCRIPT", REWRITE_PLAY_SCRIPT);
            map.put("INSERT_PLAY_AUDIO", INSERT_PLAY_AUDIO);
            map.put("REWRITE_INTERACTION_RULES", REWRITE_INTERACTION_RULES);
            map.put("GET_CURRENT_PLAYING_SCRIPTS", GET_CURRENT_PLAYING_SCRIPTS);
            map.put("REFRESH_OUTPUT_URL", REFRESH_OUTPUT_URL);
            map.put("GET_LIVE_JOB_CONFIG_INFO", GET_LIVE_JOB_CONFIG_INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandEnum(String value) {
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
        public static CommandEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandEnum(value));
        }

        public static CommandEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandEnum) {
                return this.value.equals(((CommandEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private CommandEnum command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Object params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    public ControlSmartLiveReq withCommand(CommandEnum command) {
        this.command = command;
        return this;
    }

    /**
     * 命令名称。 - INSERT_PLAY_SCRIPT: 插入表演脚本。用于互动回复。数字人不变，背景不变。params结构定义：PlayTextInfo - REWRITE_PLAY_SCRIPT: 动态编辑未播放剧本。params结构定义：scene_scripts - INSERT_PLAY_AUDIO:插入驱动音频。用于音频直接驱动。数字人不变，背景不变。params结构定义：PlayAudioInfo - REWRITE_INTERACTION_RULES: 动态修改互动规则。params结构定义：interaction_rules - GET_CURRENT_PLAYING_SCRIPTS: 查询本轮剧本列表。响应为LivePlayingScriptList结构 - SHOW_LAYER：显示导播素材，用于直播导播。params结构定义：LiveGuideRuleInfo - REFRESH_OUTPUT_URL: 更新当前任务的rtmp推流信息。params结构定义： RefreshOutputUrlConfig - GET_LIVE_JOB_CONFIG_INFO：获取任务中的房间信息。params结构定义：SmartLiveRoomInfo
     * @return command
     */
    public CommandEnum getCommand() {
        return command;
    }

    public void setCommand(CommandEnum command) {
        this.command = command;
    }

    public ControlSmartLiveReq withParams(Object params) {
        this.params = params;
        return this;
    }

    /**
     * 命令参数。
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public ControlSmartLiveReq withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public ControlSmartLiveReq withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ControlSmartLiveReq that = (ControlSmartLiveReq) obj;
        return Objects.equals(this.command, that.command) && Objects.equals(this.params, that.params)
            && Objects.equals(this.reviewConfig, that.reviewConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, params, reviewConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControlSmartLiveReq {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
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
