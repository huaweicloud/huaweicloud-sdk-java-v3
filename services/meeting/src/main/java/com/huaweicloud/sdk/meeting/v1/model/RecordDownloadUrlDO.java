package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 单个录制文件下载链接信息
 */
public class RecordDownloadUrlDO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="token")
    
    private String token;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fileType")
    
    private String fileType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;

    public RecordDownloadUrlDO withToken(String token) {
        this.token = token;
        return this;
    }

    


    /**
     * 下载鉴权token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    

    public RecordDownloadUrlDO withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    


    /**
     * 文件类型
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    

    public RecordDownloadUrlDO withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 录制文件下载URL
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
        RecordDownloadUrlDO recordDownloadUrlDO = (RecordDownloadUrlDO) o;
        return Objects.equals(this.token, recordDownloadUrlDO.token) &&
            Objects.equals(this.fileType, recordDownloadUrlDO.fileType) &&
            Objects.equals(this.url, recordDownloadUrlDO.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(token, fileType, url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordDownloadUrlDO {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

