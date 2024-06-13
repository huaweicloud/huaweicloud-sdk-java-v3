package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * pi筛选条件
 */
public class PiFilterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_sprints")

    private List<PiInfo> piSprints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_pi")

    private Boolean allPi;

    public PiFilterInfo withPiSprints(List<PiInfo> piSprints) {
        this.piSprints = piSprints;
        return this;
    }

    public PiFilterInfo addPiSprintsItem(PiInfo piSprintsItem) {
        if (this.piSprints == null) {
            this.piSprints = new ArrayList<>();
        }
        this.piSprints.add(piSprintsItem);
        return this;
    }

    public PiFilterInfo withPiSprints(Consumer<List<PiInfo>> piSprintsSetter) {
        if (this.piSprints == null) {
            this.piSprints = new ArrayList<>();
        }
        piSprintsSetter.accept(this.piSprints);
        return this;
    }

    /**
     * pi迭代筛选条件
     * @return piSprints
     */
    public List<PiInfo> getPiSprints() {
        return piSprints;
    }

    public void setPiSprints(List<PiInfo> piSprints) {
        this.piSprints = piSprints;
    }

    public PiFilterInfo withAllPi(Boolean allPi) {
        this.allPi = allPi;
        return this;
    }

    /**
     * pi下拉框全选标识，全选时为true
     * @return allPi
     */
    public Boolean getAllPi() {
        return allPi;
    }

    public void setAllPi(Boolean allPi) {
        this.allPi = allPi;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PiFilterInfo that = (PiFilterInfo) obj;
        return Objects.equals(this.piSprints, that.piSprints) && Objects.equals(this.allPi, that.allPi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(piSprints, allPi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PiFilterInfo {\n");
        sb.append("    piSprints: ").append(toIndentedString(piSprints)).append("\n");
        sb.append("    allPi: ").append(toIndentedString(allPi)).append("\n");
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
