package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSkillPackageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private Integer revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_hash")

    private String packageHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_size")

    private Long packageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_status")

    private PackageStatusEnum packageStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uploaded_by")

    private String uploadedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uploaded_role")

    private String uploadedRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<SkillPackageRegionItem> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateSkillPackageResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 技能包id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateSkillPackageResponse withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 所属技能id。
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public UpdateSkillPackageResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateSkillPackageResponse withRevision(Integer revision) {
        this.revision = revision;
        return this;
    }

    /**
     * 版本修订号。
     * @return revision
     */
    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public UpdateSkillPackageResponse withPackageHash(String packageHash) {
        this.packageHash = packageHash;
        return this;
    }

    /**
     * 技能包 SHA256 哈希值。
     * @return packageHash
     */
    public String getPackageHash() {
        return packageHash;
    }

    public void setPackageHash(String packageHash) {
        this.packageHash = packageHash;
    }

    public UpdateSkillPackageResponse withPackageSize(Long packageSize) {
        this.packageSize = packageSize;
        return this;
    }

    /**
     * 技能包大小（字节）。
     * @return packageSize
     */
    public Long getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(Long packageSize) {
        this.packageSize = packageSize;
    }

    public UpdateSkillPackageResponse withPackageStatus(PackageStatusEnum packageStatus) {
        this.packageStatus = packageStatus;
        return this;
    }

    /**
     * Get packageStatus
     * @return packageStatus
     */
    public PackageStatusEnum getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(PackageStatusEnum packageStatus) {
        this.packageStatus = packageStatus;
    }

    public UpdateSkillPackageResponse withUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
        return this;
    }

    /**
     * 上传者。
     * @return uploadedBy
     */
    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public UpdateSkillPackageResponse withUploadedRole(String uploadedRole) {
        this.uploadedRole = uploadedRole;
        return this;
    }

    /**
     * 上传者角色。
     * @return uploadedRole
     */
    public String getUploadedRole() {
        return uploadedRole;
    }

    public void setUploadedRole(String uploadedRole) {
        this.uploadedRole = uploadedRole;
    }

    public UpdateSkillPackageResponse withRegions(List<SkillPackageRegionItem> regions) {
        this.regions = regions;
        return this;
    }

    public UpdateSkillPackageResponse addRegionsItem(SkillPackageRegionItem regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public UpdateSkillPackageResponse withRegions(Consumer<List<SkillPackageRegionItem>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域详情列表。
     * @return regions
     */
    public List<SkillPackageRegionItem> getRegions() {
        return regions;
    }

    public void setRegions(List<SkillPackageRegionItem> regions) {
        this.regions = regions;
    }

    public UpdateSkillPackageResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateSkillPackageResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（ISO8601格式，UTC时区）。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateSkillPackageResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（ISO8601格式，UTC时区）。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateSkillPackageResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSkillPackageResponse that = (UpdateSkillPackageResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.skillId, that.skillId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.revision, that.revision)
            && Objects.equals(this.packageHash, that.packageHash) && Objects.equals(this.packageSize, that.packageSize)
            && Objects.equals(this.packageStatus, that.packageStatus)
            && Objects.equals(this.uploadedBy, that.uploadedBy) && Objects.equals(this.uploadedRole, that.uploadedRole)
            && Objects.equals(this.regions, that.regions) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            skillId,
            version,
            revision,
            packageHash,
            packageSize,
            packageStatus,
            uploadedBy,
            uploadedRole,
            regions,
            remark,
            createTime,
            updateTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSkillPackageResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    packageHash: ").append(toIndentedString(packageHash)).append("\n");
        sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
        sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
        sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
        sb.append("    uploadedRole: ").append(toIndentedString(uploadedRole)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
