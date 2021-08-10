package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateRuleRequestBody */
public class CreateRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_parsing_status")

    private Integer dataParsingStatus;

    public CreateRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 规则名称，支持英文大小写，数字，下划线和中划线,长度1-64
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRuleRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述，长度0-200
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRuleRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 规则状态 0-启用 1-停用，不填写时默认为0-启用 minimum: 0 maximum: 10
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CreateRuleRequestBody withDataParsingStatus(Integer dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
        return this;
    }

    /** 数据解析状态，0-启用 1-停用，不填写时默认为1-禁用 minimum: 0 maximum: 10
     * 
     * @return dataParsingStatus */
    public Integer getDataParsingStatus() {
        return dataParsingStatus;
    }

    public void setDataParsingStatus(Integer dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRuleRequestBody createRuleRequestBody = (CreateRuleRequestBody) o;
        return Objects.equals(this.name, createRuleRequestBody.name)
            && Objects.equals(this.appId, createRuleRequestBody.appId)
            && Objects.equals(this.description, createRuleRequestBody.description)
            && Objects.equals(this.status, createRuleRequestBody.status)
            && Objects.equals(this.dataParsingStatus, createRuleRequestBody.dataParsingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appId, description, status, dataParsingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dataParsingStatus: ").append(toIndentedString(dataParsingStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
