package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryTemplatesItems
 */
public class QueryTemplatesItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favourite")

    private Boolean favourite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private QueryTemplateVo template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Double weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private String toolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intl_description")

    private Object intlDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<CreateBuildJobParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n")

    private Object i18n;

    public QueryTemplatesItems withFavourite(Boolean favourite) {
        this.favourite = favourite;
        return this;
    }

    /**
     * 是否收藏模板
     * @return favourite
     */
    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public QueryTemplatesItems withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public QueryTemplatesItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库中id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryTemplatesItems withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public QueryTemplatesItems withTemplate(QueryTemplateVo template) {
        this.template = template;
        return this;
    }

    public QueryTemplatesItems withTemplate(Consumer<QueryTemplateVo> templateSetter) {
        if (this.template == null) {
            this.template = new QueryTemplateVo();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public QueryTemplateVo getTemplate() {
        return template;
    }

    public void setTemplate(QueryTemplateVo template) {
        this.template = template;
    }

    public QueryTemplatesItems withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板类别
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QueryTemplatesItems withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * 模板是否公开
     * @return _public
     */
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public QueryTemplatesItems withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板命名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryTemplatesItems withCreateTime(String createTime) {
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

    public QueryTemplatesItems withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public QueryTemplatesItems withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重
     * @return weight
     */
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public QueryTemplatesItems withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public QueryTemplatesItems withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public QueryTemplatesItems withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * domain名字
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public QueryTemplatesItems withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 模板范围，自定义模板默认为custom
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public QueryTemplatesItems withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板说明
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryTemplatesItems withToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * 构建工具类型，yaml构建还是action构建
     * @return toolType
     */
    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public QueryTemplatesItems withIntlDescription(Object intlDescription) {
        this.intlDescription = intlDescription;
        return this;
    }

    /**
     * intl说明
     * @return intlDescription
     */
    public Object getIntlDescription() {
        return intlDescription;
    }

    public void setIntlDescription(Object intlDescription) {
        this.intlDescription = intlDescription;
    }

    public QueryTemplatesItems withParameters(List<CreateBuildJobParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public QueryTemplatesItems addParametersItem(CreateBuildJobParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public QueryTemplatesItems withParameters(Consumer<List<CreateBuildJobParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 构建执行参数列表
     * @return parameters
     */
    public List<CreateBuildJobParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<CreateBuildJobParameter> parameters) {
        this.parameters = parameters;
    }

    public QueryTemplatesItems withI18n(Object i18n) {
        this.i18n = i18n;
        return this;
    }

    /**
     * i18n
     * @return i18n
     */
    public Object getI18n() {
        return i18n;
    }

    public void setI18n(Object i18n) {
        this.i18n = i18n;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTemplatesItems that = (QueryTemplatesItems) obj;
        return Objects.equals(this.favourite, that.favourite) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.template, that.template) && Objects.equals(this.type, that.type)
            && Objects.equals(this._public, that._public) && Objects.equals(this.name, that.name)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.description, that.description)
            && Objects.equals(this.toolType, that.toolType)
            && Objects.equals(this.intlDescription, that.intlDescription)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.i18n, that.i18n);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favourite,
            nickName,
            id,
            uuid,
            template,
            type,
            _public,
            name,
            createTime,
            domainId,
            weight,
            userId,
            userName,
            domainName,
            scope,
            description,
            toolType,
            intlDescription,
            parameters,
            i18n);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTemplatesItems {\n");
        sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
        sb.append("    intlDescription: ").append(toIndentedString(intlDescription)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    i18n: ").append(toIndentedString(i18n)).append("\n");
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
