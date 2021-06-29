package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VodSampleData
 */
public class VodSampleData  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage")
    
    private Float storage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode")
    
    private Long transcode;

    public VodSampleData withStorage(Float storage) {
        this.storage = storage;
        return this;
    }

    


    /**
     * 存储空间。 单位：GB。
     * @return storage
     */
    public Float getStorage() {
        return storage;
    }

    public void setStorage(Float storage) {
        this.storage = storage;
    }

    

    public VodSampleData withTranscode(Long transcode) {
        this.transcode = transcode;
        return this;
    }

    


    /**
     * 转码时长。 单位：秒。
     * @return transcode
     */
    public Long getTranscode() {
        return transcode;
    }

    public void setTranscode(Long transcode) {
        this.transcode = transcode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VodSampleData vodSampleData = (VodSampleData) o;
        return Objects.equals(this.storage, vodSampleData.storage) &&
            Objects.equals(this.transcode, vodSampleData.transcode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(storage, transcode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VodSampleData {\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

