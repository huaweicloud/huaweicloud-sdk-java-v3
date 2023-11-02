package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转发到的后端主机组的配置。当action为REDIRECT_TO_POOL时生效。
 */
public class UpdateRedirectPoolsExtendConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_enable")

    private Boolean rewriteUrlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_url_config")

    private CreateRewriteUrlConfig rewriteUrlConfig;

    public UpdateRedirectPoolsExtendConfig withRewriteUrlEnable(Boolean rewriteUrlEnable) {
        this.rewriteUrlEnable = rewriteUrlEnable;
        return this;
    }

    /**
     * 是否开启url重定向
     * @return rewriteUrlEnable
     */
    public Boolean getRewriteUrlEnable() {
        return rewriteUrlEnable;
    }

    public void setRewriteUrlEnable(Boolean rewriteUrlEnable) {
        this.rewriteUrlEnable = rewriteUrlEnable;
    }

    public UpdateRedirectPoolsExtendConfig withRewriteUrlConfig(CreateRewriteUrlConfig rewriteUrlConfig) {
        this.rewriteUrlConfig = rewriteUrlConfig;
        return this;
    }

    public UpdateRedirectPoolsExtendConfig withRewriteUrlConfig(
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
            && Objects.equals(this.rewriteUrlConfig, that.rewriteUrlConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewriteUrlEnable, rewriteUrlConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRedirectPoolsExtendConfig {\n");
        sb.append("    rewriteUrlEnable: ").append(toIndentedString(rewriteUrlEnable)).append("\n");
        sb.append("    rewriteUrlConfig: ").append(toIndentedString(rewriteUrlConfig)).append("\n");
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
