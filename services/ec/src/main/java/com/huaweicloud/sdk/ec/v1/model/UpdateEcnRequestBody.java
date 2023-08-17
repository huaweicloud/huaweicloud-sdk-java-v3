package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateEcnRequestBody
 */
public class UpdateEcnRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_asn")

    private Long ecnAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_asn")

    private Long iegAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hub_enable")

    private Boolean hubEnable;

    public UpdateEcnRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业连接网络名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEcnRequestBody withDescription(String description) {
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

    public UpdateEcnRequestBody withEcnAsn(Long ecnAsn) {
        this.ecnAsn = ecnAsn;
        return this;
    }

    /**
     * 企业连接网络AS号
     * minimum: 64512
     * maximum: 65534
     * @return ecnAsn
     */
    public Long getEcnAsn() {
        return ecnAsn;
    }

    public void setEcnAsn(Long ecnAsn) {
        this.ecnAsn = ecnAsn;
    }

    public UpdateEcnRequestBody withIegAsn(Long iegAsn) {
        this.iegAsn = iegAsn;
        return this;
    }

    /**
     * 智能企业网关AS号
     * minimum: 64512
     * maximum: 65534
     * @return iegAsn
     */
    public Long getIegAsn() {
        return iegAsn;
    }

    public void setIegAsn(Long iegAsn) {
        this.iegAsn = iegAsn;
    }

    public UpdateEcnRequestBody withHubEnable(Boolean hubEnable) {
        this.hubEnable = hubEnable;
        return this;
    }

    /**
     * 分支互联开关
     * @return hubEnable
     */
    public Boolean getHubEnable() {
        return hubEnable;
    }

    public void setHubEnable(Boolean hubEnable) {
        this.hubEnable = hubEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEcnRequestBody that = (UpdateEcnRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.ecnAsn, that.ecnAsn) && Objects.equals(this.iegAsn, that.iegAsn)
            && Objects.equals(this.hubEnable, that.hubEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, ecnAsn, iegAsn, hubEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEcnRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecnAsn: ").append(toIndentedString(ecnAsn)).append("\n");
        sb.append("    iegAsn: ").append(toIndentedString(iegAsn)).append("\n");
        sb.append("    hubEnable: ").append(toIndentedString(hubEnable)).append("\n");
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
