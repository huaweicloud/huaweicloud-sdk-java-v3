package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ObsFileAddr
 */
public class ObsFileAddr  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private String location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object")
    
    private String _object;

    public ObsFileAddr withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * OBS的bucket名称
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ObsFileAddr withLocation(String location) {
        this.location = location;
        return this;
    }

    


    /**
     * OBS Bucket所在数据中心（OBS Location）
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ObsFileAddr withObject(String _object) {
        this._object = _object;
        return this;
    }

    


    /**
     * OBS对象路径，遵守OSS Object定义，当用于指示input时,需要指定到具体对象；当用于指示output时, 只需指定到转码结果期望存放的路径
     * @return _object
     */
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
        ObsFileAddr obsFileAddr = (ObsFileAddr) o;
        return Objects.equals(this.bucket, obsFileAddr.bucket) &&
            Objects.equals(this.location, obsFileAddr.location) &&
            Objects.equals(this._object, obsFileAddr._object);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucket, location, _object);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsFileAddr {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

