package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowDirectConnectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_id")

    private String directConnectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    public ShowDirectConnectRequest withDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
        return this;
    }

    /**
     * 物理专线连接ID。
     * @return directConnectId
     */
    public String getDirectConnectId() {
        return directConnectId;
    }

    public void setDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
    }

    public ShowDirectConnectRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ShowDirectConnectRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ShowDirectConnectRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 显示字段列表
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDirectConnectRequest that = (ShowDirectConnectRequest) obj;
        return Objects.equals(this.directConnectId, that.directConnectId) && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directConnectId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDirectConnectRequest {\n");
        sb.append("    directConnectId: ").append(toIndentedString(directConnectId)).append("\n");
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
