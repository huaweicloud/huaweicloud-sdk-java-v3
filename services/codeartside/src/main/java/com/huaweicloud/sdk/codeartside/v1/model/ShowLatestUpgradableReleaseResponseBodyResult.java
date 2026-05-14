package com.huaweicloud.sdk.codeartside.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 返回值
 */
public class ShowLatestUpgradableReleaseResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available")

    private Boolean available;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_product_name")

    private String subProductName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ShowLatestUpgradableReleaseResponseBodyResult withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 哈希值
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public ShowLatestUpgradableReleaseResponseBodyResult withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * 版本是否可用
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public ShowLatestUpgradableReleaseResponseBodyResult withSubProductName(String subProductName) {
        this.subProductName = subProductName;
        return this;
    }

    /**
     * 子产品名称
     * @return subProductName
     */
    public String getSubProductName() {
        return subProductName;
    }

    public void setSubProductName(String subProductName) {
        this.subProductName = subProductName;
    }

    public ShowLatestUpgradableReleaseResponseBodyResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 子产品版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowLatestUpgradableReleaseResponseBodyResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 下载链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLatestUpgradableReleaseResponseBodyResult that = (ShowLatestUpgradableReleaseResponseBodyResult) obj;
        return Objects.equals(this.hash, that.hash) && Objects.equals(this.available, that.available)
            && Objects.equals(this.subProductName, that.subProductName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash, available, subProductName, version, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestUpgradableReleaseResponseBodyResult {\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    subProductName: ").append(toIndentedString(subProductName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
