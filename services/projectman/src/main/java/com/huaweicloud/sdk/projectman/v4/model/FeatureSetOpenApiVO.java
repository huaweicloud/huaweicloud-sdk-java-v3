package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 特性集OpenApi返回体
 */
public class FeatureSetOpenApiVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_float")

    private Float positionFloat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserEntity createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserEntity modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_fs")

    private List<FeatureSetOpenApiVO> childFs = null;

    public FeatureSetOpenApiVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 特性集ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FeatureSetOpenApiVO withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public FeatureSetOpenApiVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父特性集ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public FeatureSetOpenApiVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FeatureSetOpenApiVO withPositionFloat(Float positionFloat) {
        this.positionFloat = positionFloat;
        return this;
    }

    /**
     * 位置信息
     * @return positionFloat
     */
    public Float getPositionFloat() {
        return positionFloat;
    }

    public void setPositionFloat(Float positionFloat) {
        this.positionFloat = positionFloat;
    }

    public FeatureSetOpenApiVO withCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public FeatureSetOpenApiVO withCreatedBy(Consumer<UserEntity> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserEntity();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public FeatureSetOpenApiVO withModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public FeatureSetOpenApiVO withModifiedBy(Consumer<UserEntity> modifiedBySetter) {
        if (this.modifiedBy == null) {
            this.modifiedBy = new UserEntity();
            modifiedBySetter.accept(this.modifiedBy);
        }

        return this;
    }

    /**
     * Get modifiedBy
     * @return modifiedBy
     */
    public UserEntity getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public FeatureSetOpenApiVO withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释**： 特性集创建时间的时间戳。 **取值范围**： 不涉及。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public FeatureSetOpenApiVO withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * **参数解释**： 特性集修改时间的时间戳。 **取值范围**： 不涉及。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public FeatureSetOpenApiVO withChildFs(List<FeatureSetOpenApiVO> childFs) {
        this.childFs = childFs;
        return this;
    }

    public FeatureSetOpenApiVO addChildFsItem(FeatureSetOpenApiVO childFsItem) {
        if (this.childFs == null) {
            this.childFs = new ArrayList<>();
        }
        this.childFs.add(childFsItem);
        return this;
    }

    public FeatureSetOpenApiVO withChildFs(Consumer<List<FeatureSetOpenApiVO>> childFsSetter) {
        if (this.childFs == null) {
            this.childFs = new ArrayList<>();
        }
        childFsSetter.accept(this.childFs);
        return this;
    }

    /**
     * 子特性集
     * @return childFs
     */
    public List<FeatureSetOpenApiVO> getChildFs() {
        return childFs;
    }

    public void setChildFs(List<FeatureSetOpenApiVO> childFs) {
        this.childFs = childFs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeatureSetOpenApiVO that = (FeatureSetOpenApiVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.number, that.number)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.positionFloat, that.positionFloat) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.childFs, that.childFs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            number,
            parentId,
            title,
            positionFloat,
            createdBy,
            modifiedBy,
            createdDate,
            modifiedDate,
            childFs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureSetOpenApiVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    positionFloat: ").append(toIndentedString(positionFloat)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    childFs: ").append(toIndentedString(childFs)).append("\n");
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
