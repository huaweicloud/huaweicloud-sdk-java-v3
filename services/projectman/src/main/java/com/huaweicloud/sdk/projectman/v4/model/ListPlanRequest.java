package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPlanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time_interval")

    private String updatedTimeInterval;

    public ListPlanRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListPlanRequest withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * **参数解释：** 发布/迭代名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListPlanRequest withUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
        return this;
    }

    /**
     * **参数解释：** 更新发布/迭代时间，unix时间戳，单位：毫秒  样例：1576114296000,1576114396000 **约束限制：**  起止时间均为13位的时间戳字符串，使用英文逗号分割。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return updatedTimeInterval
     */
    public String getUpdatedTimeInterval() {
        return updatedTimeInterval;
    }

    public void setUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPlanRequest that = (ListPlanRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.keyWord, that.keyWord)
            && Objects.equals(this.updatedTimeInterval, that.updatedTimeInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, keyWord, updatedTimeInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlanRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    updatedTimeInterval: ").append(toIndentedString(updatedTimeInterval)).append("\n");
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
