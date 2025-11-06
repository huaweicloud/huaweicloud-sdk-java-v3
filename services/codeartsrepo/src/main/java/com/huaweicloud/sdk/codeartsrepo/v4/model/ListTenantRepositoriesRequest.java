package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTenantRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_number")

    private Integer memberNumber;

    /**
     * **参数解释：** 仓库状态。 **取值范围：** - 0，正常。 - 3，冻结。 - 4，关闭。 - 5，清理中。 - 7，删除中。
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final StatusEnum NUMBER_3 = new StatusEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final StatusEnum NUMBER_4 = new StatusEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final StatusEnum NUMBER_5 = new StatusEnum(5);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final StatusEnum NUMBER_7 = new StatusEnum(7);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_after")

    private OffsetDateTime createdAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_before")

    private OffsetDateTime createdBefore;

    /**
     * **参数解释：** 结果集排序方式。 **约束限制：** 与sort_field搭配使用。  **取值范围：** - asc，正序返回。 - desc，倒序返回。
     */
    public static final class SortEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortEnum ASC = new SortEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortEnum DESC = new SortEnum("desc");

        private static final Map<String, SortEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortEnum> createStaticFields() {
            Map<String, SortEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortEnum(String value) {
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
        public static SortEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortEnum(value));
        }

        public static SortEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortEnum) {
                return this.value.equals(((SortEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private SortEnum sort;

    /**
     * **参数解释：** 用作排序的字段。 - owner，仓库所有者。 - capacity，使用空间。 - status，状态。 - create_time，创建时间。 - member_number，成员数量。 - repository_name，仓库名称。
     */
    public static final class SortFieldEnum {

        /**
         * Enum OWNER for value: "owner"
         */
        public static final SortFieldEnum OWNER = new SortFieldEnum("owner");

        /**
         * Enum CAPACITY for value: "capacity"
         */
        public static final SortFieldEnum CAPACITY = new SortFieldEnum("capacity");

        /**
         * Enum STATUS for value: "status"
         */
        public static final SortFieldEnum STATUS = new SortFieldEnum("status");

        /**
         * Enum CREATE_TIME for value: "create_time"
         */
        public static final SortFieldEnum CREATE_TIME = new SortFieldEnum("create_time");

        /**
         * Enum MEMBER_NUMBER for value: "member_number"
         */
        public static final SortFieldEnum MEMBER_NUMBER = new SortFieldEnum("member_number");

        /**
         * Enum REPOSITORY_NAME for value: "repository_name"
         */
        public static final SortFieldEnum REPOSITORY_NAME = new SortFieldEnum("repository_name");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("owner", OWNER);
            map.put("capacity", CAPACITY);
            map.put("status", STATUS);
            map.put("create_time", CREATE_TIME);
            map.put("member_number", MEMBER_NUMBER);
            map.put("repository_name", REPOSITORY_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortFieldEnum(String value) {
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
        public static SortFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortFieldEnum(value));
        }

        public static SortFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortFieldEnum) {
                return this.value.equals(((SortFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private SortFieldEnum sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTenantRepositoriesRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。 **取值范围：** 字符串长度不少于1，不超过128。
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public ListTenantRepositoriesRequest withMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
        return this;
    }

    /**
     * **参数解释：** 成员数量。
     * minimum: 1
     * maximum: 2147483647
     * @return memberNumber
     */
    public Integer getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    public ListTenantRepositoriesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 仓库状态。 **取值范围：** - 0，正常。 - 3，冻结。 - 4，关闭。 - 5，清理中。 - 7，删除中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListTenantRepositoriesRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释：** 仓库所有者。 **取值范围：** 字符串长度不少于1，不超过128。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListTenantRepositoriesRequest withCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * **参数解释：** 筛选在该时间之后创建的仓库。
     * @return createdAfter
     */
    public OffsetDateTime getCreatedAfter() {
        return createdAfter;
    }

    public void setCreatedAfter(OffsetDateTime createdAfter) {
        this.createdAfter = createdAfter;
    }

    public ListTenantRepositoriesRequest withCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * **参数解释：** 筛选在该时间之前创建的仓库。
     * @return createdBefore
     */
    public OffsetDateTime getCreatedBefore() {
        return createdBefore;
    }

    public void setCreatedBefore(OffsetDateTime createdBefore) {
        this.createdBefore = createdBefore;
    }

    public ListTenantRepositoriesRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 结果集排序方式。 **约束限制：** 与sort_field搭配使用。  **取值范围：** - asc，正序返回。 - desc，倒序返回。
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListTenantRepositoriesRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * **参数解释：** 用作排序的字段。 - owner，仓库所有者。 - capacity，使用空间。 - status，状态。 - create_time，创建时间。 - member_number，成员数量。 - repository_name，仓库名称。
     * @return sortField
     */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    public ListTenantRepositoriesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTenantRepositoriesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantRepositoriesRequest that = (ListTenantRepositoriesRequest) obj;
        return Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.memberNumber, that.memberNumber) && Objects.equals(this.status, that.status)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.createdAfter, that.createdAfter)
            && Objects.equals(this.createdBefore, that.createdBefore) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryName,
            memberNumber,
            status,
            owner,
            createdAfter,
            createdBefore,
            sort,
            sortField,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantRepositoriesRequest {\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    memberNumber: ").append(toIndentedString(memberNumber)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
        sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
