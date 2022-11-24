package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 资源分组创建方式，取值只能为EPS（同步企业项目）,TAG（标签动态匹配）,Manual（手动添加）
     */
    public static final class TypeEnum {

        /**
         * Enum EPS for value: "EPS"
         */
        public static final TypeEnum EPS = new TypeEnum("EPS");

        /**
         * Enum TAG for value: "TAG"
         */
        public static final TypeEnum TAG = new TypeEnum("TAG");

        /**
         * Enum MANUAL for value: "Manual"
         */
        public static final TypeEnum MANUAL = new TypeEnum("Manual");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EPS", EPS);
            map.put("TAG", TAG);
            map.put("Manual", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_ep_ids")

    private List<String> associationEpIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    public ShowResourceGroupResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组的名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowResourceGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组ID，以rg开头，后跟22位由字母或数字组成的字符串
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowResourceGroupResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源分组的创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowResourceGroupResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 资源分组归属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowResourceGroupResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源分组创建方式，取值只能为EPS（同步企业项目）,TAG（标签动态匹配）,Manual（手动添加）
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowResourceGroupResponse withAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
        return this;
    }

    public ShowResourceGroupResponse addAssociationEpIdsItem(String associationEpIdsItem) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        this.associationEpIds.add(associationEpIdsItem);
        return this;
    }

    public ShowResourceGroupResponse withAssociationEpIds(Consumer<List<String>> associationEpIdsSetter) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        associationEpIdsSetter.accept(this.associationEpIds);
        return this;
    }

    /**
     * 该资源分组内包含的资源来源的企业项目ID，type为EPS时必传
     * @return associationEpIds
     */
    public List<String> getAssociationEpIds() {
        return associationEpIds;
    }

    public void setAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
    }

    public ShowResourceGroupResponse withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public ShowResourceGroupResponse addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowResourceGroupResponse withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签动态匹配时的关联标签,type为TAG时必传
     * @return tags
     */
    public List<ResourceGroupTagRelation> getTags() {
        return tags;
    }

    public void setTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceGroupResponse showResourceGroupResponse = (ShowResourceGroupResponse) o;
        return Objects.equals(this.groupName, showResourceGroupResponse.groupName)
            && Objects.equals(this.groupId, showResourceGroupResponse.groupId)
            && Objects.equals(this.createTime, showResourceGroupResponse.createTime)
            && Objects.equals(this.enterpriseProjectId, showResourceGroupResponse.enterpriseProjectId)
            && Objects.equals(this.type, showResourceGroupResponse.type)
            && Objects.equals(this.associationEpIds, showResourceGroupResponse.associationEpIds)
            && Objects.equals(this.tags, showResourceGroupResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupId, createTime, enterpriseProjectId, type, associationEpIds, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceGroupResponse {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    associationEpIds: ").append(toIndentedString(associationEpIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
