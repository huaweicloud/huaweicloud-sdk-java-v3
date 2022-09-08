package com.huaweicloud.sdk.vod.v1.model;

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
public class ListTemplateGroupCollectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_collection_list")

    private List<TemplateGroupCollection> templateGroupCollectionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListTemplateGroupCollectionResponse withTemplateGroupCollectionList(
        List<TemplateGroupCollection> templateGroupCollectionList) {
        this.templateGroupCollectionList = templateGroupCollectionList;
        return this;
    }

    public ListTemplateGroupCollectionResponse addTemplateGroupCollectionListItem(
        TemplateGroupCollection templateGroupCollectionListItem) {
        if (this.templateGroupCollectionList == null) {
            this.templateGroupCollectionList = new ArrayList<>();
        }
        this.templateGroupCollectionList.add(templateGroupCollectionListItem);
        return this;
    }

    public ListTemplateGroupCollectionResponse withTemplateGroupCollectionList(
        Consumer<List<TemplateGroupCollection>> templateGroupCollectionListSetter) {
        if (this.templateGroupCollectionList == null) {
            this.templateGroupCollectionList = new ArrayList<>();
        }
        templateGroupCollectionListSetter.accept(this.templateGroupCollectionList);
        return this;
    }

    /**
     * 模板组集合信息<br/> 
     * @return templateGroupCollectionList
     */
    public List<TemplateGroupCollection> getTemplateGroupCollectionList() {
        return templateGroupCollectionList;
    }

    public void setTemplateGroupCollectionList(List<TemplateGroupCollection> templateGroupCollectionList) {
        this.templateGroupCollectionList = templateGroupCollectionList;
    }

    public ListTemplateGroupCollectionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录条数<br/> 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateGroupCollectionResponse listTemplateGroupCollectionResponse =
            (ListTemplateGroupCollectionResponse) o;
        return Objects.equals(this.templateGroupCollectionList,
            listTemplateGroupCollectionResponse.templateGroupCollectionList)
            && Objects.equals(this.total, listTemplateGroupCollectionResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateGroupCollectionList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateGroupCollectionResponse {\n");
        sb.append("    templateGroupCollectionList: ")
            .append(toIndentedString(templateGroupCollectionList))
            .append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
