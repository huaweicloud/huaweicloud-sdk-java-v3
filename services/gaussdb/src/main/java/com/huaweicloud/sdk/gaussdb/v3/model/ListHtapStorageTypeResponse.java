package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListHtapStorageTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private List<HtapStorageTypeStorageType> storageType = null;

    public ListHtapStorageTypeResponse withStorageType(List<HtapStorageTypeStorageType> storageType) {
        this.storageType = storageType;
        return this;
    }

    public ListHtapStorageTypeResponse addStorageTypeItem(HtapStorageTypeStorageType storageTypeItem) {
        if (this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        this.storageType.add(storageTypeItem);
        return this;
    }

    public ListHtapStorageTypeResponse withStorageType(Consumer<List<HtapStorageTypeStorageType>> storageTypeSetter) {
        if (this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        storageTypeSetter.accept(this.storageType);
        return this;
    }

    /**
     * 存储类型。
     * @return storageType
     */
    public List<HtapStorageTypeStorageType> getStorageType() {
        return storageType;
    }

    public void setStorageType(List<HtapStorageTypeStorageType> storageType) {
        this.storageType = storageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHtapStorageTypeResponse that = (ListHtapStorageTypeResponse) obj;
        return Objects.equals(this.storageType, that.storageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHtapStorageTypeResponse {\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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
