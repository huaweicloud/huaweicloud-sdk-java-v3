package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 可集成系统CodeArts Req设置信息。
 */
public class ReqSettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Boolean active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches")

    private String branches;

    /**
     * **参数解释：** 分支的类型，文本或者正则表达式。 **取值范围：** plain代表文本，regex代表正则表达式。
     */
    public static final class BranchesTypeEnum {

        /**
         * Enum PLAIN for value: "plain"
         */
        public static final BranchesTypeEnum PLAIN = new BranchesTypeEnum("plain");

        /**
         * Enum REGEX for value: "regex"
         */
        public static final BranchesTypeEnum REGEX = new BranchesTypeEnum("regex");

        private static final Map<String, BranchesTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BranchesTypeEnum> createStaticFields() {
            Map<String, BranchesTypeEnum> map = new HashMap<>();
            map.put("plain", PLAIN);
            map.put("regex", REGEX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BranchesTypeEnum(String value) {
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
        public static BranchesTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BranchesTypeEnum(value));
        }

        public static BranchesTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BranchesTypeEnum) {
                return this.value.equals(((BranchesTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches_type")

    private BranchesTypeEnum branchesType;

    /**
     * **参数解释：** 关联的CodeArts Req项目类型。 **取值范围：** scrum代表scrum类型项目，ipd代表IPD类型项目, xboard为看板类型项目。
     */
    public static final class ProjectTypeEnum {

        /**
         * Enum SCRUM for value: "scrum"
         */
        public static final ProjectTypeEnum SCRUM = new ProjectTypeEnum("scrum");

        /**
         * Enum IPD for value: "ipd"
         */
        public static final ProjectTypeEnum IPD = new ProjectTypeEnum("ipd");

        /**
         * Enum XBOARD for value: "xboard"
         */
        public static final ProjectTypeEnum XBOARD = new ProjectTypeEnum("xboard");

        private static final Map<String, ProjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProjectTypeEnum> createStaticFields() {
            Map<String, ProjectTypeEnum> map = new HashMap<>();
            map.put("scrum", SCRUM);
            map.put("ipd", IPD);
            map.put("xboard", XBOARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProjectTypeEnum(String value) {
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
        public static ProjectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProjectTypeEnum(value));
        }

        public static ProjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProjectTypeEnum) {
                return this.value.equals(((ProjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_type")

    private ProjectTypeEnum projectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private String categories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_codes")

    private String categoryCodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_statuses")

    private String excludeStatuses;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_status_codes")

    private String excludeStatusCodes;

    public ReqSettingDto withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * **参数解释：** 是否开启集成CodeArts Req **取值范围：** true：开启集成CodeArts Req，false：未开启集成CodeArts Req。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ReqSettingDto withBranches(String branches) {
        this.branches = branches;
        return this;
    }

    /**
     * **参数解释：** 应用排除状态和可关联类别限制的分支列表，该分支指代合并请求的目标分支，可支持多个分支用英文逗号拼接或者正则表达式，在项目层级和代码组层级只支持配置正则表达式。
     * @return branches
     */
    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public ReqSettingDto withBranchesType(BranchesTypeEnum branchesType) {
        this.branchesType = branchesType;
        return this;
    }

    /**
     * **参数解释：** 分支的类型，文本或者正则表达式。 **取值范围：** plain代表文本，regex代表正则表达式。
     * @return branchesType
     */
    public BranchesTypeEnum getBranchesType() {
        return branchesType;
    }

    public void setBranchesType(BranchesTypeEnum branchesType) {
        this.branchesType = branchesType;
    }

    public ReqSettingDto withProjectType(ProjectTypeEnum projectType) {
        this.projectType = projectType;
        return this;
    }

    /**
     * **参数解释：** 关联的CodeArts Req项目类型。 **取值范围：** scrum代表scrum类型项目，ipd代表IPD类型项目, xboard为看板类型项目。
     * @return projectType
     */
    public ProjectTypeEnum getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectTypeEnum projectType) {
        this.projectType = projectType;
    }

    public ReqSettingDto withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    /**
     * **参数解释：** 可关联类型列表，逗号分隔。
     * @return categories
     */
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public ReqSettingDto withCategoryCodes(String categoryCodes) {
        this.categoryCodes = categoryCodes;
        return this;
    }

    /**
     * **参数解释：** 可关联类型编码列表，逗号分隔。
     * @return categoryCodes
     */
    public String getCategoryCodes() {
        return categoryCodes;
    }

    public void setCategoryCodes(String categoryCodes) {
        this.categoryCodes = categoryCodes;
    }

    public ReqSettingDto withExcludeStatuses(String excludeStatuses) {
        this.excludeStatuses = excludeStatuses;
        return this;
    }

    /**
     * **参数解释：** 排除状态列表，逗号分隔。
     * @return excludeStatuses
     */
    public String getExcludeStatuses() {
        return excludeStatuses;
    }

    public void setExcludeStatuses(String excludeStatuses) {
        this.excludeStatuses = excludeStatuses;
    }

    public ReqSettingDto withExcludeStatusCodes(String excludeStatusCodes) {
        this.excludeStatusCodes = excludeStatusCodes;
        return this;
    }

    /**
     * **参数解释：** 排除状态编码列表，逗号分隔。
     * @return excludeStatusCodes
     */
    public String getExcludeStatusCodes() {
        return excludeStatusCodes;
    }

    public void setExcludeStatusCodes(String excludeStatusCodes) {
        this.excludeStatusCodes = excludeStatusCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqSettingDto that = (ReqSettingDto) obj;
        return Objects.equals(this.active, that.active) && Objects.equals(this.branches, that.branches)
            && Objects.equals(this.branchesType, that.branchesType)
            && Objects.equals(this.projectType, that.projectType) && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.categoryCodes, that.categoryCodes)
            && Objects.equals(this.excludeStatuses, that.excludeStatuses)
            && Objects.equals(this.excludeStatusCodes, that.excludeStatusCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active,
            branches,
            branchesType,
            projectType,
            categories,
            categoryCodes,
            excludeStatuses,
            excludeStatusCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqSettingDto {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
        sb.append("    branchesType: ").append(toIndentedString(branchesType)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoryCodes: ").append(toIndentedString(categoryCodes)).append("\n");
        sb.append("    excludeStatuses: ").append(toIndentedString(excludeStatuses)).append("\n");
        sb.append("    excludeStatusCodes: ").append(toIndentedString(excludeStatusCodes)).append("\n");
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
