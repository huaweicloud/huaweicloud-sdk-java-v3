package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.BtrfsSubvolumn;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * btrfs分区类型
 */
public class BtrfsFileSystem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uuid")
    
    private String uuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodesize")
    
    private Long nodesize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sectorsize")
    
    private Integer sectorsize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_profile")
    
    private String dataProfile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="system_profile")
    
    private String systemProfile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata_profile")
    
    private String metadataProfile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="global_reserve1")
    
    private String globalReserve1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="g_vol_used_size")
    
    private Long gVolUsedSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_subvolid")
    
    private String defaultSubvolid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_subvol_name")
    
    private String defaultSubvolName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_subvol_mountpath")
    
    private String defaultSubvolMountpath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subvolumn")
    
    private List<BtrfsSubvolumn> subvolumn = new ArrayList<>();
    
    public BtrfsFileSystem withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 文件系统名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BtrfsFileSystem withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 文件系统标签，若无标签为空字符串
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BtrfsFileSystem withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    


    /**
     * 文件系统的uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BtrfsFileSystem withDevice(String device) {
        this.device = device;
        return this;
    }

    


    /**
     * btrfs包含的设备名称
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public BtrfsFileSystem withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 文件系统数据占用大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public BtrfsFileSystem withNodesize(Long nodesize) {
        this.nodesize = nodesize;
        return this;
    }

    


    /**
     * btrfs节点大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return nodesize
     */
    public Long getNodesize() {
        return nodesize;
    }

    public void setNodesize(Long nodesize) {
        this.nodesize = nodesize;
    }

    public BtrfsFileSystem withSectorsize(Integer sectorsize) {
        this.sectorsize = sectorsize;
        return this;
    }

    


    /**
     * 扇区大小
     * minimum: 0
     * maximum: 2147483647
     * @return sectorsize
     */
    public Integer getSectorsize() {
        return sectorsize;
    }

    public void setSectorsize(Integer sectorsize) {
        this.sectorsize = sectorsize;
    }

    public BtrfsFileSystem withDataProfile(String dataProfile) {
        this.dataProfile = dataProfile;
        return this;
    }

    


    /**
     * 数据配置（RAD）
     * @return dataProfile
     */
    public String getDataProfile() {
        return dataProfile;
    }

    public void setDataProfile(String dataProfile) {
        this.dataProfile = dataProfile;
    }

    public BtrfsFileSystem withSystemProfile(String systemProfile) {
        this.systemProfile = systemProfile;
        return this;
    }

    


    /**
     * 文件系统配置（RAD）
     * @return systemProfile
     */
    public String getSystemProfile() {
        return systemProfile;
    }

    public void setSystemProfile(String systemProfile) {
        this.systemProfile = systemProfile;
    }

    public BtrfsFileSystem withMetadataProfile(String metadataProfile) {
        this.metadataProfile = metadataProfile;
        return this;
    }

    


    /**
     * 元数据配置（RAD）
     * @return metadataProfile
     */
    public String getMetadataProfile() {
        return metadataProfile;
    }

    public void setMetadataProfile(String metadataProfile) {
        this.metadataProfile = metadataProfile;
    }

    public BtrfsFileSystem withGlobalReserve1(String globalReserve1) {
        this.globalReserve1 = globalReserve1;
        return this;
    }

    


    /**
     * Btrfs文件系统信息
     * @return globalReserve1
     */
    public String getGlobalReserve1() {
        return globalReserve1;
    }

    public void setGlobalReserve1(String globalReserve1) {
        this.globalReserve1 = globalReserve1;
    }

    public BtrfsFileSystem withGVolUsedSize(Long gVolUsedSize) {
        this.gVolUsedSize = gVolUsedSize;
        return this;
    }

    


    /**
     * Btrfs卷已使用空间大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return gVolUsedSize
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="g_vol_used_size")
    public Long getGVolUsedSize() {
        return gVolUsedSize;
    }

    public void setGVolUsedSize(Long gVolUsedSize) {
        this.gVolUsedSize = gVolUsedSize;
    }

    public BtrfsFileSystem withDefaultSubvolid(String defaultSubvolid) {
        this.defaultSubvolid = defaultSubvolid;
        return this;
    }

    


    /**
     * 默认子卷ID
     * @return defaultSubvolid
     */
    public String getDefaultSubvolid() {
        return defaultSubvolid;
    }

    public void setDefaultSubvolid(String defaultSubvolid) {
        this.defaultSubvolid = defaultSubvolid;
    }

    public BtrfsFileSystem withDefaultSubvolName(String defaultSubvolName) {
        this.defaultSubvolName = defaultSubvolName;
        return this;
    }

    


    /**
     * 默认子卷名称
     * @return defaultSubvolName
     */
    public String getDefaultSubvolName() {
        return defaultSubvolName;
    }

    public void setDefaultSubvolName(String defaultSubvolName) {
        this.defaultSubvolName = defaultSubvolName;
    }

    public BtrfsFileSystem withDefaultSubvolMountpath(String defaultSubvolMountpath) {
        this.defaultSubvolMountpath = defaultSubvolMountpath;
        return this;
    }

    


    /**
     * 默认子卷挂载路径/BTRFS文件系统的挂载路径
     * @return defaultSubvolMountpath
     */
    public String getDefaultSubvolMountpath() {
        return defaultSubvolMountpath;
    }

    public void setDefaultSubvolMountpath(String defaultSubvolMountpath) {
        this.defaultSubvolMountpath = defaultSubvolMountpath;
    }

    public BtrfsFileSystem withSubvolumn(List<BtrfsSubvolumn> subvolumn) {
        this.subvolumn = subvolumn;
        return this;
    }

    
    public BtrfsFileSystem addSubvolumnItem(BtrfsSubvolumn subvolumnItem) {
        this.subvolumn.add(subvolumnItem);
        return this;
    }

    public BtrfsFileSystem withSubvolumn(Consumer<List<BtrfsSubvolumn>> subvolumnSetter) {
        if(this.subvolumn == null ){
            this.subvolumn = new ArrayList<>();
        }
        subvolumnSetter.accept(this.subvolumn);
        return this;
    }

    /**
     * 子卷信息
     * @return subvolumn
     */
    public List<BtrfsSubvolumn> getSubvolumn() {
        return subvolumn;
    }

    public void setSubvolumn(List<BtrfsSubvolumn> subvolumn) {
        this.subvolumn = subvolumn;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BtrfsFileSystem btrfsFileSystem = (BtrfsFileSystem) o;
        return Objects.equals(this.name, btrfsFileSystem.name) &&
            Objects.equals(this.label, btrfsFileSystem.label) &&
            Objects.equals(this.uuid, btrfsFileSystem.uuid) &&
            Objects.equals(this.device, btrfsFileSystem.device) &&
            Objects.equals(this.size, btrfsFileSystem.size) &&
            Objects.equals(this.nodesize, btrfsFileSystem.nodesize) &&
            Objects.equals(this.sectorsize, btrfsFileSystem.sectorsize) &&
            Objects.equals(this.dataProfile, btrfsFileSystem.dataProfile) &&
            Objects.equals(this.systemProfile, btrfsFileSystem.systemProfile) &&
            Objects.equals(this.metadataProfile, btrfsFileSystem.metadataProfile) &&
            Objects.equals(this.globalReserve1, btrfsFileSystem.globalReserve1) &&
            Objects.equals(this.gVolUsedSize, btrfsFileSystem.gVolUsedSize) &&
            Objects.equals(this.defaultSubvolid, btrfsFileSystem.defaultSubvolid) &&
            Objects.equals(this.defaultSubvolName, btrfsFileSystem.defaultSubvolName) &&
            Objects.equals(this.defaultSubvolMountpath, btrfsFileSystem.defaultSubvolMountpath) &&
            Objects.equals(this.subvolumn, btrfsFileSystem.subvolumn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, label, uuid, device, size, nodesize, sectorsize, dataProfile, systemProfile, metadataProfile, globalReserve1, gVolUsedSize, defaultSubvolid, defaultSubvolName, defaultSubvolMountpath, subvolumn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BtrfsFileSystem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    nodesize: ").append(toIndentedString(nodesize)).append("\n");
        sb.append("    sectorsize: ").append(toIndentedString(sectorsize)).append("\n");
        sb.append("    dataProfile: ").append(toIndentedString(dataProfile)).append("\n");
        sb.append("    systemProfile: ").append(toIndentedString(systemProfile)).append("\n");
        sb.append("    metadataProfile: ").append(toIndentedString(metadataProfile)).append("\n");
        sb.append("    globalReserve1: ").append(toIndentedString(globalReserve1)).append("\n");
        sb.append("    gVolUsedSize: ").append(toIndentedString(gVolUsedSize)).append("\n");
        sb.append("    defaultSubvolid: ").append(toIndentedString(defaultSubvolid)).append("\n");
        sb.append("    defaultSubvolName: ").append(toIndentedString(defaultSubvolName)).append("\n");
        sb.append("    defaultSubvolMountpath: ").append(toIndentedString(defaultSubvolMountpath)).append("\n");
        sb.append("    subvolumn: ").append(toIndentedString(subvolumn)).append("\n");
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

