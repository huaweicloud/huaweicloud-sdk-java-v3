package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CheckTaskMetadata
 */
public class CheckTaskMetadata {

    /**
     * **参数解释：** 插件检查类型 **取值范围：** - addonStatic: 运行中插件巡检 - addonUpgrade: 插件升级前检查  
     */
    public static final class TypeEnum {

        /**
         * Enum ADDONSTATIC for value: "addonStatic"
         */
        public static final TypeEnum ADDONSTATIC = new TypeEnum("addonStatic");

        /**
         * Enum ADDONUPGRADE for value: "addonUpgrade"
         */
        public static final TypeEnum ADDONUPGRADE = new TypeEnum("addonUpgrade");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("addonStatic", ADDONSTATIC);
            map.put("addonUpgrade", ADDONUPGRADE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "taskID")

    private String taskID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateName")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonInstanceName")

    private String addonInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonInstanceID")

    private String addonInstanceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTimeStamp")

    private String createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTimeStamp")

    private String expireTimeStamp;

    public CheckTaskMetadata withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 插件检查类型 **取值范围：** - addonStatic: 运行中插件巡检 - addonUpgrade: 插件升级前检查  
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CheckTaskMetadata withTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }

    /**
     * **参数解释：** 插件检查任务ID，用于任务检查结果查询 **取值范围：** 不涉及 
     * @return taskID
     */
    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public CheckTaskMetadata withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * **参数解释：** 插件模板名称 **取值范围：** cce服务提供的插件模板，可以通过[查询AddonTemplates列表](cce_02_0321.xml)中的items[].metadata.name字段获取 
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public CheckTaskMetadata withAddonInstanceName(String addonInstanceName) {
        this.addonInstanceName = addonInstanceName;
        return this;
    }

    /**
     * **参数解释：** 插件实例名称 **取值范围：** 不涉及 
     * @return addonInstanceName
     */
    public String getAddonInstanceName() {
        return addonInstanceName;
    }

    public void setAddonInstanceName(String addonInstanceName) {
        this.addonInstanceName = addonInstanceName;
    }

    public CheckTaskMetadata withAddonInstanceID(String addonInstanceID) {
        this.addonInstanceID = addonInstanceID;
        return this;
    }

    /**
     * **参数解释：** 插件实例ID **取值范围：** 不涉及 
     * @return addonInstanceID
     */
    public String getAddonInstanceID() {
        return addonInstanceID;
    }

    public void setAddonInstanceID(String addonInstanceID) {
        this.addonInstanceID = addonInstanceID;
    }

    public CheckTaskMetadata withCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * **参数解释：** 插件检查任务创建时间 **取值范围：** 不涉及 
     * @return createTimeStamp
     */
    public String getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public CheckTaskMetadata withExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
        return this;
    }

    /**
     * **参数解释：** 插件检查任务超时时间，仅终态（Failed/Success）任务存在此字段 **取值范围：** 不涉及 
     * @return expireTimeStamp
     */
    public String getExpireTimeStamp() {
        return expireTimeStamp;
    }

    public void setExpireTimeStamp(String expireTimeStamp) {
        this.expireTimeStamp = expireTimeStamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckTaskMetadata that = (CheckTaskMetadata) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.taskID, that.taskID)
            && Objects.equals(this.addonTemplateName, that.addonTemplateName)
            && Objects.equals(this.addonInstanceName, that.addonInstanceName)
            && Objects.equals(this.addonInstanceID, that.addonInstanceID)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.expireTimeStamp, that.expireTimeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            taskID,
            addonTemplateName,
            addonInstanceName,
            addonInstanceID,
            createTimeStamp,
            expireTimeStamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTaskMetadata {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    addonInstanceName: ").append(toIndentedString(addonInstanceName)).append("\n");
        sb.append("    addonInstanceID: ").append(toIndentedString(addonInstanceID)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    expireTimeStamp: ").append(toIndentedString(expireTimeStamp)).append("\n");
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
