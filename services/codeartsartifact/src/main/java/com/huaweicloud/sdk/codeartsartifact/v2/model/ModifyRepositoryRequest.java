package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ModifyRepositoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tab_id")

    private String tabId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IDERepositoryPair body;

    public ModifyRepositoryRequest withTabId(String tabId) {
        this.tabId = tabId;
        return this;
    }

    /**
     * tab_id
     * @return tabId
     */
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    public ModifyRepositoryRequest withBody(IDERepositoryPair body) {
        this.body = body;
        return this;
    }

    public ModifyRepositoryRequest withBody(Consumer<IDERepositoryPair> bodySetter) {
        if (this.body == null) {
            this.body = new IDERepositoryPair();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IDERepositoryPair getBody() {
        return body;
    }

    public void setBody(IDERepositoryPair body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyRepositoryRequest that = (ModifyRepositoryRequest) obj;
        return Objects.equals(this.tabId, that.tabId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tabId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRepositoryRequest {\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
