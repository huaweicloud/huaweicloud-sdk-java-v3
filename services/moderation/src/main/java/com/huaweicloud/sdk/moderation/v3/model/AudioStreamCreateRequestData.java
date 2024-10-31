package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 音频流数据输入
 */
public class AudioStreamCreateRequestData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_all_results")

    private Boolean returnAllResults;

    public AudioStreamCreateRequestData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 音频流url地址，支持rtmp、rtmps、hls、http、https等主流协议。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AudioStreamCreateRequestData withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 指定音频流中语种类型 zh: 中文,默认值为zh
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public AudioStreamCreateRequestData withReturnAllResults(Boolean returnAllResults) {
        this.returnAllResults = returnAllResults;
        return this;
    }

    /**
     * 返回音频片段结果的策略。可选值如下： false：返回风险等级为非pass的音频片段结果 true：返回所有风险等级的音频片段结果 说明： 1. 默认值为false； 2. 每隔10秒返回一次最近10秒音频流的审核结果。
     * @return returnAllResults
     */
    public Boolean getReturnAllResults() {
        return returnAllResults;
    }

    public void setReturnAllResults(Boolean returnAllResults) {
        this.returnAllResults = returnAllResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioStreamCreateRequestData that = (AudioStreamCreateRequestData) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.language, that.language)
            && Objects.equals(this.returnAllResults, that.returnAllResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, language, returnAllResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioStreamCreateRequestData {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    returnAllResults: ").append(toIndentedString(returnAllResults)).append("\n");
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
