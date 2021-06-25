package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 截图结果
 */
public class ThumbnailRsp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;

    public ThumbnailRsp withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 截图在视频中的时间偏移，单位为秒。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ThumbnailRsp withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 截图访问URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThumbnailRsp thumbnailRsp = (ThumbnailRsp) o;
        return Objects.equals(this.offset, thumbnailRsp.offset) &&
            Objects.equals(this.url, thumbnailRsp.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailRsp {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

