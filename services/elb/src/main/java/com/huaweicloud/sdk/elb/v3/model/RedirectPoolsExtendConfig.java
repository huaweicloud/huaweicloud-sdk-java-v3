package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释：转发到的后端主机组的配置。  约束限制：当action为REDIRECT_TO_POOL时生效。
 */
public class RedirectPoolsExtendConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_enable")

    private Boolean rewriteUrlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_config")

    private RewriteUrlConfig rewriteUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers_config")

    private InsertHeadersConfig insertHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_headers_config")

    private RemoveHeadersConfig removeHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit_config")

    private TrafficLimitConfig trafficLimitConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors_config")

    private CorsConfig corsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_config")

    private TrafficMirrorConfig trafficMirrorConfig;

    public RedirectPoolsExtendConfig withRewriteUrlEnable(Boolean rewriteUrlEnable) {
        this.rewriteUrlEnable = rewriteUrlEnable;
        return this;
    }

    /**
     * 参数解释：是否开启url重定向。
     * @return rewriteUrlEnable
     */
    public Boolean getRewriteUrlEnable() {
        return rewriteUrlEnable;
    }

    public void setRewriteUrlEnable(Boolean rewriteUrlEnable) {
        this.rewriteUrlEnable = rewriteUrlEnable;
    }

    public RedirectPoolsExtendConfig withRewriteUrlConfig(RewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
        return this;
    }

    public RedirectPoolsExtendConfig withRewriteUrlConfig(Consumer<RewriteUrlConfig> rewriteUrlConfigSetter) {
        if (this.rewriteUrlConfig == null) {
            this.rewriteUrlConfig = new RewriteUrlConfig();
            rewriteUrlConfigSetter.accept(this.rewriteUrlConfig);
        }

        return this;
    }

    /**
     * Get rewriteUrlConfig
     * @return rewriteUrlConfig
     */
    public RewriteUrlConfig getRewriteUrlConfig() {
        return rewriteUrlConfig;
    }

    public void setRewriteUrlConfig(RewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
    }

    public RedirectPoolsExtendConfig withInsertHeadersConfig(InsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
        return this;
    }

    public RedirectPoolsExtendConfig withInsertHeadersConfig(Consumer<InsertHeadersConfig> insertHeadersConfigSetter) {
        if (this.insertHeadersConfig == null) {
            this.insertHeadersConfig = new InsertHeadersConfig();
            insertHeadersConfigSetter.accept(this.insertHeadersConfig);
        }

        return this;
    }

    /**
     * Get insertHeadersConfig
     * @return insertHeadersConfig
     */
    public InsertHeadersConfig getInsertHeadersConfig() {
        return insertHeadersConfig;
    }

    public void setInsertHeadersConfig(InsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
    }

    public RedirectPoolsExtendConfig withRemoveHeadersConfig(RemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
        return this;
    }

    public RedirectPoolsExtendConfig withRemoveHeadersConfig(Consumer<RemoveHeadersConfig> removeHeadersConfigSetter) {
        if (this.removeHeadersConfig == null) {
            this.removeHeadersConfig = new RemoveHeadersConfig();
            removeHeadersConfigSetter.accept(this.removeHeadersConfig);
        }

        return this;
    }

    /**
     * Get removeHeadersConfig
     * @return removeHeadersConfig
     */
    public RemoveHeadersConfig getRemoveHeadersConfig() {
        return removeHeadersConfig;
    }

    public void setRemoveHeadersConfig(RemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    public RedirectPoolsExtendConfig withTrafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
        return this;
    }

    public RedirectPoolsExtendConfig withTrafficLimitConfig(Consumer<TrafficLimitConfig> trafficLimitConfigSetter) {
        if (this.trafficLimitConfig == null) {
            this.trafficLimitConfig = new TrafficLimitConfig();
            trafficLimitConfigSetter.accept(this.trafficLimitConfig);
        }

        return this;
    }

    /**
     * Get trafficLimitConfig
     * @return trafficLimitConfig
     */
    public TrafficLimitConfig getTrafficLimitConfig() {
        return trafficLimitConfig;
    }

    public void setTrafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
    }

    public RedirectPoolsExtendConfig withCorsConfig(CorsConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }

    public RedirectPoolsExtendConfig withCorsConfig(Consumer<CorsConfig> corsConfigSetter) {
        if (this.corsConfig == null) {
            this.corsConfig = new CorsConfig();
            corsConfigSetter.accept(this.corsConfig);
        }

        return this;
    }

    /**
     * Get corsConfig
     * @return corsConfig
     */
    public CorsConfig getCorsConfig() {
        return corsConfig;
    }

    public void setCorsConfig(CorsConfig corsConfig) {
        this.corsConfig = corsConfig;
    }

    public RedirectPoolsExtendConfig withTrafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
        this.trafficMirrorConfig = trafficMirrorConfig;
        return this;
    }

    public RedirectPoolsExtendConfig withTrafficMirrorConfig(Consumer<TrafficMirrorConfig> trafficMirrorConfigSetter) {
        if (this.trafficMirrorConfig == null) {
            this.trafficMirrorConfig = new TrafficMirrorConfig();
            trafficMirrorConfigSetter.accept(this.trafficMirrorConfig);
        }

        return this;
    }

    /**
     * Get trafficMirrorConfig
     * @return trafficMirrorConfig
     */
    public TrafficMirrorConfig getTrafficMirrorConfig() {
        return trafficMirrorConfig;
    }

    public void setTrafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
        this.trafficMirrorConfig = trafficMirrorConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedirectPoolsExtendConfig that = (RedirectPoolsExtendConfig) obj;
        return Objects.equals(this.rewriteUrlEnable, that.rewriteUrlEnable)
            && Objects.equals(this.rewriteUrlConfig, that.rewriteUrlConfig)
            && Objects.equals(this.insertHeadersConfig, that.insertHeadersConfig)
            && Objects.equals(this.removeHeadersConfig, that.removeHeadersConfig)
            && Objects.equals(this.trafficLimitConfig, that.trafficLimitConfig)
            && Objects.equals(this.corsConfig, that.corsConfig)
            && Objects.equals(this.trafficMirrorConfig, that.trafficMirrorConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewriteUrlEnable,
            rewriteUrlConfig,
            insertHeadersConfig,
            removeHeadersConfig,
            trafficLimitConfig,
            corsConfig,
            trafficMirrorConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedirectPoolsExtendConfig {\n");
        sb.append("    rewriteUrlEnable: ").append(toIndentedString(rewriteUrlEnable)).append("\n");
        sb.append("    rewriteUrlConfig: ").append(toIndentedString(rewriteUrlConfig)).append("\n");
        sb.append("    insertHeadersConfig: ").append(toIndentedString(insertHeadersConfig)).append("\n");
        sb.append("    removeHeadersConfig: ").append(toIndentedString(removeHeadersConfig)).append("\n");
        sb.append("    trafficLimitConfig: ").append(toIndentedString(trafficLimitConfig)).append("\n");
        sb.append("    corsConfig: ").append(toIndentedString(corsConfig)).append("\n");
        sb.append("    trafficMirrorConfig: ").append(toIndentedString(trafficMirrorConfig)).append("\n");
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
