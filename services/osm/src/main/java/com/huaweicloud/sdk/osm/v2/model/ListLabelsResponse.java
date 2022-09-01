package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLabelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    @JacksonXmlProperty(localName = "label_list")

    private List<CaseLabelInfo> labelList = null;

    public ListLabelsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListLabelsResponse withLabelList(List<CaseLabelInfo> labelList) {
        this.labelList = labelList;
        return this;
    }

    public ListLabelsResponse addLabelListItem(CaseLabelInfo labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public ListLabelsResponse withLabelList(Consumer<List<CaseLabelInfo>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * 标签列表
     * @return labelList
     */
    public List<CaseLabelInfo> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<CaseLabelInfo> labelList) {
        this.labelList = labelList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLabelsResponse listLabelsResponse = (ListLabelsResponse) o;
        return Objects.equals(this.totalCount, listLabelsResponse.totalCount)
            && Objects.equals(this.labelList, listLabelsResponse.labelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, labelList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLabelsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
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
