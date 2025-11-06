package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteNotificationRequestBody
 */
public class DeleteNotificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "names")

    private List<String> names = null;

    public DeleteNotificationRequestBody withNames(List<String> names) {
        this.names = names;
        return this;
    }

    public DeleteNotificationRequestBody addNamesItem(String namesItem) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        this.names.add(namesItem);
        return this;
    }

    public DeleteNotificationRequestBody withNames(Consumer<List<String>> namesSetter) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        namesSetter.accept(this.names);
        return this;
    }

    /**
     * 待删除的消息通知模板名称列表。
     * @return names
     */
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNotificationRequestBody that = (DeleteNotificationRequestBody) obj;
        return Objects.equals(this.names, that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNotificationRequestBody {\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
