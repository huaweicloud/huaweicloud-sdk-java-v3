package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体
 */
public class RunModerationAudioRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private RunModerationAudioRequestBodyConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    public RunModerationAudioRequestBody withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 与url二选一  语音文件Base64编码字符串。要求base64编码后大小不超过4M。语音时长不超过1分钟。 
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public RunModerationAudioRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与data二选一  语音的URL路径，目前支持对服务授权访问华为云上OBS的URL，华为云上OBS提供的临时授权访问的URL和匿名公开授权的URL。 OBS服务的访问权限设置请参见配置OBS访问权限。 出于安全的考虑，当前服务不支持从公网上任意URL读取数据。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RunModerationAudioRequestBody withConfig(RunModerationAudioRequestBodyConfig config) {
        this.config = config;
        return this;
    }

    public RunModerationAudioRequestBody withConfig(Consumer<RunModerationAudioRequestBodyConfig> configSetter) {
        if (this.config == null) {
            this.config = new RunModerationAudioRequestBodyConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public RunModerationAudioRequestBodyConfig getConfig() {
        return config;
    }

    public void setConfig(RunModerationAudioRequestBodyConfig config) {
        this.config = config;
    }

    public RunModerationAudioRequestBody withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public RunModerationAudioRequestBody addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public RunModerationAudioRequestBody withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 审核场景。 当前支持的场景有默认场景和用户自定义场景： ● 默认场景为：   – politics：涉政   – porn：涉黄   – ad：广告   – abuse：辱骂   – contraband：违禁品 ● 用户自定义场景为：自定义词库。 说明 自定义词库的创建和使用请参见配置自定义词库。 
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunModerationAudioRequestBody that = (RunModerationAudioRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.url, that.url)
            && Objects.equals(this.config, that.config) && Objects.equals(this.categories, that.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, url, config, categories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModerationAudioRequestBody {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
