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
public class ListGroupOtherResourceRelationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<GroupOtherResourceRelationQueryResponseData> data = null;

    public ListGroupOtherResourceRelationsResponse withData(List<GroupOtherResourceRelationQueryResponseData> data) {
        this.data = data;
        return this;
    }

    public ListGroupOtherResourceRelationsResponse addDataItem(GroupOtherResourceRelationQueryResponseData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListGroupOtherResourceRelationsResponse withData(
        Consumer<List<GroupOtherResourceRelationQueryResponseData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释：** 离线资源列表。 **取值范围：** 列表大小在0到500之间。
     * @return data
     */
    public List<GroupOtherResourceRelationQueryResponseData> getData() {
        return data;
    }

    public void setData(List<GroupOtherResourceRelationQueryResponseData> data) {
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
        ListGroupOtherResourceRelationsResponse that = (ListGroupOtherResourceRelationsResponse) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupOtherResourceRelationsResponse {\n");
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
