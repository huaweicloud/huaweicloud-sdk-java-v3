package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释：转发到的后端主机组的配置。  约束限制：当action为REDIRECT_TO_POOL时生效。
 */
public class CreateRedirectPoolsExtendConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_enable")

    private Boolean rewriteUrlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_config")

    private CreateRewriteUrlConfig rewriteUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers_config")

    private CreateInsertHeadersConfig insertHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_headers_config")

    private CreateRemoveHeadersConfig removeHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit_config")

    private CreateTrafficLimitConfig trafficLimitConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors_config")

    private CreateCorsConfig corsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_config")

    private CreateTrafficMirrorConfig trafficMirrorConfig;

    public CreateRedirectPoolsExtendConfig withRewriteUrlEnable(Boolean rewriteUrlEnable) {
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

    public CreateRedirectPoolsExtendConfig withRewriteUrlConfig(CreateRewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
        return this;
    }

    public CreateRedirectPoolsExtendConfig withRewriteUrlConfig(
        Consumer<CreateRewriteUrlConfig> rewriteUrlConfigSetter) {
        if (this.rewriteUrlConfig == null) {
            this.rewriteUrlConfig = new CreateRewriteUrlConfig();
            rewriteUrlConfigSetter.accept(this.rewriteUrlConfig);
        }

        return this;
    }

    /**
     * Get rewriteUrlConfig
     * @return rewriteUrlConfig
     */
    public CreateRewriteUrlConfig getRewriteUrlConfig() {
        return rewriteUrlConfig;
    }

    public void setRewriteUrlConfig(CreateRewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
    }

    public CreateRedirectPoolsExtendConfig withInsertHeadersConfig(CreateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
        return this;
    }

    public CreateRedirectPoolsExtendConfig withInsertHeadersConfig(
        Consumer<CreateInsertHeadersConfig> insertHeadersConfigSetter) {
        if (this.insertHeadersConfig == null) {
            this.insertHeadersConfig = new CreateInsertHeadersConfig();
            insertHeadersConfigSetter.accept(this.insertHeadersConfig);
        }

        return this;
    }

    /**
     * Get insertHeadersConfig
     * @return insertHeadersConfig
     */
    public CreateInsertHeadersConfig getInsertHeadersConfig() {
        return insertHeadersConfig;
    }

    public void setInsertHeadersConfig(CreateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
    }

    public CreateRedirectPoolsExtendConfig withRemoveHeadersConfig(CreateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
        return this;
    }

    public CreateRedirectPoolsExtendConfig withRemoveHeadersConfig(
        Consumer<CreateRemoveHeadersConfig> removeHeadersConfigSetter) {
        if (this.removeHeadersConfig == null) {
            this.removeHeadersConfig = new CreateRemoveHeadersConfig();
            removeHeadersConfigSetter.accept(this.removeHeadersConfig);
        }

        return this;
    }

    /**
     * Get removeHeadersConfig
     * @return removeHeadersConfig
     */
    public CreateRemoveHeadersConfig getRemoveHeadersConfig() {
        return removeHeadersConfig;
    }

    public void setRemoveHeadersConfig(CreateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    public CreateRedirectPoolsExtendConfig withTrafficLimitConfig(CreateTrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
        return this;
    }

    public CreateRedirectPoolsExtendConfig withTrafficLimitConfig(
        Consumer<CreateTrafficLimitConfig> trafficLimitConfigSetter) {
        if (this.trafficLimitConfig == null) {
            this.trafficLimitConfig = new CreateTrafficLimitConfig();
            trafficLimitConfigSetter.accept(this.trafficLimitConfig);
        }

        return this;
    }

    /**
     * Get trafficLimitConfig
     * @return trafficLimitConfig
     */
    public CreateTrafficLimitConfig getTrafficLimitConfig() {
        return trafficLimitConfig;
    }

    public void setTrafficLimitConfig(CreateTrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
    }

    public CreateRedirectPoolsExtendConfig withCorsConfig(CreateCorsConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }

    public CreateRedirectPoolsExtendConfig withCorsConfig(Consumer<CreateCorsConfig> corsConfigSetter) {
        if (this.corsConfig == null) {
            this.corsConfig = new CreateCorsConfig();
            corsConfigSetter.accept(this.corsConfig);
        }

        return this;
    }

    /**
     * Get corsConfig
     * @return corsConfig
     */
    public CreateCorsConfig getCorsConfig() {
        return corsConfig;
    }

    public void setCorsConfig(CreateCorsConfig corsConfig) {
        this.corsConfig = corsConfig;
    }

    public CreateRedirectPoolsExtendConfig withTrafficMirrorConfig(CreateTrafficMirrorConfig trafficMirrorConfig) {
        this.trafficMirrorConfig = trafficMirrorConfig;
        return this;
    }

    public CreateRedirectPoolsExtendConfig withTrafficMirrorConfig(
        Consumer<CreateTrafficMirrorConfig> trafficMirrorConfigSetter) {
        if (this.trafficMirrorConfig == null) {
            this.trafficMirrorConfig = new CreateTrafficMirrorConfig();
            trafficMirrorConfigSetter.accept(this.trafficMirrorConfig);
        }

        return this;
    }

    /**
     * Get trafficMirrorConfig
     * @return trafficMirrorConfig
     */
    public CreateTrafficMirrorConfig getTrafficMirrorConfig() {
        return trafficMirrorConfig;
    }

    public void setTrafficMirrorConfig(CreateTrafficMirrorConfig trafficMirrorConfig) {
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
        CreateRedirectPoolsExtendConfig that = (CreateRedirectPoolsExtendConfig) obj;
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
        sb.append("class CreateRedirectPoolsExtendConfig {\n");
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
