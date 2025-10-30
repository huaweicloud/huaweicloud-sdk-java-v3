package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStoragePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_pool")

    private StoragePoolV2 storagePool;

    public ShowStoragePoolResponse withStoragePool(StoragePoolV2 storagePool) {
        this.storagePool = storagePool;
        return this;
    }

    public ShowStoragePoolResponse withStoragePool(Consumer<StoragePoolV2> storagePoolSetter) {
        if (this.storagePool == null) {
            this.storagePool = new StoragePoolV2();
            storagePoolSetter.accept(this.storagePool);
        }

        return this;
    }

    /**
     * Get storagePool
     * @return storagePool
     */
    public StoragePoolV2 getStoragePool() {
        return storagePool;
    }

    public void setStoragePool(StoragePoolV2 storagePool) {
        this.storagePool = storagePool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStoragePoolResponse that = (ShowStoragePoolResponse) obj;
        return Objects.equals(this.storagePool, that.storagePool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storagePool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStoragePoolResponse {\n");
        sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
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
