package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要解禁或封禁的URL信息
 */
public class AccessControlUrls {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ban_duration")

    private Integer banDuration;

    public AccessControlUrls withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public AccessControlUrls addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public AccessControlUrls withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * URL必须带有“http://”或“https://”，单次最多输入1000个url。
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public AccessControlUrls withBanDuration(Integer banDuration) {
        this.banDuration = banDuration;
        return this;
    }

    /**
     * URL封禁天数，默认7天，取值范围1-30。
     * @return banDuration
     */
    public Integer getBanDuration() {
        return banDuration;
    }

    public void setBanDuration(Integer banDuration) {
        this.banDuration = banDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlUrls that = (AccessControlUrls) obj;
        return Objects.equals(this.urls, that.urls) && Objects.equals(this.banDuration, that.banDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urls, banDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessControlUrls {\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    banDuration: ").append(toIndentedString(banDuration)).append("\n");
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
