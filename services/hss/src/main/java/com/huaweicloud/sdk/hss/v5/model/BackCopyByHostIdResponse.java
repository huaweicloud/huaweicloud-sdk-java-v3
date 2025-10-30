package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BackCopyByHostIdResponse
 */
public class BackCopyByHostIdResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name")

    private String backupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_status")

    private String backupStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_images_data")

    private List<ImageData> osImagesData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_tag")

    private Integer backupTag;

    public BackCopyByHostIdResponse withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * **参数解释** 备份ID **取值范围** 字符长度0-65535位 
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public BackCopyByHostIdResponse withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * **参数解释** 备份名称 **取值范围** 字符长度0-65535位 
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public BackCopyByHostIdResponse withBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    /**
     * **参数解释** 备份状态 **取值范围** 字符长度0-65535位 
     * @return backupStatus
     */
    public String getBackupStatus() {
        return backupStatus;
    }

    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    public BackCopyByHostIdResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释** 创建时间 **取值范围** 取值0-2147483647 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BackCopyByHostIdResponse withOsImagesData(List<ImageData> osImagesData) {
        this.osImagesData = osImagesData;
        return this;
    }

    public BackCopyByHostIdResponse addOsImagesDataItem(ImageData osImagesDataItem) {
        if (this.osImagesData == null) {
            this.osImagesData = new ArrayList<>();
        }
        this.osImagesData.add(osImagesDataItem);
        return this;
    }

    public BackCopyByHostIdResponse withOsImagesData(Consumer<List<ImageData>> osImagesDataSetter) {
        if (this.osImagesData == null) {
            this.osImagesData = new ArrayList<>();
        }
        osImagesDataSetter.accept(this.osImagesData);
        return this;
    }

    /**
     * **参数解释** 备份注册镜像ID列表 **取值范围** 取值0-200 
     * @return osImagesData
     */
    public List<ImageData> getOsImagesData() {
        return osImagesData;
    }

    public void setOsImagesData(List<ImageData> osImagesData) {
        this.osImagesData = osImagesData;
    }

    public BackCopyByHostIdResponse withBackupTag(Integer backupTag) {
        this.backupTag = backupTag;
        return this;
    }

    /**
     * **参数解释** 备份标识 **取值范围** - 0：定时周期 - 1：勒索加密 
     * minimum: 0
     * maximum: 2147483647
     * @return backupTag
     */
    public Integer getBackupTag() {
        return backupTag;
    }

    public void setBackupTag(Integer backupTag) {
        this.backupTag = backupTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackCopyByHostIdResponse that = (BackCopyByHostIdResponse) obj;
        return Objects.equals(this.backupId, that.backupId) && Objects.equals(this.backupName, that.backupName)
            && Objects.equals(this.backupStatus, that.backupStatus) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.osImagesData, that.osImagesData) && Objects.equals(this.backupTag, that.backupTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, backupName, backupStatus, createTime, osImagesData, backupTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackCopyByHostIdResponse {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    osImagesData: ").append(toIndentedString(osImagesData)).append("\n");
        sb.append("    backupTag: ").append(toIndentedString(backupTag)).append("\n");
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
