package com.huaweicloud.sdk.idme.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ModifyApplicationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyApplicationRequestBody body;

    public ModifyApplicationRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ModifyApplicationRequest withBody(ModifyApplicationRequestBody body) {
        this.body = body;
        return this;
    }

    public ModifyApplicationRequest withBody(Consumer<ModifyApplicationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyApplicationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyApplicationRequestBody getBody() {
        return body;
    }

    public void setBody(ModifyApplicationRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyApplicationRequest modifyApplicationRequest = (ModifyApplicationRequest) o;
        return Objects.equals(this.appId, modifyApplicationRequest.appId)
            && Objects.equals(this.body, modifyApplicationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyApplicationRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
