package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 和列信息相关的对象
 */
public class ObjectWithColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notices")

    private List<String> notices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private String extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_expand")

    private Boolean isSupportExpand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_column_info")

    private Boolean hasColumnInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_preset")

    private Boolean isPreset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_count")

    private String tokenCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sent")

    private Boolean isSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sent_alias_name")

    private String sentAliasName;

    public ObjectWithColumnInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 本节点id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectWithColumnInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父节点id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ObjectWithColumnInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 节点类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ObjectWithColumnInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectWithColumnInfo withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * 节点别名
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public ObjectWithColumnInfo withNotices(List<String> notices) {
        this.notices = notices;
        return this;
    }

    public ObjectWithColumnInfo addNoticesItem(String noticesItem) {
        if (this.notices == null) {
            this.notices = new ArrayList<>();
        }
        this.notices.add(noticesItem);
        return this;
    }

    public ObjectWithColumnInfo withNotices(Consumer<List<String>> noticesSetter) {
        if (this.notices == null) {
            this.notices = new ArrayList<>();
        }
        noticesSetter.accept(this.notices);
        return this;
    }

    /**
     * 提示信息，例如提示库下表过多
     * @return notices
     */
    public List<String> getNotices() {
        return notices;
    }

    public void setNotices(List<String> notices) {
        this.notices = notices;
    }

    public ObjectWithColumnInfo withExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    /**
     * 扩展信息，例如提示有无数据,结构是否在目标库中存在
     * @return extendInfo
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public ObjectWithColumnInfo withIsSupportExpand(Boolean isSupportExpand) {
        this.isSupportExpand = isSupportExpand;
        return this;
    }

    /**
     * 是否支持展开查询
     * @return isSupportExpand
     */
    public Boolean getIsSupportExpand() {
        return isSupportExpand;
    }

    public void setIsSupportExpand(Boolean isSupportExpand) {
        this.isSupportExpand = isSupportExpand;
    }

    public ObjectWithColumnInfo withHasColumnInfo(Boolean hasColumnInfo) {
        this.hasColumnInfo = hasColumnInfo;
        return this;
    }

    /**
     * 是否有列信息
     * @return hasColumnInfo
     */
    public Boolean getHasColumnInfo() {
        return hasColumnInfo;
    }

    public void setHasColumnInfo(Boolean hasColumnInfo) {
        this.hasColumnInfo = hasColumnInfo;
    }

    public ObjectWithColumnInfo withIsPreset(Boolean isPreset) {
        this.isPreset = isPreset;
        return this;
    }

    /**
     * 是否预置
     * @return isPreset
     */
    public Boolean getIsPreset() {
        return isPreset;
    }

    public void setIsPreset(Boolean isPreset) {
        this.isPreset = isPreset;
    }

    public ObjectWithColumnInfo withTokenCount(String tokenCount) {
        this.tokenCount = tokenCount;
        return this;
    }

    /**
     * token个数
     * @return tokenCount
     */
    public String getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(String tokenCount) {
        this.tokenCount = tokenCount;
    }

    public ObjectWithColumnInfo withIsSent(Boolean isSent) {
        this.isSent = isSent;
        return this;
    }

    /**
     * 是否已经下发给node
     * @return isSent
     */
    public Boolean getIsSent() {
        return isSent;
    }

    public void setIsSent(Boolean isSent) {
        this.isSent = isSent;
    }

    public ObjectWithColumnInfo withSentAliasName(String sentAliasName) {
        this.sentAliasName = sentAliasName;
        return this;
    }

    /**
     * 下发给node的别名
     * @return sentAliasName
     */
    public String getSentAliasName() {
        return sentAliasName;
    }

    public void setSentAliasName(String sentAliasName) {
        this.sentAliasName = sentAliasName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectWithColumnInfo that = (ObjectWithColumnInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.aliasName, that.aliasName) && Objects.equals(this.notices, that.notices)
            && Objects.equals(this.extendInfo, that.extendInfo)
            && Objects.equals(this.isSupportExpand, that.isSupportExpand)
            && Objects.equals(this.hasColumnInfo, that.hasColumnInfo) && Objects.equals(this.isPreset, that.isPreset)
            && Objects.equals(this.tokenCount, that.tokenCount) && Objects.equals(this.isSent, that.isSent)
            && Objects.equals(this.sentAliasName, that.sentAliasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            parentId,
            type,
            name,
            aliasName,
            notices,
            extendInfo,
            isSupportExpand,
            hasColumnInfo,
            isPreset,
            tokenCount,
            isSent,
            sentAliasName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectWithColumnInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    notices: ").append(toIndentedString(notices)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    isSupportExpand: ").append(toIndentedString(isSupportExpand)).append("\n");
        sb.append("    hasColumnInfo: ").append(toIndentedString(hasColumnInfo)).append("\n");
        sb.append("    isPreset: ").append(toIndentedString(isPreset)).append("\n");
        sb.append("    tokenCount: ").append(toIndentedString(tokenCount)).append("\n");
        sb.append("    isSent: ").append(toIndentedString(isSent)).append("\n");
        sb.append("    sentAliasName: ").append(toIndentedString(sentAliasName)).append("\n");
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
