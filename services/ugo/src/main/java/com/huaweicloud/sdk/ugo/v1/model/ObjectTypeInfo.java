package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源库中的对象类型信息。
 */
public class ObjectTypeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_select_all_objects_type")

    @JacksonXmlProperty(localName = "is_select_all_objects_type")

    private Boolean isSelectAllObjectsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects_type_list")

    @JacksonXmlProperty(localName = "objects_type_list")

    private List<String> objectsTypeList = null;

    public ObjectTypeInfo withIsSelectAllObjectsType(Boolean isSelectAllObjectsType) {
        this.isSelectAllObjectsType = isSelectAllObjectsType;
        return this;
    }

    /**
     * 是否选择全部object类型。取值为true时，不包含USER。
     * @return isSelectAllObjectsType
     */
    public Boolean getIsSelectAllObjectsType() {
        return isSelectAllObjectsType;
    }

    public void setIsSelectAllObjectsType(Boolean isSelectAllObjectsType) {
        this.isSelectAllObjectsType = isSelectAllObjectsType;
    }

    public ObjectTypeInfo withObjectsTypeList(List<String> objectsTypeList) {
        this.objectsTypeList = objectsTypeList;
        return this;
    }

    public ObjectTypeInfo addObjectsTypeListItem(String objectsTypeListItem) {
        if (this.objectsTypeList == null) {
            this.objectsTypeList = new ArrayList<>();
        }
        this.objectsTypeList.add(objectsTypeListItem);
        return this;
    }

    public ObjectTypeInfo withObjectsTypeList(Consumer<List<String>> objectsTypeListSetter) {
        if (this.objectsTypeList == null) {
            this.objectsTypeList = new ArrayList<>();
        }
        objectsTypeListSetter.accept(this.objectsTypeList);
        return this;
    }

    /**
     * 需要评估的object类型列表。is_select_all_objects_type为false时必填。
     * @return objectsTypeList
     */
    public List<String> getObjectsTypeList() {
        return objectsTypeList;
    }

    public void setObjectsTypeList(List<String> objectsTypeList) {
        this.objectsTypeList = objectsTypeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObjectTypeInfo objectTypeInfo = (ObjectTypeInfo) o;
        return Objects.equals(this.isSelectAllObjectsType, objectTypeInfo.isSelectAllObjectsType)
            && Objects.equals(this.objectsTypeList, objectTypeInfo.objectsTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSelectAllObjectsType, objectsTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectTypeInfo {\n");
        sb.append("    isSelectAllObjectsType: ").append(toIndentedString(isSelectAllObjectsType)).append("\n");
        sb.append("    objectsTypeList: ").append(toIndentedString(objectsTypeList)).append("\n");
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
