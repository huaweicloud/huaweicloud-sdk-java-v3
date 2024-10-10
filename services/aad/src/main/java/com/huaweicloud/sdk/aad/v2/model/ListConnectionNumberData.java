package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListConnectionNumberData
 */
public class ListConnectionNumberData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<ListConnectionNumberDataList> list = null;

    public ListConnectionNumberData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListConnectionNumberData withList(List<ListConnectionNumberDataList> list) {
        this.list = list;
        return this;
    }

    public ListConnectionNumberData addListItem(ListConnectionNumberDataList listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListConnectionNumberData withList(Consumer<List<ListConnectionNumberDataList>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * items
     * @return list
     */
    public List<ListConnectionNumberDataList> getList() {
        return list;
    }

    public void setList(List<ListConnectionNumberDataList> list) {
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
        ListConnectionNumberData that = (ListConnectionNumberData) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionNumberData {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
