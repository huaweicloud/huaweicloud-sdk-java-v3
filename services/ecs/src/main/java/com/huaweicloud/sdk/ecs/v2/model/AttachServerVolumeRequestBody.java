package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class AttachServerVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeAttachment")

    private AttachServerVolumeOption volumeAttachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public AttachServerVolumeRequestBody withVolumeAttachment(AttachServerVolumeOption volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public AttachServerVolumeRequestBody withVolumeAttachment(
        Consumer<AttachServerVolumeOption> volumeAttachmentSetter) {
        if (this.volumeAttachment == null) {
            this.volumeAttachment = new AttachServerVolumeOption();
            volumeAttachmentSetter.accept(this.volumeAttachment);
        }

        return this;
    }

    /**
     * Get volumeAttachment
     * @return volumeAttachment
     */
    public AttachServerVolumeOption getVolumeAttachment() {
        return volumeAttachment;
    }

    public void setVolumeAttachment(AttachServerVolumeOption volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
    }

    public AttachServerVolumeRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 是否只预检此次请求。  true：发送检查请求，不会挂载磁盘。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应结果。 false：发送正常请求，通过检查后并且进行挂载磁盘请求。 默认值：false
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachServerVolumeRequestBody attachServerVolumeRequestBody = (AttachServerVolumeRequestBody) o;
        return Objects.equals(this.volumeAttachment, attachServerVolumeRequestBody.volumeAttachment)
            && Objects.equals(this.dryRun, attachServerVolumeRequestBody.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachment, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachServerVolumeRequestBody {\n");
        sb.append("    volumeAttachment: ").append(toIndentedString(volumeAttachment)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
