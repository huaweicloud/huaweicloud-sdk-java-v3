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
public class ListAvailabilityZoneInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private List<AzInfo> azs = null;

    public ListAvailabilityZoneInfosResponse withAzs(List<AzInfo> azs) {
        this.azs = azs;
        return this;
    }

    public ListAvailabilityZoneInfosResponse addAzsItem(AzInfo azsItem) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(azsItem);
        return this;
    }

    public ListAvailabilityZoneInfosResponse withAzs(Consumer<List<AzInfo>> azsSetter) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * az列表
     * @return azs
     */
    public List<AzInfo> getAzs() {
        return azs;
    }

    public void setAzs(List<AzInfo> azs) {
        this.azs = azs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailabilityZoneInfosResponse that = (ListAvailabilityZoneInfosResponse) obj;
        return Objects.equals(this.azs, that.azs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailabilityZoneInfosResponse {\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
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
