package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreheatingTaskRequestBody
 */
public class PreheatingTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_url_encode")

    private Boolean zhUrlEncode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    public PreheatingTaskRequestBody withZhUrlEncode(Boolean zhUrlEncode) {
        this.zhUrlEncode = zhUrlEncode;
        return this;
    }

    /**
     * 是否对url中的中文字符进行编码后预热，false代表不开启，true代表开启，开启后仅预热转码后的URL。
     * @return zhUrlEncode
     */
    public Boolean getZhUrlEncode() {
        return zhUrlEncode;
    }

    public void setZhUrlEncode(Boolean zhUrlEncode) {
        this.zhUrlEncode = zhUrlEncode;
    }

    public PreheatingTaskRequestBody withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public PreheatingTaskRequestBody addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public PreheatingTaskRequestBody withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 需要预热的URL必须带有“http://”或“https://”，多个URL用逗号分隔（\"url1\", \"url2\"），目前不支持对目录的预热，单个url的长度限制为4096字符,单次最多输入1000个url。
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreheatingTaskRequestBody that = (PreheatingTaskRequestBody) obj;
        return Objects.equals(this.zhUrlEncode, that.zhUrlEncode) && Objects.equals(this.urls, that.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhUrlEncode, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreheatingTaskRequestBody {\n");
        sb.append("    zhUrlEncode: ").append(toIndentedString(zhUrlEncode)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
