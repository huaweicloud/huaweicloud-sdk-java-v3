package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 评论实体对象
 */
public class CommentEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Boolean top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_time")

    private String topTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_flag")

    private Boolean topFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_info")

    private UserVO creatorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_attribute")

    private String extendAttribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_attribute_obj")

    private CommentExtendAttribute extendAttributeObj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_attribute_objs")

    private List<CommentExtendAttribute> extendAttributeObjs = null;

    public CommentEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 评论ID。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CommentEntity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 评论类型。 **取值范围**： - comment：评论 - reply：回复 - operation：系统操作。 **默认取值**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CommentEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 评论元数据类型。 **取值范围**： 固定为comment。 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CommentEntity withTop(Boolean top) {
        this.top = top;
        return this;
    }

    /**
     * **参数解释**： 是否显示在置顶区域。 **取值范围**： - true：显示。 - false： 不显示。 **默认取值**： 不涉及。
     * @return top
     */
    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public CommentEntity withTopTime(String topTime) {
        this.topTime = topTime;
        return this;
    }

    /**
     * **参数解释**： 置顶时间的unix时间戳，单位：毫秒。当有多条置顶评论时，最后置顶的评论显示在最上层。 **默认取值**： 不涉及。
     * @return topTime
     */
    public String getTopTime() {
        return topTime;
    }

    public void setTopTime(String topTime) {
        this.topTime = topTime;
    }

    public CommentEntity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 评论内容，表现形式为html标签。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommentEntity withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * **参数解释**： 评论关联的工作项ID。 **默认取值**： 不涉及。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public CommentEntity withTopFlag(Boolean topFlag) {
        this.topFlag = topFlag;
        return this;
    }

    /**
     * **参数解释**： 当前评论是否被置顶。 **取值范围**： - true：置顶。 - false： 不置顶。 **默认取值**： 不涉及。
     * @return topFlag
     */
    public Boolean getTopFlag() {
        return topFlag;
    }

    public void setTopFlag(Boolean topFlag) {
        this.topFlag = topFlag;
    }

    public CommentEntity withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释**： 评论创建人ID。 **默认取值**： 不涉及。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public CommentEntity withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释**： 评论创建时间。 **默认取值**： 不涉及。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public CommentEntity withCreatorInfo(UserVO creatorInfo) {
        this.creatorInfo = creatorInfo;
        return this;
    }

    public CommentEntity withCreatorInfo(Consumer<UserVO> creatorInfoSetter) {
        if (this.creatorInfo == null) {
            this.creatorInfo = new UserVO();
            creatorInfoSetter.accept(this.creatorInfo);
        }

        return this;
    }

    /**
     * Get creatorInfo
     * @return creatorInfo
     */
    public UserVO getCreatorInfo() {
        return creatorInfo;
    }

    public void setCreatorInfo(UserVO creatorInfo) {
        this.creatorInfo = creatorInfo;
    }

    public CommentEntity withExtendAttribute(String extendAttribute) {
        this.extendAttribute = extendAttribute;
        return this;
    }

    /**
     * **参数解释**： 评论的一些扩展属性，表现为json字符串。 **默认取值**： 不涉及。
     * @return extendAttribute
     */
    public String getExtendAttribute() {
        return extendAttribute;
    }

    public void setExtendAttribute(String extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    public CommentEntity withExtendAttributeObj(CommentExtendAttribute extendAttributeObj) {
        this.extendAttributeObj = extendAttributeObj;
        return this;
    }

    public CommentEntity withExtendAttributeObj(Consumer<CommentExtendAttribute> extendAttributeObjSetter) {
        if (this.extendAttributeObj == null) {
            this.extendAttributeObj = new CommentExtendAttribute();
            extendAttributeObjSetter.accept(this.extendAttributeObj);
        }

        return this;
    }

    /**
     * Get extendAttributeObj
     * @return extendAttributeObj
     */
    public CommentExtendAttribute getExtendAttributeObj() {
        return extendAttributeObj;
    }

    public void setExtendAttributeObj(CommentExtendAttribute extendAttributeObj) {
        this.extendAttributeObj = extendAttributeObj;
    }

    public CommentEntity withExtendAttributeObjs(List<CommentExtendAttribute> extendAttributeObjs) {
        this.extendAttributeObjs = extendAttributeObjs;
        return this;
    }

    public CommentEntity addExtendAttributeObjsItem(CommentExtendAttribute extendAttributeObjsItem) {
        if (this.extendAttributeObjs == null) {
            this.extendAttributeObjs = new ArrayList<>();
        }
        this.extendAttributeObjs.add(extendAttributeObjsItem);
        return this;
    }

    public CommentEntity withExtendAttributeObjs(Consumer<List<CommentExtendAttribute>> extendAttributeObjsSetter) {
        if (this.extendAttributeObjs == null) {
            this.extendAttributeObjs = new ArrayList<>();
        }
        extendAttributeObjsSetter.accept(this.extendAttributeObjs);
        return this;
    }

    /**
     * **参数解释**： 评论的扩展属性对象数组。 **默认取值**： 不涉及。
     * @return extendAttributeObjs
     */
    public List<CommentExtendAttribute> getExtendAttributeObjs() {
        return extendAttributeObjs;
    }

    public void setExtendAttributeObjs(List<CommentExtendAttribute> extendAttributeObjs) {
        this.extendAttributeObjs = extendAttributeObjs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentEntity that = (CommentEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.type, that.type) && Objects.equals(this.top, that.top)
            && Objects.equals(this.topTime, that.topTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.issueId, that.issueId) && Objects.equals(this.topFlag, that.topFlag)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.creatorInfo, that.creatorInfo)
            && Objects.equals(this.extendAttribute, that.extendAttribute)
            && Objects.equals(this.extendAttributeObj, that.extendAttributeObj)
            && Objects.equals(this.extendAttributeObjs, that.extendAttributeObjs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            category,
            type,
            top,
            topTime,
            description,
            issueId,
            topFlag,
            createdBy,
            createdDate,
            creatorInfo,
            extendAttribute,
            extendAttributeObj,
            extendAttributeObjs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    topTime: ").append(toIndentedString(topTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    topFlag: ").append(toIndentedString(topFlag)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    creatorInfo: ").append(toIndentedString(creatorInfo)).append("\n");
        sb.append("    extendAttribute: ").append(toIndentedString(extendAttribute)).append("\n");
        sb.append("    extendAttributeObj: ").append(toIndentedString(extendAttributeObj)).append("\n");
        sb.append("    extendAttributeObjs: ").append(toIndentedString(extendAttributeObjs)).append("\n");
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
