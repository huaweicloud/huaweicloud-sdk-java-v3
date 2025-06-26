package com.huaweicloud.sdk.dws.v2.model;

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
public class ListDatabaseObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_list")

    private List<DatabaseObjectInfo> objectList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    public ListDatabaseObjectsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **取值范围**： DATABASE、SCHEMA、TABLE、VIEW、COLUMN、FUNCTION、SEQUENCE、NODEGROUP
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListDatabaseObjectsResponse withObjectList(List<DatabaseObjectInfo> objectList) {
        this.objectList = objectList;
        return this;
    }

    public ListDatabaseObjectsResponse addObjectListItem(DatabaseObjectInfo objectListItem) {
        if (this.objectList == null) {
            this.objectList = new ArrayList<>();
        }
        this.objectList.add(objectListItem);
        return this;
    }

    public ListDatabaseObjectsResponse withObjectList(Consumer<List<DatabaseObjectInfo>> objectListSetter) {
        if (this.objectList == null) {
            this.objectList = new ArrayList<>();
        }
        objectListSetter.accept(this.objectList);
        return this;
    }

    /**
     * **参数解释**： 对象列表。 **取值范围**： 不涉及。
     * @return objectList
     */
    public List<DatabaseObjectInfo> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<DatabaseObjectInfo> objectList) {
        this.objectList = objectList;
    }

    public ListDatabaseObjectsResponse withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 对象总条数。 **取值范围**： 不涉及。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
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
        ListDatabaseObjectsResponse that = (ListDatabaseObjectsResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.objectList, that.objectList)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, objectList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseObjectsResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    objectList: ").append(toIndentedString(objectList)).append("\n");
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
