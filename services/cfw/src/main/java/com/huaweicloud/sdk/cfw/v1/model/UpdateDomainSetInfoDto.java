package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDomainSetInfoDto
 */
public class UpdateDomainSetInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_set_type")

    private Integer domainSetType;

    public UpdateDomainSetInfoDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域名组名称UUID
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDomainSetInfoDto withDescription(String description) {
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

    public UpdateDomainSetInfoDto withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 域名组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public UpdateDomainSetInfoDto withDomainSetType(Integer domainSetType) {
        this.domainSetType = domainSetType;
        return this;
    }

    /**
     * 域名组类型，0表示URL过滤，1表示地址解析
     * @return domainSetType
     */
    public Integer getDomainSetType() {
        return domainSetType;
    }

    public void setDomainSetType(Integer domainSetType) {
        this.domainSetType = domainSetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainSetInfoDto that = (UpdateDomainSetInfoDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.setId, that.setId) && Objects.equals(this.domainSetType, that.domainSetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, setId, domainSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainSetInfoDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    domainSetType: ").append(toIndentedString(domainSetType)).append("\n");
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
