package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TemplateBlockDeviceMappingAttachmentOption
 */
public class TemplateBlockDeviceMappingAttachmentOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_index")

    private Integer bootIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    public TemplateBlockDeviceMappingAttachmentOption withBootIndex(Integer bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    /**
     * 盘在虚拟机上的挂载顺序，0表示启动盘
     * @return bootIndex
     */
    public Integer getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(Integer bootIndex) {
        this.bootIndex = bootIndex;
    }

    public TemplateBlockDeviceMappingAttachmentOption withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * 卷是否随实例一同释放 默认系统盘设置为true随实例释放，数据盘设置为false不随实例释放
     * @return deleteOnTermination
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateBlockDeviceMappingAttachmentOption that = (TemplateBlockDeviceMappingAttachmentOption) obj;
        return Objects.equals(this.bootIndex, that.bootIndex)
            && Objects.equals(this.deleteOnTermination, that.deleteOnTermination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bootIndex, deleteOnTermination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateBlockDeviceMappingAttachmentOption {\n");
        sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
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
