package com.huaweicloud.sdk.dds.v3.model;

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
public class ListAz2MigrateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_list")

    private List<Az2Migrate> azList = null;

    public ListAz2MigrateResponse withAzList(List<Az2Migrate> azList) {
        this.azList = azList;
        return this;
    }

    public ListAz2MigrateResponse addAzListItem(Az2Migrate azListItem) {
        if (this.azList == null) {
            this.azList = new ArrayList<>();
        }
        this.azList.add(azListItem);
        return this;
    }

    public ListAz2MigrateResponse withAzList(Consumer<List<Az2Migrate>> azListSetter) {
        if (this.azList == null) {
            this.azList = new ArrayList<>();
        }
        azListSetter.accept(this.azList);
        return this;
    }

    /**
     * 可用区具体信息。
     * @return azList
     */
    public List<Az2Migrate> getAzList() {
        return azList;
    }

    public void setAzList(List<Az2Migrate> azList) {
        this.azList = azList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAz2MigrateResponse listAz2MigrateResponse = (ListAz2MigrateResponse) o;
        return Objects.equals(this.azList, listAz2MigrateResponse.azList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAz2MigrateResponse {\n");
        sb.append("    azList: ").append(toIndentedString(azList)).append("\n");
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
