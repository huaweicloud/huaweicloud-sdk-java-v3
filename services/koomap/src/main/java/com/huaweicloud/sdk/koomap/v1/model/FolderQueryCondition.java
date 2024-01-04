package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FolderQueryCondition
 */
public class FolderQueryCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_alias")

    private String folderAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_desc")

    private String folderDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    public FolderQueryCondition withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 倾斜影像名称。支持中文、英文、数字以及“_”、“-”、“.”字符，长度限制为[1, 100]。
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public FolderQueryCondition withFolderAlias(String folderAlias) {
        this.folderAlias = folderAlias;
        return this;
    }

    /**
     * 倾斜影像别名。支持中文、英文、数字以及“_”、“-”、“.”字符，长度限制为[1, 100]。
     * @return folderAlias
     */
    public String getFolderAlias() {
        return folderAlias;
    }

    public void setFolderAlias(String folderAlias) {
        this.folderAlias = folderAlias;
    }

    public FolderQueryCondition withFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc;
        return this;
    }

    /**
     * 倾斜影像描述。支持中文、英文、数字以及“_”、“-”、“.”字符，长度限制为[0, 255]。
     * @return folderDesc
     */
    public String getFolderDesc() {
        return folderDesc;
    }

    public void setFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc;
    }

    public FolderQueryCondition withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 倾斜影像上传起始时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public FolderQueryCondition withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 倾斜影像上传结束时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public FolderQueryCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 倾斜影像状态。当前仅支持处理中（0）、已完成（1）、导入失败（2）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FolderQueryCondition withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 倾斜影像排序规则。 当前仅支持影像名称正序（1）、影像名称倒序（-1）、影像别名正序（2）、影像别名倒序（-2）、影像上传日期正序（3）、影像上传日期倒序（-3）。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderQueryCondition that = (FolderQueryCondition) obj;
        return Objects.equals(this.folderName, that.folderName) && Objects.equals(this.folderAlias, that.folderAlias)
            && Objects.equals(this.folderDesc, that.folderDesc) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.status, that.status)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderName, folderAlias, folderDesc, from, to, status, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderQueryCondition {\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    folderAlias: ").append(toIndentedString(folderAlias)).append("\n");
        sb.append("    folderDesc: ").append(toIndentedString(folderDesc)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
