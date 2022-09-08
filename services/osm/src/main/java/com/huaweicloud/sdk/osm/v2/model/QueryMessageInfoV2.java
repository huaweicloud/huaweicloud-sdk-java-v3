package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryMessageInfoV2
 */
public class QueryMessageInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replier_type")

    private Integer replierType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replier")

    private String replier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replier_name")

    private String replierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_first_message")

    private Integer isFirstMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_type")

    private Integer iamUserType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_list")

    private List<SimpleAccessoryV2> accessoryList = null;

    public QueryMessageInfoV2 withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，0客户留言 1华为工程师留言
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public QueryMessageInfoV2 withReplierType(Integer replierType) {
        this.replierType = replierType;
        return this;
    }

    /**
     * 回复人类型，0客户留言 1华为工程师留言 2第三方留言
     * minimum: 0
     * maximum: 3
     * @return replierType
     */
    public Integer getReplierType() {
        return replierType;
    }

    public void setReplierType(Integer replierType) {
        this.replierType = replierType;
    }

    public QueryMessageInfoV2 withReplier(String replier) {
        this.replier = replier;
        return this;
    }

    /**
     * 回复人id
     * @return replier
     */
    public String getReplier() {
        return replier;
    }

    public void setReplier(String replier) {
        this.replier = replier;
    }

    public QueryMessageInfoV2 withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 留言内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public QueryMessageInfoV2 withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public QueryMessageInfoV2 withReplierName(String replierName) {
        this.replierName = replierName;
        return this;
    }

    /**
     * 回复人名称
     * @return replierName
     */
    public String getReplierName() {
        return replierName;
    }

    public void setReplierName(String replierName) {
        this.replierName = replierName;
    }

    public QueryMessageInfoV2 withIsFirstMessage(Integer isFirstMessage) {
        this.isFirstMessage = isFirstMessage;
        return this;
    }

    /**
     * 是否是第一条留言
     * minimum: 0
     * maximum: 1
     * @return isFirstMessage
     */
    public Integer getIsFirstMessage() {
        return isFirstMessage;
    }

    public void setIsFirstMessage(Integer isFirstMessage) {
        this.isFirstMessage = isFirstMessage;
    }

    public QueryMessageInfoV2 withIamUserType(Integer iamUserType) {
        this.iamUserType = iamUserType;
        return this;
    }

    /**
     * 子用户类型
     * minimum: 0
     * maximum: 3
     * @return iamUserType
     */
    public Integer getIamUserType() {
        return iamUserType;
    }

    public void setIamUserType(Integer iamUserType) {
        this.iamUserType = iamUserType;
    }

    public QueryMessageInfoV2 withAccessoryList(List<SimpleAccessoryV2> accessoryList) {
        this.accessoryList = accessoryList;
        return this;
    }

    public QueryMessageInfoV2 addAccessoryListItem(SimpleAccessoryV2 accessoryListItem) {
        if (this.accessoryList == null) {
            this.accessoryList = new ArrayList<>();
        }
        this.accessoryList.add(accessoryListItem);
        return this;
    }

    public QueryMessageInfoV2 withAccessoryList(Consumer<List<SimpleAccessoryV2>> accessoryListSetter) {
        if (this.accessoryList == null) {
            this.accessoryList = new ArrayList<>();
        }
        accessoryListSetter.accept(this.accessoryList);
        return this;
    }

    /**
     * 附件列表
     * @return accessoryList
     */
    public List<SimpleAccessoryV2> getAccessoryList() {
        return accessoryList;
    }

    public void setAccessoryList(List<SimpleAccessoryV2> accessoryList) {
        this.accessoryList = accessoryList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryMessageInfoV2 queryMessageInfoV2 = (QueryMessageInfoV2) o;
        return Objects.equals(this.type, queryMessageInfoV2.type)
            && Objects.equals(this.replierType, queryMessageInfoV2.replierType)
            && Objects.equals(this.replier, queryMessageInfoV2.replier)
            && Objects.equals(this.content, queryMessageInfoV2.content)
            && Objects.equals(this.createTime, queryMessageInfoV2.createTime)
            && Objects.equals(this.replierName, queryMessageInfoV2.replierName)
            && Objects.equals(this.isFirstMessage, queryMessageInfoV2.isFirstMessage)
            && Objects.equals(this.iamUserType, queryMessageInfoV2.iamUserType)
            && Objects.equals(this.accessoryList, queryMessageInfoV2.accessoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            replierType,
            replier,
            content,
            createTime,
            replierName,
            isFirstMessage,
            iamUserType,
            accessoryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryMessageInfoV2 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    replierType: ").append(toIndentedString(replierType)).append("\n");
        sb.append("    replier: ").append(toIndentedString(replier)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    replierName: ").append(toIndentedString(replierName)).append("\n");
        sb.append("    isFirstMessage: ").append(toIndentedString(isFirstMessage)).append("\n");
        sb.append("    iamUserType: ").append(toIndentedString(iamUserType)).append("\n");
        sb.append("    accessoryList: ").append(toIndentedString(accessoryList)).append("\n");
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
