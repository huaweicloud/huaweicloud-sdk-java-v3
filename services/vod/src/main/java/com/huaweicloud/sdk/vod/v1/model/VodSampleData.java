package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VodSampleData
 */
public class VodSampleData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Float storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_warm")

    private Float storageWarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_cold")

    private Float storageCold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode")

    private Long transcode;

    public VodSampleData withStorage(Float storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 存储空间。  单位：GB。
     * @return storage
     */
    public Float getStorage() {
        return storage;
    }

    public void setStorage(Float storage) {
        this.storage = storage;
    }

    public VodSampleData withStorageWarm(Float storageWarm) {
        this.storageWarm = storageWarm;
        return this;
    }

    /**
     * 低频存储空间。  单位：GB。
     * @return storageWarm
     */
    public Float getStorageWarm() {
        return storageWarm;
    }

    public void setStorageWarm(Float storageWarm) {
        this.storageWarm = storageWarm;
    }

    public VodSampleData withStorageCold(Float storageCold) {
        this.storageCold = storageCold;
        return this;
    }

    /**
     * 归档存储空间。  单位：GB。
     * @return storageCold
     */
    public Float getStorageCold() {
        return storageCold;
    }

    public void setStorageCold(Float storageCold) {
        this.storageCold = storageCold;
    }

    public VodSampleData withTranscode(Long transcode) {
        this.transcode = transcode;
        return this;
    }

    /**
     * 转码时长。  单位：分钟。
     * @return transcode
     */
    public Long getTranscode() {
        return transcode;
    }

    public void setTranscode(Long transcode) {
        this.transcode = transcode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VodSampleData that = (VodSampleData) obj;
        return Objects.equals(this.storage, that.storage) && Objects.equals(this.storageWarm, that.storageWarm)
            && Objects.equals(this.storageCold, that.storageCold) && Objects.equals(this.transcode, that.transcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage, storageWarm, storageCold, transcode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VodSampleData {\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    storageWarm: ").append(toIndentedString(storageWarm)).append("\n");
        sb.append("    storageCold: ").append(toIndentedString(storageCold)).append("\n");
        sb.append("    transcode: ").append(toIndentedString(transcode)).append("\n");
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
