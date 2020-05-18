package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 请求参数
 */
public class GlanceDeleteImageRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_backup")
    
    private Boolean deleteBackup;

    public GlanceDeleteImageRequestBody withDeleteBackup(Boolean deleteBackup) {
        this.deleteBackup = deleteBackup;
        return this;
    }

    


    /**
     * 取值为：true和false true：表示删除整机镜像时，同时删除其关联的云服务器备份。 false：表示只删除整机镜像，不删除其关联的云服务器备份。
     * @return deleteBackup
     */
    public Boolean getDeleteBackup() {
        return deleteBackup;
    }

    public void setDeleteBackup(Boolean deleteBackup) {
        this.deleteBackup = deleteBackup;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceDeleteImageRequestBody glanceDeleteImageRequestBody = (GlanceDeleteImageRequestBody) o;
        return Objects.equals(this.deleteBackup, glanceDeleteImageRequestBody.deleteBackup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deleteBackup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceDeleteImageRequestBody {\n");
            sb.append("    deleteBackup: ").append(toIndentedString(deleteBackup)).append("\n");
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

