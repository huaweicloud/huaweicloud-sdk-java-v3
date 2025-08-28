package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目标委托信息。
 */
public class AssumedAgencyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public AssumedAgencyDto withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 目标委托的URN。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public AssumedAgencyDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 目标委托的唯一标志，包含了委托ID和委托会话名称信息。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumedAgencyDto that = (AssumedAgencyDto) obj;
        return Objects.equals(this.urn, that.urn) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urn, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumedAgencyDto {\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
