package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimpleTagDto
 */
public class SimpleTagDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpgKey")

    private GpgKeyDto gpgKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_read")

    private Boolean canRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_download")

    private Boolean canDownload;

    public SimpleTagDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 标签名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleTagDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 标签描述
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SimpleTagDto withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 目标commit_id
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public SimpleTagDto withGpgKey(GpgKeyDto gpgKey) {
        this.gpgKey = gpgKey;
        return this;
    }

    public SimpleTagDto withGpgKey(Consumer<GpgKeyDto> gpgKeySetter) {
        if (this.gpgKey == null) {
            this.gpgKey = new GpgKeyDto();
            gpgKeySetter.accept(this.gpgKey);
        }

        return this;
    }

    /**
     * Get gpgKey
     * @return gpgKey
     */
    public GpgKeyDto getGpgKey() {
        return gpgKey;
    }

    public void setGpgKey(GpgKeyDto gpgKey) {
        this.gpgKey = gpgKey;
    }

    public SimpleTagDto withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否可以被删除
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public SimpleTagDto withCanRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    /**
     * 是否可以被查看
     * @return canRead
     */
    public Boolean getCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    public SimpleTagDto withCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
        return this;
    }

    /**
     * 是否可以被下载
     * @return canDownload
     */
    public Boolean getCanDownload() {
        return canDownload;
    }

    public void setCanDownload(Boolean canDownload) {
        this.canDownload = canDownload;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleTagDto that = (SimpleTagDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.message, that.message)
            && Objects.equals(this.target, that.target) && Objects.equals(this.gpgKey, that.gpgKey)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canRead, that.canRead)
            && Objects.equals(this.canDownload, that.canDownload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, target, gpgKey, canDelete, canRead, canDownload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleTagDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    gpgKey: ").append(toIndentedString(gpgKey)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
        sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
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
