package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 版本信息结构体
 */
public class Versions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Link> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media-types")

    private List<MediaTypes> mediaTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public Versions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 接口版本的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Versions withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    public Versions addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public Versions withLinks(Consumer<List<Link>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 接口版本信息的URI描述信息
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Versions withMediaTypes(List<MediaTypes> mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }

    public Versions addMediaTypesItem(MediaTypes mediaTypesItem) {
        if (this.mediaTypes == null) {
            this.mediaTypes = new ArrayList<>();
        }
        this.mediaTypes.add(mediaTypesItem);
        return this;
    }

    public Versions withMediaTypes(Consumer<List<MediaTypes>> mediaTypesSetter) {
        if (this.mediaTypes == null) {
            this.mediaTypes = new ArrayList<>();
        }
        mediaTypesSetter.accept(this.mediaTypes);
        return this;
    }

    /**
     * 接口版本的请求消息类型信息
     * @return mediaTypes
     */
    public List<MediaTypes> getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(List<MediaTypes> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public Versions withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 接口版本的最小版本号
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public Versions withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 接口版本的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Versions withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 接口版本更新时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Versions withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 接口版本的版本号信息
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Versions versions = (Versions) o;
        return Objects.equals(this.id, versions.id) && Objects.equals(this.links, versions.links)
            && Objects.equals(this.mediaTypes, versions.mediaTypes)
            && Objects.equals(this.minVersion, versions.minVersion) && Objects.equals(this.status, versions.status)
            && Objects.equals(this.updated, versions.updated) && Objects.equals(this.version, versions.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, mediaTypes, minVersion, status, updated, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Versions {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
