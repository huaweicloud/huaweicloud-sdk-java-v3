package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CheckMd5DuplicationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="md5")
    
    private String md5;

    public CheckMd5DuplicationRequest withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 文件大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    

    public CheckMd5DuplicationRequest withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    


    /**
     * 文件MD5
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckMd5DuplicationRequest checkMd5DuplicationRequest = (CheckMd5DuplicationRequest) o;
        return Objects.equals(this.size, checkMd5DuplicationRequest.size) &&
            Objects.equals(this.md5, checkMd5DuplicationRequest.md5);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, md5);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMd5DuplicationRequest {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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

