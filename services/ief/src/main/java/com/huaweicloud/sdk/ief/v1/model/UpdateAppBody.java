package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新应用模板的请求体
 */
public class UpdateAppBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private AppUpdate app;

    public UpdateAppBody withApp(AppUpdate app) {
        this.app = app;
        return this;
    }

    public UpdateAppBody withApp(Consumer<AppUpdate> appSetter) {
        if (this.app == null) {
            this.app = new AppUpdate();
            appSetter.accept(this.app);
        }

        return this;
    }

    /**
     * Get app
     * @return app
     */
    public AppUpdate getApp() {
        return app;
    }

    public void setApp(AppUpdate app) {
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
        UpdateAppBody updateAppBody = (UpdateAppBody) o;
        return Objects.equals(this.app, updateAppBody.app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppBody {\n");
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
