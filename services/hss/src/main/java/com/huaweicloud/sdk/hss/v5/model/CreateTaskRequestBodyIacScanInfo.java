package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建IAC安全扫描任务的参数，任务类型为“iac_scan”时必传
 */
public class CreateTaskRequestBodyIacScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id_list")

    private List<String> fileIdList = null;

    public CreateTaskRequestBodyIacScanInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型，包含如下   - dockerfile：Dockerfile文件   - k8s_yaml：k8s yaml文件
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public CreateTaskRequestBodyIacScanInfo withFileIdList(List<String> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }

    public CreateTaskRequestBodyIacScanInfo addFileIdListItem(String fileIdListItem) {
        if (this.fileIdList == null) {
            this.fileIdList = new ArrayList<>();
        }
        this.fileIdList.add(fileIdListItem);
        return this;
    }

    public CreateTaskRequestBodyIacScanInfo withFileIdList(Consumer<List<String>> fileIdListSetter) {
        if (this.fileIdList == null) {
            this.fileIdList = new ArrayList<>();
        }
        fileIdListSetter.accept(this.fileIdList);
        return this;
    }

    /**
     * 需要扫描的文件id列表，可以从文件上传接口“/v5/{project_id}/common/files/batch-upload”的响应数据中获取上传成功的文件id
     * @return fileIdList
     */
    public List<String> getFileIdList() {
        return fileIdList;
    }

    public void setFileIdList(List<String> fileIdList) {
        this.fileIdList = fileIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTaskRequestBodyIacScanInfo that = (CreateTaskRequestBodyIacScanInfo) obj;
        return Objects.equals(this.fileType, that.fileType) && Objects.equals(this.fileIdList, that.fileIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, fileIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskRequestBodyIacScanInfo {\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileIdList: ").append(toIndentedString(fileIdList)).append("\n");
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
