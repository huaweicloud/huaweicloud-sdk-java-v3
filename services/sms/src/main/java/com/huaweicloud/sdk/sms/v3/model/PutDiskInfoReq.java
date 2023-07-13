package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class PutDiskInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    private List<ServerDisk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumegroups")

    private List<VolumeGroups> volumegroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "btrfs_list")

    private List<BtrfsFileSystem> btrfsList = null;

    public PutDiskInfoReq withDisks(List<ServerDisk> disks) {
        this.disks = disks;
        return this;
    }

    public PutDiskInfoReq addDisksItem(ServerDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public PutDiskInfoReq withDisks(Consumer<List<ServerDisk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 更新的磁盘信息
     * @return disks
     */
    public List<ServerDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<ServerDisk> disks) {
        this.disks = disks;
    }

    public PutDiskInfoReq withVolumegroups(List<VolumeGroups> volumegroups) {
        this.volumegroups = volumegroups;
        return this;
    }

    public PutDiskInfoReq addVolumegroupsItem(VolumeGroups volumegroupsItem) {
        if (this.volumegroups == null) {
            this.volumegroups = new ArrayList<>();
        }
        this.volumegroups.add(volumegroupsItem);
        return this;
    }

    public PutDiskInfoReq withVolumegroups(Consumer<List<VolumeGroups>> volumegroupsSetter) {
        if (this.volumegroups == null) {
            this.volumegroups = new ArrayList<>();
        }
        volumegroupsSetter.accept(this.volumegroups);
        return this;
    }

    /**
     * 更新的卷信息
     * @return volumegroups
     */
    public List<VolumeGroups> getVolumegroups() {
        return volumegroups;
    }

    public void setVolumegroups(List<VolumeGroups> volumegroups) {
        this.volumegroups = volumegroups;
    }

    public PutDiskInfoReq withBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    public PutDiskInfoReq addBtrfsListItem(BtrfsFileSystem btrfsListItem) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public PutDiskInfoReq withBtrfsList(Consumer<List<BtrfsFileSystem>> btrfsListSetter) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        btrfsListSetter.accept(this.btrfsList);
        return this;
    }

    /**
     * 更新的btrfs信息
     * @return btrfsList
     */
    public List<BtrfsFileSystem> getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutDiskInfoReq that = (PutDiskInfoReq) obj;
        return Objects.equals(this.disks, that.disks) && Objects.equals(this.volumegroups, that.volumegroups)
            && Objects.equals(this.btrfsList, that.btrfsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disks, volumegroups, btrfsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutDiskInfoReq {\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    volumegroups: ").append(toIndentedString(volumegroups)).append("\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
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
