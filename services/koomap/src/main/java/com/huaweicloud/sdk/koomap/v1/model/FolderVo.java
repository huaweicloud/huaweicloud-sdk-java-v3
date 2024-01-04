package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 倾斜影像信息。
 */
public class FolderVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_code")

    private String folderCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_alias")

    private String folderAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_desc")

    private String folderDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_endpoint")

    private String obsEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public FolderVo withFolderCode(String folderCode) {
        this.folderCode = folderCode;
        return this;
    }

    /**
     * 倾斜影像的唯一标识。
     * @return folderCode
     */
    public String getFolderCode() {
        return folderCode;
    }

    public void setFolderCode(String folderCode) {
        this.folderCode = folderCode;
    }

    public FolderVo withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 倾斜影像名称。
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public FolderVo withFolderAlias(String folderAlias) {
        this.folderAlias = folderAlias;
        return this;
    }

    /**
     * 倾斜影像别名。
     * @return folderAlias
     */
    public String getFolderAlias() {
        return folderAlias;
    }

    public void setFolderAlias(String folderAlias) {
        this.folderAlias = folderAlias;
    }

    public FolderVo withFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc;
        return this;
    }

    /**
     * 倾斜影像描述。
     * @return folderDesc
     */
    public String getFolderDesc() {
        return folderDesc;
    }

    public void setFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc;
    }

    public FolderVo withObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
        return this;
    }

    /**
     * 倾斜影像所在OBS的Endpoint。
     * @return obsEndpoint
     */
    public String getObsEndpoint() {
        return obsEndpoint;
    }

    public void setObsEndpoint(String obsEndpoint) {
        this.obsEndpoint = obsEndpoint;
    }

    public FolderVo withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * 倾斜影像所在OBS的目录地址。
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public FolderVo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 倾斜影像上传时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public FolderVo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 倾斜影像状态。  - 0：处理中 - 1：已完成 - 2：导入失败
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderVo that = (FolderVo) obj;
        return Objects.equals(this.folderCode, that.folderCode) && Objects.equals(this.folderName, that.folderName)
            && Objects.equals(this.folderAlias, that.folderAlias) && Objects.equals(this.folderDesc, that.folderDesc)
            && Objects.equals(this.obsEndpoint, that.obsEndpoint) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderCode, folderName, folderAlias, folderDesc, obsEndpoint, obsPath, createTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderVo {\n");
        sb.append("    folderCode: ").append(toIndentedString(folderCode)).append("\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    folderAlias: ").append(toIndentedString(folderAlias)).append("\n");
        sb.append("    folderDesc: ").append(toIndentedString(folderDesc)).append("\n");
        sb.append("    obsEndpoint: ").append(toIndentedString(obsEndpoint)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
