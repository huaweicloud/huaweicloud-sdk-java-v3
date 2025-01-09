package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAppRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_obs_file")

    private String reserveObsFile;

    public DeleteAppRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DeleteAppRequest withReserveObsFile(String reserveObsFile) {
        this.reserveObsFile = reserveObsFile;
        return this;
    }

    /**
     * 删除应用时是否保留OBS桶文件(默认false) * 'true' - 保留OBS桶文件,仅删除应用 * 'false' - 不保留OBS桶文件,删除应用同时删除OBS桶文件
     * @return reserveObsFile
     */
    public String getReserveObsFile() {
        return reserveObsFile;
    }

    public void setReserveObsFile(String reserveObsFile) {
        this.reserveObsFile = reserveObsFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAppRequest that = (DeleteAppRequest) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.reserveObsFile, that.reserveObsFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, reserveObsFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAppRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    reserveObsFile: ").append(toIndentedString(reserveObsFile)).append("\n");
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
