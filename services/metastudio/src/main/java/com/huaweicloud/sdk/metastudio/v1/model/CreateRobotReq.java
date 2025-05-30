package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建应用请求。
 */
public class CreateRobotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private Integer appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_type")

    private RobotTypeEnum robotType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tail_silence_time")

    private Integer tailSilenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_question_audit")

    private Boolean enableQuestionAudit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huawei_ei_cbs")

    private HuaweiEiCbs huaweiEiCbs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iflytek_aiui_config")

    private IflytekAiuiConfig iflytekAiuiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iflytek_spark")

    private IflytekSpark iflytekSpark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_party_model_config")

    private ThirdPartyModelConfig thirdPartyModelConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobvoi_config")

    private MobvoiConfig mobvoiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wise_brain_config")

    private WiseBrainConfig wiseBrainConfig;

    public CreateRobotReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRobotReq withAppType(Integer appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 对接第三方应用厂商类型。 > 0：科大讯飞AIUI；1：华为云CBS；2：科大讯飞星火交互认知大模型；5：第三方驱动；6：第三方语言模型；7：交互助手；8：奇妙问
     * minimum: 0
     * maximum: 32
     * @return appType
     */
    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public CreateRobotReq withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 智能交互对话房间ID。
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public CreateRobotReq withRobotType(RobotTypeEnum robotType) {
        this.robotType = robotType;
        return this;
    }

    /**
     * Get robotType
     * @return robotType
     */
    public RobotTypeEnum getRobotType() {
        return robotType;
    }

    public void setRobotType(RobotTypeEnum robotType) {
        this.robotType = robotType;
    }

    public CreateRobotReq withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public CreateRobotReq withTailSilenceTime(Integer tailSilenceTime) {
        this.tailSilenceTime = tailSilenceTime;
        return this;
    }

    /**
     * 语音识别后端点静音时长默认500ms
     * minimum: 0
     * maximum: 3000
     * @return tailSilenceTime
     */
    public Integer getTailSilenceTime() {
        return tailSilenceTime;
    }

    public void setTailSilenceTime(Integer tailSilenceTime) {
        this.tailSilenceTime = tailSilenceTime;
    }

    public CreateRobotReq withEnableQuestionAudit(Boolean enableQuestionAudit) {
        this.enableQuestionAudit = enableQuestionAudit;
        return this;
    }

    /**
     * 提问文本审核开关
     * @return enableQuestionAudit
     */
    public Boolean getEnableQuestionAudit() {
        return enableQuestionAudit;
    }

    public void setEnableQuestionAudit(Boolean enableQuestionAudit) {
        this.enableQuestionAudit = enableQuestionAudit;
    }

    public CreateRobotReq withHuaweiEiCbs(HuaweiEiCbs huaweiEiCbs) {
        this.huaweiEiCbs = huaweiEiCbs;
        return this;
    }

    public CreateRobotReq withHuaweiEiCbs(Consumer<HuaweiEiCbs> huaweiEiCbsSetter) {
        if (this.huaweiEiCbs == null) {
            this.huaweiEiCbs = new HuaweiEiCbs();
            huaweiEiCbsSetter.accept(this.huaweiEiCbs);
        }

        return this;
    }

    /**
     * Get huaweiEiCbs
     * @return huaweiEiCbs
     */
    public HuaweiEiCbs getHuaweiEiCbs() {
        return huaweiEiCbs;
    }

    public void setHuaweiEiCbs(HuaweiEiCbs huaweiEiCbs) {
        this.huaweiEiCbs = huaweiEiCbs;
    }

    public CreateRobotReq withIflytekAiuiConfig(IflytekAiuiConfig iflytekAiuiConfig) {
        this.iflytekAiuiConfig = iflytekAiuiConfig;
        return this;
    }

    public CreateRobotReq withIflytekAiuiConfig(Consumer<IflytekAiuiConfig> iflytekAiuiConfigSetter) {
        if (this.iflytekAiuiConfig == null) {
            this.iflytekAiuiConfig = new IflytekAiuiConfig();
            iflytekAiuiConfigSetter.accept(this.iflytekAiuiConfig);
        }

        return this;
    }

    /**
     * Get iflytekAiuiConfig
     * @return iflytekAiuiConfig
     */
    public IflytekAiuiConfig getIflytekAiuiConfig() {
        return iflytekAiuiConfig;
    }

    public void setIflytekAiuiConfig(IflytekAiuiConfig iflytekAiuiConfig) {
        this.iflytekAiuiConfig = iflytekAiuiConfig;
    }

    public CreateRobotReq withIflytekSpark(IflytekSpark iflytekSpark) {
        this.iflytekSpark = iflytekSpark;
        return this;
    }

    public CreateRobotReq withIflytekSpark(Consumer<IflytekSpark> iflytekSparkSetter) {
        if (this.iflytekSpark == null) {
            this.iflytekSpark = new IflytekSpark();
            iflytekSparkSetter.accept(this.iflytekSpark);
        }

        return this;
    }

    /**
     * Get iflytekSpark
     * @return iflytekSpark
     */
    public IflytekSpark getIflytekSpark() {
        return iflytekSpark;
    }

    public void setIflytekSpark(IflytekSpark iflytekSpark) {
        this.iflytekSpark = iflytekSpark;
    }

    public CreateRobotReq withThirdPartyModelConfig(ThirdPartyModelConfig thirdPartyModelConfig) {
        this.thirdPartyModelConfig = thirdPartyModelConfig;
        return this;
    }

    public CreateRobotReq withThirdPartyModelConfig(Consumer<ThirdPartyModelConfig> thirdPartyModelConfigSetter) {
        if (this.thirdPartyModelConfig == null) {
            this.thirdPartyModelConfig = new ThirdPartyModelConfig();
            thirdPartyModelConfigSetter.accept(this.thirdPartyModelConfig);
        }

        return this;
    }

    /**
     * Get thirdPartyModelConfig
     * @return thirdPartyModelConfig
     */
    public ThirdPartyModelConfig getThirdPartyModelConfig() {
        return thirdPartyModelConfig;
    }

    public void setThirdPartyModelConfig(ThirdPartyModelConfig thirdPartyModelConfig) {
        this.thirdPartyModelConfig = thirdPartyModelConfig;
    }

    public CreateRobotReq withMobvoiConfig(MobvoiConfig mobvoiConfig) {
        this.mobvoiConfig = mobvoiConfig;
        return this;
    }

    public CreateRobotReq withMobvoiConfig(Consumer<MobvoiConfig> mobvoiConfigSetter) {
        if (this.mobvoiConfig == null) {
            this.mobvoiConfig = new MobvoiConfig();
            mobvoiConfigSetter.accept(this.mobvoiConfig);
        }

        return this;
    }

    /**
     * Get mobvoiConfig
     * @return mobvoiConfig
     */
    public MobvoiConfig getMobvoiConfig() {
        return mobvoiConfig;
    }

    public void setMobvoiConfig(MobvoiConfig mobvoiConfig) {
        this.mobvoiConfig = mobvoiConfig;
    }

    public CreateRobotReq withWiseBrainConfig(WiseBrainConfig wiseBrainConfig) {
        this.wiseBrainConfig = wiseBrainConfig;
        return this;
    }

    public CreateRobotReq withWiseBrainConfig(Consumer<WiseBrainConfig> wiseBrainConfigSetter) {
        if (this.wiseBrainConfig == null) {
            this.wiseBrainConfig = new WiseBrainConfig();
            wiseBrainConfigSetter.accept(this.wiseBrainConfig);
        }

        return this;
    }

    /**
     * Get wiseBrainConfig
     * @return wiseBrainConfig
     */
    public WiseBrainConfig getWiseBrainConfig() {
        return wiseBrainConfig;
    }

    public void setWiseBrainConfig(WiseBrainConfig wiseBrainConfig) {
        this.wiseBrainConfig = wiseBrainConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRobotReq that = (CreateRobotReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.roomId, that.roomId) && Objects.equals(this.robotType, that.robotType)
            && Objects.equals(this.language, that.language)
            && Objects.equals(this.tailSilenceTime, that.tailSilenceTime)
            && Objects.equals(this.enableQuestionAudit, that.enableQuestionAudit)
            && Objects.equals(this.huaweiEiCbs, that.huaweiEiCbs)
            && Objects.equals(this.iflytekAiuiConfig, that.iflytekAiuiConfig)
            && Objects.equals(this.iflytekSpark, that.iflytekSpark)
            && Objects.equals(this.thirdPartyModelConfig, that.thirdPartyModelConfig)
            && Objects.equals(this.mobvoiConfig, that.mobvoiConfig)
            && Objects.equals(this.wiseBrainConfig, that.wiseBrainConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            appType,
            roomId,
            robotType,
            language,
            tailSilenceTime,
            enableQuestionAudit,
            huaweiEiCbs,
            iflytekAiuiConfig,
            iflytekSpark,
            thirdPartyModelConfig,
            mobvoiConfig,
            wiseBrainConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRobotReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    robotType: ").append(toIndentedString(robotType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    tailSilenceTime: ").append(toIndentedString(tailSilenceTime)).append("\n");
        sb.append("    enableQuestionAudit: ").append(toIndentedString(enableQuestionAudit)).append("\n");
        sb.append("    huaweiEiCbs: ").append(toIndentedString(huaweiEiCbs)).append("\n");
        sb.append("    iflytekAiuiConfig: ").append(toIndentedString(iflytekAiuiConfig)).append("\n");
        sb.append("    iflytekSpark: ").append(toIndentedString(iflytekSpark)).append("\n");
        sb.append("    thirdPartyModelConfig: ").append(toIndentedString(thirdPartyModelConfig)).append("\n");
        sb.append("    mobvoiConfig: ").append(toIndentedString(mobvoiConfig)).append("\n");
        sb.append("    wiseBrainConfig: ").append(toIndentedString(wiseBrainConfig)).append("\n");
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
