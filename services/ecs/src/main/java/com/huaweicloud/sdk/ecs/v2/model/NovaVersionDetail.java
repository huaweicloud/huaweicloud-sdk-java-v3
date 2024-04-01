package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 *  
 */
public class NovaVersionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<NovaLink> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media-types")

    private List<NovaVersionMediaType> mediaTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_version")

    private String minVersion;

    /**
     * 这个是API版本的状态。  可以是：  - CURRENT这是使用的API的首选版本； - SUPPORTED：这是一个较老的，但仍然支持的API版本； - DEPRECATED：一个被废弃的API版本，该版本将被删除
     */
    public static final class StatusEnum {

        /**
         * Enum CURRENT for value: "CURRENT"
         */
        public static final StatusEnum CURRENT = new StatusEnum("CURRENT");

        /**
         * Enum SUPPORTED for value: "SUPPORTED"
         */
        public static final StatusEnum SUPPORTED = new StatusEnum("SUPPORTED");

        /**
         * Enum DEPRECATED for value: "DEPRECATED"
         */
        public static final StatusEnum DEPRECATED = new StatusEnum("DEPRECATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CURRENT", CURRENT);
            map.put("SUPPORTED", SUPPORTED);
            map.put("DEPRECATED", DEPRECATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public NovaVersionDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 所讨论的版本的通用名称。仅仅是信息性的，它没有真正的语义。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaVersionDetail withLinks(List<NovaLink> links) {
        this.links = links;
        return this;
    }

    public NovaVersionDetail addLinksItem(NovaLink linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public NovaVersionDetail withLinks(Consumer<List<NovaLink>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 链接到资源的问题。有关更多信息，请参见[OpenStack Documentation](http://developer.openstack.org/api-guide/compute/links_and_references.html)。
     * @return links
     */
    public List<NovaLink> getLinks() {
        return links;
    }

    public void setLinks(List<NovaLink> links) {
        this.links = links;
    }

    public NovaVersionDetail withMediaTypes(List<NovaVersionMediaType> mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }

    public NovaVersionDetail addMediaTypesItem(NovaVersionMediaType mediaTypesItem) {
        if (this.mediaTypes == null) {
            this.mediaTypes = new ArrayList<>();
        }
        this.mediaTypes.add(mediaTypesItem);
        return this;
    }

    public NovaVersionDetail withMediaTypes(Consumer<List<NovaVersionMediaType>> mediaTypesSetter) {
        if (this.mediaTypes == null) {
            this.mediaTypes = new ArrayList<>();
        }
        mediaTypesSetter.accept(this.mediaTypes);
        return this;
    }

    /**
     * 媒体类型。
     * @return mediaTypes
     */
    public List<NovaVersionMediaType> getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(List<NovaVersionMediaType> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public NovaVersionDetail withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * 如果API的这个版本支持微版本，则支持最小的微版本。如果不支持微版本，这将是空字符串。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public NovaVersionDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 这个是API版本的状态。  可以是：  - CURRENT这是使用的API的首选版本； - SUPPORTED：这是一个较老的，但仍然支持的API版本； - DEPRECATED：一个被废弃的API版本，该版本将被删除
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NovaVersionDetail withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 一个有特定值的字符串。API版本为2.0时，值为'2011-01-21T11:33:21Z' ，API版本是2.1时，值为' 2013-07-23T11:33:21Z'。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public NovaVersionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 如果API的这个版本支持微版本，则支持最大的微版本。如果不支持微版本，这将是空字符串。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaVersionDetail that = (NovaVersionDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links)
            && Objects.equals(this.mediaTypes, that.mediaTypes) && Objects.equals(this.minVersion, that.minVersion)
            && Objects.equals(this.status, that.status) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links, mediaTypes, minVersion, status, updated, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaVersionDetail {\n");
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
