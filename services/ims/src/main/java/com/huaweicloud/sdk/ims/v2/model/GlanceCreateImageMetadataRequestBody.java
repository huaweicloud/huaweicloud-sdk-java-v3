package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建镜像请求体
 */
public class GlanceCreateImageMetadataRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private String containerFormat = "bare";
    /**
     * 镜像文件格式。目前支持vhd，zvhd、zvhd2、raw，qcow2。默认取值为vhd
     */
    public static class DiskFormatEnum {

        
        /**
         * Enum VHD for value: "vhd"
         */
        public static final DiskFormatEnum VHD = new DiskFormatEnum("vhd");

        
        /**
         * Enum ZVHD for value: "zvhd"
         */
        public static final DiskFormatEnum ZVHD = new DiskFormatEnum("zvhd");

        
        /**
         * Enum ZVHD2 for value: "zvhd2"
         */
        public static final DiskFormatEnum ZVHD2 = new DiskFormatEnum("zvhd2");

        
        /**
         * Enum RAW for value: "raw"
         */
        public static final DiskFormatEnum RAW = new DiskFormatEnum("raw");

        
        /**
         * Enum QCOW2 for value: "qcow2"
         */
        public static final DiskFormatEnum QCOW2 = new DiskFormatEnum("qcow2");

        

        public static Map<String, DiskFormatEnum> staticFields =
                new HashMap<String, DiskFormatEnum>() {
                    { 
                        put("vhd", VHD);
                        put("zvhd", ZVHD);
                        put("zvhd2", ZVHD2);
                        put("raw", RAW);
                        put("qcow2", QCOW2);
                    }
                };

        private String value;

        DiskFormatEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DiskFormatEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DiskFormatEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DiskFormatEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DiskFormatEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DiskFormatEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DiskFormatEnum) {
                return this.value.equals(((DiskFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_format")
    
    private DiskFormatEnum diskFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private Integer minDisk = 40;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ram")
    
    private Integer minRam = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protected")
    
    private Boolean _protected = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="visibility")
    
    private String visibility = "private";

    public GlanceCreateImageMetadataRequestBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 镜像的操作系统具体版本,如果未指定__os_version，则默认设置为Other Linux(64 bit)，不保证该镜像能成功创建虚拟机以及通过该镜像创建的虚拟机能够正常使用。
     * @return osVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public GlanceCreateImageMetadataRequestBody withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    


    /**
     * 容器格式。默认取值为bare。
     * @return containerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public GlanceCreateImageMetadataRequestBody withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 镜像文件格式。目前支持vhd，zvhd、zvhd2、raw，qcow2。默认取值为vhd
     * @return diskFormat
     */
    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    public GlanceCreateImageMetadataRequestBody withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 镜像运行需要的最小磁盘，单位为GB 。必须大于镜像系统盘容量，否则创建云主机云服务器可能失败。
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public GlanceCreateImageMetadataRequestBody withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 镜像运行需要的最小内存，单位为MB。参数取值依据云主机云服务器的规格限制。默认取值为0。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public GlanceCreateImageMetadataRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称，如果未指定name的取值，则默认为空，但是使用该镜像创建虚拟机会失败。名称的长度为1-255位。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlanceCreateImageMetadataRequestBody withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    


    /**
     * 镜像是否被保护，保护后的镜像不可删除。默认取值为false。
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public GlanceCreateImageMetadataRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public GlanceCreateImageMetadataRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GlanceCreateImageMetadataRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表。长度为1-255位。默认为空。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public GlanceCreateImageMetadataRequestBody withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    


    /**
     * 其他租户是否可见。默认取值为private。创建镜像元数据时，visibility取值只能为private。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceCreateImageMetadataRequestBody glanceCreateImageMetadataRequestBody = (GlanceCreateImageMetadataRequestBody) o;
        return Objects.equals(this.osVersion, glanceCreateImageMetadataRequestBody.osVersion) &&
            Objects.equals(this.containerFormat, glanceCreateImageMetadataRequestBody.containerFormat) &&
            Objects.equals(this.diskFormat, glanceCreateImageMetadataRequestBody.diskFormat) &&
            Objects.equals(this.minDisk, glanceCreateImageMetadataRequestBody.minDisk) &&
            Objects.equals(this.minRam, glanceCreateImageMetadataRequestBody.minRam) &&
            Objects.equals(this.name, glanceCreateImageMetadataRequestBody.name) &&
            Objects.equals(this._protected, glanceCreateImageMetadataRequestBody._protected) &&
            Objects.equals(this.tags, glanceCreateImageMetadataRequestBody.tags) &&
            Objects.equals(this.visibility, glanceCreateImageMetadataRequestBody.visibility);
    }
    @Override
    public int hashCode() {
        return Objects.hash(osVersion, containerFormat, diskFormat, minDisk, minRam, name, _protected, tags, visibility);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceCreateImageMetadataRequestBody {\n");
            sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
            sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
            sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
            sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
            sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

