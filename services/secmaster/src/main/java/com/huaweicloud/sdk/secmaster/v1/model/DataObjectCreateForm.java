package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据对象创建体
 */
public class DataObjectCreateForm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_version")

    private Integer formatVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_flag")

    private Boolean triggerFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private Object dataObject;

    public DataObjectCreateForm withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataObjectCreateForm withFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    /**
     * 对齐的模板版本号，默认传1
     * minimum: 1
     * maximum: 10
     * @return formatVersion
     */
    public Integer getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
    }

    public DataObjectCreateForm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataObjectCreateForm withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 描述
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataObjectCreateForm withTriggerFlag(Boolean triggerFlag) {
        this.triggerFlag = triggerFlag;
        return this;
    }

    /**
     * 触发标志
     * @return triggerFlag
     */
    public Boolean getTriggerFlag() {
        return triggerFlag;
    }

    public void setTriggerFlag(Boolean triggerFlag) {
        this.triggerFlag = triggerFlag;
    }

    public DataObjectCreateForm withDataObject(Object dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    /**
     * 单个数据对象json体，键值根据对应数据类所需的字段添加
     * @return dataObject
     */
    public Object getDataObject() {
        return dataObject;
    }

    public void setDataObject(Object dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataObjectCreateForm that = (DataObjectCreateForm) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.formatVersion, that.formatVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.triggerFlag, that.triggerFlag) && Objects.equals(this.dataObject, that.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formatVersion, name, type, triggerFlag, dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataObjectCreateForm {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    triggerFlag: ").append(toIndentedString(triggerFlag)).append("\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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
