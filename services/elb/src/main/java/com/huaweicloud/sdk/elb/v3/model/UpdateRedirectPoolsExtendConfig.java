package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：转发到的后端服务器组的配置。  **约束限制**：当action为REDIRECT_TO_POOL时生效。
 */
public class UpdateRedirectPoolsExtendConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_enable")

    private Boolean rewriteUrlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_config")

    private UpdateRewriteUrlConfig rewriteUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers_config")

    private UpdateInsertHeadersConfig insertHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_headers_config")

    private UpdateRemoveHeadersConfig removeHeadersConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit_config")

    private UpdateTrafficLimitConfig trafficLimitConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors_config")

    private CreateCorsConfig corsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_config")

    private CreateTrafficMirrorConfig trafficMirrorConfig;

    public UpdateRedirectPoolsExtendConfig withRewriteUrlEnable(Boolean rewriteUrlEnable) {
        this.rewriteUrlEnable = rewriteUrlEnable;
        return this;
    }

    /**
     * **参数解释**：是否开启url重定向。  **约束限制**：不涉及  **取值范围**：true 开启，false 未开启。  **默认取值**：不涉及
     * @return rewriteUrlEnable
     */
    public Boolean getRewriteUrlEnable() {
        return rewriteUrlEnable;
    }

    public void setRewriteUrlEnable(Boolean rewriteUrlEnable) {
        this.rewriteUrlEnable = rewriteUrlEnable;
    }

    public UpdateRedirectPoolsExtendConfig withRewriteUrlConfig(UpdateRewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withRewriteUrlConfig(
        Consumer<UpdateRewriteUrlConfig> rewriteUrlConfigSetter) {
        if (this.rewriteUrlConfig == null) {
            this.rewriteUrlConfig = new UpdateRewriteUrlConfig();
            rewriteUrlConfigSetter.accept(this.rewriteUrlConfig);
        }

        return this;
    }

    /**
     * Get rewriteUrlConfig
     * @return rewriteUrlConfig
     */
    public UpdateRewriteUrlConfig getRewriteUrlConfig() {
        return rewriteUrlConfig;
    }

    public void setRewriteUrlConfig(UpdateRewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
    }

    public UpdateRedirectPoolsExtendConfig withInsertHeadersConfig(UpdateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withInsertHeadersConfig(
        Consumer<UpdateInsertHeadersConfig> insertHeadersConfigSetter) {
        if (this.insertHeadersConfig == null) {
            this.insertHeadersConfig = new UpdateInsertHeadersConfig();
            insertHeadersConfigSetter.accept(this.insertHeadersConfig);
        }

        return this;
    }

    /**
     * Get insertHeadersConfig
     * @return insertHeadersConfig
     */
    public UpdateInsertHeadersConfig getInsertHeadersConfig() {
        return insertHeadersConfig;
    }

    public void setInsertHeadersConfig(UpdateInsertHeadersConfig insertHeadersConfig) {
        this.insertHeadersConfig = insertHeadersConfig;
    }

    public UpdateRedirectPoolsExtendConfig withRemoveHeadersConfig(UpdateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withRemoveHeadersConfig(
        Consumer<UpdateRemoveHeadersConfig> removeHeadersConfigSetter) {
        if (this.removeHeadersConfig == null) {
            this.removeHeadersConfig = new UpdateRemoveHeadersConfig();
            removeHeadersConfigSetter.accept(this.removeHeadersConfig);
        }

        return this;
    }

    /**
     * Get removeHeadersConfig
     * @return removeHeadersConfig
     */
    public UpdateRemoveHeadersConfig getRemoveHeadersConfig() {
        return removeHeadersConfig;
    }

    public void setRemoveHeadersConfig(UpdateRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    public UpdateRedirectPoolsExtendConfig withTrafficLimitConfig(UpdateTrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withTrafficLimitConfig(
        Consumer<UpdateTrafficLimitConfig> trafficLimitConfigSetter) {
        if (this.trafficLimitConfig == null) {
            this.trafficLimitConfig = new UpdateTrafficLimitConfig();
            trafficLimitConfigSetter.accept(this.trafficLimitConfig);
        }

        return this;
    }

    /**
     * Get trafficLimitConfig
     * @return trafficLimitConfig
     */
    public UpdateTrafficLimitConfig getTrafficLimitConfig() {
        return trafficLimitConfig;
    }

    public void setTrafficLimitConfig(UpdateTrafficLimitConfig trafficLimitConfig) {
        this.trafficLimitConfig = trafficLimitConfig;
    }

    public UpdateRedirectPoolsExtendConfig withCorsConfig(CreateCorsConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withCorsConfig(Consumer<CreateCorsConfig> corsConfigSetter) {
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

    public UpdateRedirectPoolsExtendConfig withTrafficMirrorConfig(CreateTrafficMirrorConfig trafficMirrorConfig) {
        this.trafficMirrorConfig = trafficMirrorConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withTrafficMirrorConfig(
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
        UpdateRedirectPoolsExtendConfig that = (UpdateRedirectPoolsExtendConfig) obj;
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
        sb.append("class UpdateRedirectPoolsExtendConfig {\n");
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
