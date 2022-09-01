package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SubtitleInfo
 */
public class SubtitleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    public SubtitleInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 字幕文件的下载地址 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SubtitleInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 字幕文件id 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SubtitleInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 字幕文件类型 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubtitleInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 字幕文件语言种类 
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubtitleInfo subtitleInfo = (SubtitleInfo) o;
        return Objects.equals(this.url, subtitleInfo.url) && Objects.equals(this.id, subtitleInfo.id)
            && Objects.equals(this.type, subtitleInfo.type) && Objects.equals(this.language, subtitleInfo.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, id, type, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtitleInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
