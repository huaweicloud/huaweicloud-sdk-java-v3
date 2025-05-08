package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectList
 */
public class ObjectList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private ObjectMetaData metaData;

    public ObjectList withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 对象文件名 
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public ObjectList withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资ID 
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ObjectList withMetaData(ObjectMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ObjectList withMetaData(Consumer<ObjectMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new ObjectMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public ObjectMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ObjectMetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectList that = (ObjectList) obj;
        return Objects.equals(this._object, that._object) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, assetId, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectList {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
