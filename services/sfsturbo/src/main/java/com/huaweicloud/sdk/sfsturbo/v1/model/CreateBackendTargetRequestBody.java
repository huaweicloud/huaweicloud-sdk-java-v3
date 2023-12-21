package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建文件系统后端存储库请求体
 */
public class CreateBackendTargetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system_path")

    private String fileSystemPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private ObsDataRepository obs;

    public CreateBackendTargetRequestBody withFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
        return this;
    }

    /**
     * 联动目录名称，SFS Turbo会在文件系统根目录下以该名称创建一个子目录，该目录用于绑定后端存储。子目录名称不能重复，长度不能超过255个字符，子目录名称不能是“.”或“..”。不支持多层目录，不能包含字符'/'。
     * @return fileSystemPath
     */
    public String getFileSystemPath() {
        return fileSystemPath;
    }

    public void setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
    }

    public CreateBackendTargetRequestBody withObs(ObsDataRepository obs) {
        this.obs = obs;
        return this;
    }

    public CreateBackendTargetRequestBody withObs(Consumer<ObsDataRepository> obsSetter) {
        if (this.obs == null) {
            this.obs = new ObsDataRepository();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public ObsDataRepository getObs() {
        return obs;
    }

    public void setObs(ObsDataRepository obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBackendTargetRequestBody that = (CreateBackendTargetRequestBody) obj;
        return Objects.equals(this.fileSystemPath, that.fileSystemPath) && Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSystemPath, obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBackendTargetRequestBody {\n");
        sb.append("    fileSystemPath: ").append(toIndentedString(fileSystemPath)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
