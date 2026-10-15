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
public class ShowObjectColumnInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_with_column_infos")

    private List<ObjectWithColumnInfo> objectWithColumnInfos = null;

    public ShowObjectColumnInfoResponse withObjectWithColumnInfos(List<ObjectWithColumnInfo> objectWithColumnInfos) {
        this.objectWithColumnInfos = objectWithColumnInfos;
        return this;
    }

    public ShowObjectColumnInfoResponse addObjectWithColumnInfosItem(ObjectWithColumnInfo objectWithColumnInfosItem) {
        if (this.objectWithColumnInfos == null) {
            this.objectWithColumnInfos = new ArrayList<>();
        }
        this.objectWithColumnInfos.add(objectWithColumnInfosItem);
        return this;
    }

    public ShowObjectColumnInfoResponse withObjectWithColumnInfos(
        Consumer<List<ObjectWithColumnInfo>> objectWithColumnInfosSetter) {
        if (this.objectWithColumnInfos == null) {
            this.objectWithColumnInfos = new ArrayList<>();
        }
        objectWithColumnInfosSetter.accept(this.objectWithColumnInfos);
        return this;
    }

    /**
     * 和列信息相关的对象
     * @return objectWithColumnInfos
     */
    public List<ObjectWithColumnInfo> getObjectWithColumnInfos() {
        return objectWithColumnInfos;
    }

    public void setObjectWithColumnInfos(List<ObjectWithColumnInfo> objectWithColumnInfos) {
        this.objectWithColumnInfos = objectWithColumnInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowObjectColumnInfoResponse that = (ShowObjectColumnInfoResponse) obj;
        return Objects.equals(this.objectWithColumnInfos, that.objectWithColumnInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectWithColumnInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowObjectColumnInfoResponse {\n");
        sb.append("    objectWithColumnInfos: ").append(toIndentedString(objectWithColumnInfos)).append("\n");
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
