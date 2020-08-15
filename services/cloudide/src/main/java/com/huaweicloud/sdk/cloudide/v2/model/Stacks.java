package com.huaweicloud.sdk.cloudide.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.StacksConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Stacks
 */
public class Stacks  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arm_config")
    
    private StacksConfig armConfig = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    
    private StacksConfig config = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private String creator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disable")
    
    private Boolean disable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Long id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logo")
    
    private String logo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private String scope;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    
    public Stacks withArmConfig(StacksConfig armConfig) {
        this.armConfig = armConfig;
        return this;
    }

    public Stacks withArmConfig(Consumer<StacksConfig> armConfigSetter) {
        if(this.armConfig == null ){
            this.armConfig = new StacksConfig();
            armConfigSetter.accept(this.armConfig);
        }
        
        return this;
    }


    /**
     * Get armConfig
     * @return armConfig
     */
    public StacksConfig getArmConfig() {
        return armConfig;
    }

    public void setArmConfig(StacksConfig armConfig) {
        this.armConfig = armConfig;
    }

    public Stacks withConfig(StacksConfig config) {
        this.config = config;
        return this;
    }

    public Stacks withConfig(Consumer<StacksConfig> configSetter) {
        if(this.config == null ){
            this.config = new StacksConfig();
            configSetter.accept(this.config);
        }
        
        return this;
    }


    /**
     * Get config
     * @return config
     */
    public StacksConfig getConfig() {
        return config;
    }

    public void setConfig(StacksConfig config) {
        this.config = config;
    }

    public Stacks withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Stacks withDescription(String description) {
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

    public Stacks withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    


    /**
     * 是否可用
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public Stacks withId(Long id) {
        this.id = id;
        return this;
    }

    


    /**
     * id
     * minimum: 1
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Stacks withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Stacks withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    


    /**
     * 图标
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Stacks withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 技术栈名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stacks withScope(String scope) {
        this.scope = scope;
        return this;
    }

    


    /**
     * 范围
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Stacks withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 技术栈ID 目前可取值all，java，go，python，cpp，nodejs，quantum，blockchain，dcn，vue，ruby。
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public Stacks withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public Stacks addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Stacks withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tags
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stacks stacks = (Stacks) o;
        return Objects.equals(this.armConfig, stacks.armConfig) &&
            Objects.equals(this.config, stacks.config) &&
            Objects.equals(this.creator, stacks.creator) &&
            Objects.equals(this.description, stacks.description) &&
            Objects.equals(this.disable, stacks.disable) &&
            Objects.equals(this.id, stacks.id) &&
            Objects.equals(this.label, stacks.label) &&
            Objects.equals(this.logo, stacks.logo) &&
            Objects.equals(this.name, stacks.name) &&
            Objects.equals(this.scope, stacks.scope) &&
            Objects.equals(this.stackId, stacks.stackId) &&
            Objects.equals(this.tags, stacks.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(armConfig, config, creator, description, disable, id, label, logo, name, scope, stackId, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stacks {\n");
        sb.append("    armConfig: ").append(toIndentedString(armConfig)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

