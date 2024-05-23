package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建实景三维精修后处理任务传输对象。
 */
public class CreateReal3DSubTaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_name")

    private String subtaskName;

    public CreateReal3DSubTaskDto withSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /**
     * 精修后处理任务名称。支持中文、英文、数字以及“_”字符，长度限制1~50个字符。
     * @return subtaskName
     */
    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateReal3DSubTaskDto that = (CreateReal3DSubTaskDto) obj;
        return Objects.equals(this.subtaskName, that.subtaskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtaskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReal3DSubTaskDto {\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
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
