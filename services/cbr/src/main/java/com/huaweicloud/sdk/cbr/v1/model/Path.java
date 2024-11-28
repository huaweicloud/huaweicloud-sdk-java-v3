package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class Path {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_path")

    private String dirPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_paths")

    private String excludePaths;

    public Path withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 路径ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Path withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 路径状态，有available和remove两种状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Path withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 该路径所属于的客户端ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Path withDirPath(String dirPath) {
        this.dirPath = dirPath;
        return this;
    }

    /**
     * 路径详情
     * @return dirPath
     */
    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public Path withExcludePaths(String excludePaths) {
        this.excludePaths = excludePaths;
        return this;
    }

    /**
     * 排除目录列表，多个路径之间以英文逗号分隔 > 该特性目前处于公测阶段，部分region可能无法使用。 
     * @return excludePaths
     */
    public String getExcludePaths() {
        return excludePaths;
    }

    public void setExcludePaths(String excludePaths) {
        this.excludePaths = excludePaths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Path that = (Path) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.dirPath, that.dirPath)
            && Objects.equals(this.excludePaths, that.excludePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, agentId, dirPath, excludePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Path {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    dirPath: ").append(toIndentedString(dirPath)).append("\n");
        sb.append("    excludePaths: ").append(toIndentedString(excludePaths)).append("\n");
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
