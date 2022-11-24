package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseDiskDto
 */
public class DatabaseDiskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Integer space;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt")

    private Boolean encrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Double used;

    public DatabaseDiskDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 磁盘类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DatabaseDiskDto withSpace(Integer space) {
        this.space = space;
        return this;
    }

    /**
     * 磁盘大小，单位GB
     * @return space
     */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public DatabaseDiskDto withEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }

    /**
     * 是否加密
     * @return encrypt
     */
    public Boolean getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
    }

    public DatabaseDiskDto withUsed(Double used) {
        this.used = used;
        return this;
    }

    /**
     * 磁盘已使用量，单位GB
     * @return used
     */
    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseDiskDto databaseDiskDto = (DatabaseDiskDto) o;
        return Objects.equals(this.type, databaseDiskDto.type) && Objects.equals(this.space, databaseDiskDto.space)
            && Objects.equals(this.encrypt, databaseDiskDto.encrypt) && Objects.equals(this.used, databaseDiskDto.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, space, encrypt, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseDiskDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
