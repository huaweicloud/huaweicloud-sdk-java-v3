package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建云连接实例的详细信息。
 */
public class CreateCloudConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 云连接使用场景。|- VPC：虚拟私有云。 ER：虚拟路由器。
     */
    public static final class UsedSceneEnum {

        /**
         * Enum ER for value: "er"
         */
        public static final UsedSceneEnum ER = new UsedSceneEnum("er");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final UsedSceneEnum VPC = new UsedSceneEnum("vpc");

        private static final Map<String, UsedSceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsedSceneEnum> createStaticFields() {
            Map<String, UsedSceneEnum> map = new HashMap<>();
            map.put("er", ER);
            map.put("vpc", VPC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UsedSceneEnum(String value) {
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
        public static UsedSceneEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            UsedSceneEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new UsedSceneEnum(value);
            }
            return result;
        }

        public static UsedSceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            UsedSceneEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UsedSceneEnum) {
                return this.value.equals(((UsedSceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_scene")

    private UsedSceneEnum usedScene;

    public CreateCloudConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云连接实例的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCloudConnection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 云连接实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCloudConnection withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 云连接实例所属的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateCloudConnection withUsedScene(UsedSceneEnum usedScene) {
        this.usedScene = usedScene;
        return this;
    }

    /**
     * 云连接使用场景。|- VPC：虚拟私有云。 ER：虚拟路由器。
     * @return usedScene
     */
    public UsedSceneEnum getUsedScene() {
        return usedScene;
    }

    public void setUsedScene(UsedSceneEnum usedScene) {
        this.usedScene = usedScene;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudConnection createCloudConnection = (CreateCloudConnection) o;
        return Objects.equals(this.name, createCloudConnection.name)
            && Objects.equals(this.description, createCloudConnection.description)
            && Objects.equals(this.enterpriseProjectId, createCloudConnection.enterpriseProjectId)
            && Objects.equals(this.usedScene, createCloudConnection.usedScene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, enterpriseProjectId, usedScene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudConnection {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    usedScene: ").append(toIndentedString(usedScene)).append("\n");
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
