package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加ip白名单请求体
 */
public class AddTrustedIpAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private Integer ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_start")

    private String ipStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_end")

    private String ipEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_flag")

    private Integer viewFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_flag")

    private Integer downloadFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_flag")

    private Integer uploadFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public AddTrustedIpAddressRequestBody withIpType(Integer ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * 格式类型，指定ip，ip范围，CIDR
     * @return ipType
     */
    public Integer getIpType() {
        return ipType;
    }

    public void setIpType(Integer ipType) {
        this.ipType = ipType;
    }

    public AddTrustedIpAddressRequestBody withIpStart(String ipStart) {
        this.ipStart = ipStart;
        return this;
    }

    /**
     * 起始ip
     * @return ipStart
     */
    public String getIpStart() {
        return ipStart;
    }

    public void setIpStart(String ipStart) {
        this.ipStart = ipStart;
    }

    public AddTrustedIpAddressRequestBody withIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
        return this;
    }

    /**
     * 结束ip
     * @return ipEnd
     */
    public String getIpEnd() {
        return ipEnd;
    }

    public void setIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
    }

    public AddTrustedIpAddressRequestBody withViewFlag(Integer viewFlag) {
        this.viewFlag = viewFlag;
        return this;
    }

    /**
     * 是否允许访问代码仓库
     * @return viewFlag
     */
    public Integer getViewFlag() {
        return viewFlag;
    }

    public void setViewFlag(Integer viewFlag) {
        this.viewFlag = viewFlag;
    }

    public AddTrustedIpAddressRequestBody withDownloadFlag(Integer downloadFlag) {
        this.downloadFlag = downloadFlag;
        return this;
    }

    /**
     * 是否允许下载代码
     * @return downloadFlag
     */
    public Integer getDownloadFlag() {
        return downloadFlag;
    }

    public void setDownloadFlag(Integer downloadFlag) {
        this.downloadFlag = downloadFlag;
    }

    public AddTrustedIpAddressRequestBody withUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
        return this;
    }

    /**
     * 是否允许提交代码
     * @return uploadFlag
     */
    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public AddTrustedIpAddressRequestBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTrustedIpAddressRequestBody that = (AddTrustedIpAddressRequestBody) obj;
        return Objects.equals(this.ipType, that.ipType) && Objects.equals(this.ipStart, that.ipStart)
            && Objects.equals(this.ipEnd, that.ipEnd) && Objects.equals(this.viewFlag, that.viewFlag)
            && Objects.equals(this.downloadFlag, that.downloadFlag) && Objects.equals(this.uploadFlag, that.uploadFlag)
            && Objects.equals(this.remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipType, ipStart, ipEnd, viewFlag, downloadFlag, uploadFlag, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTrustedIpAddressRequestBody {\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ipStart: ").append(toIndentedString(ipStart)).append("\n");
        sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
        sb.append("    viewFlag: ").append(toIndentedString(viewFlag)).append("\n");
        sb.append("    downloadFlag: ").append(toIndentedString(downloadFlag)).append("\n");
        sb.append("    uploadFlag: ").append(toIndentedString(uploadFlag)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
