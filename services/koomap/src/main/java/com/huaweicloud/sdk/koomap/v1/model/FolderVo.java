package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 影像图片文件夹信息。
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
    @JsonProperty(value = "supplier")

    private String supplier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinate_sys")

    private String coordinateSys;

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
     * 文件夹的唯一标识。
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
     * 文件夹名称。
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
     * 文件夹别名。
     * @return folderAlias
     */
    public String getFolderAlias() {
        return folderAlias;
    }

    public void setFolderAlias(String folderAlias) {
        this.folderAlias = folderAlias;
    }

    public FolderVo withSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    /**
     * 供应商。
     * @return supplier
     */
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public FolderVo withCoordinateSys(String coordinateSys) {
        this.coordinateSys = coordinateSys;
        return this;
    }

    /**
     * 坐标系。
     * @return coordinateSys
     */
    public String getCoordinateSys() {
        return coordinateSys;
    }

    public void setCoordinateSys(String coordinateSys) {
        this.coordinateSys = coordinateSys;
    }

    public FolderVo withFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc;
        return this;
    }

    /**
     * 文件夹描述。
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
     * 文件夹所在OBS的Endpoint。
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
     * 文件夹所在OBS的目录地址。
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
     * 影像上传时间。
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
     * 影像文件夹的可操作状态。  - 1：可操作 - 0：不可操作
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
            && Objects.equals(this.folderAlias, that.folderAlias) && Objects.equals(this.supplier, that.supplier)
            && Objects.equals(this.coordinateSys, that.coordinateSys)
            && Objects.equals(this.folderDesc, that.folderDesc) && Objects.equals(this.obsEndpoint, that.obsEndpoint)
            && Objects.equals(this.obsPath, that.obsPath) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderCode,
            folderName,
            folderAlias,
            supplier,
            coordinateSys,
            folderDesc,
            obsEndpoint,
            obsPath,
            createTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderVo {\n");
        sb.append("    folderCode: ").append(toIndentedString(folderCode)).append("\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    folderAlias: ").append(toIndentedString(folderAlias)).append("\n");
        sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
        sb.append("    coordinateSys: ").append(toIndentedString(coordinateSys)).append("\n");
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
