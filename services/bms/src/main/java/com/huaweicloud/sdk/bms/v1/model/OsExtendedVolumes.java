package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/** os-extended-volumes:volumes_attached字段数据结构说明 */
public class OsExtendedVolumes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    public OsExtendedVolumes withId(UUID id) {
        this.id = id;
        return this;
    }

    /** 云硬盘ID
     * 
     * @return id */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OsExtendedVolumes withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /** 删裸金属服务器时是否一并删除该卷。true：是false：否
     * 
     * @return deleteOnTermination */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsExtendedVolumes osExtendedVolumes = (OsExtendedVolumes) o;
        return Objects.equals(this.id, osExtendedVolumes.id)
            && Objects.equals(this.deleteOnTermination, osExtendedVolumes.deleteOnTermination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleteOnTermination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsExtendedVolumes {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
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
