package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 将云硬盘导出为镜像的请求参数。
 */
public class CinderExportToImageOption  {

    /**
     * 云硬盘导出镜像的容器类型。  目前支持ami、ari、aki、ovf、bare。默认是bare。
     */
    public static class ContainerFormatEnum {

        
        /**
         * Enum AMI for value: "ami"
         */
        public static final ContainerFormatEnum AMI = new ContainerFormatEnum("ami");

        
        /**
         * Enum ARI for value: "ari"
         */
        public static final ContainerFormatEnum ARI = new ContainerFormatEnum("ari");

        
        /**
         * Enum AKI for value: "aki"
         */
        public static final ContainerFormatEnum AKI = new ContainerFormatEnum("aki");

        
        /**
         * Enum OVF for value: "ovf"
         */
        public static final ContainerFormatEnum OVF = new ContainerFormatEnum("ovf");

        
        /**
         * Enum BARE for value: "bare"
         */
        public static final ContainerFormatEnum BARE = new ContainerFormatEnum("bare");

        

        public static Map<String, ContainerFormatEnum> staticFields =
                new HashMap<String, ContainerFormatEnum>() {
                    { 
                        put("ami", AMI);
                        put("ari", ARI);
                        put("aki", AKI);
                        put("ovf", OVF);
                        put("bare", BARE);
                    }
                };

        private String value;

        ContainerFormatEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContainerFormatEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ContainerFormatEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ContainerFormatEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ContainerFormatEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ContainerFormatEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ContainerFormatEnum) {
                return this.value.equals(((ContainerFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private ContainerFormatEnum containerFormat = ContainerFormatEnum.BARE;
    /**
     * 云硬盘导出镜像的格式。  目前支持vhd、zvhd、zvhd2、raw、qcow2。默认是vhd。
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
    
    private DiskFormatEnum diskFormat = DiskFormatEnum.VHD;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force")
    
    private Boolean force = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_name")
    
    private String imageName;
    /**
     * 云硬盘导出镜像的系统类型。目前只支持“windows”和“linux”，默认值是“linux”。 只有云硬盘的volume_image_metadata信息中无“__os_type”字段且云硬盘状态为“available”时，设置的__os_type才会生效。
     */
    public static class OsTypeEnum {

        
        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("windows");

        
        /**
         * Enum LINUX for value: "linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("linux");

        

        public static Map<String, OsTypeEnum> staticFields =
                new HashMap<String, OsTypeEnum>() {
                    { 
                        put("windows", WINDOWS);
                        put("linux", LINUX);
                    }
                };

        private String value;

        OsTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = staticFields.get(value);
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
    
    private OsTypeEnum osType = OsTypeEnum.LINUX;

    public CinderExportToImageOption withContainerFormat(ContainerFormatEnum containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的容器类型。  目前支持ami、ari、aki、ovf、bare。默认是bare。
     * @return containerFormat
     */
    public ContainerFormatEnum getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(ContainerFormatEnum containerFormat) {
        this.containerFormat = containerFormat;
    }

    public CinderExportToImageOption withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的格式。  目前支持vhd、zvhd、zvhd2、raw、qcow2。默认是vhd。
     * @return diskFormat
     */
    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    public CinderExportToImageOption withForce(Boolean force) {
        this.force = force;
        return this;
    }

    


    /**
     * 强制导出镜像的标示，默认值是false。  当force标记为false时，云硬盘处于正在使用状态时，不能强制导出镜像。 当force标记为true时，即使云硬盘处于正在使用状态时，仍可以导出镜像。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public CinderExportToImageOption withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的名称。  名称的长度范围为1～128位。 名称只能包含以下字符：大写字母、小写字母、中文、数字、特殊字符包含“-”、“.”、“_”和空格。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public CinderExportToImageOption withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 云硬盘导出镜像的系统类型。目前只支持“windows”和“linux”，默认值是“linux”。 只有云硬盘的volume_image_metadata信息中无“__os_type”字段且云硬盘状态为“available”时，设置的__os_type才会生效。
     * @return osType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderExportToImageOption cinderExportToImageOption = (CinderExportToImageOption) o;
        return Objects.equals(this.containerFormat, cinderExportToImageOption.containerFormat) &&
            Objects.equals(this.diskFormat, cinderExportToImageOption.diskFormat) &&
            Objects.equals(this.force, cinderExportToImageOption.force) &&
            Objects.equals(this.imageName, cinderExportToImageOption.imageName) &&
            Objects.equals(this.osType, cinderExportToImageOption.osType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(containerFormat, diskFormat, force, imageName, osType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderExportToImageOption {\n");
            sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
            sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
            sb.append("    force: ").append(toIndentedString(force)).append("\n");
            sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
            sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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

