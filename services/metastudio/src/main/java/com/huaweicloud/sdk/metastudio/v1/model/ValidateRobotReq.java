package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 校验应用请求。
 */
public class ValidateRobotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private Integer appType;

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

    public ValidateRobotReq withAppType(Integer appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 对接第三方应用厂商类型。 > 0：科大讯飞AIUI；1：华为云CBS；2：科大讯飞星火交互认知大模型；6：第三方语言模型；7：交互助手；8：奇妙问
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

    public ValidateRobotReq withHuaweiEiCbs(HuaweiEiCbs huaweiEiCbs) {
        this.huaweiEiCbs = huaweiEiCbs;
        return this;
    }

    public ValidateRobotReq withHuaweiEiCbs(Consumer<HuaweiEiCbs> huaweiEiCbsSetter) {
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

    public ValidateRobotReq withIflytekAiuiConfig(IflytekAiuiConfig iflytekAiuiConfig) {
        this.iflytekAiuiConfig = iflytekAiuiConfig;
        return this;
    }

    public ValidateRobotReq withIflytekAiuiConfig(Consumer<IflytekAiuiConfig> iflytekAiuiConfigSetter) {
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

    public ValidateRobotReq withIflytekSpark(IflytekSpark iflytekSpark) {
        this.iflytekSpark = iflytekSpark;
        return this;
    }

    public ValidateRobotReq withIflytekSpark(Consumer<IflytekSpark> iflytekSparkSetter) {
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

    public ValidateRobotReq withThirdPartyModelConfig(ThirdPartyModelConfig thirdPartyModelConfig) {
        this.thirdPartyModelConfig = thirdPartyModelConfig;
        return this;
    }

    public ValidateRobotReq withThirdPartyModelConfig(Consumer<ThirdPartyModelConfig> thirdPartyModelConfigSetter) {
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

    public ValidateRobotReq withMobvoiConfig(MobvoiConfig mobvoiConfig) {
        this.mobvoiConfig = mobvoiConfig;
        return this;
    }

    public ValidateRobotReq withMobvoiConfig(Consumer<MobvoiConfig> mobvoiConfigSetter) {
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

    public ValidateRobotReq withWiseBrainConfig(WiseBrainConfig wiseBrainConfig) {
        this.wiseBrainConfig = wiseBrainConfig;
        return this;
    }

    public ValidateRobotReq withWiseBrainConfig(Consumer<WiseBrainConfig> wiseBrainConfigSetter) {
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
        ValidateRobotReq that = (ValidateRobotReq) obj;
        return Objects.equals(this.appType, that.appType) && Objects.equals(this.huaweiEiCbs, that.huaweiEiCbs)
            && Objects.equals(this.iflytekAiuiConfig, that.iflytekAiuiConfig)
            && Objects.equals(this.iflytekSpark, that.iflytekSpark)
            && Objects.equals(this.thirdPartyModelConfig, that.thirdPartyModelConfig)
            && Objects.equals(this.mobvoiConfig, that.mobvoiConfig)
            && Objects.equals(this.wiseBrainConfig, that.wiseBrainConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appType,
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
        sb.append("class ValidateRobotReq {\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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
