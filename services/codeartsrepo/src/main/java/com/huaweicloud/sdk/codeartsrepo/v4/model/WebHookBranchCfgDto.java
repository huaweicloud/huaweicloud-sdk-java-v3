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
 * WebHookBranchCfgDto
 */
public class WebHookBranchCfgDto {

    /**
     * **参数解释：** 分支类型。 **取值范围：** - 0，文本。 - 1，通配符。 - 2，正则。
     */
    public static final class BranchTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final BranchTypeEnum NUMBER_0 = new BranchTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final BranchTypeEnum NUMBER_1 = new BranchTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final BranchTypeEnum NUMBER_2 = new BranchTypeEnum(2);

        private static final Map<Integer, BranchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BranchTypeEnum> createStaticFields() {
            Map<Integer, BranchTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BranchTypeEnum(Integer value) {
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
        public static BranchTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BranchTypeEnum(value));
        }

        public static BranchTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BranchTypeEnum) {
                return this.value.equals(((BranchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_type")

    private BranchTypeEnum branchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    /**
     * **参数解释：** 仓库名类型。 **取值范围：** - 0，文本。 - 1，通配符。 - 2，正则。
     */
    public static final class ProjectTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProjectTypeEnum NUMBER_0 = new ProjectTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProjectTypeEnum NUMBER_1 = new ProjectTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ProjectTypeEnum NUMBER_2 = new ProjectTypeEnum(2);

        private static final Map<Integer, ProjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProjectTypeEnum> createStaticFields() {
            Map<Integer, ProjectTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProjectTypeEnum(Integer value) {
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
        public static ProjectTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProjectTypeEnum(value));
        }

        public static ProjectTypeEnum valueOf(Integer value) {
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
    @JsonProperty(value = "project")

    private String project;

    public WebHookBranchCfgDto withBranchType(BranchTypeEnum branchType) {
        this.branchType = branchType;
        return this;
    }

    /**
     * **参数解释：** 分支类型。 **取值范围：** - 0，文本。 - 1，通配符。 - 2，正则。
     * @return branchType
     */
    public BranchTypeEnum getBranchType() {
        return branchType;
    }

    public void setBranchType(BranchTypeEnum branchType) {
        this.branchType = branchType;
    }

    public WebHookBranchCfgDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名配置。 **取值范围：** 最小1个字节，最大255字节
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public WebHookBranchCfgDto withProjectType(ProjectTypeEnum projectType) {
        this.projectType = projectType;
        return this;
    }

    /**
     * **参数解释：** 仓库名类型。 **取值范围：** - 0，文本。 - 1，通配符。 - 2，正则。
     * @return projectType
     */
    public ProjectTypeEnum getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectTypeEnum projectType) {
        this.projectType = projectType;
    }

    public WebHookBranchCfgDto withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * **参数解释：** 仓库名配置。 **取值范围：** 最小1个字节，最大255字节
     * @return project
     */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebHookBranchCfgDto that = (WebHookBranchCfgDto) obj;
        return Objects.equals(this.branchType, that.branchType) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.projectType, that.projectType) && Objects.equals(this.project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchType, branch, projectType, project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebHookBranchCfgDto {\n");
        sb.append("    branchType: ").append(toIndentedString(branchType)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
