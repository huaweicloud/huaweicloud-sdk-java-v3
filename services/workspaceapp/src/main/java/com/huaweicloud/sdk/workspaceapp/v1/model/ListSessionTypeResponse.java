package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSessionTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_types")

    private List<SessionTypeEntity> sessionTypes = null;

    public ListSessionTypeResponse withSessionTypes(List<SessionTypeEntity> sessionTypes) {
        this.sessionTypes = sessionTypes;
        return this;
    }

    public ListSessionTypeResponse addSessionTypesItem(SessionTypeEntity sessionTypesItem) {
        if (this.sessionTypes == null) {
            this.sessionTypes = new ArrayList<>();
        }
        this.sessionTypes.add(sessionTypesItem);
        return this;
    }

    public ListSessionTypeResponse withSessionTypes(Consumer<List<SessionTypeEntity>> sessionTypesSetter) {
        if (this.sessionTypes == null) {
            this.sessionTypes = new ArrayList<>();
        }
        sessionTypesSetter.accept(this.sessionTypes);
        return this;
    }

    /**
     * 会话列表。
     * @return sessionTypes
     */
    public List<SessionTypeEntity> getSessionTypes() {
        return sessionTypes;
    }

    public void setSessionTypes(List<SessionTypeEntity> sessionTypes) {
        this.sessionTypes = sessionTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionTypeResponse that = (ListSessionTypeResponse) obj;
        return Objects.equals(this.sessionTypes, that.sessionTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionTypeResponse {\n");
        sb.append("    sessionTypes: ").append(toIndentedString(sessionTypes)).append("\n");
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
