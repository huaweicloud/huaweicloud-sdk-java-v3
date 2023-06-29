package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量处理对象详情
 */
public class Target {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_info")

    private List<Extension> extensionInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    public Target withExtensionInfo(List<Extension> extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }

    public Target addExtensionInfoItem(Extension extensionInfoItem) {
        if (this.extensionInfo == null) {
            this.extensionInfo = new ArrayList<>();
        }
        this.extensionInfo.add(extensionInfoItem);
        return this;
    }

    public Target withExtensionInfo(Consumer<List<Extension>> extensionInfoSetter) {
        if (this.extensionInfo == null) {
            this.extensionInfo = new ArrayList<>();
        }
        extensionInfoSetter.accept(this.extensionInfo);
        return this;
    }

    /**
     * 批量处理对象基本信息
     * @return extensionInfo
     */
    public List<Extension> getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(List<Extension> extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    public Target withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 批量处理对象ID
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Target that = (Target) obj;
        return Objects.equals(this.extensionInfo, that.extensionInfo) && Objects.equals(this.targetId, that.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensionInfo, targetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Target {\n");
        sb.append("    extensionInfo: ").append(toIndentedString(extensionInfo)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
