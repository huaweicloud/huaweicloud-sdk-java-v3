package com.huaweicloud.sdk.dss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 版本号详情
 */
public class VersionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private VersionLinks links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    public VersionBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 版本id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionBody withLinks(VersionLinks links) {
        this.links = links;
        return this;
    }

    public VersionBody withLinks(Consumer<VersionLinks> linksSetter) {
        if (this.links == null) {
            this.links = new VersionLinks();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public VersionLinks getLinks() {
        return links;
    }

    public void setLinks(VersionLinks links) {
        this.links = links;
    }

    public VersionBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 版本状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VersionBody withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 版本上线时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public VersionBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 微版本最大值，如果没有微版本则为空
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionBody withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 微版本最小值，如果没有微版本则为空
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionBody that = (VersionBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links)
            && Objects.equals(this.status, that.status) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.version, that.version) && Objects.equals(this.minVersion, that.minVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, status, updated, version, minVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
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
