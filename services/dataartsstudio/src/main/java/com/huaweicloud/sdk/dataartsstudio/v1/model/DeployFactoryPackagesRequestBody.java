package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeployFactoryPackagesRequestBody
 */
public class DeployFactoryPackagesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_ids")

    private List<String> packageIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_mode")

    private Integer startupMode;

    public DeployFactoryPackagesRequestBody withPackageIds(List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }

    public DeployFactoryPackagesRequestBody addPackageIdsItem(String packageIdsItem) {
        if (this.packageIds == null) {
            this.packageIds = new ArrayList<>();
        }
        this.packageIds.add(packageIdsItem);
        return this;
    }

    public DeployFactoryPackagesRequestBody withPackageIds(Consumer<List<String>> packageIdsSetter) {
        if (this.packageIds == null) {
            this.packageIds = new ArrayList<>();
        }
        packageIdsSetter.accept(this.packageIds);
        return this;
    }

    /**
     * 发布包ID
     * @return packageIds
     */
    public List<String> getPackageIds() {
        return packageIds;
    }

    public void setPackageIds(List<String> packageIds) {
        this.packageIds = packageIds;
    }

    public DeployFactoryPackagesRequestBody withStartupMode(Integer startupMode) {
        this.startupMode = startupMode;
        return this;
    }

    /**
     * 发布后是否立即启动作业。取值范围为0和1，默认为1, 1：发布成功后立即启动作业 0：不立即启动
     * @return startupMode
     */
    public Integer getStartupMode() {
        return startupMode;
    }

    public void setStartupMode(Integer startupMode) {
        this.startupMode = startupMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployFactoryPackagesRequestBody that = (DeployFactoryPackagesRequestBody) obj;
        return Objects.equals(this.packageIds, that.packageIds) && Objects.equals(this.startupMode, that.startupMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageIds, startupMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployFactoryPackagesRequestBody {\n");
        sb.append("    packageIds: ").append(toIndentedString(packageIds)).append("\n");
        sb.append("    startupMode: ").append(toIndentedString(startupMode)).append("\n");
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
