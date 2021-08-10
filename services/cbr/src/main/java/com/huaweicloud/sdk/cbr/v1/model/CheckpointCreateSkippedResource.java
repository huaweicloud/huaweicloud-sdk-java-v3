package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 备份时跳过的资源 */
public class CheckpointCreateSkippedResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public CheckpointCreateSkippedResource withId(String id) {
        this.id = id;
        return this;
    }

    /** 资源ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckpointCreateSkippedResource withType(String type) {
        this.type = type;
        return this;
    }

    /** 资源类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CheckpointCreateSkippedResource withName(String name) {
        this.name = name;
        return this;
    }

    /** 资源名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckpointCreateSkippedResource withCode(String code) {
        this.code = code;
        return this;
    }

    /** 请参见[错误码](ErrorCode.xml)。
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CheckpointCreateSkippedResource withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** 跳过原因，例如：该资源正在备份中。
     * 
     * @return reason */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointCreateSkippedResource checkpointCreateSkippedResource = (CheckpointCreateSkippedResource) o;
        return Objects.equals(this.id, checkpointCreateSkippedResource.id)
            && Objects.equals(this.type, checkpointCreateSkippedResource.type)
            && Objects.equals(this.name, checkpointCreateSkippedResource.name)
            && Objects.equals(this.code, checkpointCreateSkippedResource.code)
            && Objects.equals(this.reason, checkpointCreateSkippedResource.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, code, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointCreateSkippedResource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
