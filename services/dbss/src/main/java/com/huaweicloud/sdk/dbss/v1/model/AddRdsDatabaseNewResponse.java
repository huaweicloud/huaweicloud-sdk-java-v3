package com.huaweicloud.sdk.dbss.v1.model;

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
public class AddRdsDatabaseNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_list")

    private List<RdsDbResponseRetList> retList = null;

    public AddRdsDatabaseNewResponse withRetList(List<RdsDbResponseRetList> retList) {
        this.retList = retList;
        return this;
    }

    public AddRdsDatabaseNewResponse addRetListItem(RdsDbResponseRetList retListItem) {
        if (this.retList == null) {
            this.retList = new ArrayList<>();
        }
        this.retList.add(retListItem);
        return this;
    }

    public AddRdsDatabaseNewResponse withRetList(Consumer<List<RdsDbResponseRetList>> retListSetter) {
        if (this.retList == null) {
            this.retList = new ArrayList<>();
        }
        retListSetter.accept(this.retList);
        return this;
    }

    /**
     * 结果列表
     * @return retList
     */
    public List<RdsDbResponseRetList> getRetList() {
        return retList;
    }

    public void setRetList(List<RdsDbResponseRetList> retList) {
        this.retList = retList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddRdsDatabaseNewResponse that = (AddRdsDatabaseNewResponse) obj;
        return Objects.equals(this.retList, that.retList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRdsDatabaseNewResponse {\n");
        sb.append("    retList: ").append(toIndentedString(retList)).append("\n");
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
