package com.huaweicloud.sdk.eps.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.Link;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 版本详情
 */
public class VersionDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Link> links = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;
    /**
     * 版本状态，为如下3种： CURRENT：表示该版本为主推版本。 SUPPORTED：表示为老版本，但是现在还继续支持。 DEPRECATED：表示为废弃版本，存在后续删除的可能。
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
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private OffsetDateTime updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_version")
    
    private String minVersion;

    public VersionDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 版本ID（版本号），如v1.0。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public VersionDetail withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    
    public VersionDetail addLinksItem(Link linksItem) {
        if(this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public VersionDetail withLinks(Consumer<List<Link>> linksSetter) {
        if(this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * API的URL地址。
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    

    public VersionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 若该版本API支持微版本，则返回支持的最大微版本号，如果不支持微版本，则返回空。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public VersionDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 版本状态，为如下3种： CURRENT：表示该版本为主推版本。 SUPPORTED：表示为老版本，但是现在还继续支持。 DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public VersionDetail withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 版本发布时间，采用UTC时间表示。如v1.0发布的时间2016-12-09T00:00:00Z。
     * @return updated
     */
    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    

    public VersionDetail withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    


    /**
     * 若该版本API 支持微版本，则返回支持的最小微版本号， 如果不支持微版本，则返回空。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionDetail versionDetail = (VersionDetail) o;
        return Objects.equals(this.id, versionDetail.id) &&
            Objects.equals(this.links, versionDetail.links) &&
            Objects.equals(this.version, versionDetail.version) &&
            Objects.equals(this.status, versionDetail.status) &&
            Objects.equals(this.updated, versionDetail.updated) &&
            Objects.equals(this.minVersion, versionDetail.minVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, version, status, updated, minVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

