package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowImageFilesStatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_files_num")

    private Integer totalFilesNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_files_size")

    private Integer totalFilesSize;

    public ShowImageFilesStatResponse withTotalFilesNum(Integer totalFilesNum) {
        this.totalFilesNum = totalFilesNum;
        return this;
    }

    /**
     * 镜像文件总数
     * minimum: 0
     * maximum: 2147483547
     * @return totalFilesNum
     */
    public Integer getTotalFilesNum() {
        return totalFilesNum;
    }

    public void setTotalFilesNum(Integer totalFilesNum) {
        this.totalFilesNum = totalFilesNum;
    }

    public ShowImageFilesStatResponse withTotalFilesSize(Integer totalFilesSize) {
        this.totalFilesSize = totalFilesSize;
        return this;
    }

    /**
     * 镜像文件大小
     * @return totalFilesSize
     */
    public Integer getTotalFilesSize() {
        return totalFilesSize;
    }

    public void setTotalFilesSize(Integer totalFilesSize) {
        this.totalFilesSize = totalFilesSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageFilesStatResponse that = (ShowImageFilesStatResponse) obj;
        return Objects.equals(this.totalFilesNum, that.totalFilesNum)
            && Objects.equals(this.totalFilesSize, that.totalFilesSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalFilesNum, totalFilesSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageFilesStatResponse {\n");
        sb.append("    totalFilesNum: ").append(toIndentedString(totalFilesNum)).append("\n");
        sb.append("    totalFilesSize: ").append(toIndentedString(totalFilesSize)).append("\n");
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
