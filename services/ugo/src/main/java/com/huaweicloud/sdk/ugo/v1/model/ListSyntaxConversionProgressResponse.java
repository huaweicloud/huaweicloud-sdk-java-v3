package com.huaweicloud.sdk.ugo.v1.model;

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
public class ListSyntaxConversionProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_objects_count")

    @JacksonXmlProperty(localName = "total_objects_count")

    private Integer totalObjectsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_objects_count")

    @JacksonXmlProperty(localName = "completed_objects_count")

    private Integer completedObjectsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects_list")

    @JacksonXmlProperty(localName = "objects_list")

    private List<DatabaseObject> objectsList = null;

    public ListSyntaxConversionProgressResponse withTotalObjectsCount(Integer totalObjectsCount) {
        this.totalObjectsCount = totalObjectsCount;
        return this;
    }

    /**
     * 对象总数。
     * @return totalObjectsCount
     */
    public Integer getTotalObjectsCount() {
        return totalObjectsCount;
    }

    public void setTotalObjectsCount(Integer totalObjectsCount) {
        this.totalObjectsCount = totalObjectsCount;
    }

    public ListSyntaxConversionProgressResponse withCompletedObjectsCount(Integer completedObjectsCount) {
        this.completedObjectsCount = completedObjectsCount;
        return this;
    }

    /**
     * 完成语法转换的对象数量。
     * @return completedObjectsCount
     */
    public Integer getCompletedObjectsCount() {
        return completedObjectsCount;
    }

    public void setCompletedObjectsCount(Integer completedObjectsCount) {
        this.completedObjectsCount = completedObjectsCount;
    }

    public ListSyntaxConversionProgressResponse withObjectsList(List<DatabaseObject> objectsList) {
        this.objectsList = objectsList;
        return this;
    }

    public ListSyntaxConversionProgressResponse addObjectsListItem(DatabaseObject objectsListItem) {
        if (this.objectsList == null) {
            this.objectsList = new ArrayList<>();
        }
        this.objectsList.add(objectsListItem);
        return this;
    }

    public ListSyntaxConversionProgressResponse withObjectsList(Consumer<List<DatabaseObject>> objectsListSetter) {
        if (this.objectsList == null) {
            this.objectsList = new ArrayList<>();
        }
        objectsListSetter.accept(this.objectsList);
        return this;
    }

    /**
     * 语法转换的对象列表。
     * @return objectsList
     */
    public List<DatabaseObject> getObjectsList() {
        return objectsList;
    }

    public void setObjectsList(List<DatabaseObject> objectsList) {
        this.objectsList = objectsList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSyntaxConversionProgressResponse listSyntaxConversionProgressResponse =
            (ListSyntaxConversionProgressResponse) o;
        return Objects.equals(this.totalObjectsCount, listSyntaxConversionProgressResponse.totalObjectsCount)
            && Objects.equals(this.completedObjectsCount, listSyntaxConversionProgressResponse.completedObjectsCount)
            && Objects.equals(this.objectsList, listSyntaxConversionProgressResponse.objectsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalObjectsCount, completedObjectsCount, objectsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyntaxConversionProgressResponse {\n");
        sb.append("    totalObjectsCount: ").append(toIndentedString(totalObjectsCount)).append("\n");
        sb.append("    completedObjectsCount: ").append(toIndentedString(completedObjectsCount)).append("\n");
        sb.append("    objectsList: ").append(toIndentedString(objectsList)).append("\n");
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
