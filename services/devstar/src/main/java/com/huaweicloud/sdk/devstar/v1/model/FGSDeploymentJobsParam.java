package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FGSDeploymentJobsParam
 */
public class FGSDeploymentJobsParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler")

    private String handler;

    public FGSDeploymentJobsParam withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 版本包id,使用历史版本包部署时需要
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public FGSDeploymentJobsParam withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * 函数入口
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FGSDeploymentJobsParam fgSDeploymentJobsParam = (FGSDeploymentJobsParam) o;
        return Objects.equals(this.fileId, fgSDeploymentJobsParam.fileId)
            && Objects.equals(this.handler, fgSDeploymentJobsParam.handler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, handler);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FGSDeploymentJobsParam {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
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
