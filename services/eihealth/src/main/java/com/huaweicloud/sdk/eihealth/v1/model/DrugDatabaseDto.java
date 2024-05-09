package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DrugDatabaseDto
 */
public class DrugDatabaseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_id")

    private String cssId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_name")

    private String cssName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<DetailDatabaseFile> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<String> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_num")

    private Integer dataNum;

    public DrugDatabaseDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DrugDatabaseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrugDatabaseDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DrugDatabaseDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据库状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DrugDatabaseDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DrugDatabaseDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据库创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DrugDatabaseDto withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 数据库更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public DrugDatabaseDto withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建数据库的用户名称
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public DrugDatabaseDto withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 失败提示，当作业执行失败时会返回
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public DrugDatabaseDto withCssId(String cssId) {
        this.cssId = cssId;
        return this;
    }

    /**
     * css集群id
     * @return cssId
     */
    public String getCssId() {
        return cssId;
    }

    public void setCssId(String cssId) {
        this.cssId = cssId;
    }

    public DrugDatabaseDto withCssName(String cssName) {
        this.cssName = cssName;
        return this;
    }

    /**
     * css集群名称
     * @return cssName
     */
    public String getCssName() {
        return cssName;
    }

    public void setCssName(String cssName) {
        this.cssName = cssName;
    }

    public DrugDatabaseDto withFiles(List<DetailDatabaseFile> files) {
        this.files = files;
        return this;
    }

    public DrugDatabaseDto addFilesItem(DetailDatabaseFile filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public DrugDatabaseDto withFiles(Consumer<List<DetailDatabaseFile>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 数据库文件列表
     * @return files
     */
    public List<DetailDatabaseFile> getFiles() {
        return files;
    }

    public void setFiles(List<DetailDatabaseFile> files) {
        this.files = files;
    }

    public DrugDatabaseDto withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public DrugDatabaseDto addColumnsItem(String columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public DrugDatabaseDto withColumns(Consumer<List<String>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 数据库列名
     * @return columns
     */
    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public DrugDatabaseDto withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * 是否打开组织共享
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public DrugDatabaseDto withDataNum(Integer dataNum) {
        this.dataNum = dataNum;
        return this;
    }

    /**
     * 分子数量
     * @return dataNum
     */
    public Integer getDataNum() {
        return dataNum;
    }

    public void setDataNum(Integer dataNum) {
        this.dataNum = dataNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrugDatabaseDto that = (DrugDatabaseDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.failedMessage, that.failedMessage) && Objects.equals(this.cssId, that.cssId)
            && Objects.equals(this.cssName, that.cssName) && Objects.equals(this.files, that.files)
            && Objects.equals(this.columns, that.columns) && Objects.equals(this.shareable, that.shareable)
            && Objects.equals(this.dataNum, that.dataNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            status,
            description,
            createTime,
            updateTime,
            creator,
            failedMessage,
            cssId,
            cssName,
            files,
            columns,
            shareable,
            dataNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DrugDatabaseDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    cssId: ").append(toIndentedString(cssId)).append("\n");
        sb.append("    cssName: ").append(toIndentedString(cssName)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
        sb.append("    dataNum: ").append(toIndentedString(dataNum)).append("\n");
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
