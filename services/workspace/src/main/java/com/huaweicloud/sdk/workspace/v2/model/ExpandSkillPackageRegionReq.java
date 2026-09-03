package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩展技能包区域请求（企业自研技能，含上传状态）。
 */
public class ExpandSkillPackageRegionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<PackageRegionWithStatusInfo> regions = null;

    public ExpandSkillPackageRegionReq withRegions(List<PackageRegionWithStatusInfo> regions) {
        this.regions = regions;
        return this;
    }

    public ExpandSkillPackageRegionReq addRegionsItem(PackageRegionWithStatusInfo regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ExpandSkillPackageRegionReq withRegions(Consumer<List<PackageRegionWithStatusInfo>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 新 region 信息（含上传状态）。
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
        ExpandSkillPackageRegionReq that = (ExpandSkillPackageRegionReq) obj;
        return Objects.equals(this.regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandSkillPackageRegionReq {\n");
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
