package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 编排映射规则。
 */
public class OrchestrationMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "map_param_list")

    private List<String> mapParamList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "map_param_range")

    private OrchestrationMapParamRange mapParamRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapped_param_value")

    private String mappedParamValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept_length")

    private Integer interceptLength;

    public OrchestrationMap withMapParamList(List<String> mapParamList) {
        this.mapParamList = mapParamList;
        return this;
    }

    public OrchestrationMap addMapParamListItem(String mapParamListItem) {
        if (this.mapParamList == null) {
            this.mapParamList = new ArrayList<>();
        }
        this.mapParamList.add(mapParamListItem);
        return this;
    }

    public OrchestrationMap withMapParamList(Consumer<List<String>> mapParamListSetter) {
        if (this.mapParamList == null) {
            this.mapParamList = new ArrayList<>();
        }
        mapParamListSetter.accept(this.mapParamList);
        return this;
    }

    /**
     * 用于映射编排后参数的列表配置，当orchestration_strategy=list时必填，列表长度范围为0-3000。  列表的取值只支持英文，数字，中划线和下划线，1-128个字符。
     * @return mapParamList
     */
    public List<String> getMapParamList() {
        return mapParamList;
    }

    public void setMapParamList(List<String> mapParamList) {
        this.mapParamList = mapParamList;
    }

    public OrchestrationMap withMapParamRange(OrchestrationMapParamRange mapParamRange) {
        this.mapParamRange = mapParamRange;
        return this;
    }

    public OrchestrationMap withMapParamRange(Consumer<OrchestrationMapParamRange> mapParamRangeSetter) {
        if (this.mapParamRange == null) {
            this.mapParamRange = new OrchestrationMapParamRange();
            mapParamRangeSetter.accept(this.mapParamRange);
        }

        return this;
    }

    /**
     * Get mapParamRange
     * @return mapParamRange
     */
    public OrchestrationMapParamRange getMapParamRange() {
        return mapParamRange;
    }

    public void setMapParamRange(OrchestrationMapParamRange mapParamRange) {
        this.mapParamRange = mapParamRange;
    }

    public OrchestrationMap withMappedParamValue(String mappedParamValue) {
        this.mappedParamValue = mappedParamValue;
        return this;
    }

    /**
     * 编排后的参数取值，只支持英文和数字，1-128个字符。 当orchestration_strategy为hash、head_n、tail_n，或者is_preprocessing为false时，非必填，其他情况必填。
     * @return mappedParamValue
     */
    public String getMappedParamValue() {
        return mappedParamValue;
    }

    public void setMappedParamValue(String mappedParamValue) {
        this.mappedParamValue = mappedParamValue;
    }

    public OrchestrationMap withInterceptLength(Integer interceptLength) {
        this.interceptLength = interceptLength;
        return this;
    }

    /**
     * 截取长度，取值范围为1-100，当策略类型为head_n和tail_n时必填，当截取长度大于参数长度时，截取参数的结果为完整参数。
     * minimum: 1
     * maximum: 100
     * @return interceptLength
     */
    public Integer getInterceptLength() {
        return interceptLength;
    }

    public void setInterceptLength(Integer interceptLength) {
        this.interceptLength = interceptLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrchestrationMap that = (OrchestrationMap) obj;
        return Objects.equals(this.mapParamList, that.mapParamList)
            && Objects.equals(this.mapParamRange, that.mapParamRange)
            && Objects.equals(this.mappedParamValue, that.mappedParamValue)
            && Objects.equals(this.interceptLength, that.interceptLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapParamList, mapParamRange, mappedParamValue, interceptLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrchestrationMap {\n");
        sb.append("    mapParamList: ").append(toIndentedString(mapParamList)).append("\n");
        sb.append("    mapParamRange: ").append(toIndentedString(mapParamRange)).append("\n");
        sb.append("    mappedParamValue: ").append(toIndentedString(mappedParamValue)).append("\n");
        sb.append("    interceptLength: ").append(toIndentedString(interceptLength)).append("\n");
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
