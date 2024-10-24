package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * API版本详细信息列表。
 */
public class ApiVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinkInfo> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    public ApiVersion withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API版本号，如v1、v3。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiVersion withLinks(List<LinkInfo> links) {
        this.links = links;
        return this;
    }

    public ApiVersion addLinksItem(LinkInfo linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ApiVersion withLinks(Consumer<List<LinkInfo>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 对应API的链接信息，v1、v3版本该字段为空。
     * @return links
     */
    public List<LinkInfo> getLinks() {
        return links;
    }

    public void setLinks(List<LinkInfo> links) {
        this.links = links;
    }

    public ApiVersion withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 版本状态。 取值“CURRENT”，表示该版本为主推版本。 取值“SUPPORTED”，表示为老版本，但是现在还继续支持 取值“DEPRECATED”，表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApiVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 若该版本API支持微版本，则填支持的最大微版本号，如果不支持微版本，则填空
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApiVersion withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 版本更新时间。 格式为“yyyy-mm-dd Thh:mm:ssZ”。 其中，T指某个时间的开始；Z指UTC时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiVersion that = (ApiVersion) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links)
            && Objects.equals(this.status, that.status) && Objects.equals(this.version, that.version)
            && Objects.equals(this.updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, status, version, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersion {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
