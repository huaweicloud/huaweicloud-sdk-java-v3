package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListBackupFileLinksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinksItem> links = null;

    public ListBackupFileLinksResponse withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /** OBS桶内文件路径。
     * 
     * @return filePath */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ListBackupFileLinksResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /** OBS桶名。
     * 
     * @return bucketName */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ListBackupFileLinksResponse withLinks(List<LinksItem> links) {
        this.links = links;
        return this;
    }

    public ListBackupFileLinksResponse addLinksItem(LinksItem linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ListBackupFileLinksResponse withLinks(Consumer<List<LinksItem>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 备份文件下链接集合，链接数最大为64个。
     * 
     * @return links */
    public List<LinksItem> getLinks() {
        return links;
    }

    public void setLinks(List<LinksItem> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupFileLinksResponse listBackupFileLinksResponse = (ListBackupFileLinksResponse) o;
        return Objects.equals(this.filePath, listBackupFileLinksResponse.filePath)
            && Objects.equals(this.bucketName, listBackupFileLinksResponse.bucketName)
            && Objects.equals(this.links, listBackupFileLinksResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, bucketName, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupFileLinksResponse {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
