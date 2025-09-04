package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * url重定向配置。
 */
public class UrlRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_include_list")

    private String urlIncludeList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_exclude_list")

    private String urlExcludeList;

    public UrlRedirectionOptions withUrlIncludeList(String urlIncludeList) {
        this.urlIncludeList = urlIncludeList;
        return this;
    }

    /**
     * 允许重定向url。
     * @return urlIncludeList
     */
    public String getUrlIncludeList() {
        return urlIncludeList;
    }

    public void setUrlIncludeList(String urlIncludeList) {
        this.urlIncludeList = urlIncludeList;
    }

    public UrlRedirectionOptions withUrlExcludeList(String urlExcludeList) {
        this.urlExcludeList = urlExcludeList;
        return this;
    }

    /**
     * 拒绝重定向url。
     * @return urlExcludeList
     */
    public String getUrlExcludeList() {
        return urlExcludeList;
    }

    public void setUrlExcludeList(String urlExcludeList) {
        this.urlExcludeList = urlExcludeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlRedirectionOptions that = (UrlRedirectionOptions) obj;
        return Objects.equals(this.urlIncludeList, that.urlIncludeList)
            && Objects.equals(this.urlExcludeList, that.urlExcludeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlIncludeList, urlExcludeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlRedirectionOptions {\n");
        sb.append("    urlIncludeList: ").append(toIndentedString(urlIncludeList)).append("\n");
        sb.append("    urlExcludeList: ").append(toIndentedString(urlExcludeList)).append("\n");
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
