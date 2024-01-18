package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改应用请求。
 */
public class UpdateRobotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private Integer appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    private Integer concurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huawei_ei_cbs")

    private HuaweiEiCbs huaweiEiCbs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iflytek_aiui_config")

    private IflytekAiuiConfig iflytekAiuiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iflytek_spark")

    private IflytekSpark iflytekSpark;

    public UpdateRobotReq withName(String name) {
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

    public UpdateRobotReq withAppType(Integer appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 对接第三方应用厂商类型。 > 0：科大讯飞AIUI；1：华为云CBS；2：科大讯飞星火交互认知大模型；5：第三方驱动
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

    public UpdateRobotReq withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * 对话的并发数
     * minimum: 1
     * maximum: 512
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public UpdateRobotReq withHuaweiEiCbs(HuaweiEiCbs huaweiEiCbs) {
        this.huaweiEiCbs = huaweiEiCbs;
        return this;
    }

    public UpdateRobotReq withHuaweiEiCbs(Consumer<HuaweiEiCbs> huaweiEiCbsSetter) {
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

    public UpdateRobotReq withIflytekAiuiConfig(IflytekAiuiConfig iflytekAiuiConfig) {
        this.iflytekAiuiConfig = iflytekAiuiConfig;
        return this;
    }

    public UpdateRobotReq withIflytekAiuiConfig(Consumer<IflytekAiuiConfig> iflytekAiuiConfigSetter) {
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

    public UpdateRobotReq withIflytekSpark(IflytekSpark iflytekSpark) {
        this.iflytekSpark = iflytekSpark;
        return this;
    }

    public UpdateRobotReq withIflytekSpark(Consumer<IflytekSpark> iflytekSparkSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRobotReq that = (UpdateRobotReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.concurrency, that.concurrency) && Objects.equals(this.huaweiEiCbs, that.huaweiEiCbs)
            && Objects.equals(this.iflytekAiuiConfig, that.iflytekAiuiConfig)
            && Objects.equals(this.iflytekSpark, that.iflytekSpark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appType, concurrency, huaweiEiCbs, iflytekAiuiConfig, iflytekSpark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRobotReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    huaweiEiCbs: ").append(toIndentedString(huaweiEiCbs)).append("\n");
        sb.append("    iflytekAiuiConfig: ").append(toIndentedString(iflytekAiuiConfig)).append("\n");
        sb.append("    iflytekSpark: ").append(toIndentedString(iflytekSpark)).append("\n");
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
