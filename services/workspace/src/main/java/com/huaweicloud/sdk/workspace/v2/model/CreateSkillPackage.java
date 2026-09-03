package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建企业自研技能时的技能包信息。
 */
public class CreateSkillPackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_hash")

    private String packageHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_size")

    private Long packageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<PackageRegionWithStatusInfo> regions = null;

    public CreateSkillPackage withVersion(String version) {
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

    public CreateSkillPackage withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 技能包文件名（与 getUploadUrls 中的 packageName 一致），服务端据此构造 OBS 路径。
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public CreateSkillPackage withPackageHash(String packageHash) {
        this.packageHash = packageHash;
        return this;
    }

    /**
     * 技能包 SHA256 哈希值（前端上传前计算）。
     * @return packageHash
     */
    public String getPackageHash() {
        return packageHash;
    }

    public void setPackageHash(String packageHash) {
        this.packageHash = packageHash;
    }

    public CreateSkillPackage withPackageSize(Long packageSize) {
        this.packageSize = packageSize;
        return this;
    }

    /**
     * 技能包大小（字节），最大 104857600。
     * minimum: 1
     * maximum: 104857600
     * @return packageSize
     */
    public Long getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(Long packageSize) {
        this.packageSize = packageSize;
    }

    public CreateSkillPackage withRegions(List<PackageRegionWithStatusInfo> regions) {
        this.regions = regions;
        return this;
    }

    public CreateSkillPackage addRegionsItem(PackageRegionWithStatusInfo regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public CreateSkillPackage withRegions(Consumer<List<PackageRegionWithStatusInfo>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * OBS 存储区域信息（含上传状态）。
     * @return regions
     */
    public List<PackageRegionWithStatusInfo> getRegions() {
        return regions;
    }

    public void setRegions(List<PackageRegionWithStatusInfo> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSkillPackage that = (CreateSkillPackage) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.packageHash, that.packageHash) && Objects.equals(this.packageSize, that.packageSize)
            && Objects.equals(this.regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, packageName, packageHash, packageSize, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillPackage {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    packageHash: ").append(toIndentedString(packageHash)).append("\n");
        sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
