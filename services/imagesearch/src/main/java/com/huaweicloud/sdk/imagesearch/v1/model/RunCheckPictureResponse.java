package com.huaweicloud.sdk.imagesearch.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RunCheckPictureResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist")

    private String exist;

    public RunCheckPictureResponse withExist(String exist) {
        this.exist = exist;
        return this;
    }

    /**
     * 调用成功时表示调用结果。  调用失败时无此字段。  - true表示图像索引库中存在查询的图片。  - false表示图像索引库中不存在查询的图片。 
     * @return exist
     */
    public String getExist() {
        return exist;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunCheckPictureResponse that = (RunCheckPictureResponse) obj;
        return Objects.equals(this.exist, that.exist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCheckPictureResponse {\n");
        sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
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
