package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 历史记录字段变更列表
 */
public class ResourceChangeExternalVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_type")

    private String customFieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_change_info")

    private ElementResourceChangeExternalVo oldChangeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_change_info")

    private ElementResourceChangeExternalVo newChangeInfo;

    public ResourceChangeExternalVo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 变更字段
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public ResourceChangeExternalVo withCustomFieldType(String customFieldType) {
        this.customFieldType = customFieldType;
        return this;
    }

    /**
     * 测试用例自定义字段类型
     * @return customFieldType
     */
    public String getCustomFieldType() {
        return customFieldType;
    }

    public void setCustomFieldType(String customFieldType) {
        this.customFieldType = customFieldType;
    }

    public ResourceChangeExternalVo withOldChangeInfo(ElementResourceChangeExternalVo oldChangeInfo) {
        this.oldChangeInfo = oldChangeInfo;
        return this;
    }

    public ResourceChangeExternalVo withOldChangeInfo(Consumer<ElementResourceChangeExternalVo> oldChangeInfoSetter) {
        if (this.oldChangeInfo == null) {
            this.oldChangeInfo = new ElementResourceChangeExternalVo();
            oldChangeInfoSetter.accept(this.oldChangeInfo);
        }

        return this;
    }

    /**
     * Get oldChangeInfo
     * @return oldChangeInfo
     */
    public ElementResourceChangeExternalVo getOldChangeInfo() {
        return oldChangeInfo;
    }

    public void setOldChangeInfo(ElementResourceChangeExternalVo oldChangeInfo) {
        this.oldChangeInfo = oldChangeInfo;
    }

    public ResourceChangeExternalVo withNewChangeInfo(ElementResourceChangeExternalVo newChangeInfo) {
        this.newChangeInfo = newChangeInfo;
        return this;
    }

    public ResourceChangeExternalVo withNewChangeInfo(Consumer<ElementResourceChangeExternalVo> newChangeInfoSetter) {
        if (this.newChangeInfo == null) {
            this.newChangeInfo = new ElementResourceChangeExternalVo();
            newChangeInfoSetter.accept(this.newChangeInfo);
        }

        return this;
    }

    /**
     * Get newChangeInfo
     * @return newChangeInfo
     */
    public ElementResourceChangeExternalVo getNewChangeInfo() {
        return newChangeInfo;
    }

    public void setNewChangeInfo(ElementResourceChangeExternalVo newChangeInfo) {
        this.newChangeInfo = newChangeInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceChangeExternalVo that = (ResourceChangeExternalVo) obj;
        return Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.customFieldType, that.customFieldType)
            && Objects.equals(this.oldChangeInfo, that.oldChangeInfo)
            && Objects.equals(this.newChangeInfo, that.newChangeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, customFieldType, oldChangeInfo, newChangeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceChangeExternalVo {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    customFieldType: ").append(toIndentedString(customFieldType)).append("\n");
        sb.append("    oldChangeInfo: ").append(toIndentedString(oldChangeInfo)).append("\n");
        sb.append("    newChangeInfo: ").append(toIndentedString(newChangeInfo)).append("\n");
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
