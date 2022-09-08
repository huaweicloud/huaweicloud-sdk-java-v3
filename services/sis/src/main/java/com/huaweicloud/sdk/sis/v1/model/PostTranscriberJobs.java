package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PostTranscriberJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private TranscriberConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_url")

    private String dataUrl;

    public PostTranscriberJobs withConfig(TranscriberConfig config) {
        this.config = config;
        return this;
    }

    public PostTranscriberJobs withConfig(Consumer<TranscriberConfig> configSetter) {
        if (this.config == null) {
            this.config = new TranscriberConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public TranscriberConfig getConfig() {
        return config;
    }

    public void setConfig(TranscriberConfig config) {
        this.config = config;
    }

    public PostTranscriberJobs withDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
        return this;
    }

    /**
     * 存放在OBS的音频文件路径。OBS的region要和请求服务的region保持一致，region不一致则OBS不可用，即使obs是公开访问权限。
     * @return dataUrl
     */
    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostTranscriberJobs postTranscriberJobs = (PostTranscriberJobs) o;
        return Objects.equals(this.config, postTranscriberJobs.config)
            && Objects.equals(this.dataUrl, postTranscriberJobs.dataUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, dataUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostTranscriberJobs {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    dataUrl: ").append(toIndentedString(dataUrl)).append("\n");
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
