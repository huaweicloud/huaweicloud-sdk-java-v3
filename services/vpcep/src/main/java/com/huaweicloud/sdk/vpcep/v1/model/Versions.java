package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 描述VPCEP服务API版本信息列表 */
public class Versions {

    /** 版本状态。● CURRENT：表示该版本为主推版本。● SUPPORT：表示为老版本，但是现在还在继续支持。● DEPRECATED：表示为废弃版本，存在后续删除的可能。 */
    public static final class StatusEnum {

        /** Enum CURRENT for value: "CURRENT" */
        public static final StatusEnum CURRENT = new StatusEnum("CURRENT");

        /** Enum SUPPORT for value: "SUPPORT" */
        public static final StatusEnum SUPPORT = new StatusEnum("SUPPORT");

        /** Enum DEPRECATED for value: "DEPRECATED" */
        public static final StatusEnum DEPRECATED = new StatusEnum("DEPRECATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CURRENT", CURRENT);
            map.put("SUPPORT", SUPPORT);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 版本ID。 */
    public static final class IdEnum {

        /** Enum V1 for value: "v1" */
        public static final IdEnum V1 = new IdEnum("v1");

        private static final Map<String, IdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IdEnum> createStaticFields() {
            Map<String, IdEnum> map = new HashMap<>();
            map.put("v1", V1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IdEnum(String value) {
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
        public static IdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            IdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IdEnum(value);
            }
            return result;
        }

        public static IdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IdEnum) {
                return this.value.equals(((IdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private IdEnum id;

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

    private List<Links> links = null;

    public Versions withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 版本状态。● CURRENT：表示该版本为主推版本。● SUPPORT：表示为老版本，但是现在还在继续支持。● DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Versions withId(IdEnum id) {
        this.id = id;
        return this;
    }

    /** 版本ID。
     * 
     * @return id */
    public IdEnum getId() {
        return id;
    }

    public void setId(IdEnum id) {
        this.id = id;
    }

    public Versions withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /** 版本发布时间。采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * 
     * @return updated */
    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public Versions withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 支持的版本号。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Versions withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /** 支持的微版本号。若该版本API不支持微版本，则为空。
     * 
     * @return minVersion */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public Versions withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    public Versions addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public Versions withLinks(Consumer<List<Links>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** API的URL地址
     * 
     * @return links */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
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
        Versions versions = (Versions) o;
        return Objects.equals(this.status, versions.status) && Objects.equals(this.id, versions.id)
            && Objects.equals(this.updated, versions.updated) && Objects.equals(this.version, versions.version)
            && Objects.equals(this.minVersion, versions.minVersion) && Objects.equals(this.links, versions.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, id, updated, version, minVersion, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Versions {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
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
