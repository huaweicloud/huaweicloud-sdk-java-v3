package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 目的端服务器
 */
public class TaskTargetServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_id")

    @JacksonXmlProperty(localName = "vm_id")

    private String vmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    @JacksonXmlProperty(localName = "ip")

    private String ip;

    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
     */
    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        /**
         * Enum LINUX for value: "LINUX"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("WINDOWS", WINDOWS);
            map.put("LINUX", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof OsTypeEnum) {
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
    @JsonProperty(value = "os_type")

    @JacksonXmlProperty(localName = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    @JacksonXmlProperty(localName = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_dir")

    @JacksonXmlProperty(localName = "system_dir")

    private String systemDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    @JacksonXmlProperty(localName = "disks")

    private List<TargetDisk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_groups")

    @JacksonXmlProperty(localName = "volume_groups")

    private List<VolumeGroups> volumeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "btrfs_list")

    @JacksonXmlProperty(localName = "btrfs_list")

    private List<String> btrfsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_disk_id")

    @JacksonXmlProperty(localName = "image_disk_id")

    private String imageDiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cutovered_snapshot_ids")

    @JacksonXmlProperty(localName = "cutovered_snapshot_ids")

    private String cutoveredSnapshotIds;

    public TaskTargetServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 目的端在SMS数据库中的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskTargetServer withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * 目的端服务器ID，自动创建虚拟机不需要这个参数
     * @return vmId
     */
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public TaskTargetServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 目的端服务器的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskTargetServer withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 目的端服务器ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TaskTargetServer withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public TaskTargetServer withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统版本，注册必选，更新非必选
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public TaskTargetServer withSystemDir(String systemDir) {
        this.systemDir = systemDir;
        return this;
    }

    /**
     * Windows必选，系统目录
     * @return systemDir
     */
    public String getSystemDir() {
        return systemDir;
    }

    public void setSystemDir(String systemDir) {
        this.systemDir = systemDir;
    }

    public TaskTargetServer withDisks(List<TargetDisk> disks) {
        this.disks = disks;
        return this;
    }

    public TaskTargetServer addDisksItem(TargetDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public TaskTargetServer withDisks(Consumer<List<TargetDisk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 目的端磁盘信息，一般和源端保持一致
     * @return disks
     */
    public List<TargetDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<TargetDisk> disks) {
        this.disks = disks;
    }

    public TaskTargetServer withVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
        return this;
    }

    public TaskTargetServer addVolumeGroupsItem(VolumeGroups volumeGroupsItem) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public TaskTargetServer withVolumeGroups(Consumer<List<VolumeGroups>> volumeGroupsSetter) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    /**
     * lvm信息，一般和源端保持一致
     * @return volumeGroups
     */
    public List<VolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    public TaskTargetServer withBtrfsList(List<String> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    public TaskTargetServer addBtrfsListItem(String btrfsListItem) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public TaskTargetServer withBtrfsList(Consumer<List<String>> btrfsListSetter) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        btrfsListSetter.accept(this.btrfsList);
        return this;
    }

    /**
     * Linux 必选，源端的Btrfs信息。如果源端不存在Btrfs，则为[]
     * @return btrfsList
     */
    public List<String> getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(List<String> btrfsList) {
        this.btrfsList = btrfsList;
    }

    public TaskTargetServer withImageDiskId(String imageDiskId) {
        this.imageDiskId = imageDiskId;
        return this;
    }

    /**
     * 目的端代理镜像磁盘id
     * @return imageDiskId
     */
    public String getImageDiskId() {
        return imageDiskId;
    }

    public void setImageDiskId(String imageDiskId) {
        this.imageDiskId = imageDiskId;
    }

    public TaskTargetServer withCutoveredSnapshotIds(String cutoveredSnapshotIds) {
        this.cutoveredSnapshotIds = cutoveredSnapshotIds;
        return this;
    }

    /**
     * 目的端回滚快照id
     * @return cutoveredSnapshotIds
     */
    public String getCutoveredSnapshotIds() {
        return cutoveredSnapshotIds;
    }

    public void setCutoveredSnapshotIds(String cutoveredSnapshotIds) {
        this.cutoveredSnapshotIds = cutoveredSnapshotIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskTargetServer taskTargetServer = (TaskTargetServer) o;
        return Objects.equals(this.id, taskTargetServer.id) && Objects.equals(this.vmId, taskTargetServer.vmId)
            && Objects.equals(this.name, taskTargetServer.name) && Objects.equals(this.ip, taskTargetServer.ip)
            && Objects.equals(this.osType, taskTargetServer.osType)
            && Objects.equals(this.osVersion, taskTargetServer.osVersion)
            && Objects.equals(this.systemDir, taskTargetServer.systemDir)
            && Objects.equals(this.disks, taskTargetServer.disks)
            && Objects.equals(this.volumeGroups, taskTargetServer.volumeGroups)
            && Objects.equals(this.btrfsList, taskTargetServer.btrfsList)
            && Objects.equals(this.imageDiskId, taskTargetServer.imageDiskId)
            && Objects.equals(this.cutoveredSnapshotIds, taskTargetServer.cutoveredSnapshotIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            vmId,
            name,
            ip,
            osType,
            osVersion,
            systemDir,
            disks,
            volumeGroups,
            btrfsList,
            imageDiskId,
            cutoveredSnapshotIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTargetServer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    systemDir: ").append(toIndentedString(systemDir)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    volumeGroups: ").append(toIndentedString(volumeGroups)).append("\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
        sb.append("    imageDiskId: ").append(toIndentedString(imageDiskId)).append("\n");
        sb.append("    cutoveredSnapshotIds: ").append(toIndentedString(cutoveredSnapshotIds)).append("\n");
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
