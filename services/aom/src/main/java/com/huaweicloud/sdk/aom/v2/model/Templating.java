package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Templating
 */
public class Templating {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<TemplateInfo> list = null;

    public Templating withList(List<TemplateInfo> list) {
        this.list = list;
        return this;
    }

    public Templating addListItem(TemplateInfo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public Templating withList(Consumer<List<TemplateInfo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 变量列表。
     * @return list
     */
    public List<TemplateInfo> getList() {
        return list;
    }

    public void setList(List<TemplateInfo> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Templating that = (Templating) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Templating {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
