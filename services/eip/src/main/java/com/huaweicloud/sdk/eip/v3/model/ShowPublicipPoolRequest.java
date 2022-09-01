package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPublicipPoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_id")

    @JacksonXmlProperty(localName = "publicip_pool_id")

    private String publicipPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    @JacksonXmlProperty(localName = "fields")

    private String fields;

    public ShowPublicipPoolRequest withPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
        return this;
    }

    /**
     * 公网IP池ID唯一标识
     * @return publicipPoolId
     */
    public String getPublicipPoolId() {
        return publicipPoolId;
    }

    public void setPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
    }

    public ShowPublicipPoolRequest withFields(String fields) {
        this.fields = fields;
        return this;
    }

    /**
     * 显示，形式为\"fields=id&fields=name&...\"  支持字段：id/name/size/used/project_id/status/billing_info/created_at/updated_at/type/shared/is_common/description/tags/enterprise_project_id/allow_share_bandwidth_types/public_border_group
     * @return fields
     */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPublicipPoolRequest showPublicipPoolRequest = (ShowPublicipPoolRequest) o;
        return Objects.equals(this.publicipPoolId, showPublicipPoolRequest.publicipPoolId)
            && Objects.equals(this.fields, showPublicipPoolRequest.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipPoolId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicipPoolRequest {\n");
        sb.append("    publicipPoolId: ").append(toIndentedString(publicipPoolId)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
