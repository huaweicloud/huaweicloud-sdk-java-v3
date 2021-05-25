package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.Links;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VersionInfo
 */
public class VersionInfo  {

    /**
     * API版本ID。
     */
    public static final class IdEnum {

        
        /**
         * Enum V1 for value: "v1"
         */
        public static final IdEnum V1 = new IdEnum("v1");
        
        /**
         * Enum V2 for value: "v2"
         */
        public static final IdEnum V2 = new IdEnum("v2");
        

        private static final Map<String, IdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IdEnum> createStaticFields() {
            Map<String, IdEnum> map = new HashMap<>();
            map.put("v1", V1);
            map.put("v2", V2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IdEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IdEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IdEnum(value);
            }
            return result;
        }

        public static IdEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof IdEnum) {
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
    @JsonProperty(value="id")
    
    private IdEnum id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_version")
    
    private String minVersion;
    /**
     * 版本状态，为如下3种：CURRENT：表示该版本为主推版本；SUPPORT：表示为老版本，但是现在还继续支持；DEPRECATED：表示为废弃版本，存在后续删除的可能。
     */
    public static final class StatusEnum {

        
        /**
         * Enum CURRENT for value: "CURRENT"
         */
        public static final StatusEnum CURRENT = new StatusEnum("CURRENT");
        
        /**
         * Enum SUPPORT for value: "SUPPORT"
         */
        public static final StatusEnum SUPPORT = new StatusEnum("SUPPORT");
        
        /**
         * Enum DEPRECATED for value: "DEPRECATED"
         */
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
            return String.valueOf(value);
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
            if (obj != null && obj instanceof StatusEnum) {
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
    @JsonProperty(value="update")
    
    private OffsetDateTime update;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public VersionInfo withId(IdEnum id) {
        this.id = id;
        return this;
    }

    


    /**
     * API版本ID。
     * @return id
     */
    public IdEnum getId() {
        return id;
    }

    public void setId(IdEnum id) {
        this.id = id;
    }

    

    public VersionInfo withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public VersionInfo addLinksItem(Links linksItem) {
        if(this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public VersionInfo withLinks(Consumer<List<Links>> linksSetter) {
        if(this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * API的URL相关信息。
     * @return links
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    

    public VersionInfo withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    


    /**
     * 该版本API支持的最小微版本号。
     * @return minVersion
     */
    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    

    public VersionInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 版本状态，为如下3种：CURRENT：表示该版本为主推版本；SUPPORT：表示为老版本，但是现在还继续支持；DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public VersionInfo withUpdate(OffsetDateTime update) {
        this.update = update;
        return this;
    }

    


    /**
     * 版本发布时间，使用UTC时间。
     * @return update
     */
    public OffsetDateTime getUpdate() {
        return update;
    }

    public void setUpdate(OffsetDateTime update) {
        this.update = update;
    }

    

    public VersionInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 该版本API支持的最大微版本号。
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
        VersionInfo versionInfo = (VersionInfo) o;
        return Objects.equals(this.id, versionInfo.id) &&
            Objects.equals(this.links, versionInfo.links) &&
            Objects.equals(this.minVersion, versionInfo.minVersion) &&
            Objects.equals(this.status, versionInfo.status) &&
            Objects.equals(this.update, versionInfo.update) &&
            Objects.equals(this.version, versionInfo.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, links, minVersion, status, update, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

