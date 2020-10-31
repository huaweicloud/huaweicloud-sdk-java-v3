package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.Nics;
import com.huaweicloud.sdk.sms.v3.model.PublicIp;
import com.huaweicloud.sdk.sms.v3.model.SgObject;
import com.huaweicloud.sdk.sms.v3.model.TemplateDisk;
import com.huaweicloud.sdk.sms.v3.model.VpcObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 自动创建虚拟机模板
 */
public class Template  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_template")
    
    private Boolean isTemplate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projectid")
    
    private String projectid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_server_name")
    
    private String targetServerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;
    /**
     * 磁盘类型 SAS：高I/O,SSD：超高I/O,SATA：普通I/O
     */
    public static final class VolumetypeEnum {

        
        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");
        
        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");
        
        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");
        

        private static final Map<String, VolumetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumetypeEnum> createStaticFields() {
            Map<String, VolumetypeEnum> map = new HashMap<>();
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("SATA", SATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumetypeEnum(String value) {
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
        public static VolumetypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumetypeEnum(value);
            }
            return result;
        }

        public static VolumetypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VolumetypeEnum) {
                return this.value.equals(((VolumetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumetype")
    
    private VolumetypeEnum volumetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc")
    
    private VpcObject vpc = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nics")
    
    private List<Nics> nics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SgObject> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private PublicIp publicip = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk")
    
    private List<TemplateDisk> disk = null;
        /**
     * 数据盘磁盘类型 SAS：高I/O,SSD：超高I/O,SATA：普通I/O
     */
    public static final class DataVolumeTypeEnum {

        
        /**
         * Enum SAS for value: "SAS"
         */
        public static final DataVolumeTypeEnum SAS = new DataVolumeTypeEnum("SAS");
        
        /**
         * Enum SSD for value: "SSD"
         */
        public static final DataVolumeTypeEnum SSD = new DataVolumeTypeEnum("SSD");
        
        /**
         * Enum SATA for value: "SATA"
         */
        public static final DataVolumeTypeEnum SATA = new DataVolumeTypeEnum("SATA");
        

        private static final Map<String, DataVolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataVolumeTypeEnum> createStaticFields() {
            Map<String, DataVolumeTypeEnum> map = new HashMap<>();
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("SATA", SATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataVolumeTypeEnum(String value) {
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
        public static DataVolumeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataVolumeTypeEnum(value);
            }
            return result;
        }

        public static DataVolumeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DataVolumeTypeEnum) {
                return this.value.equals(((DataVolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volume_type")
    
    private DataVolumeTypeEnum dataVolumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_password")
    
    private String targetPassword;

    public Template withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Template withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    


    /**
     * 是否是通用模板，如果模板关联一个任务，则不算通用模板
     * @return isTemplate
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Template withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Region信息
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Template withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public Template withTargetServerName(String targetServerName) {
        this.targetServerName = targetServerName;
        return this;
    }

    


    /**
     * 目标端服务器名称
     * @return targetServerName
     */
    public String getTargetServerName() {
        return targetServerName;
    }

    public void setTargetServerName(String targetServerName) {
        this.targetServerName = targetServerName;
    }

    public Template withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Template withVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    


    /**
     * 磁盘类型 SAS：高I/O,SSD：超高I/O,SATA：普通I/O
     * @return volumetype
     */
    public VolumetypeEnum getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
    }

    public Template withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * 虚拟机规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Template withVpc(VpcObject vpc) {
        this.vpc = vpc;
        return this;
    }

    public Template withVpc(Consumer<VpcObject> vpcSetter) {
        if(this.vpc == null ){
            this.vpc = new VpcObject();
            vpcSetter.accept(this.vpc);
        }
        
        return this;
    }


    /**
     * Get vpc
     * @return vpc
     */
    public VpcObject getVpc() {
        return vpc;
    }

    public void setVpc(VpcObject vpc) {
        this.vpc = vpc;
    }

    public Template withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    
    public Template addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public Template withNics(Consumer<List<Nics>> nicsSetter) {
        if(this.nics == null ){
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 网卡信息，支持多个网卡，如果是自动创建，只填一个，id使用“autoCreate”
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public Template withSecurityGroups(List<SgObject> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public Template addSecurityGroupsItem(SgObject securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public Template withSecurityGroups(Consumer<List<SgObject>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组，支持多个安全组，如果是自动创建，只填一个，id使用“autoCreate”
     * @return securityGroups
     */
    public List<SgObject> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SgObject> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Template withPublicip(PublicIp publicip) {
        this.publicip = publicip;
        return this;
    }

    public Template withPublicip(Consumer<PublicIp> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new PublicIp();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public PublicIp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicIp publicip) {
        this.publicip = publicip;
    }

    public Template withDisk(List<TemplateDisk> disk) {
        this.disk = disk;
        return this;
    }

    
    public Template addDiskItem(TemplateDisk diskItem) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        this.disk.add(diskItem);
        return this;
    }

    public Template withDisk(Consumer<List<TemplateDisk>> diskSetter) {
        if(this.disk == null ){
            this.disk = new ArrayList<>();
        }
        diskSetter.accept(this.disk);
        return this;
    }

    /**
     * 磁盘信息
     * @return disk
     */
    public List<TemplateDisk> getDisk() {
        return disk;
    }

    public void setDisk(List<TemplateDisk> disk) {
        this.disk = disk;
    }

    public Template withDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
        return this;
    }

    


    /**
     * 数据盘磁盘类型 SAS：高I/O,SSD：超高I/O,SATA：普通I/O
     * @return dataVolumeType
     */
    public DataVolumeTypeEnum getDataVolumeType() {
        return dataVolumeType;
    }

    public void setDataVolumeType(DataVolumeTypeEnum dataVolumeType) {
        this.dataVolumeType = dataVolumeType;
    }

    public Template withTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
        return this;
    }

    


    /**
     * 目的端密码
     * @return targetPassword
     */
    public String getTargetPassword() {
        return targetPassword;
    }

    public void setTargetPassword(String targetPassword) {
        this.targetPassword = targetPassword;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Template template = (Template) o;
        return Objects.equals(this.name, template.name) &&
            Objects.equals(this.isTemplate, template.isTemplate) &&
            Objects.equals(this.region, template.region) &&
            Objects.equals(this.projectid, template.projectid) &&
            Objects.equals(this.targetServerName, template.targetServerName) &&
            Objects.equals(this.availabilityZone, template.availabilityZone) &&
            Objects.equals(this.volumetype, template.volumetype) &&
            Objects.equals(this.flavor, template.flavor) &&
            Objects.equals(this.vpc, template.vpc) &&
            Objects.equals(this.nics, template.nics) &&
            Objects.equals(this.securityGroups, template.securityGroups) &&
            Objects.equals(this.publicip, template.publicip) &&
            Objects.equals(this.disk, template.disk) &&
            Objects.equals(this.dataVolumeType, template.dataVolumeType) &&
            Objects.equals(this.targetPassword, template.targetPassword);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, isTemplate, region, projectid, targetServerName, availabilityZone, volumetype, flavor, vpc, nics, securityGroups, publicip, disk, dataVolumeType, targetPassword);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    targetServerName: ").append(toIndentedString(targetServerName)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    dataVolumeType: ").append(toIndentedString(dataVolumeType)).append("\n");
        sb.append("    targetPassword: ").append(toIndentedString(targetPassword)).append("\n");
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

