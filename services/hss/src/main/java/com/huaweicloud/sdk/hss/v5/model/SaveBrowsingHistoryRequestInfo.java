package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户访问记录请求体消息
 */
public class SaveBrowsingHistoryRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public SaveBrowsingHistoryRequestInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 用户页面访问动作in:进入页面，out:离开页面
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public SaveBrowsingHistoryRequestInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SaveBrowsingHistoryRequestInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 访问记录id,仅当type为out时携带
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveBrowsingHistoryRequestInfo that = (SaveBrowsingHistoryRequestInfo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.path, that.path)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, path, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveBrowsingHistoryRequestInfo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
