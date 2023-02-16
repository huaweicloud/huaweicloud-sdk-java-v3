package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCustomTemplateBody
 */
public class CreateCustomTemplateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_mode")

    private String cacheMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, String> params = null;

    public CreateCustomTemplateBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 来源系统模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateCustomTemplateBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomTemplateBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateCustomTemplateBody withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 缓存引擎：Redis[和Memcached](tag:hws,hws_hk,ocb,sbc,tm,ctc,cmcc)。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public CreateCustomTemplateBody withCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }

    /**
     * 缓存实例类型。取值范围如下： - single：表示单机实例 - ha：表示主备实例 - cluster：表示cluster集群实例 - proxy：表示Proxy集群实例 [- ha_rw_split： 表示读写分离实例](tag:hws) 
     * @return cacheMode
     */
    public String getCacheMode() {
        return cacheMode;
    }

    public void setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
    }

    public CreateCustomTemplateBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCustomTemplateBody withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 缓存版本。  当缓存引擎为Redis时，取值为4.0或5.0。  [当缓存引擎为Memcached时，该字段为可选，取值为空。](tag:hws,hws_hk,ocb,sbc,tm,ctc,cmcc) 
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CreateCustomTemplateBody withParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public CreateCustomTemplateBody putParamsItem(String key, String paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public CreateCustomTemplateBody withParams(Consumer<Map<String, String>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数配置信息
     * @return params
     */
    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomTemplateBody createCustomTemplateBody = (CreateCustomTemplateBody) o;
        return Objects.equals(this.templateId, createCustomTemplateBody.templateId)
            && Objects.equals(this.name, createCustomTemplateBody.name)
            && Objects.equals(this.type, createCustomTemplateBody.type)
            && Objects.equals(this.engine, createCustomTemplateBody.engine)
            && Objects.equals(this.cacheMode, createCustomTemplateBody.cacheMode)
            && Objects.equals(this.description, createCustomTemplateBody.description)
            && Objects.equals(this.engineVersion, createCustomTemplateBody.engineVersion)
            && Objects.equals(this.params, createCustomTemplateBody.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, name, type, engine, cacheMode, description, engineVersion, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomTemplateBody {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    cacheMode: ").append(toIndentedString(cacheMode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
