package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaptureResultUrlVO
 */
public class CaptureResultUrlVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "captcha")

    private String captcha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires")

    private Long expires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_list")

    private List<CaptureFile> fileList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_header")

    private HostHeaderInfo requestHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public CaptureResultUrlVO withCaptcha(String captcha) {
        this.captcha = captcha;
        return this;
    }

    /**
     * 下载链接提取码
     * @return captcha
     */
    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public CaptureResultUrlVO withExpires(Long expires) {
        this.expires = expires;
        return this;
    }

    /**
     * 下载链接过期时间
     * @return expires
     */
    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public CaptureResultUrlVO withFileList(List<CaptureFile> fileList) {
        this.fileList = fileList;
        return this;
    }

    public CaptureResultUrlVO addFileListItem(CaptureFile fileListItem) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        this.fileList.add(fileListItem);
        return this;
    }

    public CaptureResultUrlVO withFileList(Consumer<List<CaptureFile>> fileListSetter) {
        if (this.fileList == null) {
            this.fileList = new ArrayList<>();
        }
        fileListSetter.accept(this.fileList);
        return this;
    }

    /**
     * 抓包文件列表
     * @return fileList
     */
    public List<CaptureFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<CaptureFile> fileList) {
        this.fileList = fileList;
    }

    public CaptureResultUrlVO withRequestHeader(HostHeaderInfo requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    public CaptureResultUrlVO withRequestHeader(Consumer<HostHeaderInfo> requestHeaderSetter) {
        if (this.requestHeader == null) {
            this.requestHeader = new HostHeaderInfo();
            requestHeaderSetter.accept(this.requestHeader);
        }

        return this;
    }

    /**
     * Get requestHeader
     * @return requestHeader
     */
    public HostHeaderInfo getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(HostHeaderInfo requestHeader) {
        this.requestHeader = requestHeader;
    }

    public CaptureResultUrlVO withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 下载链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaptureResultUrlVO that = (CaptureResultUrlVO) obj;
        return Objects.equals(this.captcha, that.captcha) && Objects.equals(this.expires, that.expires)
            && Objects.equals(this.fileList, that.fileList) && Objects.equals(this.requestHeader, that.requestHeader)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(captcha, expires, fileList, requestHeader, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptureResultUrlVO {\n");
        sb.append("    captcha: ").append(toIndentedString(captcha)).append("\n");
        sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
        sb.append("    fileList: ").append(toIndentedString(fileList)).append("\n");
        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
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
