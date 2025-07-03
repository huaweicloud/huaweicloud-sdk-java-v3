package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 每项检查项检测到的问题
 */
public class DetectedProblem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object")

    private String dbObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public DetectedProblem withDbObject(String dbObject) {
        this.dbObject = dbObject;
        return this;
    }

    /**
     * 存在问题的数据库对象
     * @return dbObject
     */
    public String getDbObject() {
        return dbObject;
    }

    public void setDbObject(String dbObject) {
        this.dbObject = dbObject;
    }

    public DetectedProblem withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 告警级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public DetectedProblem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 检查项描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedProblem that = (DetectedProblem) obj;
        return Objects.equals(this.dbObject, that.dbObject) && Objects.equals(this.level, that.level)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbObject, level, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectedProblem {\n");
        sb.append("    dbObject: ").append(toIndentedString(dbObject)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
