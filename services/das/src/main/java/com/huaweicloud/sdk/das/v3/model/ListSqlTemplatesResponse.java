package com.huaweicloud.sdk.das.v3.model;

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
public class ListSqlTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_list")

    private List<Tpl> tplList = null;

    public ListSqlTemplatesResponse withTplList(List<Tpl> tplList) {
        this.tplList = tplList;
        return this;
    }

    public ListSqlTemplatesResponse addTplListItem(Tpl tplListItem) {
        if (this.tplList == null) {
            this.tplList = new ArrayList<>();
        }
        this.tplList.add(tplListItem);
        return this;
    }

    public ListSqlTemplatesResponse withTplList(Consumer<List<Tpl>> tplListSetter) {
        if (this.tplList == null) {
            this.tplList = new ArrayList<>();
        }
        tplListSetter.accept(this.tplList);
        return this;
    }

    /**
     * SQL模板列表
     * @return tplList
     */
    public List<Tpl> getTplList() {
        return tplList;
    }

    public void setTplList(List<Tpl> tplList) {
        this.tplList = tplList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlTemplatesResponse that = (ListSqlTemplatesResponse) obj;
        return Objects.equals(this.tplList, that.tplList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlTemplatesResponse {\n");
        sb.append("    tplList: ").append(toIndentedString(tplList)).append("\n");
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
