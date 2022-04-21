package com.huaweicloud.sdk.osm.v2.model;

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
public class ListSatisfactionDimensionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "satisfaction_dimension_list")

    private List<SatisfactionDimensionSimpleInfoV2> satisfactionDimensionList = null;

    public ListSatisfactionDimensionsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListSatisfactionDimensionsResponse withSatisfactionDimensionList(
        List<SatisfactionDimensionSimpleInfoV2> satisfactionDimensionList) {
        this.satisfactionDimensionList = satisfactionDimensionList;
        return this;
    }

    public ListSatisfactionDimensionsResponse addSatisfactionDimensionListItem(
        SatisfactionDimensionSimpleInfoV2 satisfactionDimensionListItem) {
        if (this.satisfactionDimensionList == null) {
            this.satisfactionDimensionList = new ArrayList<>();
        }
        this.satisfactionDimensionList.add(satisfactionDimensionListItem);
        return this;
    }

    public ListSatisfactionDimensionsResponse withSatisfactionDimensionList(
        Consumer<List<SatisfactionDimensionSimpleInfoV2>> satisfactionDimensionListSetter) {
        if (this.satisfactionDimensionList == null) {
            this.satisfactionDimensionList = new ArrayList<>();
        }
        satisfactionDimensionListSetter.accept(this.satisfactionDimensionList);
        return this;
    }

    /**
     * 满意度分类列表
     * @return satisfactionDimensionList
     */
    public List<SatisfactionDimensionSimpleInfoV2> getSatisfactionDimensionList() {
        return satisfactionDimensionList;
    }

    public void setSatisfactionDimensionList(List<SatisfactionDimensionSimpleInfoV2> satisfactionDimensionList) {
        this.satisfactionDimensionList = satisfactionDimensionList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSatisfactionDimensionsResponse listSatisfactionDimensionsResponse = (ListSatisfactionDimensionsResponse) o;
        return Objects.equals(this.totalCount, listSatisfactionDimensionsResponse.totalCount) && Objects
            .equals(this.satisfactionDimensionList, listSatisfactionDimensionsResponse.satisfactionDimensionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, satisfactionDimensionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSatisfactionDimensionsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    satisfactionDimensionList: ").append(toIndentedString(satisfactionDimensionList)).append("\n");
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
