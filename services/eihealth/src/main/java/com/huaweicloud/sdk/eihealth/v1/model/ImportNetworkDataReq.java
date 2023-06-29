package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入网上数据请求体
 */
public class ImportNetworkDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_folder")

    private String targetFolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5s")

    private List<String> md5s = null;

    public ImportNetworkDataReq withTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
        return this;
    }

    /**
     * 所在文件夹
     * @return targetFolder
     */
    public String getTargetFolder() {
        return targetFolder;
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    public ImportNetworkDataReq withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public ImportNetworkDataReq addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public ImportNetworkDataReq withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 导入网上数据的url集
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public ImportNetworkDataReq withMd5s(List<String> md5s) {
        this.md5s = md5s;
        return this;
    }

    public ImportNetworkDataReq addMd5sItem(String md5sItem) {
        if (this.md5s == null) {
            this.md5s = new ArrayList<>();
        }
        this.md5s.add(md5sItem);
        return this;
    }

    public ImportNetworkDataReq withMd5s(Consumer<List<String>> md5sSetter) {
        if (this.md5s == null) {
            this.md5s = new ArrayList<>();
        }
        md5sSetter.accept(this.md5s);
        return this;
    }

    /**
     * 导入网上数据的md5集
     * @return md5s
     */
    public List<String> getMd5s() {
        return md5s;
    }

    public void setMd5s(List<String> md5s) {
        this.md5s = md5s;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportNetworkDataReq that = (ImportNetworkDataReq) obj;
        return Objects.equals(this.targetFolder, that.targetFolder) && Objects.equals(this.urls, that.urls)
            && Objects.equals(this.md5s, that.md5s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetFolder, urls, md5s);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportNetworkDataReq {\n");
        sb.append("    targetFolder: ").append(toIndentedString(targetFolder)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    md5s: ").append(toIndentedString(md5s)).append("\n");
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
