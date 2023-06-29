package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListLabelPageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_pages")

    private List<LabelPageListDto> labelPages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListLabelPageResponse withLabelPages(List<LabelPageListDto> labelPages) {
        this.labelPages = labelPages;
        return this;
    }

    public ListLabelPageResponse addLabelPagesItem(LabelPageListDto labelPagesItem) {
        if (this.labelPages == null) {
            this.labelPages = new ArrayList<>();
        }
        this.labelPages.add(labelPagesItem);
        return this;
    }

    public ListLabelPageResponse withLabelPages(Consumer<List<LabelPageListDto>> labelPagesSetter) {
        if (this.labelPages == null) {
            this.labelPages = new ArrayList<>();
        }
        labelPagesSetter.accept(this.labelPages);
        return this;
    }

    /**
     * 标签页面列表
     * @return labelPages
     */
    public List<LabelPageListDto> getLabelPages() {
        return labelPages;
    }

    public void setLabelPages(List<LabelPageListDto> labelPages) {
        this.labelPages = labelPages;
    }

    public ListLabelPageResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 标签页面总条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLabelPageResponse that = (ListLabelPageResponse) obj;
        return Objects.equals(this.labelPages, that.labelPages) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelPages, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLabelPageResponse {\n");
        sb.append("    labelPages: ").append(toIndentedString(labelPages)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
