package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 媒资存储参数信息。 */
public class FileAddr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    public FileAddr withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /** OBS的bucket名称。
     * 
     * @return bucket */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public FileAddr withLocation(String location) {
        this.location = location;
        return this;
    }

    /** 桶所在的区域名， 如“华北-北京四”的区域名为“cn-north-4”，创建的桶所在区域必须和点播服务所在区域保持一致。
     * 
     * @return location */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FileAddr withObject(String _object) {
        this._object = _object;
        return this;
    }

    /** 文件的存储路径。
     * 
     * @return _object */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileAddr fileAddr = (FileAddr) o;
        return Objects.equals(this.bucket, fileAddr.bucket) && Objects.equals(this.location, fileAddr.location)
            && Objects.equals(this._object, fileAddr._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, location, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileAddr {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
