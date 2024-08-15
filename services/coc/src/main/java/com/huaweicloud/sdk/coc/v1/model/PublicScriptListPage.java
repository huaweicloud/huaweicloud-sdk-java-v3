package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公共脚本列表分页数据
 */
public class PublicScriptListPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<PublicScriptListModel> data = null;

    public PublicScriptListPage withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * minimum: 1
     * maximum: 9223372036854775807
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public PublicScriptListPage withData(List<PublicScriptListModel> data) {
        this.data = data;
        return this;
    }

    public PublicScriptListPage addDataItem(PublicScriptListModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public PublicScriptListPage withData(Consumer<List<PublicScriptListModel>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 单页数据列表
     * @return data
     */
    public List<PublicScriptListModel> getData() {
        return data;
    }

    public void setData(List<PublicScriptListModel> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicScriptListPage that = (PublicScriptListPage) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicScriptListPage {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
