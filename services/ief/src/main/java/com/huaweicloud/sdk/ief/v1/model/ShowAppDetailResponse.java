package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAppDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private AppResp app;

    public ShowAppDetailResponse withApp(AppResp app) {
        this.app = app;
        return this;
    }

    public ShowAppDetailResponse withApp(Consumer<AppResp> appSetter) {
        if (this.app == null) {
            this.app = new AppResp();
            appSetter.accept(this.app);
        }

        return this;
    }

    /**
     * Get app
     * @return app
     */
    public AppResp getApp() {
        return app;
    }

    public void setApp(AppResp app) {
        this.app = app;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppDetailResponse showAppDetailResponse = (ShowAppDetailResponse) o;
        return Objects.equals(this.app, showAppDetailResponse.app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppDetailResponse {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
