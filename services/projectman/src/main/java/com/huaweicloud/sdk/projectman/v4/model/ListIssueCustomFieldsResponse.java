package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListIssueCustomFieldsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datas")

    private List<IssueCustomField> datas = null;

    public ListIssueCustomFieldsResponse withDatas(List<IssueCustomField> datas) {
        this.datas = datas;
        return this;
    }

    public ListIssueCustomFieldsResponse addDatasItem(IssueCustomField datasItem) {
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        this.datas.add(datasItem);
        return this;
    }

    public ListIssueCustomFieldsResponse withDatas(Consumer<List<IssueCustomField>> datasSetter) {
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        datasSetter.accept(this.datas);
        return this;
    }

    /**
     * 自定义字段返回数据
     * @return datas
     */
    public List<IssueCustomField> getDatas() {
        return datas;
    }

    public void setDatas(List<IssueCustomField> datas) {
        this.datas = datas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIssueCustomFieldsResponse that = (ListIssueCustomFieldsResponse) obj;
        return Objects.equals(this.datas, that.datas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueCustomFieldsResponse {\n");
        sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
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
