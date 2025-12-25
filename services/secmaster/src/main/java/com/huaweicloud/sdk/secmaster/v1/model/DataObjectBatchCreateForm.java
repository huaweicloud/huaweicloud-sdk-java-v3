package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据对象批量创建对象
 */
public class DataObjectBatchCreateForm {

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
    @JsonProperty(value = "data_object_list")

    private List<Object> dataObjectList = null;

    public DataObjectBatchCreateForm withId(String id) {
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

    public DataObjectBatchCreateForm withFormatVersion(Integer formatVersion) {
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

    public DataObjectBatchCreateForm withName(String name) {
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

    public DataObjectBatchCreateForm withType(String type) {
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

    public DataObjectBatchCreateForm withTriggerFlag(Boolean triggerFlag) {
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

    public DataObjectBatchCreateForm withDataObjectList(List<Object> dataObjectList) {
        this.dataObjectList = dataObjectList;
        return this;
    }

    public DataObjectBatchCreateForm addDataObjectListItem(Object dataObjectListItem) {
        if (this.dataObjectList == null) {
            this.dataObjectList = new ArrayList<>();
        }
        this.dataObjectList.add(dataObjectListItem);
        return this;
    }

    public DataObjectBatchCreateForm withDataObjectList(Consumer<List<Object>> dataObjectListSetter) {
        if (this.dataObjectList == null) {
            this.dataObjectList = new ArrayList<>();
        }
        dataObjectListSetter.accept(this.dataObjectList);
        return this;
    }

    /**
     * 数据对象列表
     * @return dataObjectList
     */
    public List<Object> getDataObjectList() {
        return dataObjectList;
    }

    public void setDataObjectList(List<Object> dataObjectList) {
        this.dataObjectList = dataObjectList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataObjectBatchCreateForm that = (DataObjectBatchCreateForm) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.formatVersion, that.formatVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.triggerFlag, that.triggerFlag)
            && Objects.equals(this.dataObjectList, that.dataObjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formatVersion, name, type, triggerFlag, dataObjectList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataObjectBatchCreateForm {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    triggerFlag: ").append(toIndentedString(triggerFlag)).append("\n");
        sb.append("    dataObjectList: ").append(toIndentedString(dataObjectList)).append("\n");
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
