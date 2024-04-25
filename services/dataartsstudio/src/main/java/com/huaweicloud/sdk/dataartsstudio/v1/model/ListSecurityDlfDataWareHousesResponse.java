package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecurityDlfDataWareHousesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_lists")

    private List<DataWareHouseDTO> dwLists = null;

    public ListSecurityDlfDataWareHousesResponse withDwLists(List<DataWareHouseDTO> dwLists) {
        this.dwLists = dwLists;
        return this;
    }

    public ListSecurityDlfDataWareHousesResponse addDwListsItem(DataWareHouseDTO dwListsItem) {
        if (this.dwLists == null) {
            this.dwLists = new ArrayList<>();
        }
        this.dwLists.add(dwListsItem);
        return this;
    }

    public ListSecurityDlfDataWareHousesResponse withDwLists(Consumer<List<DataWareHouseDTO>> dwListsSetter) {
        if (this.dwLists == null) {
            this.dwLists = new ArrayList<>();
        }
        dwListsSetter.accept(this.dwLists);
        return this;
    }

    /**
     * 数据开发细粒度连接列表
     * @return dwLists
     */
    public List<DataWareHouseDTO> getDwLists() {
        return dwLists;
    }

    public void setDwLists(List<DataWareHouseDTO> dwLists) {
        this.dwLists = dwLists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityDlfDataWareHousesResponse that = (ListSecurityDlfDataWareHousesResponse) obj;
        return Objects.equals(this.dwLists, that.dwLists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwLists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityDlfDataWareHousesResponse {\n");
        sb.append("    dwLists: ").append(toIndentedString(dwLists)).append("\n");
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
