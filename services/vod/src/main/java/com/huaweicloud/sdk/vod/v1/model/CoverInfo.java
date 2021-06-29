package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 封面信息。
 */
public class CoverInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cover_url")
    
    private String coverUrl;

    public CoverInfo withCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    


    /**
     * 封面文件的下载地址。
     * @return coverUrl
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoverInfo coverInfo = (CoverInfo) o;
        return Objects.equals(this.coverUrl, coverInfo.coverUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(coverUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverInfo {\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
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

