package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
public class ListStagePluginsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_stage_plugins_item_list")

    private List<FullStagePluginsRelationVOFullStagePluginsItemList> fullStagePluginsItemList = null;

    public ListStagePluginsResponse withFullStagePluginsItemList(
        List<FullStagePluginsRelationVOFullStagePluginsItemList> fullStagePluginsItemList) {
        this.fullStagePluginsItemList = fullStagePluginsItemList;
        return this;
    }

    public ListStagePluginsResponse addFullStagePluginsItemListItem(
        FullStagePluginsRelationVOFullStagePluginsItemList fullStagePluginsItemListItem) {
        if (this.fullStagePluginsItemList == null) {
            this.fullStagePluginsItemList = new ArrayList<>();
        }
        this.fullStagePluginsItemList.add(fullStagePluginsItemListItem);
        return this;
    }

    public ListStagePluginsResponse withFullStagePluginsItemList(
        Consumer<List<FullStagePluginsRelationVOFullStagePluginsItemList>> fullStagePluginsItemListSetter) {
        if (this.fullStagePluginsItemList == null) {
            this.fullStagePluginsItemList = new ArrayList<>();
        }
        fullStagePluginsItemListSetter.accept(this.fullStagePluginsItemList);
        return this;
    }

    /**
     * **参数解释**： 结果集。 **取值范围**： 不涉及。 
     * @return fullStagePluginsItemList
     */
    public List<FullStagePluginsRelationVOFullStagePluginsItemList> getFullStagePluginsItemList() {
        return fullStagePluginsItemList;
    }

    public void setFullStagePluginsItemList(
        List<FullStagePluginsRelationVOFullStagePluginsItemList> fullStagePluginsItemList) {
        this.fullStagePluginsItemList = fullStagePluginsItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStagePluginsResponse that = (ListStagePluginsResponse) obj;
        return Objects.equals(this.fullStagePluginsItemList, that.fullStagePluginsItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullStagePluginsItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStagePluginsResponse {\n");
        sb.append("    fullStagePluginsItemList: ").append(toIndentedString(fullStagePluginsItemList)).append("\n");
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
