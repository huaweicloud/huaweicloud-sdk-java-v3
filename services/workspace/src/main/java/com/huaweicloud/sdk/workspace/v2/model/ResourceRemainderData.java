package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额剩余数量信息。
 */
public class ResourceRemainderData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remainder")

    private Long remainder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need")

    private Long need;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    public ResourceRemainderData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceRemainderData withRemainder(Long remainder) {
        this.remainder = remainder;
        return this;
    }

    /**
     * 剩余数量。
     * @return remainder
     */
    public Long getRemainder() {
        return remainder;
    }

    public void setRemainder(Long remainder) {
        this.remainder = remainder;
    }

    public ResourceRemainderData withNeed(Long need) {
        this.need = need;
        return this;
    }

    /**
     * 所需资源。
     * @return need
     */
    public Long getNeed() {
        return need;
    }

    public void setNeed(Long need) {
        this.need = need;
    }

    public ResourceRemainderData withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。type为volume_gigabytes时，会返回该字段。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceRemainderData that = (ResourceRemainderData) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.remainder, that.remainder)
            && Objects.equals(this.need, that.need) && Objects.equals(this.volumeType, that.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, remainder, need, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceRemainderData {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    remainder: ").append(toIndentedString(remainder)).append("\n");
        sb.append("    need: ").append(toIndentedString(need)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
