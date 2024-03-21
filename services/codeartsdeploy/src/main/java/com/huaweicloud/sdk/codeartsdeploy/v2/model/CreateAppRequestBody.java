package com.huaweicloud.sdk.codeartsdeploy.v2.model;

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
 * 创建应用请求体
 */
public class CreateAppRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_draft")

    private Boolean isDraft;

    /**
     * 创建类型，创建类型只有一个'template'，即根据模板创建
     */
    public static final class CreateTypeEnum {

        /**
         * Enum TEMPLATE for value: "template"
         */
        public static final CreateTypeEnum TEMPLATE = new CreateTypeEnum("template");

        private static final Map<String, CreateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CreateTypeEnum> createStaticFields() {
            Map<String, CreateTypeEnum> map = new HashMap<>();
            map.put("template", TEMPLATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CreateTypeEnum(String value) {
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
        public static CreateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CreateTypeEnum(value));
        }

        public static CreateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CreateTypeEnum) {
                return this.value.equals(((CreateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_type")

    private CreateTypeEnum createType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    private String slaveClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TaskTriggerVO trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrange_infos")

    private List<TaskV2RequestBody> arrangeInfos = null;

    public CreateAppRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateAppRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAppRequestBody withDescription(String description) {
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

    public CreateAppRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CreateAppRequestBody withIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
        return this;
    }

    /**
     * 是否为草稿
     * @return isDraft
     */
    public Boolean getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public CreateAppRequestBody withCreateType(CreateTypeEnum createType) {
        this.createType = createType;
        return this;
    }

    /**
     * 创建类型，创建类型只有一个'template'，即根据模板创建
     * @return createType
     */
    public CreateTypeEnum getCreateType() {
        return createType;
    }

    public void setCreateType(CreateTypeEnum createType) {
        this.createType = createType;
    }

    public CreateAppRequestBody withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * 自定义slave资源池id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public CreateAppRequestBody withTrigger(TaskTriggerVO trigger) {
        this.trigger = trigger;
        return this;
    }

    public CreateAppRequestBody withTrigger(Consumer<TaskTriggerVO> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TaskTriggerVO();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TaskTriggerVO getTrigger() {
        return trigger;
    }

    public void setTrigger(TaskTriggerVO trigger) {
        this.trigger = trigger;
    }

    public CreateAppRequestBody withArrangeInfos(List<TaskV2RequestBody> arrangeInfos) {
        this.arrangeInfos = arrangeInfos;
        return this;
    }

    public CreateAppRequestBody addArrangeInfosItem(TaskV2RequestBody arrangeInfosItem) {
        if (this.arrangeInfos == null) {
            this.arrangeInfos = new ArrayList<>();
        }
        this.arrangeInfos.add(arrangeInfosItem);
        return this;
    }

    public CreateAppRequestBody withArrangeInfos(Consumer<List<TaskV2RequestBody>> arrangeInfosSetter) {
        if (this.arrangeInfos == null) {
            this.arrangeInfos = new ArrayList<>();
        }
        arrangeInfosSetter.accept(this.arrangeInfos);
        return this;
    }

    /**
     * 部署任务列表信息
     * @return arrangeInfos
     */
    public List<TaskV2RequestBody> getArrangeInfos() {
        return arrangeInfos;
    }

    public void setArrangeInfos(List<TaskV2RequestBody> arrangeInfos) {
        this.arrangeInfos = arrangeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAppRequestBody that = (CreateAppRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.isDraft, that.isDraft) && Objects.equals(this.createType, that.createType)
            && Objects.equals(this.slaveClusterId, that.slaveClusterId) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.arrangeInfos, that.arrangeInfos);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(projectId, name, description, groupId, isDraft, createType, slaveClusterId, trigger, arrangeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
        sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    arrangeInfos: ").append(toIndentedString(arrangeInfos)).append("\n");
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
