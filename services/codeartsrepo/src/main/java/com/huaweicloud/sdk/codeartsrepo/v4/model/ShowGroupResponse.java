package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ShowGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Integer creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_ids")

    private List<Integer> ancestorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_names")

    private List<String> ancestorNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members_count")

    private Integer membersCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_count")

    private Integer repositoryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star_count")

    private Integer starCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starred")

    private Boolean starred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subgroup_count")

    private Integer subgroupCount;

    /**
     * 可见性, private public
     */
    public static final class VisibilityEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final VisibilityEnum PUBLIC = new VisibilityEnum("public");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final VisibilityEnum PRIVATE = new VisibilityEnum("private");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("private", PRIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum")

    private GroupSumDto sum;

    public ShowGroupResponse withCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者id
     * minimum: 1
     * maximum: 2147483647
     * @return creatorId
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public ShowGroupResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowGroupResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShowGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowGroupResponse withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * 代码组全名
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ShowGroupResponse withAncestorIds(List<Integer> ancestorIds) {
        this.ancestorIds = ancestorIds;
        return this;
    }

    public ShowGroupResponse addAncestorIdsItem(Integer ancestorIdsItem) {
        if (this.ancestorIds == null) {
            this.ancestorIds = new ArrayList<>();
        }
        this.ancestorIds.add(ancestorIdsItem);
        return this;
    }

    public ShowGroupResponse withAncestorIds(Consumer<List<Integer>> ancestorIdsSetter) {
        if (this.ancestorIds == null) {
            this.ancestorIds = new ArrayList<>();
        }
        ancestorIdsSetter.accept(this.ancestorIds);
        return this;
    }

    /**
     * 代码组层级路径id
     * @return ancestorIds
     */
    public List<Integer> getAncestorIds() {
        return ancestorIds;
    }

    public void setAncestorIds(List<Integer> ancestorIds) {
        this.ancestorIds = ancestorIds;
    }

    public ShowGroupResponse withAncestorNames(List<String> ancestorNames) {
        this.ancestorNames = ancestorNames;
        return this;
    }

    public ShowGroupResponse addAncestorNamesItem(String ancestorNamesItem) {
        if (this.ancestorNames == null) {
            this.ancestorNames = new ArrayList<>();
        }
        this.ancestorNames.add(ancestorNamesItem);
        return this;
    }

    public ShowGroupResponse withAncestorNames(Consumer<List<String>> ancestorNamesSetter) {
        if (this.ancestorNames == null) {
            this.ancestorNames = new ArrayList<>();
        }
        ancestorNamesSetter.accept(this.ancestorNames);
        return this;
    }

    /**
     * 代码组层级路径名称
     * @return ancestorNames
     */
    public List<String> getAncestorNames() {
        return ancestorNames;
    }

    public void setAncestorNames(List<String> ancestorNames) {
        this.ancestorNames = ancestorNames;
    }

    public ShowGroupResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 代码组id
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowGroupResponse withMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    /**
     * 代码组成员计数
     * minimum: 1
     * maximum: 1000
     * @return membersCount
     */
    public Integer getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public ShowGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 代码组名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowGroupResponse withRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
        return this;
    }

    /**
     * 仓库计数
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryCount
     */
    public Integer getRepositoryCount() {
        return repositoryCount;
    }

    public void setRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public ShowGroupResponse withStarCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    /**
     * 关注计数
     * minimum: 1
     * maximum: 2147483647
     * @return starCount
     */
    public Integer getStarCount() {
        return starCount;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    public ShowGroupResponse withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * 是否关注
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public ShowGroupResponse withSubgroupCount(Integer subgroupCount) {
        this.subgroupCount = subgroupCount;
        return this;
    }

    /**
     * 子组计数
     * minimum: 1
     * maximum: 2147483647
     * @return subgroupCount
     */
    public Integer getSubgroupCount() {
        return subgroupCount;
    }

    public void setSubgroupCount(Integer subgroupCount) {
        this.subgroupCount = subgroupCount;
    }

    public ShowGroupResponse withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 可见性, private public
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ShowGroupResponse withSum(GroupSumDto sum) {
        this.sum = sum;
        return this;
    }

    public ShowGroupResponse withSum(Consumer<GroupSumDto> sumSetter) {
        if (this.sum == null) {
            this.sum = new GroupSumDto();
            sumSetter.accept(this.sum);
        }

        return this;
    }

    /**
     * Get sum
     * @return sum
     */
    public GroupSumDto getSum() {
        return sum;
    }

    public void setSum(GroupSumDto sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupResponse that = (ShowGroupResponse) obj;
        return Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.fullName, that.fullName) && Objects.equals(this.ancestorIds, that.ancestorIds)
            && Objects.equals(this.ancestorNames, that.ancestorNames) && Objects.equals(this.id, that.id)
            && Objects.equals(this.membersCount, that.membersCount) && Objects.equals(this.name, that.name)
            && Objects.equals(this.repositoryCount, that.repositoryCount)
            && Objects.equals(this.starCount, that.starCount) && Objects.equals(this.starred, that.starred)
            && Objects.equals(this.subgroupCount, that.subgroupCount)
            && Objects.equals(this.visibility, that.visibility) && Objects.equals(this.sum, that.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatorId,
            projectId,
            createdAt,
            description,
            fullName,
            ancestorIds,
            ancestorNames,
            id,
            membersCount,
            name,
            repositoryCount,
            starCount,
            starred,
            subgroupCount,
            visibility,
            sum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupResponse {\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    ancestorIds: ").append(toIndentedString(ancestorIds)).append("\n");
        sb.append("    ancestorNames: ").append(toIndentedString(ancestorNames)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    membersCount: ").append(toIndentedString(membersCount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    repositoryCount: ").append(toIndentedString(repositoryCount)).append("\n");
        sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
        sb.append("    subgroupCount: ").append(toIndentedString(subgroupCount)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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
