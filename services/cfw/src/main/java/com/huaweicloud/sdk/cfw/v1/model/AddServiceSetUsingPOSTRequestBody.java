package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Create Service Set Required Body
 */
public class AddServiceSetUsingPOSTRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AddServiceSetUsingPOSTRequestBody withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 互联网边界防护对象id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，type为0的为互联网边界防护对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AddServiceSetUsingPOSTRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddServiceSetUsingPOSTRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 服务组描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddServiceSetUsingPOSTRequestBody that = (AddServiceSetUsingPOSTRequestBody) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServiceSetUsingPOSTRequestBody {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
