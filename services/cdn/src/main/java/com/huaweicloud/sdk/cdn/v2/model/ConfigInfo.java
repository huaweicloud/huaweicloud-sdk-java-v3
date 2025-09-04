package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置信息
 */
public class ConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private TopUrl url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ua")

    private TopUa ua;

    public ConfigInfo withUrl(TopUrl url) {
        this.url = url;
        return this;
    }

    public ConfigInfo withUrl(Consumer<TopUrl> urlSetter) {
        if (this.url == null) {
            this.url = new TopUrl();
            urlSetter.accept(this.url);
        }

        return this;
    }

    /**
     * Get url
     * @return url
     */
    public TopUrl getUrl() {
        return url;
    }

    public void setUrl(TopUrl url) {
        this.url = url;
    }

    public ConfigInfo withUa(TopUa ua) {
        this.ua = ua;
        return this;
    }

    public ConfigInfo withUa(Consumer<TopUa> uaSetter) {
        if (this.ua == null) {
            this.ua = new TopUa();
            uaSetter.accept(this.ua);
        }

        return this;
    }

    /**
     * Get ua
     * @return ua
     */
    public TopUa getUa() {
        return ua;
    }

    public void setUa(TopUa ua) {
        this.ua = ua;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigInfo that = (ConfigInfo) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.ua, that.ua);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, ua);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    ua: ").append(toIndentedString(ua)).append("\n");
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
