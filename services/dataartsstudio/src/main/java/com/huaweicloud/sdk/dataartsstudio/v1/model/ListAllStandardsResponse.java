package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAllStandardsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private StandardSearchResultData data;

    public ListAllStandardsResponse withData(StandardSearchResultData data) {
        this.data = data;
        return this;
    }

    public ListAllStandardsResponse withData(Consumer<StandardSearchResultData> dataSetter) {
        if (this.data == null) {
            this.data = new StandardSearchResultData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public StandardSearchResultData getData() {
        return data;
    }

    public void setData(StandardSearchResultData data) {
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
        ListAllStandardsResponse that = (ListAllStandardsResponse) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllStandardsResponse {\n");
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
