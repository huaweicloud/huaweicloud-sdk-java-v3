package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAtlasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_count")

    private Long imageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referenced_rules")

    private List<ReferencedRule> referencedRules = null;

    public UpdateAtlasResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 图库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateAtlasResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 图库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAtlasResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 图库类型 0=白库（豁免/可信样本） / 1=黑库（敏感/拦截样本）
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public UpdateAtlasResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 图库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAtlasResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（毫秒）
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateAtlasResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（毫秒）
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateAtlasResponse withImageCount(Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }

    /**
     * 图库下已加入（status≥0）且未删除的图片数量；创建返回 0
     * @return imageCount
     */
    public Long getImageCount() {
        return imageCount;
    }

    public void setImageCount(Long imageCount) {
        this.imageCount = imageCount;
    }

    public UpdateAtlasResponse withReferencedRules(List<ReferencedRule> referencedRules) {
        this.referencedRules = referencedRules;
        return this;
    }

    public UpdateAtlasResponse addReferencedRulesItem(ReferencedRule referencedRulesItem) {
        if (this.referencedRules == null) {
            this.referencedRules = new ArrayList<>();
        }
        this.referencedRules.add(referencedRulesItem);
        return this;
    }

    public UpdateAtlasResponse withReferencedRules(Consumer<List<ReferencedRule>> referencedRulesSetter) {
        if (this.referencedRules == null) {
            this.referencedRules = new ArrayList<>();
        }
        referencedRulesSetter.accept(this.referencedRules);
        return this;
    }

    /**
     * 引用此图库的规则列表
     * @return referencedRules
     */
    public List<ReferencedRule> getReferencedRules() {
        return referencedRules;
    }

    public void setReferencedRules(List<ReferencedRule> referencedRules) {
        this.referencedRules = referencedRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAtlasResponse that = (UpdateAtlasResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.imageCount, that.imageCount)
            && Objects.equals(this.referencedRules, that.referencedRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, createTime, updateTime, imageCount, referencedRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAtlasResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    imageCount: ").append(toIndentedString(imageCount)).append("\n");
        sb.append("    referencedRules: ").append(toIndentedString(referencedRules)).append("\n");
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
