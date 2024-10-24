package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSpecsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_types")

    private List<String> specTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario")

    private SpecScenario scenario;

    public ListSpecsRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListSpecsRequest withSpecTypes(List<String> specTypes) {
        this.specTypes = specTypes;
        return this;
    }

    public ListSpecsRequest addSpecTypesItem(String specTypesItem) {
        if (this.specTypes == null) {
            this.specTypes = new ArrayList<>();
        }
        this.specTypes.add(specTypesItem);
        return this;
    }

    public ListSpecsRequest withSpecTypes(Consumer<List<String>> specTypesSetter) {
        if (this.specTypes == null) {
            this.specTypes = new ArrayList<>();
        }
        specTypesSetter.accept(this.specTypes);
        return this;
    }

    /**
     * 通过资源规格类型检索
     * @return specTypes
     */
    public List<String> getSpecTypes() {
        return specTypes;
    }

    public void setSpecTypes(List<String> specTypes) {
        this.specTypes = specTypes;
    }

    public ListSpecsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0，默认为0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSpecsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定每一页返回的最大条目数，取值范围[1,100]，默认为10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSpecsRequest withScenario(SpecScenario scenario) {
        this.scenario = scenario;
        return this;
    }

    /**
     * 规格使用场景，不填表示不限制： COMPUTE: 用于购买Ray计算资源时配置的物理节点规格 ENDPOINT: 用于创建Endpoint时配置的资源组规格大小
     * @return scenario
     */
    public SpecScenario getScenario() {
        return scenario;
    }

    public void setScenario(SpecScenario scenario) {
        this.scenario = scenario;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSpecsRequest that = (ListSpecsRequest) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.specTypes, that.specTypes)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.scenario, that.scenario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, specTypes, offset, limit, scenario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecsRequest {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    specTypes: ").append(toIndentedString(specTypes)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
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
