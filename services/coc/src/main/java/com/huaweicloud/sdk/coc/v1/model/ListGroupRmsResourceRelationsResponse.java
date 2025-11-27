package com.huaweicloud.sdk.coc.v1.model;

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
public class ListGroupRmsResourceRelationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<GroupRmsResourceRelationQueryResponseData> data = null;

    public ListGroupRmsResourceRelationsResponse withData(List<GroupRmsResourceRelationQueryResponseData> data) {
        this.data = data;
        return this;
    }

    public ListGroupRmsResourceRelationsResponse addDataItem(GroupRmsResourceRelationQueryResponseData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListGroupRmsResourceRelationsResponse withData(
        Consumer<List<GroupRmsResourceRelationQueryResponseData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释：** 分组资源关联信息。 **取值范围：** 长度大小在0~500之间。
     * @return data
     */
    public List<GroupRmsResourceRelationQueryResponseData> getData() {
        return data;
    }

    public void setData(List<GroupRmsResourceRelationQueryResponseData> data) {
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
        ListGroupRmsResourceRelationsResponse that = (ListGroupRmsResourceRelationsResponse) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupRmsResourceRelationsResponse {\n");
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
