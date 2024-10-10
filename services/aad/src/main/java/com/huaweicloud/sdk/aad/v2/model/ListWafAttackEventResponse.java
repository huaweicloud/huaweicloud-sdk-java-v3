package com.huaweicloud.sdk.aad.v2.model;

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
public class ListWafAttackEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<ListWafAttackEventlist> list = null;

    public ListWafAttackEventResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWafAttackEventResponse withList(List<ListWafAttackEventlist> list) {
        this.list = list;
        return this;
    }

    public ListWafAttackEventResponse addListItem(ListWafAttackEventlist listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListWafAttackEventResponse withList(Consumer<List<ListWafAttackEventlist>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * list
     * @return list
     */
    public List<ListWafAttackEventlist> getList() {
        return list;
    }

    public void setList(List<ListWafAttackEventlist> list) {
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
        ListWafAttackEventResponse that = (ListWafAttackEventResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWafAttackEventResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
