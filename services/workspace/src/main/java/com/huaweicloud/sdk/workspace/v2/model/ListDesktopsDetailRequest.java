package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListDesktopsDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_names")

    private List<String> userNames = null;

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - created 创建时间。 - computer_name 桌面名称。
     */
    public static final class SortFieldEnum {

        /**
         * Enum CREATED for value: "created"
         */
        public static final SortFieldEnum CREATED = new SortFieldEnum("created");

        /**
         * Enum COMPUTER_NAME for value: "computer_name"
         */
        public static final SortFieldEnum COMPUTER_NAME = new SortFieldEnum("computer_name");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("created", CREATED);
            map.put("computer_name", COMPUTER_NAME);
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

    /**
     * 排序类型，默认升序，需要结合sort_field字段一起使用。 - ASC 升序。 - DESC 降序。
     */
    public static final class SortTypeEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortTypeEnum ASC = new SortTypeEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortTypeEnum DESC = new SortTypeEnum("DESC");

        private static final Map<String, SortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortTypeEnum> createStaticFields() {
            Map<String, SortTypeEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortTypeEnum(String value) {
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
        public static SortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortTypeEnum(value));
        }

        public static SortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortTypeEnum) {
                return this.value.equals(((SortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private SortTypeEnum sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ip")

    private String desktopIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private List<String> desktopId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private String desktopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_attached")

    private Boolean userAttached;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_maintenance_mode")

    private Boolean inMaintenanceMode;

    public ListDesktopsDetailRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面状态。  - ACTIVE：运行中。 - SHUTOFF：关机。 - ERROR：异常。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListDesktopsDetailRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面所属用户，当传user_names时，本字段不生效。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListDesktopsDetailRequest withUserNames(List<String> userNames) {
        this.userNames = userNames;
        return this;
    }

    public ListDesktopsDetailRequest addUserNamesItem(String userNamesItem) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        this.userNames.add(userNamesItem);
        return this;
    }

    public ListDesktopsDetailRequest withUserNames(Consumer<List<String>> userNamesSetter) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        userNamesSetter.accept(this.userNames);
        return this;
    }

    /**
     * 桌面所属用户，批量筛选，最多不超过100个用户。
     * @return userNames
     */
    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public ListDesktopsDetailRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段名称，需要结合sort_type字段一起使用。 - created 创建时间。 - computer_name 桌面名称。
     * @return sortField
     */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    public ListDesktopsDetailRequest withSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序类型，默认升序，需要结合sort_field字段一起使用。 - ASC 升序。 - DESC 降序。
     * @return sortType
     */
    public SortTypeEnum getSortType() {
        return sortType;
    }

    public void setSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
    }

    public ListDesktopsDetailRequest withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ListDesktopsDetailRequest withDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
        return this;
    }

    /**
     * 桌面IP地址。
     * @return desktopIp
     */
    public String getDesktopIp() {
        return desktopIp;
    }

    public void setDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
    }

    public ListDesktopsDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
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

    public ListDesktopsDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，取值范围0-500，默认值500。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDesktopsDetailRequest withDesktopId(List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    public ListDesktopsDetailRequest addDesktopIdItem(String desktopIdItem) {
        if (this.desktopId == null) {
            this.desktopId = new ArrayList<>();
        }
        this.desktopId.add(desktopIdItem);
        return this;
    }

    public ListDesktopsDetailRequest withDesktopId(Consumer<List<String>> desktopIdSetter) {
        if (this.desktopId == null) {
            this.desktopId = new ArrayList<>();
        }
        desktopIdSetter.accept(this.desktopId);
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public List<String> getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(List<String> desktopId) {
        this.desktopId = desktopId;
    }

    public ListDesktopsDetailRequest withDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类型，为空时查所有桌面。 - DEDICATED：普通桌面，包括专享桌面、专属桌面等 - POOLED：池桌面，即桌面池里的桌面
     * @return desktopType
     */
    public String getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(String desktopType) {
        this.desktopType = desktopType;
    }

    public ListDesktopsDetailRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 桌面的标签。样例：  - key1=value1。 - key1=value1，key2=value2。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListDesktopsDetailRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 桌面池ID,多个桌面池ID用逗号隔开。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ListDesktopsDetailRequest withUserAttached(Boolean userAttached) {
        this.userAttached = userAttached;
        return this;
    }

    /**
     * 是否分配了用户。
     * @return userAttached
     */
    public Boolean getUserAttached() {
        return userAttached;
    }

    public void setUserAttached(Boolean userAttached) {
        this.userAttached = userAttached;
    }

    public ListDesktopsDetailRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListDesktopsDetailRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ListDesktopsDetailRequest withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式，0：包周期，1：按需。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListDesktopsDetailRequest withInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
        return this;
    }

    /**
     * 按照维护模式过滤
     * @return inMaintenanceMode
     */
    public Boolean getInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsDetailRequest that = (ListDesktopsDetailRequest) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userNames, that.userNames) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.desktopIp, that.desktopIp) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.desktopType, that.desktopType) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.userAttached, that.userAttached)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.inMaintenanceMode, that.inMaintenanceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            userName,
            userNames,
            sortField,
            sortType,
            computerName,
            desktopIp,
            offset,
            limit,
            desktopId,
            desktopType,
            tag,
            poolId,
            userAttached,
            enterpriseProjectId,
            imageId,
            chargeMode,
            inMaintenanceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsDetailRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    desktopIp: ").append(toIndentedString(desktopIp)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    userAttached: ").append(toIndentedString(userAttached)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    inMaintenanceMode: ").append(toIndentedString(inMaintenanceMode)).append("\n");
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
