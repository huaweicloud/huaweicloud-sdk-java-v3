package com.huaweicloud.sdk.rds.v3.model;

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
public class ListStorageTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private List<Storage> storageType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_info")

    private List<DssPoolInfo> dsspoolInfo = null;

    public ListStorageTypesResponse withStorageType(List<Storage> storageType) {
        this.storageType = storageType;
        return this;
    }

    public ListStorageTypesResponse addStorageTypeItem(Storage storageTypeItem) {
        if (this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        this.storageType.add(storageTypeItem);
        return this;
    }

    public ListStorageTypesResponse withStorageType(Consumer<List<Storage>> storageTypeSetter) {
        if (this.storageType == null) {
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

    public ListStorageTypesResponse withDsspoolInfo(List<DssPoolInfo> dsspoolInfo) {
        this.dsspoolInfo = dsspoolInfo;
        return this;
    }

    public ListStorageTypesResponse addDsspoolInfoItem(DssPoolInfo dsspoolInfoItem) {
        if (this.dsspoolInfo == null) {
            this.dsspoolInfo = new ArrayList<>();
        }
        this.dsspoolInfo.add(dsspoolInfoItem);
        return this;
    }

    public ListStorageTypesResponse withDsspoolInfo(Consumer<List<DssPoolInfo>> dsspoolInfoSetter) {
        if (this.dsspoolInfo == null) {
            this.dsspoolInfo = new ArrayList<>();
        }
        dsspoolInfoSetter.accept(this.dsspoolInfo);
        return this;
    }

    /**
     * 实例专属存储信息。
     * @return dsspoolInfo
     */
    public List<DssPoolInfo> getDsspoolInfo() {
        return dsspoolInfo;
    }

    public void setDsspoolInfo(List<DssPoolInfo> dsspoolInfo) {
        this.dsspoolInfo = dsspoolInfo;
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
        return Objects.equals(this.storageType, listStorageTypesResponse.storageType)
            && Objects.equals(this.dsspoolInfo, listStorageTypesResponse.dsspoolInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType, dsspoolInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypesResponse {\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    dsspoolInfo: ").append(toIndentedString(dsspoolInfo)).append("\n");
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
