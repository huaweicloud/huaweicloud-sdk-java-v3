package com.huaweicloud.sdk.bms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.Links;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * image数据结构说明
 */
public class ImageInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private UUID id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 镜像的类型。取值为：Linux（包括SUSE/RedHat/CentOS/Oracle Linux/EulerOS/Ubuntu操作系统）Windows（Windows操作系统）Other（ESXi操作系统）
     */
    public static final class OsTypeEnum {

        
        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");
        
        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");
        
        /**
         * Enum OTHER for value: "Other"
         */
        public static final OsTypeEnum OTHER = new OsTypeEnum("Other");
        

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("Linux", LINUX);
            map.put("Windows", WINDOWS);
            map.put("Other", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_type")
    
    private OsTypeEnum osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
    
    public ImageInfo withId(UUID id) {
        this.id = id;
        return this;
    }

    


    /**
     * 镜像ID，格式为UUID。
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    

    public ImageInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ImageInfo withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 镜像的类型。取值为：Linux（包括SUSE/RedHat/CentOS/Oracle Linux/EulerOS/Ubuntu操作系统）Windows（Windows操作系统）Other（ESXi操作系统）
     * @return osType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_type")
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    

    public ImageInfo withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public ImageInfo addLinksItem(Links linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public ImageInfo withLinks(Consumer<List<Links>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 镜像相关快捷链接地址。
     * @return links
     */
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
        ImageInfo imageInfo = (ImageInfo) o;
        return Objects.equals(this.id, imageInfo.id) &&
            Objects.equals(this.name, imageInfo.name) &&
            Objects.equals(this.osType, imageInfo.osType) &&
            Objects.equals(this.links, imageInfo.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, osType, links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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

