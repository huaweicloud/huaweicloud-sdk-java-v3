package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数模板信息
 */
public class UpdateConfigurationRspConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignored_params")

    private List<String> ignoredParams = null;

    public UpdateConfigurationRspConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数模板ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateConfigurationRspConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateConfigurationRspConfiguration withIgnoredParams(List<String> ignoredParams) {
        this.ignoredParams = ignoredParams;
        return this;
    }

    public UpdateConfigurationRspConfiguration addIgnoredParamsItem(String ignoredParamsItem) {
        if (this.ignoredParams == null) {
            this.ignoredParams = new ArrayList<>();
        }
        this.ignoredParams.add(ignoredParamsItem);
        return this;
    }

    public UpdateConfigurationRspConfiguration withIgnoredParams(Consumer<List<String>> ignoredParamsSetter) {
        if (this.ignoredParams == null) {
            this.ignoredParams = new ArrayList<>();
        }
        ignoredParamsSetter.accept(this.ignoredParams);
        return this;
    }

    /**
     * 请求参数“values”中被忽略掉，没有生效的参数名称列表。 当参数不存在时，参数修改不会下发，并通过此参数返回所有被忽略的参数名称。
     * @return ignoredParams
     */
    public List<String> getIgnoredParams() {
        return ignoredParams;
    }

    public void setIgnoredParams(List<String> ignoredParams) {
        this.ignoredParams = ignoredParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConfigurationRspConfiguration that = (UpdateConfigurationRspConfiguration) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ignoredParams, that.ignoredParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ignoredParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationRspConfiguration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ignoredParams: ").append(toIndentedString(ignoredParams)).append("\n");
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
