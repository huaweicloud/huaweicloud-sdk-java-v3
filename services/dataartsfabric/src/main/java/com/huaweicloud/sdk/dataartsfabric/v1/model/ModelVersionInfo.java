package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Model Version详情信息
 */
public class ModelVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cap_white_list")

    private List<String> capWhiteList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private ModelConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private User createUser;

    public ModelVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模型版本ID，32~36位的英文、数字、短横组合，系统自动生成无法修改，输入不生效。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelVersionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模型版本名称, 只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelVersionInfo withCapWhiteList(List<String> capWhiteList) {
        this.capWhiteList = capWhiteList;
        return this;
    }

    public ModelVersionInfo addCapWhiteListItem(String capWhiteListItem) {
        if (this.capWhiteList == null) {
            this.capWhiteList = new ArrayList<>();
        }
        this.capWhiteList.add(capWhiteListItem);
        return this;
    }

    public ModelVersionInfo withCapWhiteList(Consumer<List<String>> capWhiteListSetter) {
        if (this.capWhiteList == null) {
            this.capWhiteList = new ArrayList<>();
        }
        capWhiteListSetter.accept(this.capWhiteList);
        return this;
    }

    /**
     * cap白名单
     * @return capWhiteList
     */
    public List<String> getCapWhiteList() {
        return capWhiteList;
    }

    public void setCapWhiteList(List<String> capWhiteList) {
        this.capWhiteList = capWhiteList;
    }

    public ModelVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelVersionInfo withConfig(ModelConfig config) {
        this.config = config;
        return this;
    }

    public ModelVersionInfo withConfig(Consumer<ModelConfig> configSetter) {
        if (this.config == null) {
            this.config = new ModelConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public ModelConfig getConfig() {
        return config;
    }

    public void setConfig(ModelConfig config) {
        this.config = config;
    }

    public ModelVersionInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ModelVersionInfo withCreateUser(User createUser) {
        this.createUser = createUser;
        return this;
    }

    public ModelVersionInfo withCreateUser(Consumer<User> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new User();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelVersionInfo that = (ModelVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.capWhiteList, that.capWhiteList)
            && Objects.equals(this.description, that.description) && Objects.equals(this.config, that.config)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capWhiteList, description, config, createTime, createUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    capWhiteList: ").append(toIndentedString(capWhiteList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
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
