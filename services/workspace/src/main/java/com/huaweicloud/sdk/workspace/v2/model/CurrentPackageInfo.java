package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当前生效技能包信息（用于批量查询响应）。
 */
public class CurrentPackageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private Integer revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_status")

    private PackageStatusEnum packageStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    public CurrentPackageInfo withId(String id) {
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

    public CurrentPackageInfo withVersion(String version) {
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

    public CurrentPackageInfo withRevision(Integer revision) {
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

    public CurrentPackageInfo withPackageStatus(PackageStatusEnum packageStatus) {
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

    public CurrentPackageInfo withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public CurrentPackageInfo addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public CurrentPackageInfo withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 已部署的区域标识列表。
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
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
        CurrentPackageInfo that = (CurrentPackageInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.revision, that.revision) && Objects.equals(this.packageStatus, that.packageStatus)
            && Objects.equals(this.regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, revision, packageStatus, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentPackageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
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
