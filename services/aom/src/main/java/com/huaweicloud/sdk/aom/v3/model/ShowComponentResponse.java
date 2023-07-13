package com.huaweicloud.sdk.aom.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowComponentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_id")

    private String aomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 注册方式
     */
    public static final class RegisterTypeEnum {

        /**
         * Enum API for value: "API"
         */
        public static final RegisterTypeEnum API = new RegisterTypeEnum("API");

        /**
         * Enum CONSOLE for value: "CONSOLE"
         */
        public static final RegisterTypeEnum CONSOLE = new RegisterTypeEnum("CONSOLE");

        /**
         * Enum SERVICE_DISCOVERY for value: "SERVICE_DISCOVERY"
         */
        public static final RegisterTypeEnum SERVICE_DISCOVERY = new RegisterTypeEnum("SERVICE_DISCOVERY");

        private static final Map<String, RegisterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegisterTypeEnum> createStaticFields() {
            Map<String, RegisterTypeEnum> map = new HashMap<>();
            map.put("API", API);
            map.put("CONSOLE", CONSOLE);
            map.put("SERVICE_DISCOVERY", SERVICE_DISCOVERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegisterTypeEnum(String value) {
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
        public static RegisterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RegisterTypeEnum(value));
        }

        public static RegisterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegisterTypeEnum) {
                return this.value.equals(((RegisterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_type")

    private RegisterTypeEnum registerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_app_id")

    private String subAppId;

    public ShowComponentResponse withAomId(String aomId) {
        this.aomId = aomId;
        return this;
    }

    /**
     * aomId
     * @return aomId
     */
    public String getAomId() {
        return aomId;
    }

    public void setAomId(String aomId) {
        this.aomId = aomId;
    }

    public ShowComponentResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowComponentResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowComponentResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowComponentResponse withDescription(String description) {
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

    public ShowComponentResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组件Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowComponentResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 修改时间
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public ShowComponentResponse withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 修改者
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public ShowComponentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowComponentResponse withRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
        return this;
    }

    /**
     * 注册方式
     * @return registerType
     */
    public RegisterTypeEnum getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterTypeEnum registerType) {
        this.registerType = registerType;
    }

    public ShowComponentResponse withSubAppId(String subAppId) {
        this.subAppId = subAppId;
        return this;
    }

    /**
     * 子应用id
     * @return subAppId
     */
    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowComponentResponse that = (ShowComponentResponse) obj;
        return Objects.equals(this.aomId, that.aomId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.modifiedTime, that.modifiedTime) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.name, that.name) && Objects.equals(this.registerType, that.registerType)
            && Objects.equals(this.subAppId, that.subAppId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aomId,
            appId,
            createTime,
            creator,
            description,
            id,
            modifiedTime,
            modifier,
            name,
            registerType,
            subAppId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComponentResponse {\n");
        sb.append("    aomId: ").append(toIndentedString(aomId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    registerType: ").append(toIndentedString(registerType)).append("\n");
        sb.append("    subAppId: ").append(toIndentedString(subAppId)).append("\n");
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
