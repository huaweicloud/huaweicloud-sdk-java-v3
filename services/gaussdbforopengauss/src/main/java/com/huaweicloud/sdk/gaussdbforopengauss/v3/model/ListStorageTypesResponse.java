package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStorageTypesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_type")
    
    
    private List<Storage> storageType = null;
    
    public ListStorageTypesResponse withStorageType(List<Storage> storageType) {
        this.storageType = storageType;
        return this;
    }

    
    public ListStorageTypesResponse addStorageTypeItem(Storage storageTypeItem) {
        if(this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        this.storageType.add(storageTypeItem);
        return this;
    }

    public ListStorageTypesResponse withStorageType(Consumer<List<Storage>> storageTypeSetter) {
        if(this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        storageTypeSetter.accept(this.storageType);
        return this;
    }

    /**
     * 实例磁盘类型信息。
     * @return storageType
     */
    public List<Storage> getStorageType() {
        return storageType;
    }

    public void setStorageType(List<Storage> storageType) {
        this.storageType = storageType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStorageTypesResponse listStorageTypesResponse = (ListStorageTypesResponse) o;
        return Objects.equals(this.storageType, listStorageTypesResponse.storageType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(storageType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypesResponse {\n");
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

