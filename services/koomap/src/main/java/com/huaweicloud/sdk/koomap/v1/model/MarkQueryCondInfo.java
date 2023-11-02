package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询像控点信息条件参数。
 */
public class MarkQueryCondInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_list")

    private List<String> nameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    public MarkQueryCondInfo withNameList(List<String> nameList) {
        this.nameList = nameList;
        return this;
    }

    public MarkQueryCondInfo addNameListItem(String nameListItem) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        this.nameList.add(nameListItem);
        return this;
    }

    public MarkQueryCondInfo withNameList(Consumer<List<String>> nameListSetter) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        nameListSetter.accept(this.nameList);
        return this;
    }

    /**
     * 名称列表。长度限制为[0, 100]。
     * @return nameList
     */
    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public MarkQueryCondInfo withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 生产资料别名。支持中文、英文、数字以及“_”、“-”字符，长度限制为[1, 100]。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public MarkQueryCondInfo withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 生产资料描述。支持中文、英文、数字以及“_”、“-”字符，长度限制为[1, 100]。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MarkQueryCondInfo withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 生产资料上传起始时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public MarkQueryCondInfo withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 生产资料上传结束时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public MarkQueryCondInfo withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 生产资料排序规则。当前仅支持生产资料名称正序（1）、生产资料名称倒序（-1）、生产资料别名正序（2）、生产资料别名倒序（-2）、生产资料上传日期正序（3）、生产资料上传日期倒序（-3）。
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
        MarkQueryCondInfo that = (MarkQueryCondInfo) obj;
        return Objects.equals(this.nameList, that.nameList) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameList, alias, desc, from, to, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkQueryCondInfo {\n");
        sb.append("    nameList: ").append(toIndentedString(nameList)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
