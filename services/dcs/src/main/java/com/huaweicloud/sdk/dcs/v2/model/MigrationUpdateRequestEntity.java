package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 迁移更新请求体
 */
public class MigrationUpdateRequestEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_mode")

    private String resumeMode;

    public MigrationUpdateRequestEntity withResumeMode(String resumeMode) {
        this.resumeMode = resumeMode;
        return this;
    }

    /**
     * 模式
     * @return resumeMode
     */
    public String getResumeMode() {
        return resumeMode;
    }

    public void setResumeMode(String resumeMode) {
        this.resumeMode = resumeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationUpdateRequestEntity that = (MigrationUpdateRequestEntity) obj;
        return Objects.equals(this.resumeMode, that.resumeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resumeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationUpdateRequestEntity {\n");
        sb.append("    resumeMode: ").append(toIndentedString(resumeMode)).append("\n");
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
