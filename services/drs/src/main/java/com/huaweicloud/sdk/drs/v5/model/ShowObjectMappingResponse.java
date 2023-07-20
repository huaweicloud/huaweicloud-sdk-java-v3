package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowObjectMappingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_mapping_list")

    private List<DbObjectInfo> objectMappingList = null;

    public ShowObjectMappingResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowObjectMappingResponse withObjectMappingList(List<DbObjectInfo> objectMappingList) {
        this.objectMappingList = objectMappingList;
        return this;
    }

    public ShowObjectMappingResponse addObjectMappingListItem(DbObjectInfo objectMappingListItem) {
        if (this.objectMappingList == null) {
            this.objectMappingList = new ArrayList<>();
        }
        this.objectMappingList.add(objectMappingListItem);
        return this;
    }

    public ShowObjectMappingResponse withObjectMappingList(Consumer<List<DbObjectInfo>> objectMappingListSetter) {
        if (this.objectMappingList == null) {
            this.objectMappingList = new ArrayList<>();
        }
        objectMappingListSetter.accept(this.objectMappingList);
        return this;
    }

    /**
     * 同步映射数据列表。
     * @return objectMappingList
     */
    public List<DbObjectInfo> getObjectMappingList() {
        return objectMappingList;
    }

    public void setObjectMappingList(List<DbObjectInfo> objectMappingList) {
        this.objectMappingList = objectMappingList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowObjectMappingResponse that = (ShowObjectMappingResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.objectMappingList, that.objectMappingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, objectMappingList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowObjectMappingResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    objectMappingList: ").append(toIndentedString(objectMappingList)).append("\n");
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
