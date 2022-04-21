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
public class ListStorageTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private List<Storage> storageType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_pool_info")

    private List<DssPoolInfo> dssPoolInfo = null;

    public ListStorageTypeResponse withStorageType(List<Storage> storageType) {
        this.storageType = storageType;
        return this;
    }

    public ListStorageTypeResponse addStorageTypeItem(Storage storageTypeItem) {
        if (this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        this.storageType.add(storageTypeItem);
        return this;
    }

    public ListStorageTypeResponse withStorageType(Consumer<List<Storage>> storageTypeSetter) {
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

    public ListStorageTypeResponse withDssPoolInfo(List<DssPoolInfo> dssPoolInfo) {
        this.dssPoolInfo = dssPoolInfo;
        return this;
    }

    public ListStorageTypeResponse addDssPoolInfoItem(DssPoolInfo dssPoolInfoItem) {
        if (this.dssPoolInfo == null) {
            this.dssPoolInfo = new ArrayList<>();
        }
        this.dssPoolInfo.add(dssPoolInfoItem);
        return this;
    }

    public ListStorageTypeResponse withDssPoolInfo(Consumer<List<DssPoolInfo>> dssPoolInfoSetter) {
        if (this.dssPoolInfo == null) {
            this.dssPoolInfo = new ArrayList<>();
        }
        dssPoolInfoSetter.accept(this.dssPoolInfo);
        return this;
    }

    /**
     * 实例专属存储信息。
     * @return dssPoolInfo
     */
    public List<DssPoolInfo> getDssPoolInfo() {
        return dssPoolInfo;
    }

    public void setDssPoolInfo(List<DssPoolInfo> dssPoolInfo) {
        this.dssPoolInfo = dssPoolInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStorageTypeResponse listStorageTypeResponse = (ListStorageTypeResponse) o;
        return Objects.equals(this.storageType, listStorageTypeResponse.storageType)
            && Objects.equals(this.dssPoolInfo, listStorageTypeResponse.dssPoolInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType, dssPoolInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypeResponse {\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    dssPoolInfo: ").append(toIndentedString(dssPoolInfo)).append("\n");
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
