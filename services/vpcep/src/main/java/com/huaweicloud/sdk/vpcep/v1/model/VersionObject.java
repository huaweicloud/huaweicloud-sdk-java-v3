package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 描述VPCEP服务API版本信息列表
 */
public class VersionObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private OffsetDateTime updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Link> links = null;

    public VersionObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 版本状态。   - CURRENT：表示该版本为主推版本。   - SUPPORT：表示为老版本，但是现在还在继续支持。   -DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VersionObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本ID。 - v1：当前主推版本
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionObject withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 版本发布时间。采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * @return updated
     */
    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public VersionObject withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 支持的版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionObject withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 支持的微版本号。若该版本API不支持微版本，则为空。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public VersionObject withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    public VersionObject addLinksItem(Link linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public VersionObject withLinks(Consumer<List<Link>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * API的URL地址
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionObject that = (VersionObject) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.id, that.id)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.version, that.version)
            && Objects.equals(this.minVersion, that.minVersion) && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, id, updated, version, minVersion, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionObject {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
