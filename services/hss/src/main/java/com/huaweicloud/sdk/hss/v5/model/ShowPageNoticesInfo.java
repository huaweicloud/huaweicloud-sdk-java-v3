package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowPageNoticesInfo
 */
public class ShowPageNoticesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_location")

    private String pageLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    public ShowPageNoticesInfo withPageLocation(String pageLocation) {
        this.pageLocation = pageLocation;
        return this;
    }

    /**
     * 页面位置
     * @return pageLocation
     */
    public String getPageLocation() {
        return pageLocation;
    }

    public void setPageLocation(String pageLocation) {
        this.pageLocation = pageLocation;
    }

    public ShowPageNoticesInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 通知类型，包含如下两种。 - links :超链接 - text  :文本
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowPageNoticesInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 通知内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowPageNoticesInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 通知标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowPageNoticesInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 超链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowPageNoticesInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 通知等级，包含如下3种。 - error :紧急 - warn :重要 - prompt :提示
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPageNoticesInfo that = (ShowPageNoticesInfo) obj;
        return Objects.equals(this.pageLocation, that.pageLocation) && Objects.equals(this.type, that.type)
            && Objects.equals(this.content, that.content) && Objects.equals(this.title, that.title)
            && Objects.equals(this.url, that.url) && Objects.equals(this.level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageLocation, type, content, title, url, level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPageNoticesInfo {\n");
        sb.append("    pageLocation: ").append(toIndentedString(pageLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
