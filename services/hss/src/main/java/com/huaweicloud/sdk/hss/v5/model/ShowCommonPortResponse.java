package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCommonPortResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    public ShowCommonPortResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ShowCommonPortResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 端口类型：目前包括TCP，UDP两种
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowCommonPortResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态   - normal : 正常   - danger : 危险   - unknow : 未知
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCommonPortResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 中文描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCommonPortResponse withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * 英文描述
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCommonPortResponse that = (ShowCommonPortResponse) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.descriptionEn, that.descriptionEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, type, status, description, descriptionEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommonPortResponse {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
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
