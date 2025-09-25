package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 活动大促信息
 */
public class HttpWelfareInfoResponseInfoActivitiesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_json")

    private String urlJson;

    public HttpWelfareInfoResponseInfoActivitiesInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**: 活动大促标题 **取值范围**: 字符长度1-256 
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HttpWelfareInfoResponseInfoActivitiesInfo withUrlJson(String urlJson) {
        this.urlJson = urlJson;
        return this;
    }

    /**
     * **参数解释**: 活动大促链接，包括中国站，国际站欧洲站，由console根据不同的场景选择跳转 **取值范围**: 字符长度0-65535 
     * @return urlJson
     */
    public String getUrlJson() {
        return urlJson;
    }

    public void setUrlJson(String urlJson) {
        this.urlJson = urlJson;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpWelfareInfoResponseInfoActivitiesInfo that = (HttpWelfareInfoResponseInfoActivitiesInfo) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.urlJson, that.urlJson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, urlJson);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpWelfareInfoResponseInfoActivitiesInfo {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    urlJson: ").append(toIndentedString(urlJson)).append("\n");
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
