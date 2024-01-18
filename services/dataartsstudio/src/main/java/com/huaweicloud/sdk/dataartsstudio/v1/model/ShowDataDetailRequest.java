package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDataDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private String instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_relationships")

    private Boolean ignoreRelationships;

    public ShowDataDetailRequest withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 实例id
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public ShowDataDetailRequest withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public ShowDataDetailRequest withIgnoreRelationships(Boolean ignoreRelationships) {
        this.ignoreRelationships = ignoreRelationships;
        return this;
    }

    /**
     * 是否忽略关联资产 缺省值：false
     * @return ignoreRelationships
     */
    public Boolean getIgnoreRelationships() {
        return ignoreRelationships;
    }

    public void setIgnoreRelationships(Boolean ignoreRelationships) {
        this.ignoreRelationships = ignoreRelationships;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataDetailRequest that = (ShowDataDetailRequest) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.ignoreRelationships, that.ignoreRelationships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, guid, ignoreRelationships);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataDetailRequest {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    ignoreRelationships: ").append(toIndentedString(ignoreRelationships)).append("\n");
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
