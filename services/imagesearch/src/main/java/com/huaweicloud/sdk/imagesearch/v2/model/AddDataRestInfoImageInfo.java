package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加图像数据的相关信息，不同服务类型返回信息不同，具体可参见服务类型说明。
 */
public class AddDataRestInfoImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects")

    private List<AddDataRestInfoImageInfoObjects> objects = null;

    public AddDataRestInfoImageInfo withObjects(List<AddDataRestInfoImageInfoObjects> objects) {
        this.objects = objects;
        return this;
    }

    public AddDataRestInfoImageInfo addObjectsItem(AddDataRestInfoImageInfoObjects objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public AddDataRestInfoImageInfo withObjects(Consumer<List<AddDataRestInfoImageInfoObjects>> objectsSetter) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        objectsSetter.accept(this.objects);
        return this;
    }

    /**
     * 添加的主体列表。
     * @return objects
     */
    public List<AddDataRestInfoImageInfoObjects> getObjects() {
        return objects;
    }

    public void setObjects(List<AddDataRestInfoImageInfoObjects> objects) {
        this.objects = objects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDataRestInfoImageInfo that = (AddDataRestInfoImageInfo) obj;
        return Objects.equals(this.objects, that.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataRestInfoImageInfo {\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
