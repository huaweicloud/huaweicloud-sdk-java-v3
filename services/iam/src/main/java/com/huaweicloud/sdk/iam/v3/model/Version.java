package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Version {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<VersionLinks> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media-types")

    private List<VersionMediatypes> mediaTypes = null;

    public Version withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 版本状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Version withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 最后更新时间。
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Version withLinks(List<VersionLinks> links) {
        this.links = links;
        return this;
    }

    public Version addLinksItem(VersionLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public Version withLinks(Consumer<List<VersionLinks>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 版本的资源链接信息。
     * 
     * @return links */
    public List<VersionLinks> getLinks() {
        return links;
    }

    public void setLinks(List<VersionLinks> links) {
        this.links = links;
    }

    public Version withId(String id) {
        this.id = id;
        return this;
    }

    /** 版本号，如v3.6。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Version withMediaTypes(List<VersionMediatypes> mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }

    public Version addMediaTypesItem(VersionMediatypes mediaTypesItem) {
        if (this.mediaTypes == null) {
            this.mediaTypes = new ArrayList<>();
        }
        this.mediaTypes.add(mediaTypesItem);
        return this;
    }

    public Version withMediaTypes(Consumer<List<VersionMediatypes>> mediaTypesSetter) {
        if (this.mediaTypes == null) {
            this.mediaTypes = new ArrayList<>();
        }
        mediaTypesSetter.accept(this.mediaTypes);
        return this;
    }

    /** 支持的消息格式。
     * 
     * @return mediaTypes */
    public List<VersionMediatypes> getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(List<VersionMediatypes> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Version version = (Version) o;
        return Objects.equals(this.status, version.status) && Objects.equals(this.updated, version.updated)
            && Objects.equals(this.links, version.links) && Objects.equals(this.id, version.id)
            && Objects.equals(this.mediaTypes, version.mediaTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, updated, links, id, mediaTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Version {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
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
