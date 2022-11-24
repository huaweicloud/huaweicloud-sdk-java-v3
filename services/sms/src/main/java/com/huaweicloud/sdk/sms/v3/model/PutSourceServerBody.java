package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改源端信息json的请求体，当前只支持修改源端服务器名称和迁移项目ID
 */
public class PutSourceServerBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migprojectid")

    private String migprojectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    private List<PutDisk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_groups")

    private List<PutVolumeGroups> volumeGroups = null;

    public PutSourceServerBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 源端服务器修改后的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PutSourceServerBody withMigprojectid(String migprojectid) {
        this.migprojectid = migprojectid;
        return this;
    }

    /**
     * 源端服务器修改后所属的迁移项目ID
     * @return migprojectid
     */
    public String getMigprojectid() {
        return migprojectid;
    }

    public void setMigprojectid(String migprojectid) {
        this.migprojectid = migprojectid;
    }

    public PutSourceServerBody withDisks(List<PutDisk> disks) {
        this.disks = disks;
        return this;
    }

    public PutSourceServerBody addDisksItem(PutDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public PutSourceServerBody withDisks(Consumer<List<PutDisk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 磁盘
     * @return disks
     */
    public List<PutDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<PutDisk> disks) {
        this.disks = disks;
    }

    public PutSourceServerBody withVolumeGroups(List<PutVolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
        return this;
    }

    public PutSourceServerBody addVolumeGroupsItem(PutVolumeGroups volumeGroupsItem) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public PutSourceServerBody withVolumeGroups(Consumer<List<PutVolumeGroups>> volumeGroupsSetter) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    /**
     * 卷组
     * @return volumeGroups
     */
    public List<PutVolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<PutVolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutSourceServerBody putSourceServerBody = (PutSourceServerBody) o;
        return Objects.equals(this.name, putSourceServerBody.name)
            && Objects.equals(this.migprojectid, putSourceServerBody.migprojectid)
            && Objects.equals(this.disks, putSourceServerBody.disks)
            && Objects.equals(this.volumeGroups, putSourceServerBody.volumeGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, migprojectid, disks, volumeGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutSourceServerBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    migprojectid: ").append(toIndentedString(migprojectid)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    volumeGroups: ").append(toIndentedString(volumeGroups)).append("\n");
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
