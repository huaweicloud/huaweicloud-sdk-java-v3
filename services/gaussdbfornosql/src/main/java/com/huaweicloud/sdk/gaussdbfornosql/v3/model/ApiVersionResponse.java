package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * API版本详细信息列表。
 */
public class ApiVersionResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    @JacksonXmlProperty(localName = "links")

    private List<Links> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    @JacksonXmlProperty(localName = "min_version")

    private String minVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    @JacksonXmlProperty(localName = "updated")

    private String updated;

    public ApiVersionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API版本号。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiVersionResponse withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    public ApiVersionResponse addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ApiVersionResponse withLinks(Consumer<List<Links>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 对应API的链接信息,v3版本该字段为[]。
     * @return links
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    public ApiVersionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 版本状态。 取值为“CURRENT”，表示该版本目前已对外公布。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApiVersionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * API版本的子版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApiVersionResponse withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * API版本的最小版本号。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public ApiVersionResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 版本更新时间。格式为“yyyy-mm-dd Thh:mm:ssZ”。其中，T指某个时间的开始，Z指UTC时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiVersionResponse apiVersionResponse = (ApiVersionResponse) o;
        return Objects.equals(this.id, apiVersionResponse.id) && Objects.equals(this.links, apiVersionResponse.links)
            && Objects.equals(this.status, apiVersionResponse.status)
            && Objects.equals(this.version, apiVersionResponse.version)
            && Objects.equals(this.minVersion, apiVersionResponse.minVersion)
            && Objects.equals(this.updated, apiVersionResponse.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, status, version, minVersion, updated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
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
