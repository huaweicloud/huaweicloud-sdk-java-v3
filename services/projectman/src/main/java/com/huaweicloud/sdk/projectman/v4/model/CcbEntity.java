package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CcbEntity
 */
public class CcbEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private String approvalTime;

    /**
     * 工作项类型，审批对象固定为CCB。
     */
    public static final class CategoryEnum {

        /**
         * Enum CCB for value: "CCB"
         */
        public static final CategoryEnum CCB = new CategoryEnum("CCB");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("CCB", CCB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccb2review")

    private String ccb2review;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co_id")

    private String coId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private UserEntity owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_comments")

    private String approvalComments;

    public CcbEntity withApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审批时间。
     * @return approvalTime
     */
    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public CcbEntity withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 工作项类型，审批对象固定为CCB。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CcbEntity withCcb2review(String ccb2review) {
        this.ccb2review = ccb2review;
        return this;
    }

    /**
     * 审批对象关联的评审单ID。
     * @return ccb2review
     */
    public String getCcb2review() {
        return ccb2review;
    }

    public void setCcb2review(String ccb2review) {
        this.ccb2review = ccb2review;
    }

    public CcbEntity withCoId(String coId) {
        this.coId = coId;
        return this;
    }

    /**
     * 关联的变更对象ID。
     * @return coId
     */
    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public CcbEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 审批对象ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CcbEntity withOwner(UserEntity owner) {
        this.owner = owner;
        return this;
    }

    public CcbEntity withOwner(Consumer<UserEntity> ownerSetter) {
        if (this.owner == null) {
            this.owner = new UserEntity();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }

    public CcbEntity withApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }

    /**
     * 审批意见。
     * @return approvalComments
     */
    public String getApprovalComments() {
        return approvalComments;
    }

    public void setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CcbEntity that = (CcbEntity) obj;
        return Objects.equals(this.approvalTime, that.approvalTime) && Objects.equals(this.category, that.category)
            && Objects.equals(this.ccb2review, that.ccb2review) && Objects.equals(this.coId, that.coId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.approvalComments, that.approvalComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalTime, category, ccb2review, coId, id, owner, approvalComments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcbEntity {\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    ccb2review: ").append(toIndentedString(ccb2review)).append("\n");
        sb.append("    coId: ").append(toIndentedString(coId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    approvalComments: ").append(toIndentedString(approvalComments)).append("\n");
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
