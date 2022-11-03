package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 区域。
 */
public class AreaRegion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    public AreaRegion withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 区域所属地区，取值： - OUTOFCM： 中国大陆以外 - CM：中国大陆
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public AreaRegion withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public AreaRegion addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public AreaRegion withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域ID列表。
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AreaRegion areaRegion = (AreaRegion) o;
        return Objects.equals(this.area, areaRegion.area) && Objects.equals(this.regions, areaRegion.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AreaRegion {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
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
