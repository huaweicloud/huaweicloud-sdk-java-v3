package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DivisionPattern
 */
public class DivisionPattern {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern_type")

    private Integer patternType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "division_type")

    private Integer divisionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "division_list")

    private List<Division> divisionList = null;

    public DivisionPattern withPatternType(Integer patternType) {
        this.patternType = patternType;
        return this;
    }

    /**
     * 阶梯类型，1：一次分档模式、2：累计分档模式
     * @return patternType
     */
    public Integer getPatternType() {
        return patternType;
    }

    public void setPatternType(Integer patternType) {
        this.patternType = patternType;
    }

    public DivisionPattern withDivisionType(Integer divisionType) {
        this.divisionType = divisionType;
        return this;
    }

    /**
     * 分档类型，1：STEP，按档拆分定价、2：TIER，按最终档定价
     * @return divisionType
     */
    public Integer getDivisionType() {
        return divisionType;
    }

    public void setDivisionType(Integer divisionType) {
        this.divisionType = divisionType;
    }

    public DivisionPattern withDivisionList(List<Division> divisionList) {
        this.divisionList = divisionList;
        return this;
    }

    public DivisionPattern addDivisionListItem(Division divisionListItem) {
        if (this.divisionList == null) {
            this.divisionList = new ArrayList<>();
        }
        this.divisionList.add(divisionListItem);
        return this;
    }

    public DivisionPattern withDivisionList(Consumer<List<Division>> divisionListSetter) {
        if (this.divisionList == null) {
            this.divisionList = new ArrayList<>();
        }
        divisionListSetter.accept(this.divisionList);
        return this;
    }

    /**
     * 阶梯分档列表
     * @return divisionList
     */
    public List<Division> getDivisionList() {
        return divisionList;
    }

    public void setDivisionList(List<Division> divisionList) {
        this.divisionList = divisionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DivisionPattern that = (DivisionPattern) obj;
        return Objects.equals(this.patternType, that.patternType)
            && Objects.equals(this.divisionType, that.divisionType)
            && Objects.equals(this.divisionList, that.divisionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patternType, divisionType, divisionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DivisionPattern {\n");
        sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
        sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
        sb.append("    divisionList: ").append(toIndentedString(divisionList)).append("\n");
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
